const vscode = require('vscode');
const jschardet = require('jschardet');
const { spawn } = require('child_process');
const { msg } = require('./locale.js');


 /**
 * @param {vscode.ExtensionContext} context
 */

 
 /**
   * @param {Map<number, Marca[]>} multimap - Multimap de marcas
   * @param {vscode.TextEditor} editor - Editor.
   * obtiene la linea donde se encuentra el editor y verifica que exista una marca para esa linea. 
   * Si existe, la muestra. Si existe mas de una las une con un 'y'
   */
function mostrarMarcas(multimap, editor) {
    if (multimap.has(editor.selection.active.line + 1)) {
      const marcas = multimap.get(editor.selection.active.line + 1);
      if (marcas.length == 1) { //si tiene una sola marca
        vscode.window.showInformationMessage(msg("linea") + (editor.selection.active.line + 1)  +  ` ${marcas[0].marca}`);
      } else { //si tiene mas
        const mensaje = marcas.map(marcaArreglo => marcaArreglo.marca).join(msg("concat"));
        vscode.window.showInformationMessage(msg("linea") + (editor.selection.active.line + 1) + ` ${mensaje}`);
      }
    } else {
      vscode.window.showInformationMessage(msg("linea") + (editor.selection.active.line + 1) + msg("sinMarcas"));
    }
  }
  

 /**
 * Ejecuta el archivo simae.jar mediante el comando 'java' y devuelve un multimap de marcas resultante.
 * @param {string} filePath - La ruta absoluta del JAR de SIMAE.
 * @param {Object} context - El contexto del editor de vs code.
 * @param {vscode.TextEditor} editor - El editor que se encuentra activo y donde está abierto el archivo.
 * @returns {Promise<Map<number, Marca[]>>} Una promesa que se resuelve con un objeto Map que contiene las marcas.
 * @throws {string} Si ocurrio un error en la ejecución del JAR.
 */


  async function armarMultimap(filePath, context, editor) {
      const idioma = vscode.workspace.getConfiguration('SIMAE').get('idioma');
      const path = require('path'); //path 
      const simaeJar = path.join(context.extensionPath, 'libs', 'resources', 'simae.jar'); //path relativo del jar
      await editor.document.save();
      return new Promise((resolve, reject) => {
        getEncoding(editor).then(encoding => {
          if (encoding) {
        const proceso = spawn('java', ['-jar', simaeJar, filePath, encoding, idioma]);
        let stdoutData = '';
        
        proceso.stdout.on('data', (data) => {
          stdoutData += data;
        });
    
        proceso.stderr.on('data', (data) => {
          console.error('Error:', data.toString());
          reject(data.toString());
        });
    
        proceso.on('close', (code) => {
          if (code === 0) {
            const salida = stdoutData.trim().split('\n');
            console.log("Salida" + salida);
            const marcas = procesarSalida(salida);
            resolve(marcas);
          } else {
            reject('Codigo de error: ' + code);
          }
        });
      }
    });
      });
      
    }

    
    /**
 * Procesa la salida y crea un multimap basado en las marcas.
 * @param {string[]} salida - Un arreglo de strings que representa la salida de ejecución del jar.
 * @returns {Map<number, Marca[]>} Map que contiene las marcas agrupadas por fila.
 * Cada clave es el número de fila y el valor es un arreglo de objetos Marca que se encuentran en esa fila.
 */
  function procesarSalida(salida) {
    let multimap = new Map();
    for (let i = 0; i < salida.length; i++) {
      const linea = salida[i].split(' ');
      const fila = Number(linea[0]);
      const columna = Number(linea[1]);
      const marcaTexto = linea.slice(2).join(' ');
      const marca = new Marca(fila, columna, marcaTexto);
      if (!multimap.has(fila)) {
        multimap.set(fila, []);
      }
      multimap.get(fila).push(marca);
    }
    return multimap;
  }
  
 /**
 * Convierte el multimap en un arreglo de objetos Marca.
 * @param {Map<number, Marca[]>} multimap - El Map que contiene las marcas agrupadas por fila.
 * @returns {Array} Arreglo de marcas. Si hay mas de una marca con la misma clave se colocan de forma consecutiva en el arreglo
 */


  function multimapToArray(multimap) {
    const result = [];
    for (const [key, values] of multimap) {
      for (const value of values) {
        let fila= value.fila;
        let columna = value.columna;
        let texto = value.marca;
        result.push({fila, columna, texto});
      }
    }
    return result;
  }

/**
 * Encuentra la siguiente marca más cercana en dirección derecha a partir de la línea donde se encuentra el usuario.
 * @param {Array} arreglo - Arreglo de marcas.
 * @param {number} fila - El número de línea en la que se encuentra el usuario.
 */
function siguientePosicion(arreglo, fila) {
  for (let i = 0; i < arreglo.length; i++) {
    const marcaFila = arreglo[i].fila;
    if (fila < marcaFila) {
      return arreglo[i];
    } else if (i < arreglo.length - 1 && fila > marcaFila && fila < arreglo[i + 1].fila) {
      return arreglo[i + 1];
    }
  }
  return -1;
}

/**
 * Encuentra la siguiente marca más cercana en dirección izquierda a partir de la línea donde se encuentra el usuario.
 * @param {Array} arreglo - Arreglo de marcas
 * @param {number} fila - El número de línea en la que se encuentra el usuario.
 */
function anteriorPosicion(arreglo, fila) {
  for (let i = arreglo.length - 1; i >= 0; i--) {
    const marcaFila = arreglo[i].fila;
    if (fila > marcaFila) {
      return arreglo[i];
    } else if (i > 0 && fila < marcaFila && fila > arreglo[i - 1].fila) {
      return arreglo[i - 1];
    }
  }
  return -1;
}

/**
 * Mueve el cursor del editor a la siguiente marca o a la marca anterior, según el valor de 'antsig'.
 * Si 'antsig' es 1, el cursor se mueve a la siguiente marca. Si 'antsig' es -1, el cursor se mueve a la marca anterior.
 * @param {Map<number, Marca[]>} ultimasMarcas - Map que contiene las marcas agrupadas por fila.
 * @param {vscode.TextEditor} editor - El editor de texto 
 * @param {number} antsig - Entero que indica la dirección del movimiento del cursor (1 para sig marca y -1 para anterior)
 */
  function moverCursor(ultimasMarcas, editor, antsig){ 
    const direccion = antsig === 1 ? msg("derecha") : msg("izquierda");
    let arreglo = multimapToArray(ultimasMarcas);
    let siguienteMarca = antsig === 1? siguientePosicion(arreglo, editor.selection.active.line + 1) : anteriorPosicion(arreglo, editor.selection.active.line + 1);
    if(siguienteMarca != -1){
      const posicion = new vscode.Position(siguienteMarca.fila - 1, siguienteMarca.columna+1);
      const rango = new vscode.Range(posicion, posicion);
      editor.selection = new vscode.Selection(posicion, posicion);
      editor.revealRange(rango);
      mostrarMarcas(ultimasMarcas, editor);
    } else {
      vscode.window.showInformationMessage(msg("noMasMarcas") + direccion);
    }
  }
  
/**
 * Obtiene la codificación del archivo actual.
 * @param {vscode.TextEditor} editor - Editor actual.
 * @returns {Promise<string|null>} - Una promesa que se resuelve con el encoding o null si la confianza es baja.
 * @async
 */

  async function getEncoding(editor) {
    const deteccion = jschardet.detect(Buffer.from(await vscode.workspace.fs.readFile(editor.document.uri)));
    return deteccion.confidence > 0.8 ? deteccion.encoding : null;
}

  class Marca {
    constructor(fila, columna, marca) {
      this.fila = fila;
      this.columna = columna;
      this.marca = marca;
    }

  }


  module.exports = { //exporta funcionas usadas por la extension
    armarMultimap,
    mostrarMarcas,
    moverCursor
  }