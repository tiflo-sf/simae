package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.factories.ANTLRModel;
import simae.core.lib.factories.ANTLRRegistry;
import simae.core.lib.listener.CPPListener;
import simae.core.lib.listener.JavaListener;
import simae.grammars.CPP14Lexer;
import simae.grammars.CPP14Parser;
import simae.grammars.JavaLexer;
import simae.grammars.JavaParser;

import java.util.HashMap;
import java.util.List;

public class JavaAbstractFactory {

    public static void register(ANTLRRegistry registry) {
        registry.registerLanguage(JavaAbstractFactory.class, new ANTLRModel(
                getLexer(),
                getParser(),
                getListener()
        ));
    }


    public static Class<?> getLexer() {
        return JavaLexer.class;
    }

    public static Class<?> getParser() {
        return JavaParser.class;
    }

    public static ParseTree getParseTree(Parser parser) {
        return ((JavaParser) parser).compilationUnit();
    }

    public static Class<?> getListener() {
        return JavaListener.class;
    }

    public static List<AnotacionMarca> getMarcas(ParseTreeListener parseTreeListener) {
        return ((JavaListener) parseTreeListener).getMarcas();
    }

}
