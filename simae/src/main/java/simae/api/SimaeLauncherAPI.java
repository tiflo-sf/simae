package simae.api;

import simae.core.SimaeLauncher;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.List;

public class SimaeLauncherAPI extends SimaeLauncher {
    public List<AnotacionMarca> obtenerMarcas(File inputFile, String lenguajeString, Charset codificacion, String idioma) throws FileNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        InputStream inputStream = new FileInputStream(inputFile);
        InputStreamReader reader = new InputStreamReader(inputStream, codificacion);
        BufferedReader inputReader = new BufferedReader(reader);
        Lenguaje programmingLenguage = lenguaje(lenguajeString);
        return SimaeAPI.fuenteMarcado(inputReader, programmingLenguage, idioma);
    }

}
