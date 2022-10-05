package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfTest extends Tests {

	
	@Test
	void ifTest() throws IOException {
		  prog = "public class Main {\n" +
				  "\n" +
				  "    public static void main(String[] args) {\n" +
				  "        int a = 5, b = 10, c = 1;\n" +
				  "        if (c == 5) {\n" +
				  "            c = a + b;\n" +
				  "            b = c - b;\n" +
				  "        }\n" +
				  "    }\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 10/*/{\n" +
				  "\n" +
				  "    public static void main(String[] args)/*/CIERRA EN LINEA 9/*/ {\n" +
				  "        int a = 5, b = 10, c = 1;\n" +
				  "        if (c == 5)/*/CIERRA EN LINEA 8/*/ {\n" +
				  "            c = a + b;\n" +
				  "            b = c - b;\n" +
				  "        }/*/CIERRA if (c == 5) DE LINEA 5/*/\n" +
				  "    }/*/CIERRA void main(String[] args) DE LINEA 3/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8, "es");
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
