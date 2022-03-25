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

import javafx.application.Application;
import simae.lib.Lenguaje;
import simae.lib.Simae;

//FIXME: faltan tests para la clase
public class CommandLineInterface {
	
	public static void main(String[] args) {

		//Si no recibe argumentos, llama a la GUI

		if (args.length == 0) {
			Application.launch(simae.gui.SelectorApplication.class,args);
			return;
		}

		//FIXME: mantener o modificar por la funcion marcaPorArchivos?

		String inputFileName;
		String outputFileName;
		String lenguajeString;
		Lenguaje lenguaje;

		if (args.length < 3) {
			System.out.println("Faltan los argumentos");
			return;
		}
				
		inputFileName = args[0];
		outputFileName = args[1];
		lenguajeString = args[2];

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
				return;
		}

		File inputFile;
		BufferedReader inputReader;
		File workFile;
		PrintWriter workWriter;
		
		try {
			inputFile = new File(inputFileName);
			inputReader = new BufferedReader(new FileReader(inputFile));
			
			workFile = new File(inputFile.getPath() + ".work");	
			workWriter = new PrintWriter(new FileWriter(workFile));
		} catch (IOException e) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println("Fallo algo en los argumentos");
			return;
		}	
		
		try {
			Simae.fuenteMarcado(inputReader, workWriter, lenguaje);
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
	
}
