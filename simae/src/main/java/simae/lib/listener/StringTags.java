package simae.lib.listener;

import java.util.Locale;
import java.util.ResourceBundle;

public interface StringTags {

    ResourceBundle rb = ResourceBundle.getBundle("simae.languages.Interfaz", Locale.getDefault());
    String endTag = (String) rb.getObject("finMarca");

}
