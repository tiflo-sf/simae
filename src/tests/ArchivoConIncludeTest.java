package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ArchivoConIncludeTest extends Tests{

	@Test
	void testArchivoConIncludeTest() throws IOException {
		 prog = "#include <iostream>" + nl +
				 "int a = 4;" + nl;
		 esperado = "#include <iostream>" + nl +
				 	"int a = 4;" + nl;
		 marcado = b.testMarcado(prog);
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
