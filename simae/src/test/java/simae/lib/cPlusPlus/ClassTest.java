package simae.lib.cPlusPlus;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassTest extends Tests {

	
	@Test
	void testIf() throws IOException {
		  prog = "class CRender {" + nl +
				  "public:" + nl +
				  "    char buffer[255];" + nl +
				  "    void llamadoFuncion(const char *argumento);" + nl +
				  "};" + nl;
		  esperado = "class CRender /*/CIERRA EN LINEA 5/*/{" + nl +
				  "public:" + nl +
 				  "    char buffer[255];" + nl +
				  "    void llamadoFuncion(const char *argumento);" + nl +
				  "}/*/CIERRA class CRender  DE LINEA 1/*/;" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.CPLUSPLUS);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
