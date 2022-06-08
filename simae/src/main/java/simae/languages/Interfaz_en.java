package simae.languages;

import java.util.ListResourceBundle;

public class Interfaz_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
            return new Object[][]{
                    {"endsOn", "CLOSES ON LINE "},
                    {"closes", "CLOSES "},
                    {"ofLine", " OF LINE "},
                    //Descripcion de argumentos
                    {"language", "Markup and message language"},
                    {"input", "Input filename"},
                    {"output", "Output filename"},
                    {"programmingLanguage", "Input file programming language (java8, c++, python3)"},
                    {"gui", "Run graphical interface"},
                    {"usage.synopsisHeading", "Usage: "},
                    //Mensajes de exito y error
                    {"extension", "If the file does not have a .java, .cpp, .py extension, you must provide a programming language. \n"},
                    {"emptyInput", "You must enter an input file. \n"},
                    {"invalidInput", "The input file is not valid. \n"},
                    {"falloMarcado", "Error in the process of writing marks. \n"},
                    {"workFileError", "Failed to write work file. \n"},
                    {"success", "The file has been successfully marked. \n"},
                    {"undefinedArgument1", "The arguments "},
                    {"undefinedArgument2", " don't exist. \n"},
                    {"missing", "You must provide a value for the argument "},
                    {"missingResource", "The entered language is not available."},
                    {"overwritten1", "The option "},
                    {"overwritten2", " should be specified only once. \n"},
                    {"version", " Version of SIMAE. \n"},
                    {"withSound", "Play audio \n"}




            };
    }

}
