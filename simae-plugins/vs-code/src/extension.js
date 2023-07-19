const vscode = require('vscode');
const { exec } = require('child_process');
const { mostrarMarcas, armarMultimap, multimapToArray, siguientePosicion, anteriorPosicion } = require('./functions.js');

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context) { //leer


  const path = require('path'); //path 
  let ultimoContenido = null; //ultimo contenido del archivo
  let ultimasMarcas = null; //ultima lista de marcas mostrada por la consola
  let editor = vscode.window.activeTextEditor;
  const filePath = editor.document.uri.fsPath; //path del archivo
  const fileExt = path.extname(filePath); //extension del archivo


  let leerMarca = vscode.commands.registerCommand('extension.leerMarca', () => { //leer marca
    if (editor) { //si esta en el editor activo
      if ([".java", ".cpp", ".py"].includes(fileExt)) { //si es cpp, java, py
        const contenido = editor.document.getText();
        if(contenido != ultimoContenido){
          armarMultimap(filePath, context, editor)
          .then((marcas) => {
            ultimasMarcas = marcas;
            mostrarMarcas(ultimasMarcas, editor);
          })
          .catch(() => {
            vscode.window.showInformationMessage("Ocurrió un error al ejecutar SIMAE. Verifica que tenés JAVA instalado.");
          });
        ultimoContenido = contenido;
        } else {
          mostrarMarcas(ultimasMarcas, editor);
        }
      } else {
        vscode.window.showInformationMessage('SIMAE esta disponible para archivos .java, .cpp y .py');
      }
    } else {
      vscode.window.showInformationMessage('SIMAE solo se puede ejecutar en un editor.');
    }
  });



  let irDerecha = vscode.commands.registerCommand('extension.irDerecha', () => { //leer marca
    let editor = vscode.window.activeTextEditor;
    if (editor) { //si esta en el editor activo
      const filePath = editor.document.uri.fsPath; //path del archivo
      const fileExt = path.extname(filePath); //extension del archivo
      if ([".java", ".cpp", ".py"].includes(fileExt)) { //si es cpp, java, py
        const contenido = editor.document.getText();
        if(contenido != ultimoContenido){
          armarMultimap(filePath, context, editor)
          .then((marcas) => {
            let arreglo = multimapToArray(marcas);
            console.log(arreglo);
            ultimasMarcas = marcas;
            const siguiente = siguientePosicion(arreglo, editor.selection.active.line + 1);
            console.log("Siguiente " + siguiente)
            const posicion = new vscode.Position(siguiente, 0);
            const rango = new vscode.Range(posicion, posicion);
            editor.selection = new vscode.Selection(posicion, posicion);
            editor.revealRange(rango);
            mostrarMarcas(ultimasMarcas, editor);
          })
          .catch(() => {
            vscode.window.showInformationMessage("Ocurrió un error al ejecutar SIMAE. Verifica que tenés JAVA instalado.");
          });
        ultimoContenido = contenido;
        } else {
            let arreglo = multimapToArray(ultimasMarcas);
            console.log("Arreglo cndo no hay cambios: " + arreglo);
            const siguiente = siguientePosicion(arreglo, editor.selection.active.line + 1);
            console.log("Siguiente: " + siguiente);
            const posicion = new vscode.Position(siguiente, 0);
            const rango = new vscode.Range(posicion, posicion);
            editor.selection = new vscode.Selection(posicion, posicion);
            editor.revealRange(rango);
            mostrarMarcas(ultimasMarcas, editor);
        }
      } else {
        vscode.window.showInformationMessage('SIMAE esta disponible para archivos .java, .cpp y .py');
      }
    } else {
      vscode.window.showInformationMessage('SIMAE solo se puede ejecutar en un editor.');
    }
  });







        let irIzquierda = vscode.commands.registerCommand('extension.irIzquierda', () => { //leer marca
          let editor = vscode.window.activeTextEditor;
          if (editor) { //si esta en el editor activo
            const filePath = editor.document.uri.fsPath; //path del archivo
            const fileExt = path.extname(filePath); //extension del archivo
            if ([".java", ".cpp", ".py"].includes(fileExt)) { //si es cpp, java, py
              const contenido = editor.document.getText();
              if(contenido != ultimoContenido){
                armarMultimap(filePath, context, editor)
                .then((marcas) => {
                  let arreglo = multimapToArray(marcas);
                  console.log(arreglo);
                  ultimasMarcas = marcas;
                  const siguiente = anteriorPosicion(arreglo, editor.selection.active.line + 1);
                  console.log("Siguiente " + siguiente)
                  const posicion = new vscode.Position(siguiente, 0);
                  const rango = new vscode.Range(posicion, posicion);
                  editor.selection = new vscode.Selection(posicion, posicion);
                  editor.revealRange(rango);
                  mostrarMarcas(ultimasMarcas, editor);
                })
                .catch(() => {
                  vscode.window.showInformationMessage("Ocurrió un error al ejecutar SIMAE. Verifica que tenés JAVA instalado.");
                });
              ultimoContenido = contenido;
              } else {
                  let arreglo = multimapToArray(ultimasMarcas);
                  console.log("Arreglo cndo no hay cambios: " + arreglo);
                  const siguiente = anteriorPosicion(arreglo, editor.selection.active.line + 1);
                  console.log("Siguiente: " + siguiente);
                  const posicion = new vscode.Position(siguiente, 0);
                  const rango = new vscode.Range(posicion, posicion);
                  editor.selection = new vscode.Selection(posicion, posicion);
                  editor.revealRange(rango);
                  mostrarMarcas(ultimasMarcas, editor);
              }
                } else {
                  vscode.window.showInformationMessage('SIMAE esta disponible para archivos .java, .cpp y .py');
                }
              } else {
                vscode.window.showInformationMessage('SIMAE solo se puede ejecutar en un editor.');
              }
            });
          
  



  context.subscriptions.push(leerMarca, irDerecha, irIzquierda);

 

}





function deactivate() {}
 
module.exports = { //exporta modulos activate y deactivate.
  activate,
  deactivate
}
