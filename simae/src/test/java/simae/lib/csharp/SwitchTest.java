package simae.lib.csharp;

import org.junit.jupiter.api.Test;
import simae.core.lib.Lenguaje;
import simae.lib.cPlusPlus.es.Tests;
import simae.standalone.SimaeLauncherStandalone;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchTest extends Tests {

	@Test
	void switchTest() throws IOException {
		prog =	"using System;\n" +
				"\n" +
				"class Program\n" +
				"{\n" +
				"    static void Main(string[] args)\n" +
				"    {\n" +
				"        int numero = 2;\n" +
				"\n" +
				"        switch (numero)\n" +
				"        {\n" +
				"            case 1: Console.WriteLine(\"El número es 1\"); break;\n" +
				"            case 2: Console.WriteLine(\"El número es 2\"); break;\n" +
				"            case 3: Console.WriteLine(\"El número es 3\"); break;\n" +
				"            default: Console.WriteLine(\"El número no es 1, 2 ni 3\"); break;\n" +
				"        }\n" +
				"    }\n" +
				"}";
		 esperado = "int a = 4;" + nl +
				 	"int b = 4;" + nl; 
		 marcado = SimaeLauncherStandalone.launchTagging(prog, Lenguaje.CSHARP, "es");
		 assertEquals(esperado,marcado, "No son iguales.");
	}

}
