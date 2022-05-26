package simae.lib.python;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfElseTest extends Tests {

	
	@Test
	void testIfELse() throws IOException {
		  prog = "if(p==1):" + nl +
				  "	p=0" + nl +
				  "else:" + nl +
				  "	p=1" + nl;
		  esperado = "if(p==1):# /CIERRA EN LINEA 2/" + nl +
				  "	p=0# /CIERRA if(p==1) DE LINEA 1/" + nl +
				  "else:# /CIERRA EN LINEA 4/" + nl +
				  "	p=1# /CIERRA else DE LÍNEA 3/" +nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.PYTHON3);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
