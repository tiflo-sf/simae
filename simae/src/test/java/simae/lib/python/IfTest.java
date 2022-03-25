package simae.lib.python;

import org.junit.jupiter.api.Test;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfTest extends Tests {

	
	@Test
	void ifTest() throws IOException {
		  prog = "a = 33\n" +
				  "b = 200\n" +
				  "if b > a:\n" +
				  "  print(\"b is greater than a\")";
		  esperado = "a = 33\n" +
				  "b = 200\n" +
				  "if b > a:# /CIERRA EN LINEA 4/\n" +
				  "  print(\"b is greater than a\")# /CIERRA if b > a DE LINEA 3/\n";
		  marcado = b.testMarcado(prog, Lenguaje.PYTHON3);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
