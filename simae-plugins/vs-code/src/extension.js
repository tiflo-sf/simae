const vscode = require('vscode');
const { exec } = require('child_process');

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context) { //leer
  const path = require('path'); //path 
  const simaeJar = path.join(context.extensionPath, 'libs', 'resources', 'simae.jar'); //path relativo del jar
  let ultimoContenido = null; //ultimo contenido del archivo
  let ultimasMarcas = null; //ultima lista de marcas mostrada por la consola
  let disposable = vscode.commands.registerCommand('extension.simaevs', () => { //leer marca
    let editor = vscode.window.activeTextEditor;
    if (editor) { //si esta en el editor activo
      const filePath = editor.document.uri.fsPath; //path del archivo
      const fileExt = path.extname(filePath); //extension del archivo
      if ([".java", ".cpp", ".py"].includes(fileExt)) { //si es cpp, java, py
        const contenido = editor.document.getText();
        if (contenido == ultimoContenido) {
          const marcas = ultimasMarcas;
          if (ultimasMarcas) {
            mostrarMarcas(marcas, editor);
          }
          return;
        }
        ultimoContenido = contenido;
        editor.document.save().then(() => {
          exec(`java -jar ${simaeJar} ${filePath}`, (err, stdout, stderr) => {
            if (err) {
              vscode.window.showInformationMessage("Ocurrio un error");
              return;
            }
            const salida = stdout.trim().split('\n');
            const marcas = armarMultimap(salida);
            ultimasMarcas = marcas;
            mostrarMarcas(marcas, editor);
          });
        });
      } else {
        vscode.window.showInformationMessage('SIMAE esta disponible para archivos .java, .cpp y .py');
      }
    } else {
      vscode.window.showInformationMessage('SIMAE solo se puede ejecutar en un editor.');
    }
  });

  context.subscriptions.push(disposable);


  /**
   * @param {Map<number, string[]>} multimap - multimap de marcas
   * @param {vscode.TextEditor} editor - editor.
   * 
   * obtiene la linea donde se encuentra el editor y verifica que exista una marca para esa linea. 
   * Si existe, la muestra. Si existe mas de una las une con un 'y'
   */
  function mostrarMarcas(multimap, editor) {
    if (multimap.has(editor.selection.active.line + 1)) {
      const marcas = multimap.get(editor.selection.active.line + 1);
      if (marcas.length == 1) { //si tiene una sola marca
        vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1)  +  ` ${marcas[0]}`);
      } else { //si tiene mas
        const mensaje = marcas.join(' y ');
        vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1) + ` ${mensaje}`);
      }
    } else {
      vscode.window.showInformationMessage("Línea " + (editor.selection.active.line + 1) + " No hay marcas");
    }
  }

  function armarMultimap(salida) {
    let multimap = new Map(); //crea mapa comun
    for (let i = 0; i < salida.length; i++) { //recorre salida del jar
      const linea = salida[i].split(' '); //obtiene la linea, yendo desde el inicio hasta 1er espacio en blanco
      const n = Number(linea[0]); 
      const marca = linea.slice(1).join(' '); //obtiene el resto de la cadena (la marca)
      if (!multimap.has(n)) { //si no existe una marca para esa linea
        multimap.set(n, []); //crea arreglo
      }
      multimap.get(n).push(marca); //inserta la amrca en el mapa
    }
    return multimap;
  }
}
function deactivate() {}
 
module.exports = { //exporta modulos activate y deactivate.
  activate,
  deactivate
}
