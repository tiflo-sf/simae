package simae.lib.listener;

import commonGrammar.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import simae.lib.AnotacionMarca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class PythonListener extends Python3ParserBaseListener {

	//declarar y asignar atributo de lista de marcas
	private final List<AnotacionMarca> marcas = new ArrayList<>();
	private final String nl = System.lineSeparator();


	public PythonListener(Python3Parser parser) {

	}

	private String getOriginalCode(Token start, Token stop) {
		return getOriginalCode(start,stop,0);
	}

	private String getOriginalCode(Token start, Token stop, int adicion) {
		//Se crea un int que sera el index siguiente al stop.
		int indexNuevo = stop.getStopIndex() + adicion;
		Interval interval = new Interval(start.getStartIndex(), indexNuevo);
		String retorno = start.getInputStream().getText(interval);

		//reemplazar todos los espacios, tabulaciones
		retorno = retorno.replaceAll("//.*" + nl, "");
		retorno = retorno.replaceAll("/\\*.*\\*/", "");
		retorno = retorno.replaceAll("(\n|\r|\t| )+", " ");
		return retorno;
	}

	public List<AnotacionMarca> getMarcas() {
		return marcas;
	}
/*
	//FIXME: no se deberían mostrar los tipos de datos que retorne?
	@Override
	public void exitIf_stmt(Python3Parser.If_stmtContext ctxt) {
		//attributespecifierseq? declspecifierseq? declarator virtspecifierseq? functionbody
		String texto = "CIERRA " + getOriginalCode(ctx.declarator().getStart(),ctx.declarator().getStop(),0) + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(), texto));
	}
*/
	@Override
	public void enterIf_stmt(Python3Parser.If_stmtContext ctx) {
		//if_stmt: 'if' test ':' suite ('elif' test ':' suite)* ('else' ':' suite)?;
		Iterator<Python3Parser.TestContext> testIterator = ctx.test().iterator();
		Iterator<Python3Parser.SuiteContext> suiteIterator = ctx.suite().iterator();
		while(testIterator.hasNext() && suiteIterator.hasNext()) {
			Python3Parser.TestContext testActual = testIterator.next();
			Python3Parser.SuiteContext suiteActual = suiteIterator.next();
			String texto = "CIERRA EN LINEA " + suiteActual.getStop().getLine();
			Token ultimoAntesDeMarca = testActual.getStop();
			marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
					ultimoAntesDeMarca.getCharPositionInLine(),
					texto, "\"\"\"", "\"\"\""));
		}

	}


}
