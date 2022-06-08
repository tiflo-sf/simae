package simae.languages;

import java.util.ListResourceBundle;

public class Interfaz_es extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
            return new Object[][] {
                    //Marcas
                    {"endsOn", "CIERRA EN LINEA "},
                    {"closes", "CIERRA "},
                    {"ofLine", " DE LINEA "},
                   //Descripcion de argumentos
                    {"language", "Idioma de marcado y de mensajes"},
                    {"input", "Archivo de entrada"},
                    {"output", "Archivo de salida"},
                    {"programmingLanguage", "Lenguaje de programacion del archivo de entrada (java8, c++, python3)"},
                    {"gui", "Abrir interfaz grafica"},
                    {"usage.synopsisHeading", "Uso: "},
                    {"withSound", "Ejecuta SIMAE con sonido que indica el resultado del marcado. \n"},
                    //Mensajes de exito y error
                    {"extension", "Si el archivo no es de extension .java, .cpp, .py debe proporcionar un lenguaje. \n"},
                    {"emptyInput", "Debe ingresar un archivo de entrada. \n"},
                    {"invalidInput", "El archivo de entrada no es válido. \n"},
                    {"falloMarcado", "Fallo en el proceso de escritura de marcas. \n"},
                    {"workFileError", "Fallo en la escritura del archivo de trabajo. \n"},
                    {"success", "El archivo ha sido marcado correctamente. \n"},
                    {"undefinedArgument1", "Los argumentos "},
                    {"undefinedArgument2", " no existen. \n"},
                    {"missing", "Debe proporcionar un valor para el argumento "},
                    {"missingResource", "El idioma ingresado no está disponible. \n"},
                    {"overwritten1", "La opción "},
                    {"overwritten2", " debería ser especificada una sola vez. \n"},
                    {"version", "Versión de SIMAE."},
            };
    }

}
