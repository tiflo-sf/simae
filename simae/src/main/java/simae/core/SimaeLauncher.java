package simae.core;

import simae.core.lib.Lenguaje;

public class SimaeLauncher {

    private static String VERSION = "SIMAE 0.2.2";
    public SimaeLauncher() {
    }

    public static String getVERSION() {
        return VERSION;
    }

    public static Lenguaje lenguaje(String lenguajeString) {
        switch(lenguajeString) {
            case "c++":
            case ".cpp":
                return Lenguaje.CPLUSPLUS;
            case "java":
            case ".java":
            case "java8":
                return Lenguaje.JAVA8;
            case "python3":
            case ".py":
                return Lenguaje.PYTHON3;
            case "cSharp":
            case ".cs":
                return Lenguaje.CSHARP;
            default:
                System.out.println("Lenguaje no valido");
                return null;
        }
    }


}