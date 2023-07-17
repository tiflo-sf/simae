package simae.api;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;
import simae.core.lib.Simae;

import java.io.BufferedReader;
import java.util.List;

public class SimaeAPI extends Simae {
    public static List<AnotacionMarca> fuenteMarcado(BufferedReader br, Lenguaje programmingLanguage, String language) {
        String armaCompleto = fuenteDesmarcado(br, programmingLanguage);
        CharStream antlrEntrada = CharStreams.fromString(armaCompleto);
        return iniciaTranslationUnit(antlrEntrada, programmingLanguage, language);
    }
}
