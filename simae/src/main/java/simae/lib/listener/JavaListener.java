package simae.lib.listener;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import simae.lib.AnotacionMarca;
import simae.grammars.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class JavaListener extends JavaParserBaseListener implements StringTags {

	//declarar y asignar atributo de lista de marcas
	private final List<AnotacionMarca> marcas = new ArrayList<>();
	private final String nl = System.lineSeparator();


	public JavaListener(JavaParser parser) {

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

	@Override
	public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		//classDeclaration
		//    : CLASS IDENTIFIER typeParameters?
		//      (EXTENDS typeType)?
		//      (IMPLEMENTS typeList)?
		//      classBody
		//    ;
		Token ultimoAntesDeMarca;
		if(ctx.typeList() != null) ultimoAntesDeMarca = ctx.typeList().getStop();
		else if(ctx.typeType() != null) ultimoAntesDeMarca = ctx.typeType().getStop();
		else if(ctx.typeParameters() != null) ultimoAntesDeMarca = ctx.typeParameters().getStop();
		else ultimoAntesDeMarca = ctx.IDENTIFIER().getSymbol();
		String texto = endTag + ctx.getStop().getLine();
		System.out.println(ultimoAntesDeMarca);
		marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
				ultimoAntesDeMarca.getCharPositionInLine() + ultimoAntesDeMarca.getText().length(),
				texto));
	}

	@Override
	public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		//classDeclaration
		//    : CLASS IDENTIFIER typeParameters?
		//      (EXTENDS typeType)?
		//      (IMPLEMENTS typeList)?
		//      classBody
		//    ;
		Token ultimoAntesDeMarca;
		if(ctx.typeList() != null) ultimoAntesDeMarca = ctx.typeList().getStop();
		else if(ctx.typeType() != null) ultimoAntesDeMarca = ctx.typeType().getStop();
		else if(ctx.typeParameters() != null) ultimoAntesDeMarca = ctx.typeParameters().getStop();
		else ultimoAntesDeMarca = ctx.IDENTIFIER().getSymbol();
		String texto = "CIERRA " + getOriginalCode(ctx.CLASS().getSymbol(),ultimoAntesDeMarca,0) + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(), texto));
	}


	@Override
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		//typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody;
		String texto = "CIERRA " + getOriginalCode(ctx.typeTypeOrVoid().getStart(),ctx.formalParameters().getStop(),0) + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(), texto));
	}

	@Override
	public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		//typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody;
		String texto = endTag + ctx.getStop().getLine();
		Token ultimoAntesDeMarca = ctx.qualifiedNameList() != null ? ctx.qualifiedNameList().getStop() : ctx.formalParameters().getStop();
		marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
				ultimoAntesDeMarca.getCharPositionInLine(),
				texto));
	}

	@Override
	public void exitSwitchStatement(JavaParser.SwitchStatementContext ctx) {
		//SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
		String switchCompleto = getOriginalCode(ctx.getStart(), ctx.parExpression().getStop());
		String texto = "CIERRA " + switchCompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterSwitchStatement(JavaParser.SwitchStatementContext ctx) {
		//SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
		String texto = endTag + ctx.getStop().getLine();
		Token parentesis = ctx.parExpression().getStop();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}
	@Override
	public void enterIfStatement(JavaParser.IfStatementContext ctx) {
		//IF parExpression statement
		String texto = endTag + ctx.statement().getStop().getLine();
		Token parentesis = ctx.parExpression().getStop();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}

	@Override
	public void exitIfStatement(JavaParser.IfStatementContext ctx) {
		//IF parExpression statement
		String ifIncompleto = getOriginalCode(ctx.getStart(), ctx.parExpression().getStop());
		String texto = "CIERRA " + ifIncompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.statement().getStop().getLine(),
				ctx.statement().getStop().getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterElseStatement(JavaParser.ElseStatementContext ctx) {
		//ELSE statement;
		String texto = "CIERRA " + "EN LINEA " + ctx.statement().getStop().getLine();
		Token elseT = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(elseT.getLine(),
				elseT.getCharPositionInLine() + 3,
				texto));
	}

	@Override
	public void exitElseStatement(JavaParser.ElseStatementContext ctx) {
		//IF parExpression statement (elseStatement)?
		//ELSE statement;
		//Como no esta separado en IfElse e If, primero se procesa el If.
		JavaParser.IfElseStatementContext ifPadre = (JavaParser.IfElseStatementContext)ctx.getParent();
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

	@Override
	public void enterWhileStatement(JavaParser.WhileStatementContext ctx) {
		//WHILE parExpression statement
		String texto = endTag + ctx.getStop().getLine();
		Token parentesis = ctx.parExpression().getStop();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}

	@Override
	public void exitWhileStatement(JavaParser.WhileStatementContext ctx) {
		//WHILE parExpression statement
		String whileCompleto = getOriginalCode(ctx.getStart(), ctx.parExpression().getStop());
		String texto = "CIERRA " + whileCompleto + " DE LINEA " + ctx.getStart().getLine();

		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterDoWhileStatement(JavaParser.DoWhileStatementContext ctx) {
		//DO statement WHILE parExpression ';'
		String texto = endTag + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(0).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine() + 1, //FIXME: es correcto esto?
				texto));
	}

	@Override
	public void exitDoWhileStatement(JavaParser.DoWhileStatementContext ctx) {
		//DO statement WHILE parExpression ';'
		String DoW = "do while";
		String texto = "CIERRA " + DoW + " DE LINEA " + ctx.getStart().getLine();

		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

	//A diferencia de C++, la gramatica entiende a ForEach y For como una sola estructura repetitiva.

	@Override
	public void enterForStatement(JavaParser.ForStatementContext ctx){
		//FOR '(' forControl ')' statement
		String texto;
		texto = endTag + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine(),
				texto));
	}

	@Override
	public void exitForStatement(JavaParser.ForStatementContext ctx){
		//FOR '(' forControl ')' statement
		String texto;
		String forCompleto = "";

		forCompleto = getOriginalCode(ctx.getStart(), ctx.forControl().getStop(), 1);

		//textoFor = "for (" + forinitstatement + condition + ";" + expression + ")";
		texto = "CIERRA " + forCompleto + " DE LINEA " + ctx.getStart().getLine();

		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

}
