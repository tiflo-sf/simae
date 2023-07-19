package simae.core.lib.factories;

import org.antlr.v4.runtime.*;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;
import simae.core.lib.factories.abstractfactories.CPlusPlusAbstractFactory;
import simae.core.lib.factories.abstractfactories.JavaAbstractFactory;
import simae.core.lib.factories.abstractfactories.PythonAbstractFactory;

import java.util.HashMap;
import java.util.List;


public class ANTLRRegistry {

    public ANTLRRegistry() {
        registry = new HashMap<>();
    }

    //FIXME: crear una clase que tenga esta conversión junto con las de string lenguaje a Lenguaje, y de Lenguaje a string
    public Class<?> getClassFrom(Lenguaje lenguaje) {
        switch (lenguaje) {
            case CPLUSPLUS:
                return CPlusPlusAbstractFactory.class;
            case JAVA8:
                return JavaAbstractFactory.class;
            case PYTHON3:
                return PythonAbstractFactory.class;
        }

        return null;
    }

    HashMap<Class<?>, ANTLRModel> registry;

    public void registerLanguage(Class<?> lenguaje, ANTLRModel antlrModel) {
        registry.put(lenguaje, antlrModel);
    }

    public ANTLRModel getModel(Class<?> lenguaje) {
        return registry.get(lenguaje);
    }

}
