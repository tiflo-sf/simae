package simae.lib.cPlusPlus;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;

class ArchivoConDeclaracionDeVariableTest extends Tests{

	@Test
	void testArchivoConDeclaracionDeVariableTest() throws IOException {
		 
		 prog = "int a = 4;" + nl;
		 esperado = "int a = 4;" + nl;
		 marcado = SimaeLauncher.launchTagging(prog, Lenguaje.CPLUSPLUS);
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
