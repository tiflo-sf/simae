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
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.Simae;

//FIXME: faltan tests para la clase
public class CommandLineInterface implements Callable<Integer> {

	@CommandLine.Option(names = {"-i", "--in"})
	static String inputFileName;

	@CommandLine.Option(names = {"-o", "--out"})
	static String outputFileName;

	@CommandLine.Option(names = {"-pl", "--programmingLanguage"})
	static String lenguajeString;
	@CommandLine.Option(names = {"-g", "--gui"})
	static Boolean gui;
	@CommandLine.Option(names = {"-l", "language"})
	static String language;

	public static void main(String[] args) {
		System.exit(new CommandLine(new CommandLineInterface()).execute(args));
	}

	@Override
	public Integer call() throws Exception {
		if ((inputFileName == null || outputFileName == null || lenguajeString == null) && gui == null) {
			System.out.println("Algun parametro esta vacio");
		} else {
			if (gui != null && gui) {
				Application.launch(simae.gui.SelectorApplication.class);
				return 0;
			}
			//FIXME: mantener o modificar por la funcion marcaPorArchivos?


			//inputFileName = args[0];
			//outputFileName = args[1];
			//lenguajeString = args[2];

			Lenguaje programmingLenguage;

			switch (lenguajeString) {
				case "c++":
					programmingLenguage = Lenguaje.CPLUSPLUS;
					break;
				case "java":
					programmingLenguage = Lenguaje.JAVA8;
					break;
				case "python3":
					programmingLenguage = Lenguaje.PYTHON3;
					break;
				default:
					System.out.println("Lenguaje invalido");
					return -1;
			}

			File inputFile = new File(inputFileName);

			SimaeLauncher simaeLauncher = new SimaeLauncher();

			simaeLauncher.launchTagging(inputFile, outputFileName, lenguajeString);
		}
		return 0;
	}

	}
