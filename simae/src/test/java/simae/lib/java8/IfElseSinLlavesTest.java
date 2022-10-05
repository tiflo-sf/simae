package simae.lib.java8;

import org.junit.jupiter.api.Test;
import simae.SimaeLauncher;
import simae.lib.Lenguaje;
import simae.lib.cPlusPlus.Tests;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IfElseSinLlavesTest extends Tests {

	
	@Test
	void ifElseTest() throws IOException {
		  prog = "public class Main {\n" +
				  "    public static void main(String[] args) {\n" +
				  "        if (esPar(numero)) \n" +
				  "            System.out.println(\"El número es par\");\n" +
				  "        else\n" +
				  "            System.out.println(\"El número es impar\");\n" +
				  "    }\n" +
				  "}\n";
		  esperado = "public class Main /*/CIERRA EN LINEA 8/*/{\n" +
				  "    public static void main(String[] args)/*/CIERRA EN LINEA 7/*/ {\n" +
				  "        if (esPar(numero))/*/CIERRA EN LINEA 4/*/ \n" +
				  "            System.out.println(\"El número es par\");/*/CIERRA if (esPar(numero)) DE LINEA 3/*/\n" +
				  "        else/*/CIERRA EN LINEA 6/*/\n" +
				  "            System.out.println(\"El número es impar\");/*/CIERRA else DE LINEA 5/*/\n" +
				  "    }/*/CIERRA void main(String[] args) DE LINEA 2/*/\n" +
				  "}/*/CIERRA class Main DE LINEA 1/*/\n";
		  marcado = SimaeLauncher.launchTagging(prog, Lenguaje.JAVA8, "es");
		  assertEquals(esperado,marcado, "No son iguales.");
	}
}
