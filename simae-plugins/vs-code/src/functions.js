const vscode = require('vscode');
const { exec } = require('child_process');
 /**
 * @param {vscode.ExtensionContext} context
 */
 /**
   * @param {Map<number, Marca[]>} multimap - multimap de marcas
   * @param {vscode.TextEditor} editor - editor.
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
  
  function armarMultimap(filePath, context, editor) {
      const path = require('path'); //path 
      const simaeJar = path.join(context.extensionPath, 'libs', 'resources', 'simae.jar'); //path relativo del jar
    return new Promise((resolve, reject) => {
        editor.document.save().then(() => {
        exec(`java -jar ${simaeJar} ${filePath}`, (err, stdout, stderr) => {
          if (err) {
            reject(err);
            return;
          }
          const salida = stdout.trim().split('\n');
          console.log("Salida" + salida);
          const marcas = procesarSalida(salida);
          resolve(marcas);
        });
      });
    });
  }
  
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

  function siguientePosicion(arreglo, fila) {
  
    for (let i = 0; i < arreglo.length-1; i++) {
      const marca = arreglo[i];
      const marcaFila = marca.fila;
         if(fila < marcaFila){
            return arreglo[i].fila - 1;
         } else if(fila > marcaFila && fila < arreglo[i+1].fila){
            return arreglo[i+1].fila -1;
         }
    }
  return 0;
  }
  
  function anteriorPosicion(arreglo, fila) {

    for (let i = arreglo.length - 1; i > 0; i--) {
      const marca = arreglo[i];
      const marcaFila = marca.fila;
      if (fila > marcaFila) {
        return arreglo[i].fila - 1;
      } else if (fila < marcaFila && fila > arreglo[i - 1].fila) {
        return arreglo[i - 1].fila - 1;
      }
    }
    return 0;
  }

  

  class Marca {
    constructor(fila, columna, marca) {
      this.fila = fila;
      this.columna = columna;
      this.marca = marca;
    }

  }

  module.exports = { //exporta modulos activate y deactivate.
    armarMultimap,
    mostrarMarcas,
    multimapToArray,
    siguientePosicion,
    anteriorPosicion
  }