package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchTest extends Tests {

	
	@Test
	void switchTest() throws IOException {
		  prog = "public class Main {\n" +
				  "\n" +
				  "    public static void main(String[] args) {\n" +
				  "        int c = 3;\n" +
				  "        switch (c) {\n" +
				  "            case 1:\n" +
				  "\n" +
				  "            case 2:\n" +
				  "\n" +
				  "            case 3:\n" +
				  "\n" +
				  "        }\n" +
				  "    }\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 14/*/{\n" +
				  "\n" +
				  "    public static void main(String[] args)/*/CIERRA EN LINEA 13/*/ {\n" +
				  "        int c = 3;\n" +
				  "        switch (c)/*/CIERRA EN LINEA 12/*/ {\n" +
				  "            case 1:\n" +
				  "\n" +
				  "            case 2:\n" +
				  "\n" +
				  "            case 3:\n" +
				  "\n" +
				  "        }/*/CIERRA switch (c) DE LINEA 5/*/\n" +
				  "    }/*/CIERRA void main(String[] args) DE LINEA 3/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8, "es");
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
