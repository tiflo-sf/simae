package simae.core.lib.factories;

import simae.core.lib.Lenguaje;
import simae.core.lib.factories.abstractfactories.AbstractFactory;

import java.util.HashMap;


public class ANTLRRegistry {

    HashMap<Lenguaje, AbstractFactory> registry;

    public ANTLRRegistry() {
        registry = new HashMap<>();
    }

    //FIXME: crear una clase que tenga esta conversión junto con las de string lenguaje a Lenguaje, y de Lenguaje a string
    /*public Class<?> getClassFrom(Lenguaje lenguaje) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return CPlusPlusFactory.class;
            case JAVA8:
                return JavaAbstractFactory.class;
            case PYTHON3:
                return PythonAbstractFactory.class;
        }

        return null;
    }
    */

    public void register(Lenguaje lenguaje, AbstractFactory factory) {
        registry.put(lenguaje, factory);
    }

    public AbstractFactory getFactory(Lenguaje lenguaje) {
        return registry.get(lenguaje);
    }

}
