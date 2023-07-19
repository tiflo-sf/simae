package simae.api;

import simae.core.lib.AnotacionMarca;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class API {

    public static void main(String[] args) {
        String filename = args[0];
        String languageString = getFileExtension(filename);
        SimaeLauncherAPI launcher = new SimaeLauncherAPI();
        List<AnotacionMarca> marcas = null;
        try {
            marcas = launcher.obtenerMarcas(new File(filename), languageString);
        } catch (FileNotFoundException e) {
            System.out.println("Fallo la lectura del archivo");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (AnotacionMarca marca : marcas) {
            System.out.println(marca);
        }
    }



    private static String getFileExtension (String name){
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }

}

