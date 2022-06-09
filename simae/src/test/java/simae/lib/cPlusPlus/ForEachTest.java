package simae.lib.cPlusPlus;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;

class ForEachTest extends Tests {

	
	@Test
	void testForEach() throws IOException {
		  prog = "int main() {" + nl +
		  		"	for(int it : vector) {" + nl +
		  		"		c++;" + nl +
		  		"	}" + nl +
		  		"}" + nl;
		  esperado = "int main()/*/CIERRA EN LINEA 5/*/ {" + nl +
		  		"	for(int it : vector)/*/CIERRA EN LINEA 4/*/ {" + nl + 
		  		"		c++;" + nl +
		  		"	}/*/CIERRA for(int it : vector) DE LINEA 2/*/" + nl + 
		  		"}/*/CIERRA main() DE LINEA 1/*/" + nl;
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.CPLUSPLUS);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
