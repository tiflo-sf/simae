package simae.lib.cPlusPlus;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import simae.lib.Lenguaje;

class ArchivoConIncludeTest extends Tests{

	@Test
	void testArchivoConIncludeTest() throws IOException {
		 prog = "#include <iostream>" + nl +
				 "int a = 4;" + nl;
		 esperado = "#include <iostream>" + nl +
				 	"int a = 4;" + nl;
		 marcado = b.testMarcado(prog, Lenguaje.CPLUSPLUS);
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
