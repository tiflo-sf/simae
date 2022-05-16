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
                    {"programmingLanguage", "Lenguaje de programacion del archivo de entrada (java8, c++, python3"},
                    {"gui", "Abrir interfaz grafica"},
                    {"usage.synopsisHeading", "Uso: "},
                    //Mensajes de exito y error
                    {"extension", "Si el archivo no es de extension .java, .cpp, .py debe proporcionar un lenguaje. \n"},
                    {"emptyInput", "Debe ingresar un archivo de entrada. \n"},
                    {"invalidInput", "El archivo de entrada no es válido. \n"},
                    {"falloMarcado", "Fallo en el proceso de escritura de marcas. \n"},
                    {"workFileError", "Fallo en la escritura del archivo de trabajo. \n"},
                    {"success", "El archivo ha sido marcado correctamente. \n"},
                    {"unmatchedArgument1", "El argumento "},
                    {"unmatchedArgument2", " no existe. \n"},


            };
    }

}
