package simae.api;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;
import simae.core.lib.Simae;
import simae.core.lib.factories.ANTLRRegistry;
import simae.core.lib.factories.abstractfactories.CPlusPlusAbstractFactory;
import simae.core.lib.factories.abstractfactories.JavaAbstractFactory;
import simae.core.lib.factories.abstractfactories.PythonAbstractFactory;

import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class SimaeAPI extends Simae {
    public static List<AnotacionMarca> fuenteMarcado(BufferedReader br, Lenguaje programmingLanguage, String language) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //Creado de la registry
        ANTLRRegistry antlrRegistry = new ANTLRRegistry();

        //Registro de lenguajes
        CPlusPlusAbstractFactory.register(antlrRegistry);
        JavaAbstractFactory.register(antlrRegistry);
        PythonAbstractFactory.register(antlrRegistry);

        String armaCompleto = fuenteDesmarcado(br, programmingLanguage);
        CharStream antlrEntrada = CharStreams.fromString(armaCompleto);
        return iniciaTranslationUnit(antlrRegistry, antlrEntrada, programmingLanguage, language);
    }
}
