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
		  prog = "public class Main {" + nl +
				  nl +
				  "}" + nl;
		  esperado = "public class Main /*/CIERRA EN LINEA 3/*/{" + nl +
				  nl +
				  "}/*/CIERRA class Main DE LINEA 1/*/" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8, "es");
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
