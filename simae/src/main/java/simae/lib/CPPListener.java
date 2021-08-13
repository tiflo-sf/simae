package simae.lib;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import simae.cpp14.CPP14BaseListener;
import simae.cpp14.CPP14Parser;


public class CPPListener extends CPP14BaseListener {
	
	//declarar y asignar atributo de lista de marcas
	private final List<AnotacionMarca> marcas = new ArrayList<>();
	private final String nl = System.lineSeparator();	
	
	
	public CPPListener(CPP14Parser parser) {
		
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
	
	//FIXME: no se deberían mostrar los tipos de datos que retorne?
	@Override
	public void exitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
		//attributespecifierseq? declspecifierseq? declarator virtspecifierseq? functionbody
		String texto = "CIERRA " + getOriginalCode(ctx.declarator().getStart(),ctx.declarator().getStop(),0) + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
		ctx.getStop().getCharPositionInLine(), texto));	
	}
	
	@Override
	public void enterFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
		//attributespecifierseq? declspecifierseq? declarator virtspecifierseq? functionbody
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
	    Token ultimoAntesDeMarca = ctx.virtspecifierseq() != null ? ctx.virtspecifierseq().getStop() : ctx.declarator().getStop();
		marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
									 ultimoAntesDeMarca.getCharPositionInLine(),
									 texto));	
	}
		
	@Override
	public void exitSwitchStatement(CPP14Parser.SwitchStatementContext ctx) {
		//Switch '(' condition ')' statement	
		String switchCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = "CIERRA " + switchCompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.statement().getStop().getLine(),
			    					  ctx.getStop().getCharPositionInLine(),
				  					  texto));
	}
	
    @Override
    public void enterSwitchStatement(CPP14Parser.SwitchStatementContext ctx) {
		//Switch '(' condition ')' statement	
            String texto = "CIERRA EN LINEA " + ctx.statement().getStop().getLine();
            Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
            marcas.add(new AnotacionMarca(parentesis.getLine(),
                                          parentesis.getCharPositionInLine(),
                                          texto));		
    }
	
	@Override
	public void enterIfElseStatement(CPP14Parser.IfElseStatementContext ctx) {
        //If '(' condition ')' statement elsestatement
		String texto = "CIERRA EN LINEA " + ctx.statement().getStop().getLine();
        Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 3).getPayload();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                                      parentesis.getCharPositionInLine(),
                                      texto));
	}
	
	@Override
    public void enterIfStatement(CPP14Parser.IfStatementContext ctx) {
        //If '(' condition ')' statement		
        String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
        Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                                      parentesis.getCharPositionInLine(),
                                      texto));		
    }
	
	@Override
	public void exitElsestatement(CPP14Parser.ElsestatementContext ctx) {
		String elseCompleto = "else";
		String texto = "CIERRA " + elseCompleto + " DE LINEA " + ctx.statement().getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
									  ctx.getStop().getCharPositionInLine(),
									  texto));
	}
	
	@Override
	public void enterElsestatement(CPP14Parser.ElsestatementContext ctx) {
		String texto = "CIERRA " + "EN LINEA " + ctx.statement().getStop().getLine();
		Token elseT = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
	    marcas.add(new AnotacionMarca(elseT.getLine(),
	    						  elseT.getCharPositionInLine() + 3,
			  					  texto));
	}
		
	@Override
	public void exitIfElseStatement(CPP14Parser.IfElseStatementContext ctx) {
		//If '(' condition ')' statement elsestatement
		String ifIncompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = "CIERRA " + ifIncompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.statement().getStop().getLine(),
			  					  ctx.statement().getStop().getCharPositionInLine(),
			  					  texto));	
	}
	
	@Override
	public void exitIfStatement(CPP14Parser.IfStatementContext ctx) {
		//If '(' condition ')' statement		
		String ifCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = "CIERRA " + ifCompleto + " DE LINEA " + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                                      ctx.getStop().getCharPositionInLine(),
                                      texto));		
	}
	
	@Override
	public void exitWhileStatement(CPP14Parser.WhileStatementContext ctx) {
		//While '(' condition ')' statement
		String whileCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = "CIERRA " + whileCompleto + " DE LINEA " + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));		
	}
	
	@Override
	public void exitDoWhileStatement(CPP14Parser.DoWhileStatementContext ctx) {
		//Do statement While '(' expression ')' ';'
		String DoW = "do";
		String texto = "CIERRA " + DoW + " DE LINEA " + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));
	}
	
	@Override
	public void exitForStatement(CPP14Parser.ForStatementContext ctx){
		//For '(' forinitstatement condition? ';' expression? ')' statement
		String texto;
		String forCompleto = "";
		
		if(ctx.expression() != null) {
			//Se envia expression. La funcion automáticamente encontrara el token siguiente.
			forCompleto = getOriginalCode(ctx.getStart(), ctx.expression().getStop());
		}
			
		//textoFor = "for (" + forinitstatement + condition + ";" + expression + ")";
		texto = "CIERRA " + forCompleto + " DE LINEA " + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));				
	}
	
	@Override
	public void exitForEachStatement(CPP14Parser.ForEachStatementContext ctx) {
		//For '(' forrangedeclaration ':' forrangeinitializer ')' statement	
		String forEachCompleto = getOriginalCode(ctx.getStart(), ctx.forrangeinitializer().getStop());
		String texto = "CIERRA " + forEachCompleto + " DE LINEA " + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));	
	}
	
	@Override
	public void enterForEachStatement(CPP14Parser.ForEachStatementContext ctx) {
		//For '(' forrangedeclaration ':' forrangeinitializer ')' statement
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
						parentesis.getCharPositionInLine(),
						texto));
	}
	
	@Override
	public void enterWhileStatement(CPP14Parser.WhileStatementContext ctx) {
		//While '(' condition ')' statement
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				   parentesis.getCharPositionInLine(),
				   texto));		
	}
	
	@Override
	public void enterDoWhileStatement(CPP14Parser.DoWhileStatementContext ctx) {
		//Do statement While '(' expression ')' ';';
		String texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 7).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine() + 1, //FIXME: es correcto esto?
				texto));
	}
	
	@Override
	public void enterForStatement(CPP14Parser.ForStatementContext ctx){
		//For '(' forinitstatement condition? ';' expression? ')' statement	
		String texto;
		texto = "CIERRA EN LINEA " + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				  					  parentesis.getCharPositionInLine(),
				  					  texto));
	}
}
