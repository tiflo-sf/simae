package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;
import simae.core.lib.factories.ANTLRModel;
import simae.core.lib.factories.ANTLRRegistry;
import simae.core.lib.listener.CPPListener;
import simae.grammars.CPP14Lexer;
import simae.grammars.CPP14Parser;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class CPlusPlusAbstractFactory {

    public static void register(ANTLRRegistry registry) {
        registry.registerLanguage(CPlusPlusAbstractFactory.class, new ANTLRModel(
                CPP14Lexer.class,
                CPP14Parser.class,
                CPPListener.class
        ));
    }
    public static ParseTree getParseTree(Parser parser) {
        return ((CPP14Parser) parser).translationunit();
    }

}
