package simae.lib;

// import ANTLR's runtime libraries

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.*;

import simae.grammars.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import simae.lib.listener.CPPListener;
import simae.lib.listener.JavaListener;
import simae.lib.listener.PythonListener;
import simae.lib.listener.StringTags;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Simae {

	//FIXME: reestructurar funcion para que no solo funcione con translationunit
	private static List<AnotacionMarca> iniciaTranslationUnit(CharStream antlrEntrada, Lenguaje lenguaje, String language, HashMap<String, String> strings) {

		Lexer lexer = ANTLRFactory.getLexer(lenguaje, antlrEntrada);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Parser parser = ANTLRFactory.getParser(lenguaje, tokens);
		ParseTree tree = ANTLRFactory.getTree(lenguaje, parser);
		ParseTreeListener extractor = ANTLRFactory.getListener(lenguaje, parser, strings);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(extractor, tree);

		return ANTLRFactory.getMarcas(lenguaje, extractor);
	}

	public static void fuenteDesmarcado(BufferedReader br, PrintWriter pw, Lenguaje lenguaje) {

		//FIXME: la seleccion de la marca de acuerdo al lenguaje no va aca
		String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";
		br.lines().forEach(linea -> pw.println(linea.replaceAll(gramaticaMarca, "")));

	}

	private static String fuenteDesmarcado(BufferedReader br, Lenguaje lenguaje) {
		//FIXME: la seleccion de la marca de acuerdo al lenguaje no va aca
		String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";

		StringBuilder programaCompleto = new StringBuilder();

		br.lines().forEach(linea -> programaCompleto
				.append(linea.replaceAll(gramaticaMarca, ""))
				.append("\n"));
		return programaCompleto.toString();

	}

	private static void algoritmoMarcado(BufferedReader brPreprocesado, PrintWriter pw, List<AnotacionMarca> todasMarcas, HashMap<String, String> strings) throws IOException {

		/*
		 * Se recorre la lista de marcas
		 * p/cada marca hay que imprimir en
		 * la salida las filas hasta que
		 * la fila coincida con alguna marca
		 * PARA(CadaMarca)
		 * MIENTRAS(Fila != FilaMarca) IMPRIMIR(PosicionDentroDeFila, Fila.length())
		 * SI NO IMPRIMIR(HastaLaMarca),IMPRIMIR(Marca) <- Guardar PosicionDentroDeFila
		 */

		String entrada;
		int nroFila = 1;

		entrada = brPreprocesado.readLine();
		int posEnFila = 0;
		//Collections.sort(todasMarcas);
		Iterator<AnotacionMarca> it = todasMarcas.iterator();
		AnotacionMarca marca;
		AnotacionMarca marcaSiguiente = null;

		while (it.hasNext() || marcaSiguiente != null) {
			marca = (marcaSiguiente != null) ? marcaSiguiente : it.next();
			marcaSiguiente = it.hasNext() ? it.next() : null;

			while (nroFila != marca.getFila()) {
				pw.println(entrada.substring(posEnFila));
				entrada = brPreprocesado.readLine();
				nroFila++;
				posEnFila = 0;
			}
			// Coincide la linea, se imprime hasta la marca y luego se imprime la marca.
			pw.print(entrada.substring(posEnFila, marca.getPosicion() + 1));
			pw.print(marca.getInicioComentario());
			pw.print(marca.getMarca());

			// En este punto nroFila coincide con marca.getFila()
			// Asegurar ademas que posEnFila coincide con marca.getPosicion()
			posEnFila = marca.getPosicion();

			while (marcaSiguiente != null) {
				if (nroFila != marcaSiguiente.getFila()
						|| posEnFila != marcaSiguiente.getPosicion()) break;
				pw.print(strings.get("and") + marcaSiguiente.getMarca());
				marcaSiguiente = it.hasNext() ? it.next() : null;
			}
			pw.print(marca.getFinComentario());
			posEnFila = posEnFila + 1;
		}

		// Terminaron las marcas, imprimir el resto de la entrada
		pw.println(entrada.substring(posEnFila));
		entrada = brPreprocesado.readLine();
		while(entrada != null) {
			pw.println(entrada);
			entrada = brPreprocesado.readLine();
		}
	}

	public static void fuenteMarcado(BufferedReader br, PrintWriter pw, Lenguaje programmingLanguage, String language) throws IOException {

		String armaCompleto = fuenteDesmarcado(br, programmingLanguage);

		CharStream antlrEntrada = CharStreams.fromString(armaCompleto);
		
		BufferedReader brPreprocesado = new BufferedReader(new StringReader(armaCompleto));

		StringTags st = new StringTags((language != null) ? language : "");
		HashMap<String, String> strings = st.getStrings();

		List<AnotacionMarca> todasMarcas = iniciaTranslationUnit(antlrEntrada, programmingLanguage, language, strings);

        algoritmoMarcado(brPreprocesado, pw, todasMarcas, strings);

	}

	public static void reproducirAudio(Integer caso) throws Exception {
		Clip sonido = AudioSystem.getClip();

		switch (caso) {
			case 0:
				sonido.open(AudioSystem.getAudioInputStream(Simae.class.getResource("success.wav")));
				break;
			default:
				sonido.open(AudioSystem.getAudioInputStream(Simae.class.getResource("error.wav")));
				break;
		}

		sonido.start();
		do {
			Thread.sleep(15);
		} while (sonido.isRunning());
		sonido.close();

	}
}