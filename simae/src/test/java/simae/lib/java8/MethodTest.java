package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodTest extends Tests {

	
	@Test
	void methodTest() throws IOException {
		  prog = "public class Main {\n" +
				  "\n" +
				  "    public void haceAlgo() {\n" +
				  "        System.out.println(\"Test\");\n" +
				  "    }\n" +
				  "\n" +
				  "    public static void main(String[] args) {\n" +
				  "\n" +
				  "    }\n" +
				  "    \n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 11/*/{\n" +
				  "\n" +
				  "    public void haceAlgo()/*/CIERRA EN LINEA 5/*/ {\n" +
				  "        System.out.println(\"Test\");\n" +
				  "    }/*/CIERRA void haceAlgo() DE LINEA 3/*/\n" +
				  "\n" +
				  "    public static void main(String[] args)/*/CIERRA EN LINEA 9/*/ {\n" +
				  "\n" +
				  "    }/*/CIERRA void main(String[] args) DE LINEA 7/*/\n" +
				  "    \n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
