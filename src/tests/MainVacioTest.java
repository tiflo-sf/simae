package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class MainVacioTest extends Tests {

	
	@Test
	void testMainSinCuerpoDosLineas() throws IOException {
		  prog = "int main() {" + nl + "}" + nl;
		  esperado = "int main()/*/CIERRA EN LINEA 2/*/ {" + nl +
		  		"}/*/CIERRA main() DE LINEA 1/*/" + nl;
		  marcado = b.testMarcado(prog);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
