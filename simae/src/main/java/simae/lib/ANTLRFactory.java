package simae.lib;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.grammars.*;
import simae.lib.listener.CPPListener;
import simae.lib.listener.JavaListener;
import simae.lib.listener.PythonListener;
import simae.lib.listener.StringTags;

import java.util.HashMap;
import java.util.List;

public abstract class ANTLRFactory {

    public static Lexer getLexer(Lenguaje lenguaje, CharStream antlrEntrada) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return new CPP14Lexer(antlrEntrada);
            case JAVA8:
                return new JavaLexer(antlrEntrada);
            case PYTHON3:
                return new Python3Lexer(antlrEntrada);
        }

        return null;
    }

    public static Parser getParser(Lenguaje lenguaje, CommonTokenStream tokens) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return new CPP14Parser(tokens);
            case JAVA8:
                return new JavaParser(tokens);
            case PYTHON3:
                return new Python3Parser(tokens);
        }

        return null;
    }

    public static ParseTree getTree(Lenguaje lenguaje, Parser parser) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return ((CPP14Parser) parser).translationunit();
            case JAVA8:
                return ((JavaParser) parser).compilationUnit();
            case PYTHON3:
                return ((Python3Parser) parser).file_input();
        }

        return null;
    }

    public static ParseTreeListener getListener(Lenguaje lenguaje, Parser parser, HashMap<String, String> strings) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return new CPPListener((CPP14Parser) parser, strings);
            case JAVA8:
                return new JavaListener((JavaParser) parser, strings);
            case PYTHON3:
                return new PythonListener((Python3Parser) parser, strings);
        }

        return null;
    }

    public static List<AnotacionMarca> getMarcas(Lenguaje lenguaje, ParseTreeListener parseTreeListener) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return ((CPPListener) parseTreeListener).getMarcas();
            case JAVA8:
                return ((JavaListener) parseTreeListener).getMarcas();
            case PYTHON3:
                return ((PythonListener) parseTreeListener).getMarcas();
        }

        return null;
    }

}
