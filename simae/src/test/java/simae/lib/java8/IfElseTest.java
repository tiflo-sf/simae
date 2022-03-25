package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfElseTest extends Tests {

	
	@Test
	void ifElseTest() throws IOException {
		  prog = "public class Main {\n" +
				  "      public static void main(String[] args) {\n" +
				  "      	int k = 1;\n" +
				  "      	if(k == 1){\n" +
				  "      		k++;\n" +
				  "      	} else {\n" +
				  "      		k--;\n" +
				  "      	}\n" +
				  "      }\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 10/*/{\n" +
				  "      public static void main(String[] args)/*/CIERRA EN LINEA 9/*/ {\n" +
				  "      	int k = 1;\n" +
				  "      	if(k == 1){\n" +
				  "      		k++;\n" +
				  "      	}/*/CIERRA if(k == 1) DE LINEA 4/*/ else/*/CIERRA EN LINEA 8/*/ {\n" +
				  "      		k--;\n" +
				  "      	}/*/CIERRA else DE LINEA 6/*/\n" +
				  "      }/*/CIERRA void main(String[] args) DE LINEA 2/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = b.testMarcado(prog, Lenguaje.JAVA8);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
