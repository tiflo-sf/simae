package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WhileTest extends Tests {

	
	@Test
	void whileTest() throws IOException {
		  prog = "public class Main {\n" +
				  "      public static void main(String[] args) {\n" +
				  "      	int k = 1;\n" +
				  "      	while(k<10){\n" +
				  "      		k++;\n" +
				  "      	}\n" +
				  "      }\n" +
				  "}";
		  esperado = "public class Main /*/CIERRA EN LINEA 8/*/{\n" +
				  "      public static void main(String[] args)/*/CIERRA EN LINEA 7/*/ {\n" +
				  "      	int k = 1;\n" +
				  "      	while(k<10)/*/CIERRA EN LINEA 6/*/{\n" +
				  "      		k++;\n" +
				  "      	}/*/CIERRA while(k<10) DE LINEA 4/*/\n" +
				  "      }/*/CIERRA void main(String[] args) DE LINEA 2/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8, "es");
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
