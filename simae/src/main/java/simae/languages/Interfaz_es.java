package simae.languages;

import java.util.ListResourceBundle;

public class Interfaz_es extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
            return new Object[][] {
                    {"endsOn", "CIERRA EN LINEA "},
                    {"closes", "CIERRA "},
                    {"ofLine", " DE LINEA "}
            };
    }

}
