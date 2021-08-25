package simae.lib.listener;

import cpp14.CPP14BaseListener;
import cpp14.CPP14Parser;
import java8.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import simae.lib.AnotacionMarca;

import java.util.ArrayList;
import java.util.List;

public class JavaListener extends Java8BaseListener {

	//declarar y asignar atributo de lista de marcas
	private final List<AnotacionMarca> marcas = new ArrayList<>();
	private final String nl = System.lineSeparator();


	public JavaListener(Java8Parser parser) {
		
	}

	private String getOriginalCode(Token start, Token stop) {
		return getOriginalCode(start,stop,1);
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

	@Override
	public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		//typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody;
		String texto = "CIERRA " + getOriginalCode(ctx.typeTypeOrVoid().getStart(),ctx.formalParameters().getStop(),0) + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(), texto));
	}

	@Override
	public void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
		//typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody;
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token ultimoAntesDeMarca = ctx.qualifiedNameList() != null ? ctx.qualifiedNameList().getStop() : ctx.formalParameters().getStop();
		marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
				ultimoAntesDeMarca.getCharPositionInLine(),
				texto));
	}

	@Override
	public void exitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		//SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
		String switchCompleto = getOriginalCode(ctx.getStart(), ctx.parExpression().getStop());
		String texto = "CIERRA " + switchCompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
		//SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}
	@Override
	public void enterIfStatement(Java8Parser.IfStatementContext ctx) {
		//IF parExpression statement (elseStatement)?
		String texto = "CIERRA EN LINEA " + ctx.statement().getStop().getLine();
		Token parentesis = ctx.parExpression().getStop();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterElseStatement(Java8Parser.ElseStatementContext ctx) {
		//ELSE statement;
		String texto = "CIERRA " + "EN LINEA " + ctx.statement().getStop().getLine();
		Token elseT = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(elseT.getLine(),
				elseT.getCharPositionInLine() + 3,
				texto));
	}

	@Override
	public void exitElseStatement(Java8Parser.ElseStatementContext ctx) {
		//IF parExpression statement (elseStatement)?
		//ELSE statement;
		//Como no esta separado en IfElse e If, primero se procesa el If.
		System.out.println("es un " + ctx.getParent().getClass().getName());
		Java8Parser.IfStatementContext ifPadre = (Java8Parser.IfStatementContext)ctx.getParent();
		String ifCompleto = getOriginalCode(ifPadre.getStart(), ifPadre.parExpression().getStop());
		String texto = "CIERRA " + ifCompleto + " DE LINEA " + ifPadre.getStart().getLine();
		marcas.add(new AnotacionMarca(ifPadre.statement().getStop().getLine(),
				ifPadre.statement().getStop().getCharPositionInLine(),
				texto));

		//Ahora se procesa el Else
		String textoElse = "CIERRA else DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				textoElse));
	}

}
