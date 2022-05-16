package simae;

import simae.lib.Lenguaje;
import simae.lib.Simae;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class SimaeLauncher {
    public SimaeLauncher() {
    }

    BufferedReader inputReader = null;
    PrintWriter workWriter = null;
    File workFile = null;

    public static Lenguaje lenguaje(String lenguajeString) {
        switch(lenguajeString) {
            case "c++":
                return Lenguaje.CPLUSPLUS;
            case "java":
                return Lenguaje.JAVA8;
            case "python3":
                return Lenguaje.PYTHON3;
            default:
                System.out.println("Lenguaje invalido");
                return null;
        }
    }
    
    public boolean prepareSimae(File inputFile) {

        try {
            inputReader = new BufferedReader(new FileReader(inputFile));
            workFile = new File(inputFile.getPath() + ".work");
            workWriter = new PrintWriter(new FileWriter(workFile));
        } catch (IOException e) {
            System.out.println("Fallo algo en los argumentos");
            return false;
        }

        return true;
    }

    private boolean writeFile(String outputFileName) {
        try {
            inputReader.close();
            Files.move(Path.of(workFile.getPath()), Path.of(outputFileName), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Fallo en la escritura del archivo de trabajo");
            return false;
        }

        return true;
    }

    public boolean launchTagging(File inputFile, String outputFileName, String lenguajeString) {

        prepareSimae(inputFile);

        Lenguaje lenguaje = lenguaje(lenguajeString.toLowerCase());

        try {
            Simae.fuenteMarcado(inputReader, workWriter, lenguaje, null);
            workWriter.close();
        } catch (IOException e) {
            System.out.println("Fallo en el proceso de escritura de marcas");
            return false;
        }

        return writeFile(outputFileName);
    }

    public boolean launchUntagging(File inputFile, String outputFileName, String lenguajeString) {

        prepareSimae(inputFile);

        Lenguaje lenguaje = lenguaje(lenguajeString.toLowerCase());

        Simae.fuenteDesmarcado(inputReader, workWriter, lenguaje);
        workWriter.close();

        return writeFile(outputFileName);

    }
}
