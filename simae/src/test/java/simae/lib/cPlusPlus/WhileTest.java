package simae.lib.cPlusPlus;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;

class WhileTest extends Tests {

	
	@Test
	void testWhile() throws IOException {
		  prog = "int main() {" + nl +
		  		"	while(c>0) {" + nl +
		  		"		c++;" + nl +
		  		"	}" + nl +
		  		"}" + nl;
		  esperado = "int main()/*/CIERRA EN LINEA 5/*/ {" + nl +
			  		"	while(c>0)/*/CIERRA EN LINEA 4/*/ {" + nl +
			  		"		c++;" + nl +
			  		"	}/*/CIERRA while(c>0) DE LINEA 2/*/" + nl +
			  		"}/*/CIERRA main() DE LINEA 1/*/" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.CPLUSPLUS);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
