package simae.lib.listener;

import java.util.Locale;
import java.util.ResourceBundle;

public interface StringTags {

    ResourceBundle rb = ResourceBundle.getBundle("simae.languages.Interfaz", Locale.getDefault());
    String endTag = (String) rb.getObject("endsOn");
    String closes = (String) rb.getObject("closes");
    String onLine = (String) rb.getObject("onLine");

}
