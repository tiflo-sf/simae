package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassTest extends Tests {

	
	@Test
	void classTest() throws IOException {
		  prog = "public class Main {\n" +
				  "\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 3/*/{\n" +
				  "\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
