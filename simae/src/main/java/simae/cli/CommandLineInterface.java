package simae.cli;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

import javafx.application.Application;
import picocli.CommandLine;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.Simae;

//FIXME: faltan tests para la clase
@CommandLine.Command(resourceBundle = "simae.languages.Interfaz", name="SIMAE")
public class CommandLineInterface implements Callable<Integer> {

	@CommandLine.Option(names = { "-l", "--language" }, descriptionKey = "language", paramLabel = "language")
	void setLocale(String language) {
		Locale.setDefault(new Locale(language));
	}

	ResourceBundle rb = ResourceBundle.getBundle("simae.languages.Interfaz", Locale.getDefault());

	@CommandLine.Parameters(index="0", arity="0..1", descriptionKey = "input", paramLabel = "input")
	static String inputFile;

	@CommandLine.Option(names = {"-o", "--out"}, required=false, descriptionKey = "output", paramLabel = "out")
	static String outputFile;

	@CommandLine.Option(names = {"-pl", "--programmingLanguage"}, descriptionKey="programmingLanguage", required=false, paramLabel = "programmingLanguage")
	static String lenguajeString;

	@CommandLine.Option(names = {"-g", "--gui"}, required=false, descriptionKey = "gui")
	static Boolean gui;

	static @CommandLine.Spec
	CommandLine.Model.CommandSpec spec;


	public static void main(String[] args) {
		ResourceBundle rb2 = ResourceBundle.getBundle("simae.languages.Interfaz", Locale.getDefault());
		try {
			new CommandLine(new CommandLineInterface()).parseArgs(args);
			new CommandLine(new CommandLineInterface()).execute(args);
		} catch(CommandLine.UnmatchedArgumentException e){
			spec.commandLine().usage(System.out.printf(rb2.getObject("undefinedArgument1")+ e.getUnmatched().toString() + rb2.getObject("undefinedArgument2")));
		} catch(picocli.CommandLine.MissingParameterException e){
			spec.commandLine().usage(System.out.printf(rb2.getObject("missing") + e.getMissing().get(0).paramLabel() + ". \n"));
		} catch(java.util.MissingResourceException e){
			System.out.println((String) rb2.getObject("missingResource"));
		}

	}
	@Override
	public Integer call() {

		if (gui == null && inputFile == null && outputFile == null && lenguajeString == null) {
			Application.launch(simae.gui.SelectorApplication.class);
			return 0;
		}

		if (inputFile == null && gui == null) {
			spec.commandLine().usage(System.out.printf((String) rb.getObject("emptyInput")));
			return -1;
		}

		if (gui != null) {
			Application.launch(simae.gui.SelectorApplication.class);
		} else {
			//FIXME: mantener o modificar por la funcion marcaPorArchivos?

			//si outputfilename no
			if (outputFile == null) {
				outputFile = inputFile;
			}

			Lenguaje programmingLenguage;

			if (lenguajeString == null) {
				lenguajeString = this.getFileExtension(inputFile);
			}
			switch (lenguajeString) { //FIXME: esto esta hardcodeado
				case "c++":
				case ".cpp":
					programmingLenguage = Lenguaje.CPLUSPLUS;
					lenguajeString = "c++";
					break;
				case "java8":
				case ".java":
					programmingLenguage = Lenguaje.JAVA8;
					lenguajeString = "java8";
					break;
				case "python3":
				case ".py":
					programmingLenguage = Lenguaje.PYTHON3;
					lenguajeString = "python3";
					break;
				default:
					spec.commandLine().usage(System.out.printf((String) rb.getObject("extension")));
					return -1;
			}

			SimaeLauncher launcher = new SimaeLauncher();

			File fileToMark = new File(inputFile);

			if (!fileToMark.exists()) {
				System.out.println((String) rb.getObject("invalidInput"));
				return 1;
			}

			switch (launcher.launchTagging(new File(inputFile), outputFile, lenguajeString)) {
				case 0:
					System.out.printf((String) rb.getObject("success"));
					break;
				case 1:
					System.out.println((String) rb.getObject("falloMarcado"));
					break;
				case 2:
					System.out.println((String) rb.getObject("workFileError"));
			}

		}
		return 0;
	}
		private String getFileExtension (String name){
			int lastIndexOf = name.lastIndexOf(".");
			if (lastIndexOf == -1) {
				return ""; // empty extension
			}
			return name.substring(lastIndexOf);
		}
	}

