package simae;

import simae.lib.Lenguaje;
import simae.lib.Simae;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class SimaeLauncher {

    private String version = "0.1.5";
    public SimaeLauncher() {
    }

    BufferedReader inputReader = null;
    PrintWriter workWriter = null;
    File workFile = null;

    public String getVersion() {
        return version;
    }

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

    public int launchTagging(File inputFile, String outputFileName, String lenguajeString) {

        prepareSimae(inputFile);

        Lenguaje lenguaje = lenguaje(lenguajeString.toLowerCase());

        try {
            Simae.fuenteMarcado(inputReader, workWriter, lenguaje, null);
            workWriter.close();
        } catch (IOException e) {
            //System.out.println("Fallo en el proceso de escritura de marcas"); FIXME: este mensaje se deberia dar en la CLI, no en launchTagging
            return 1;
        }

        return writeFile(outputFileName) ? 0 : 2;
    }

    public static String launchTagging(String entrada, Lenguaje lenguaje) throws IOException {

        StringReader srEntrada = new StringReader(entrada);
        BufferedReader reader = new BufferedReader(srEntrada);

        StringWriter swSalida = new StringWriter();
        PrintWriter writer = new PrintWriter(swSalida);

        Simae.fuenteMarcado(reader, writer, lenguaje, null);

        String salida = swSalida.toString();

        srEntrada.close();
        swSalida.close();
        return salida;
    }

    public boolean launchUntagging(File inputFile, String outputFileName, String lenguajeString) {

        prepareSimae(inputFile);

        Lenguaje lenguaje = lenguaje(lenguajeString.toLowerCase());

        Simae.fuenteDesmarcado(inputReader, workWriter, lenguaje);
        workWriter.close();

        return writeFile(outputFileName);

    }
}
