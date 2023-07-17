package simae.core.lib;

public enum Lenguaje {


    CPLUSPLUS("C++"), JAVA8("Java"), PYTHON3("Python3");

    private String nombre;

    Lenguaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
