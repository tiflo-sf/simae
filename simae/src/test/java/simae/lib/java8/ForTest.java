package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForTest extends Tests {

	
	@Test
	void forTest() throws IOException {
		  prog = "public class Main {\n" +
				  "      public static void main(String[] args) {\n" +
				  "      	int k = 1;\n" +
				  "      	for(int i=0; i<10; i++){\n" +
				  "      		k++;\n" +
				  "      	}\n" +
				  "      }\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 8/*/{\n" +
				  "      public static void main(String[] args)/*/CIERRA EN LINEA 7/*/ {\n" +
				  "      	int k = 1;\n" +
				  "      	for(int i=0; i<10; i++)/*/CIERRA EN LINEA 6/*/{\n" +
				  "      		k++;\n" +
				  "      	}/*/CIERRA for(int i=0; i<10; i++) DE LINEA 4/*/\n" +
				  "      }/*/CIERRA void main(String[] args) DE LINEA 2/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = b.testMarcado(prog, Lenguaje.JAVA8);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
