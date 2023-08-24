package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.listener.PythonListener;
import simae.grammars.Python3Lexer;
import simae.grammars.Python3Parser;

import java.util.HashMap;
import java.util.List;

public class PythonFactory extends AbstractFactory {

    public Lexer getLexer(CharStream charStream) {
        return new Python3Lexer(charStream);
    }

    public Parser getParser(CommonTokenStream tokens) {
        return new Python3Parser(tokens);
    }

    public ParseTree getParseTree(Parser parser) {
        return ((Python3Parser) parser).file_input();
    }

    public ParseTreeListener getParseTreeListener(Parser parser, HashMap<String, String> stringsIdioma) {
        return new PythonListener((Python3Parser) parser, stringsIdioma);
    }

    //FIXME: Usar esto o .getClass().getMethod("getMarcas", ParseTreeListener).invoke(extractor) en Simae.java?
    public List<AnotacionMarca> getMarcas(ParseTreeListener extractor) {
        return ((PythonListener) extractor).getMarcas();
    }



}
