package simae.standalone.lib;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import simae.core.lib.AnotacionMarca;
import simae.core.lib.Lenguaje;
import simae.core.lib.Simae;
import simae.core.lib.factories.ANTLRRegistry;
import simae.core.lib.factories.abstractfactories.CPlusPlusFactory;
import simae.core.lib.factories.abstractfactories.CSharpFactory;
import simae.core.lib.factories.abstractfactories.JavaFactory;
import simae.core.lib.factories.abstractfactories.PythonFactory;
import simae.core.lib.listener.StringTags;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SimaeStandalone extends Simae {

    public static void fuenteMarcado(BufferedReader br, PrintWriter pw, Lenguaje programmingLanguage, String language) throws IOException {

        //Creado de la registry
        ANTLRRegistry antlrRegistry = new ANTLRRegistry();

        //Registro de lenguajes
        //CPlusPlusAbstractFactory.register(antlrRegistry);
        //JavaAbstractFactory.register(antlrRegistry);
        //PythonAbstractFactory.register(antlrRegistry);

        antlrRegistry.register(Lenguaje.CPLUSPLUS, new CPlusPlusFactory());
        antlrRegistry.register(Lenguaje.JAVA8, new JavaFactory());
        antlrRegistry.register(Lenguaje.PYTHON3, new PythonFactory());
        antlrRegistry.register(Lenguaje.CSHARP, new CSharpFactory());

        String armaCompleto = fuenteDesmarcado(br, programmingLanguage);
        CharStream antlrEntrada = CharStreams.fromString(armaCompleto);
        BufferedReader brPreprocesado = new BufferedReader(new StringReader(armaCompleto));
        StringTags st = new StringTags((language != null) ? language : "");
        HashMap<String, String> strings = st.getStrings();

        List<AnotacionMarca> todasMarcas = null;
        try {
            todasMarcas = iniciaTranslationUnit(antlrRegistry, antlrEntrada, programmingLanguage, language);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        algoritmoMarcado(brPreprocesado, pw, todasMarcas, strings);


    }

    private static void algoritmoMarcado(BufferedReader brPreprocesado, PrintWriter pw, List<AnotacionMarca> todasMarcas, HashMap<String, String> strings) throws IOException {

        /*
         * Se recorre la lista de marcas
         * p/cada marca hay que imprimir en
         * la salida las filas hasta que
         * la fila coincida con alguna marca
         * PARA(CadaMarca)
         * MIENTRAS(Fila != FilaMarca) IMPRIMIR(PosicionDentroDeFila, Fila.length())
         * SI NO IMPRIMIR(HastaLaMarca),IMPRIMIR(Marca) <- Guardar PosicionDentroDeFila
         */

        String entrada;
        int nroFila = 1;

        entrada = brPreprocesado.readLine();
        int posEnFila = 0;
        //Collections.sort(todasMarcas);
        Iterator<AnotacionMarca> it = todasMarcas.iterator();
        AnotacionMarca marca;
        AnotacionMarca marcaSiguiente = null;

        while (it.hasNext() || marcaSiguiente != null) {
            marca = (marcaSiguiente != null) ? marcaSiguiente : it.next();
            marcaSiguiente = it.hasNext() ? it.next() : null;

            while (nroFila != marca.getFila()) {
                pw.println(entrada.substring(posEnFila));
                entrada = brPreprocesado.readLine();
                nroFila++;
                posEnFila = 0;
            }
            // Coincide la linea, se imprime hasta la marca y luego se imprime la marca.
            pw.print(entrada.substring(posEnFila, marca.getPosicion() + 1));
            pw.print(marca.getInicioComentario());
            pw.print(marca.getMarca());

            // En este punto nroFila coincide con marca.getFila()
            // Asegurar ademas que posEnFila coincide con marca.getPosicion()
            posEnFila = marca.getPosicion();

            while (marcaSiguiente != null) {
                if (nroFila != marcaSiguiente.getFila()
                        || posEnFila != marcaSiguiente.getPosicion()) break;
                pw.print(strings.get("and") + marcaSiguiente.getMarca());
                marcaSiguiente = it.hasNext() ? it.next() : null;
            }
            pw.print(marca.getFinComentario());
            posEnFila = posEnFila + 1;
        }

        // Terminaron las marcas, imprimir el resto de la entrada
        pw.println(entrada.substring(posEnFila));
        entrada = brPreprocesado.readLine();
        while(entrada != null) {
            pw.println(entrada);
            entrada = brPreprocesado.readLine();
        }
    }

    public static void reproducirAudio(Integer caso) throws Exception {
        Clip sonido = AudioSystem.getClip();

        switch (caso) {
            case 0:
                sonido.open(AudioSystem.getAudioInputStream(SimaeStandalone.class.getResource("success.wav")));
                break;
            default:
                sonido.open(AudioSystem.getAudioInputStream(SimaeStandalone.class.getResource("error.wav")));
                break;
        }

        sonido.start();
        do {
            Thread.sleep(15);
        } while (sonido.isRunning());
        sonido.close();


    }
    public static void fuenteDesmarcado(BufferedReader br, PrintWriter pw, Lenguaje lenguaje) {

        //FIXME: la seleccion de la marca de acuerdo al lenguaje no va aca
        String gramaticaMarca = (lenguaje == Lenguaje.PYTHON3) ? "# /.*/" : "/\\*/[^/]*/\\*/";
        br.lines().forEach(linea -> pw.println(linea.replaceAll(gramaticaMarca, "")));

    }

}
