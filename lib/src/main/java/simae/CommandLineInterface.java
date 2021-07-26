package simae;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

//FIXME: faltan tests para la clase
public class CommandLineInterface {
	
	public static void main(String[] args) {
		
		String inputFileName;
		String outputFileName;
		
		if (args.length < 2) {
			System.out.println("Faltan los argumentos");
			return;
		}
				
		inputFileName = args[0];
		outputFileName = args[1];
		
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
			System.out.println("Fallo algo en los argumentos");
			return;
		}	
		
		try {
			Simae.fuenteMarcado(inputReader, workWriter);	
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
