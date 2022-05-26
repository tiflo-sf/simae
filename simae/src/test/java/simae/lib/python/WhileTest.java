package simae.lib.python;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhileTest extends Tests {

	
	@Test
	void testWhile() throws IOException {
		  prog = "while(c):" + nl +
				 "    print(\"print1\")" + nl +
				 "print(\"print2\")" + nl;
		  esperado = "while(c):# /CIERRA EN LINEA 2/" + nl +
			  		"    print(\"print1\")# /CIERRA while(c) DE LINEA 1/" + nl +
			  		"print(\"print2\")" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.PYTHON3);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
