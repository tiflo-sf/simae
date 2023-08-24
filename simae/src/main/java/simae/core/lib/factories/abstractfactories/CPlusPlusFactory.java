package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.listener.CPPListener;
import simae.grammars.CPP14Lexer;
import simae.grammars.CPP14Parser;

import java.util.HashMap;
import java.util.List;

public class CPlusPlusFactory extends AbstractFactory {

    public Lexer getLexer(CharStream charStream) {
        return new CPP14Lexer(charStream);
    }

    public Parser getParser(CommonTokenStream tokens) {
        return new CPP14Parser(tokens);
    }

    public ParseTree getParseTree(Parser parser) {
        return ((CPP14Parser) parser).translationunit();
    }

    public ParseTreeListener getParseTreeListener(Parser parser, HashMap<String, String> stringsIdioma) {
        return new CPPListener((CPP14Parser) parser, stringsIdioma);
    }

    //FIXME: Usar esto o .getClass().getMethod("getMarcas", ParseTreeListener).invoke(extractor) en Simae.java?
    public List<AnotacionMarca> getMarcas(ParseTreeListener extractor) {
        return ((CPPListener) extractor).getMarcas();
    }



}
