package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoWhileTest extends Tests {

	
	@Test
	void doWhileTest() throws IOException {
		  prog = "public class Main {\n" +
				  "	public static void main(String[] args) {\n" +
				  "		int i = 5;\n" +
				  "		do {\n" +
				  "			System.out.println(i);\n" +
				  "			i++;\n" +
				  "		} while (i <= 10);\n" +
				  "	}\n" +
				  "}";

		  esperado = "public class Main /*/CIERRA EN LINEA 9/*/{\n" +
				  "	public static void main(String[] args)/*/CIERRA EN LINEA 8/*/ {\n" +
				  "		int i = 5;\n" +
				  "		do/*/CIERRA EN LINEA 7/*/ {\n" +
				  "			System.out.println(i);\n" +
				  "			i++;\n" +
				  "		} while (i <= 10);/*/CIERRA do while DE LINEA 4/*/\n" +
				  "	}/*/CIERRA void main(String[] args) DE LINEA 2/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = b.testMarcado(prog, Lenguaje.JAVA8);
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
