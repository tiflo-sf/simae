package simae.core.lib.listener;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class StringTags {

    private ResourceBundle rb;
    HashMap<String, String> strings;

    public StringTags() {
        rb = ResourceBundle.getBundle("simae.core.languages.Interfaz", Locale.getDefault());
        initializeLanguage();
    }

    public StringTags(String language) {
        this.rb = ResourceBundle.getBundle("simae.core.languages.Interfaz", Locale.forLanguageTag(language));
        strings = new HashMap<>();
        initializeLanguage();
    }

    private void initializeLanguage() {
        strings.put("endsOn", (String) rb.getObject("endsOn"));
        strings.put("closes", (String) rb.getObject("closes"));
        strings.put("ofLine", (String) rb.getObject("ofLine"));
        strings.put("and", (String) rb.getObject("and"));
    }

    public HashMap<String, String> getStrings() {
        return strings;
    }
}
