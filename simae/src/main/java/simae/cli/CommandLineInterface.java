package simae.cli;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

import javafx.application.Application;
import picocli.CommandLine;
import simae.lib.Lenguaje;
import simae.lib.Simae;

//FIXME: faltan tests para la clase
@CommandLine.Command(resourceBundle = "simae.languages.Interfaz", name="")
public class CommandLineInterface implements Callable<Integer> {

	@CommandLine.Option(names = { "-l", "--language" }, descriptionKey = "language")
	void setLocale(String language) {
		Locale.setDefault(new Locale(language));
	}

	//static String language;
	//Usar este language en vez de ver cual es el locale del so en en listener.
	ResourceBundle rb = ResourceBundle.getBundle("simae.languages.Interfaz", Locale.getDefault());
	//@CommandLine.Option(names = {"-i", "--in"})
	@CommandLine.Parameters(index="0", arity="0..1", descriptionKey = "input")
	static String inputFile;

	@CommandLine.Option(names = {"-o", "--out"}, required=false, descriptionKey = "output")
	static String outputFile;

	@CommandLine.Option(names = {"-pl", "--programmingLanguage"}, descriptionKey="programmingLanguage", required=false)
	static String lenguajeString;
	@CommandLine.Option(names = {"-g", "--gui"}, required=false, descriptionKey = "gui")
	static Boolean gui;
	//@CommandLine.Option(names = {"-l", "language"}, required=false, descriptionKey = "lenguajeMarcado")
	//static String language;

	static @CommandLine.Spec
	CommandLine.Model.CommandSpec spec;



	public static void main(String[] args) {
		try {
			new CommandLine(new CommandLineInterface()).parseArgs(args);
			new CommandLine(new CommandLineInterface()).execute(args);
		} catch(CommandLine.UnmatchedArgumentException e){
			spec.commandLine().usage(System.out.printf("Argumento no definido. \n"));
		} catch(picocli.CommandLine.MissingParameterException e){
			spec.commandLine().usage(System.out.printf("Falta valor al argumento. \n"));
		}

	}

	@Override
	public Integer call() throws Exception {
		//System.out.println(language);
		//si se pasa parametro de la gui
		if (inputFile == null && gui == null) {
			spec.commandLine().usage(System.out.printf((String) rb.getObject("emptyInput")));
			return -1;
		}
		if (gui != null) {
			Application.launch(simae.gui.SelectorApplication.class);
			return 0;
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
			switch (lenguajeString) {
				case "c++":
				case ".cpp":
					programmingLenguage = Lenguaje.CPLUSPLUS;
					break;
				case "java":
				case ".java":
					programmingLenguage = Lenguaje.JAVA8;
					break;
				case "python3":
				case ".py":
					programmingLenguage = Lenguaje.PYTHON3;
					break;
				default:
					spec.commandLine().usage(System.out.printf((String) rb.getObject("extension")));
					return -1;
			}

			File inputFile;
			BufferedReader inputReader;
			File workFile;
			PrintWriter workWriter;

			try {
				inputFile = new File(CommandLineInterface.inputFile);
				inputReader = new BufferedReader(new FileReader(inputFile));
				workFile = new File(inputFile.getPath() + ".work");
				workWriter = new PrintWriter(new FileWriter(workFile));
			} catch (IOException e) {
				System.out.println((String) rb.getObject("invalidInput"));
				return -1;
			}

			try {
				Simae.fuenteMarcado(inputReader, workWriter, programmingLenguage, null);
				workWriter.close();
			} catch (IOException e) {
				System.out.println((String) rb.getObject("falloMarcado"));
				return -1;
			}

			try {
				Files.move(Path.of(workFile.getPath()), Path.of(outputFile), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.println((String) rb.getObject("workFileError"));
			}
			System.out.printf((String) rb.getObject("success"));
			return 0;
		}
	}
		private String getFileExtension (String name){
			int lastIndexOf = name.lastIndexOf(".");
			if (lastIndexOf == -1) {
				return ""; // empty extension
			}
			return name.substring(lastIndexOf);
		}
	}

