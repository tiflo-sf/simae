package simae.core.lib;

// import ANTLR's runtime libraries

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import simae.core.lib.factories.ANTLRRegistry;
import simae.core.lib.factories.abstractfactories.AbstractFactory;
import simae.core.lib.listener.StringTags;

import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;


public class Simae {

	//FIXME: reestructurar funcion para que no solo funcione con translationunit
	protected static List<AnotacionMarca> iniciaTranslationUnit(ANTLRRegistry antlrRegistry, CharStream antlrEntrada, Lenguaje lenguaje, String language) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		StringTags st;
		HashMap<String, String> strings;
		st = new StringTags((language != null) ? language : "");
		strings = st.getStrings();

		//Class<?> claseLenguaje = antlrRegistry.getClassFrom(lenguaje);
		//ANTLRModel antlrModel = antlrRegistry.getFactory(claseLenguaje);

		AbstractFactory factory = antlrRegistry.getFactory(lenguaje);

		Lexer lexer = factory.getLexer(antlrEntrada);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Parser parser = factory.getParser(tokens);
		ParseTree tree = factory.getParseTree(parser);
		ParseTreeListener extractor = factory.getParseTreeListener(parser, strings);
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		walker.walk(extractor, tree); // initiate walk of tree with listener

		//System.out.println(extractor.marcas);

		return factory.getMarcas(extractor);


		//Class<?> lexerClass = factory.getLexer();
		//Lexer lexer = (Lexer) lexerClass.getDeclaredConstructor(CharStream.class).newInstance(antlrEntrada);
		//Class<?> parserClass = factory.getParser();

		//Lexer lexer = ANTLRFactory.getLexer(lenguaje, antlrEntrada);
		//Lexer lexer = ANTLRRegistry.getLexer(lenguaje).fromInput(antlrEntrada);
		//Parser parser = ANTLRFactory.getParser(lenguaje, tokens);
		//ParseTree tree = ANTLRFactory.getTree(lenguaje, parser);
		//ParseTreeListener extractor = ANTLRFactory.getListener(lenguaje, parser, strings);
/*
		Lexer lexer = null;
		lexer = (Lexer) antlrModel.getLexer().getDeclaredConstructor(CharStream.class).newInstance(antlrEntrada);

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Parser parser = (Parser) antlrModel.getParser().getDeclaredConstructor(TokenStream.class).newInstance(tokens);

		ParseTree tree = (ParseTree) (claseLenguaje.getMethod("getParseTree", Parser.class).invoke(null, parser));
		ParseTreeListener extractor = (ParseTreeListener) antlrModel.getParseTreeListener().getDeclaredConstructor(antlrModel.getParser(), HashMap.class).newInstance(parser, strings);

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(extractor, tree);

		return (List<AnotacionMarca>) extractor.getClass().getMethod("getMarcas").invoke(extractor);
		*/
	}



	protected static String fuenteDesmarcado(BufferedReader br, Lenguaje lenguaje) {
		//FIXME: la seleccion de la marca de acuerdo al lenguaje no va aca
		String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";

		StringBuilder programaCompleto = new StringBuilder();

		br.lines().forEach(linea -> programaCompleto
				.append(linea.replaceAll(gramaticaMarca, ""))
				.append("\n"));
		return programaCompleto.toString();

	}




}