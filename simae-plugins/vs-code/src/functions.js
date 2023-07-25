const vscode = require('vscode');
const { spawn } = require('child_process');

 /**
 * @param {vscode.ExtensionContext} context
 */
 /**
   * @param {Map<number, Marca[]>} multimap - Multimap de marcas
   * @param {vscode.TextEditor} editor - Editor.
   * 
   * obtiene la linea donde se encuentra el editor y verifica que exista una marca para esa linea. 
   * Si existe, la muestra. Si existe mas de una las une con un 'y'
   */
function mostrarMarcas(multimap, editor) {
    if (multimap.has(editor.selection.active.line + 1)) {
      const marcas = multimap.get(editor.selection.active.line + 1);
      if (marcas.length == 1) { //si tiene una sola marca
        vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1)  +  ` ${marcas[0].marca}`);
      } else { //si tiene mas
        const mensaje = marcas.map(marcaArreglo => marcaArreglo.marca).join(' y ');
        vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1) + ` ${mensaje}`);
      }
    } else {
      vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1) + " No hay marcas.");
    }
  }
  

 /**
 * Ejecuta el archivo simae.jar mediante el comando 'java' y devuelve un multimap de marcas resultante.
 *
 * @param {string} filePath - La ruta absoluta del JAR de SIMAE.
 * @param {Object} context - El contexto del editor de vs code.
 * @param {vscode.TextEditor} editor - El editor que se encuentra activo y donde está abierto el archivo.
 *
 * @returns {Promise<Map<number, Marca[]>>} Una promesa que se resuelve con un objeto Map que contiene las marcas.
 * @throws {string} Si ocurrio un error en la ejecución del JAR.
 */


  async function armarMultimap(filePath, context, editor) {
      const path = require('path'); //path 
      const simaeJar = path.join(context.extensionPath, 'libs', 'resources', 'simae.jar'); //path relativo del jar
      await editor.document.save();
      return new Promise((resolve, reject) => {
        const process = spawn('java', ['-jar', simaeJar, filePath]);
        let stdoutData = '';
    
        process.stdout.on('data', (data) => {
          stdoutData += data;
        });
    
        process.stderr.on('data', (data) => {
          console.error('Error:', data.toString());
          reject(data.toString());
        });
    
        process.on('close', (code) => {
          if (code === 0) {
            const salida = stdoutData.trim().split('\n');
            console.log("Salida" + salida);
            const marcas = procesarSalida(salida);
            resolve(marcas);
          } else {
            console.error('Error: JAR execution failed with code ' + code);
            reject('JAR execution failed with code ' + code);
          }
        });
      });
    }

    
    /**
 * Procesa la salida y crea un multimap basado en las marcas.
 *
 * @param {string[]} salida - Un arreglo de strings que representa la salida de ejecución del jar.
 *
 * @returns {Map<number, Marca[]>} Un objeto Map que contiene las marcas agrupadas por fila.
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
 *
 * @param {Map<number, Marca[]>} multimap - El Map que contiene las marcas agrupadas por fila.
 *
 * @returns {Array} Arreglo de objetos que representa las marcas en el multimap. Si hay mas de una marca con
 * la misma clave se colocan de forma consecutiva en el arreglo
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
 * Encuentra la siguiente marca más cercana en direccion derecha a partir de la linea donde se encuentra el usuario.
 *
 * @param {Array} arreglo - Un arreglo de objetos que representan las marcas.
 * @param {number} fila - El número de linea en la que se encuentra el usuario.
 *
 * @returns {Marca|Number} La siguiente marca más cercana a la linea o -1 si no se encontró ninguna marca válida.
 */
  function siguientePosicion(arreglo, fila) {
  
    for (let i = 0; i < arreglo.length; i++) {
      const marcaFila = arreglo[i].fila;
         if(fila < marcaFila){
            return arreglo[i];
         } else if(fila > marcaFila && fila < arreglo[i+1].fila){
            return arreglo[i+1];
         }
    }
  return -1;
  }
  
   /**
 * Encuentra la siguiente marca más cercana en direccion izquierda a partir de la linea donde se encuentra el usuario.
 *
 * @param {Array} arreglo - Un arreglo de objetos que representan las marcas.
 * @param {number} fila - El número de linea en la que se encuentra el usuario.
 *
 */
  function anteriorPosicion(arreglo, fila) {

    for (let i = arreglo.length-1; i >= 0; i--) {
      const marca = arreglo[i];
      const marcaFila = marca.fila;
      if (fila > marcaFila) {
        return arreglo[i];
      } else if (fila < marcaFila && fila > arreglo[i - 1].fila) {
        return arreglo[i - 1];
      }
    }
    return -1;
  }

/**
 * Mueve el cursor del editor a la siguiente marca o a la marca anterior, según el valor de 'antsig'.
 * Si 'antsig' es 1, el cursor se mueve a la siguiente marca. Si 'antsig' es -1, el cursor se mueve a la marca anterior.
 *
 * @param {Map<number, Marca[]>} ultimasMarcas - Un objeto Map que contiene las marcas agrupadas por fila.
 * @param {vscode.TextEditor} editor - El editor de texto 
 * @param {number} antsig - Un número entero que indica la dirección del movimiento del cursor (1 para sig marca y 1 para anterior)
 */
  function moverCursor(ultimasMarcas, editor, antsig){ 
    const direccion = antsig === 1 ? "derecha." : "izquierda.";
    let arreglo = multimapToArray(ultimasMarcas);
    let siguienteMarca = antsig === 1? siguientePosicion(arreglo, editor.selection.active.line + 1) : anteriorPosicion(arreglo, editor.selection.active.line + 1);
    if(siguienteMarca != -1){
      const posicion = new vscode.Position(siguienteMarca.fila - 1, siguienteMarca.columna+1);
      const rango = new vscode.Range(posicion, posicion);
      editor.selection = new vscode.Selection(posicion, posicion);
      editor.revealRange(rango);
      mostrarMarcas(ultimasMarcas, editor);
    } else {
      vscode.window.showInformationMessage("No hay mas marcas en el documento en direccion " + direccion);
    }
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