package simae.core.lib.factories.abstractfactories;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.listener.CSharpListener;
import simae.core.lib.listener.PythonListener;
import simae.grammars.CSharpLexer;
import simae.grammars.CSharpParser;
import simae.grammars.Python3Lexer;
import simae.grammars.Python3Parser;

import java.util.HashMap;
import java.util.List;

public class CSharpFactory extends AbstractFactory {

    public Lexer getLexer(CharStream charStream) {
        return new CSharpLexer(charStream);
    }

    public Parser getParser(CommonTokenStream tokens) {
        return new CSharpParser(tokens);
    }

    public ParseTree getParseTree(Parser parser) {
        return ((CSharpParser) parser).compilation_unit();
    }

    public ParseTreeListener getParseTreeListener(Parser parser, HashMap<String, String> stringsIdioma) {
        return new CSharpListener((CSharpParser) parser, stringsIdioma);
    }

    //FIXME: Usar esto o .getClass().getMethod("getMarcas", ParseTreeListener).invoke(extractor) en Simae.java?
    public List<AnotacionMarca> getMarcas(ParseTreeListener extractor) {
        return ((CSharpListener) extractor).getMarcas();
    }



}
