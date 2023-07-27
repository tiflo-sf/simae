const fs = require('fs');
const vscode = require('vscode');
const path = require('path');
const i18next = require('i18next');


// Función para cargar los archivos JSON de traducción
function loadTranslationFile(lang) {
  const filePath = path.join(__dirname, 'locales', `${lang}.json`);
    const fileContent = fs.readFileSync(filePath, 'utf8');
    return JSON.parse(fileContent);
}

// Configuración de i18next
i18next.init({
  fallbackLng: 'en',
  lng: 'en',
  resources: {
    en: {
      translation: loadTranslationFile('en'),
    },
    es: {
      translation: loadTranslationFile('es'),
    },
  },
  interpolation: {
    escapeValue: false,
  },
});

// Función para acceder a mensajes
function msg(key) {
  return i18next.t(key);
}

function getLocale() {
    let idioma = vscode.workspace.getConfiguration('SIMAE').get('idioma');
    //obtener idioma actual segun configuracion o vs code
    if (idioma === 'Ingles') {
      return 'en';
    } else if (idioma === 'Español') {
      return 'es';
    } else {
      const osLanguage = vscode.env.language;
      if (osLanguage.startsWith('en')) {
        return 'en';
      } else if (osLanguage.startsWith('es')) {
        return 'es';
      } else {
        return 'es';
      }
    }
  }
module.exports = { msg, getLocale };
