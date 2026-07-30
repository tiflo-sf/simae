const path = require('path');
const vscode = require('vscode');
const https = require('https');
const os = require('os');
const fs = require('fs');
const decompress = require('decompress');
const { msg } = require('./locale.js');
const { exec } = require ('child_process');


 /**
 * Retorna la URL de descarga del JRE según el sistema operativo del usuario.
 * @returns {string} url - URL de descarga del JRE
 */
function obtenerURL() {
  let platform = os.platform();
  let url;

  if (platform === 'win32') {
    url = 'https://github.com/tiflo-sf/simae/releases/download/v1.0.0/jre_win.zip';
  } else if (platform === 'darwin') {
    url = 'JRE_MACOS'; //TO-DO
  } else if (platform === 'linux') {
    url = 'JRE_LINUX'; //TO-DO
  } else {
    return null;
  }

  return url;
}

 /**
 * Descarga el JRE en formato .zip a partir la URL proporcionada
 * @param {string} url - URL de descarga del JRE.
 * @param {string} jrePath - PATH del archivo descargado.
 */
function descargarJRE(urlStr, jrePath, redirecciones = 0) {
  return new Promise((resolve, reject) => {
    if (redirecciones > 5) {
      return reject(new Error('Demasiadas redirecciones al intentar descargar el JRE.'));
    }

    let finalizado = false;

    function limpiarArchivoParcial() {
      fs.unlink(jrePath, (err) => {
        if (err && err.code !== 'ENOENT') {
          console.error('Error al limpiar archivo parcial:', err);
        }
      });
    }

    function fallar(err) {
      if (finalizado) return;
      finalizado = true;
      limpiarArchivoParcial();
      reject(err);
    }

    const req = https.get(urlStr, (response) => {
      if (response.statusCode >= 300 && response.statusCode < 400 && response.headers.location) {
        const { URL } = require('url');
        const redirectUrl = new URL(response.headers.location, urlStr).toString();
        return resolve(descargarJRE(redirectUrl, jrePath, redirecciones + 1));
      }

      if (response.statusCode < 200 || response.statusCode >= 300) {
        response.resume();
        return fallar(new Error(`Error HTTP ${response.statusCode}`));
      }

      const archivo = fs.createWriteStream(jrePath);

      archivo.on('error', (err) => {
        fallar(new Error(`Error escribiendo el archivo local: ${err.message}`));
      });

      response.on('error', (err) => {
        fallar(new Error(`Error en el stream de respuesta: ${err.message}`));
      });

      response.on('aborted', () => {
        fallar(new Error('La conexión de descarga se abortó inesperadamente.'));
      });

      response.pipe(archivo);

      archivo.on('finish', () => {
        if (finalizado) return;
        archivo.close((err) => {
          if (finalizado) return;
          if (err) return fallar(err);
          finalizado = true;
          resolve(jrePath);
        });
      });
    });

    req.on('error', (err) => {
      fallar(new Error(`Error en la petición de red: ${err.message}`));
    });

    req.setTimeout(30000, () => {
      req.destroy(new Error('Timeout de descarga excedido.'));
    });
  });
}

 /**
 * Descomprime el .zip del JRE descargado
 * @param {string} jrePath - path del .zip descargado
 * @param {string} extractPath - Directorio de extracción del .zip
 */
function extraerJRE(jrePath, extractPath) {
  return decompress(jrePath, extractPath);
}


 /**
 * Verifica que el usuario tenga JAVA instalado, si no lo tiene descarga un JRE personalizado, crea el directorio del JRE, y descomprime el .zip
 * @param {vscode.ExtensionContext} context
 * @returns {Promise<string>} extractPath - PATH de instalación del JRE
 */
async function instalarJRE(context) {
  const jreDir = path.join(context.extensionPath, 'jre');
  if (!fs.existsSync(jreDir)) {
    fs.mkdirSync(jreDir);
  }

  const jreUrl = obtenerURL();
  if (!jreUrl) {
    return null;
  }

  const jrePath = path.join(jreDir, 'jre.zip');
  const extractPath = path.join(jreDir, os.platform());

  if (!fs.existsSync(extractPath)) {
    try {
      await descargarJRE(jreUrl, jrePath);
      await extraerJRE(jrePath, extractPath);
      fs.unlinkSync(jrePath); //elimina el .zip luego de extraerlo
    } catch (error) {
      return null;
    }
  }
  return extractPath;
}


/**
 * Permite saber si el usuario tiene instalado Java en su sistema operativo.
 * @returns {Promise<boolean>} instalado - Retorna true en caso de que JAVA esté instalado, false en caso contrario.
 */
async function javaInstalado() {
  return new Promise((resolve) => {
    exec('java -version', (error, stdout, stderr) => {
      if (error) {
        resolve(false);
        return;
      }
      const versionMatch = stderr.match(/version "(\d+)\.(\d+)/);
      if (versionMatch) {
        const majorVersion = parseInt(versionMatch[1], 10);
        const minorVersion = parseInt(versionMatch[2], 10);
        if (majorVersion > 11 || (majorVersion === 11 && minorVersion >= 0)) {
          resolve(true);
        } else {
          resolve(false);
        }
      } else {
        resolve(false);
      }
    });
  });
}

 /**
 * @param {vscode.ExtensionContext} context
 * Ejecuta la configuración del plugin, muestra el estado del proceso y setea el PATH de java una vez instalado el JRE.
 */
async function setup(context) {
    try {
        await vscode.window.withProgress({
            location: vscode.ProgressLocation.Notification,
            title: msg("instalando"),
            cancellable: false
          }, async () => {
            const instalado = await javaInstalado();
            if(!instalado){
                let jrePath = await instalarJRE(context);
                if (fs.existsSync(path.join(jrePath, 'jre'))) {
                    jrePath = path.join(jrePath, 'jre');
                }
                context.globalState.update('jrePath', jrePath);
            } else {
                const javaPath = await getJavaPath()
                context.globalState.update('jrePath', javaPath);
            }
            context.globalState.update('instalado', true);
            return Promise.resolve();
      });
      vscode.window.showInformationMessage(msg("instalado"));
    } catch (error) {
      vscode.window.showErrorMessage(msg("errorInstalando") + error);
    }
  }

  /**
 * Obtiene el path del JDK o JRE de Java instalado en el SO.
 * @returns Una promesa que resuelve al path del JDK o JRE si está instalado, de lo contrario `null`.
 */
  async function getJavaPath() {
    return new Promise((resolve, reject) => {
      exec('java -XshowSettings:properties -version', (error, stdout, stderr) => {
        if (error) {
          reject();
          return;
        }
        const output = stderr || stdout;
        const javaHomeMatch = output.match(/java\.home = (.*)/);
        if (javaHomeMatch && javaHomeMatch[1]) {
          resolve(javaHomeMatch[1].trim());
        } else {
          reject();
        }
      });
    });
  }


module.exports = {
 setup, javaInstalado
};
