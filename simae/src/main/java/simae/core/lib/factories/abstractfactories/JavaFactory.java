package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.listener.JavaListener;
import simae.grammars.JavaLexer;
import simae.grammars.JavaParser;

import java.util.HashMap;
import java.util.List;

public class JavaFactory extends AbstractFactory {

    public Lexer getLexer(CharStream charStream) {
        return new JavaLexer(charStream);
    }

    public Parser getParser(CommonTokenStream tokens) {
        return new JavaParser(tokens);
    }

    public ParseTree getParseTree(Parser parser) {
        return ((JavaParser) parser).compilationUnit();
    }

    public ParseTreeListener getParseTreeListener(Parser parser, HashMap<String, String> stringsIdioma) {
        return new JavaListener((JavaParser) parser, stringsIdioma);
    }

    //FIXME: Usar esto o .getClass().getMethod("getMarcas", ParseTreeListener).invoke(extractor) en Simae.java?
    public List<AnotacionMarca> getMarcas(ParseTreeListener extractor) {
        return ((JavaListener) extractor).getMarcas();
    }



}
