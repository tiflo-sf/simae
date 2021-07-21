package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ArchivoConDeclaracionDeVariableTest extends Tests{

	@Test
	void testArchivoConDeclaracionDeVariableTest() throws IOException {
		 
		 prog = "int a = 4;" + nl;
		 esperado = "int a = 4;" + nl;
		 marcado = b.testMarcado(prog);
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
