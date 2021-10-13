package simae.lib;

// import ANTLR's runtime libraries

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import simae.grammars.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import simae.lib.listener.CPPListener;
import simae.lib.listener.JavaListener;
import simae.lib.listener.PythonListener;

public class Simae {
	
	//FIXME: reestructurar funcion para que no solo funcione con translationunit
	private static List<AnotacionMarca> iniciaTranslationUnit(ANTLRInputStream antlrEntrada, Lenguaje lenguaje) throws IOException {

		if (lenguaje == Lenguaje.CPLUSPLUS) {
			CPP14Lexer lexer = new CPP14Lexer(antlrEntrada);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CPP14Parser parser = new CPP14Parser(tokens);
			ParseTree tree = parser.translationunit();
			CPPListener extractor = new CPPListener(parser);
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			walker.walk(extractor, tree); // initiate walk of tree with listener

			//System.out.println(extractor.marcas);

			return extractor.getMarcas();
		}
		else if (lenguaje == Lenguaje.JAVA8) {
				JavaLexer lexer = new JavaLexer(antlrEntrada);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				JavaParser parser = new JavaParser(tokens);
				ParseTree tree = parser.compilationUnit();
				JavaListener extractor = new JavaListener(parser);
				ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
				walker.walk(extractor, tree); // initiate walk of tree with listener

				//System.out.println(extractor.marcas);

				return extractor.getMarcas();
		}
		else if (lenguaje == Lenguaje.PYTHON3) {
			Python3Lexer lexer = new Python3Lexer(antlrEntrada);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Python3Parser parser = new Python3Parser(tokens);
			ParseTree tree = parser.file_input();
			PythonListener extractor = new PythonListener(parser);
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			walker.walk(extractor, tree); // initiate walk of tree with listener

			//System.out.println(extractor.marcas);

			return extractor.getMarcas();
		}

		return null;
	}

	public static void fuenteDesmarcado(BufferedReader br, PrintWriter pw, Lenguaje lenguaje) {

		String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";
		br.lines().forEach(linea -> pw.println(linea.replaceAll(gramaticaMarca, "")));

	}

	public static void fuenteMarcado(BufferedReader br, PrintWriter pw, Lenguaje lenguaje) throws IOException {
		
		StringBuilder armaCompleto = new StringBuilder();

		String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";

		br.lines().forEach(linea -> armaCompleto
												.append(linea.replaceAll(gramaticaMarca, ""))
												.append("\n"));
		String armaCompletoStr = armaCompleto.toString();
		
		ANTLRInputStream antlrEntrada = new ANTLRInputStream(armaCompletoStr);
		
		BufferedReader brPreprocesado = new BufferedReader(new StringReader(armaCompletoStr));
		
		List<AnotacionMarca> todasMarcas = iniciaTranslationUnit(antlrEntrada, lenguaje);

        String entrada = "";
        int nroFila = 1;
        
        /* 
         * Se recorre la lista de marcas 
         * p/cada marca hay que imprimir en
         * la salida las filas hasta que
         * la fila coincida con alguna marca
         * PARA(CadaMarca)
         * MIENTRAS(Fila != FilaMarca) IMPRIMIR(PosicionDentroDeFila, Fila.length())
         * SI NO IMPRIMIR(HastaLaMarca),IMPRIMIR(Marca) <- Guardar PosicionDentroDeFila
        */
        entrada = brPreprocesado.readLine();
        int posEnFila = 0;
        Collections.sort(todasMarcas);
        Iterator<AnotacionMarca> it = todasMarcas.iterator();
        boolean yaEstaCargadaLaMarcaSiguiente = false;
        AnotacionMarca marca = null;
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

				pw.print(" y " + marcaSiguiente.getMarca());
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

	public void marcaDesmarcaPorArchivos(File inputFile, String outputFileName, String lenguajeString, char operacion) {
		BufferedReader inputReader;
		File workFile;
		PrintWriter workWriter;

		Lenguaje lenguaje;

		switch(lenguajeString)/*/CIERRA EN LINEA 44/*/ {
			case "c++":
			case "C++":
				lenguaje = Lenguaje.CPLUSPLUS;
				break;
			case "java8":
			case "Java":
				lenguaje = Lenguaje.JAVA8;
				break;
			case "python3":
			case "Python":
				lenguaje = Lenguaje.PYTHON3;
				break;
			default:
				System.out.println("Lenguaje invalido");
				return;
		}

		try {
			inputReader = new BufferedReader(new FileReader(inputFile));

			workFile = new File(inputFile.getPath() + ".work");
			workWriter = new PrintWriter(new FileWriter(workFile));
		} catch (IOException e) {
			System.out.println("Fallo algo en los argumentos");
			return;
		}

		try {
			if(operacion == 'M')
				fuenteMarcado(inputReader, workWriter, lenguaje);
			else
				fuenteDesmarcado(inputReader, workWriter, lenguaje);
			workWriter.close();
		} catch (IOException e) {
			System.out.println("Fallo en el proceso de escritura de marcas");
			return;
		}

		try {
			Files.move(Path.of(workFile.getPath()), Path.of(outputFileName), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Fallo en la escritura del archivo de trabajo");
		}

	}

	public String testMarcado(String entrada, Lenguaje lenguaje) throws IOException {

		StringReader srEntrada = new StringReader(entrada);
		BufferedReader reader = new BufferedReader(srEntrada);
		
		StringWriter swSalida = new StringWriter();
		PrintWriter writer = new PrintWriter(swSalida);
		
		fuenteMarcado(reader, writer, lenguaje);
		
		String salida = swSalida.toString();
		
		srEntrada.close();
		swSalida.close();
		return salida;
	}
}