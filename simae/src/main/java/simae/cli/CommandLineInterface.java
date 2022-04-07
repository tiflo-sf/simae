package simae.cli;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Callable;

import javafx.application.Application;
import picocli.CommandLine;
import simae.lib.Lenguaje;
import simae.lib.Simae;

//FIXME: faltan tests para la clase
public class CommandLineInterface implements Callable<Integer> {

	@CommandLine.Option(names = {"-i", "--in"})
	static String inputFileName;

	@CommandLine.Option(names = {"-o", "--out"})
	static String outputFileName;

	@CommandLine.Option(names = {"-l", "--language"})
	static String lenguajeString;

	public static void main(String[] args) {
		System.exit(new CommandLine(new CommandLineInterface()).execute(args));
	}

	@Override
	public Integer call() throws Exception {
		//Si no recibe argumentos, llama a la GUI

		//FIXME: mantener o modificar por la funcion marcaPorArchivos?


		//inputFileName = args[0];
		//outputFileName = args[1];
		//lenguajeString = args[2];

		Lenguaje lenguaje;

		switch(lenguajeString) {
			case "c++":
				lenguaje = Lenguaje.CPLUSPLUS;
				break;
			case "java":
				lenguaje = Lenguaje.JAVA8;
				break;
			case "python3":
				lenguaje = Lenguaje.PYTHON3;
				break;
			default:
				System.out.println("Lenguaje invalido");
				return -1;
		}

		File inputFile;
		BufferedReader inputReader;
		File workFile;
		PrintWriter workWriter;

		try {
			System.out.println(inputFileName);
			inputFile = new File(inputFileName);
			inputReader = new BufferedReader(new FileReader(inputFile));

			workFile = new File(inputFile.getPath() + ".work");
			workWriter = new PrintWriter(new FileWriter(workFile));
		} catch (IOException e) {
			System.out.println("Fallo algo en los argumentos");
			return -1;
		}

		try {
			Simae.fuenteMarcado(inputReader, workWriter, lenguaje);
			workWriter.close();
		} catch (IOException e) {
			System.out.println("Fallo en el proceso de escritura de marcas");
			return -1;
		}

		try {
			Files.move(Path.of(workFile.getPath()), Path.of(outputFileName), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Fallo en la escritura del archivo de trabajo");
		}

		return 0;
	}
}
