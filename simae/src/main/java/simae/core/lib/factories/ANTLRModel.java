package simae.core.lib.factories;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.listener.CPPListener;
import simae.grammars.CPP14Lexer;
import simae.grammars.CPP14Parser;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class ANTLRModel {

    public ANTLRModel(Class<?> lexer, Class<?> parser,  Class<?> parseTreeListener) {
        this.lexer = lexer;
        this.parser = parser;
        this.parseTreeListener = parseTreeListener;
    }

    Class<?> lexer;
    Class<?> parser;
    Class<?> parseTreeListener;

    public Class<?> getLexer() {
        return lexer;
    }

    public Class<?> getParser() {
        return parser;
    }

    public Class<?> getParseTreeListener() {
        return parseTreeListener;
    }

    public List<AnotacionMarca> getMarcas(ParseTreeListener extractedParseTreeListener) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (List<AnotacionMarca>) parseTreeListener.getMethod("getMarcas").invoke(parseTreeListener);
    }

}
