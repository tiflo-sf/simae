package simae.lib.cPlusPlus;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;

class ArchivoConIncludeTest extends Tests{

	@Test
	void testArchivoConIncludeTest() throws IOException {
		 prog = "#include <iostream>" + nl +
				 "int a = 4;" + nl;
		 esperado = "#include <iostream>" + nl +
				 	"int a = 4;" + nl;
		 marcado = SimaeLauncher.launchTagging(prog, Lenguaje.CPLUSPLUS, "es");
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
