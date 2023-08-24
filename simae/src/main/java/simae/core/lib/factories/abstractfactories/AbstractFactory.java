package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractFactory {
    //private Class<?> lexer;
    //private Class<?> parser;
    //private Class<?> parseTreeListener;

    /*public AbstractFactory(Class<?> lexer, Class<?> parser, Class<?> parseTreeListener) {
        this.lexer = lexer;
        this.parser = parser;
        this.parseTreeListener = parseTreeListener;
    }*/

    public abstract Lexer getLexer(CharStream charStream);

    public abstract Parser getParser(CommonTokenStream tokens);

    public abstract ParseTreeListener getParseTreeListener(Parser parser, HashMap<String, String> stringsIdioma);
    public abstract ParseTree getParseTree(Parser parser);
    public abstract List<AnotacionMarca> getMarcas(ParseTreeListener extractor);
}
