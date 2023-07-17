package simae.api;

import simae.core.SimaeLauncher;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;

import java.io.*;
import java.util.List;

public class SimaeLauncherAPI extends SimaeLauncher {
    public List<AnotacionMarca> obtenerMarcas(File inputFile, String lenguajeString) throws FileNotFoundException {
        BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
        Lenguaje programmingLenguage = lenguaje(lenguajeString);
        return SimaeAPI.fuenteMarcado(inputReader, programmingLenguage, null);
    }

}