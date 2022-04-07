package simae.languages;

import java.util.ListResourceBundle;

public class Interfaz_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
            return new Object[][] {
                    {"endsOn", "CLOSES ON LINE "},
                    {"closes", "CLOSES "},
                    {"onLine", " ON LINE "}
            };
    }

}
