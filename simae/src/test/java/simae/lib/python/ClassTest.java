package simae.lib.python;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassTest extends Tests {

	
	@Test
	void testWhile() throws IOException {
		  prog = "class MyClass:\n" +
				  "  x = 5" + nl;
		  esperado = "class MyClass:# /CIERRA EN LINEA 2/\n" +
				  "  x = 5# /CIERRA class MyClass DE LINEA 1/" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.PYTHON3);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
