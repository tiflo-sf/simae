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
import simae.core.lib.listener.JavaListener;
import simae.core.lib.listener.PythonListener;
import simae.grammars.JavaLexer;
import simae.grammars.JavaParser;
import simae.grammars.Python3Lexer;
import simae.grammars.Python3Parser;

import java.util.HashMap;
import java.util.List;

public class PythonAbstractFactory {

    public static void register(ANTLRRegistry registry) {
        registry.registerLanguage(PythonAbstractFactory.class, new ANTLRModel(
                getLexer(),
                getParser(),
                getListener()
        ));
    }


    public static Class<?> getLexer() {
        return Python3Lexer.class;
    }

    public static Class<?> getParser() {
        return Python3Parser.class;
    }

    public static ParseTree getParseTree(Parser parser) {
        return ((Python3Parser) parser).file_input();
    }

    public static Class<?> getListener() {
        return PythonListener.class;
    }

    public static List<AnotacionMarca> getMarcas(ParseTreeListener parseTreeListener) {
        return ((PythonListener) parseTreeListener).getMarcas();
    }

}
