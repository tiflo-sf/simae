package simae.lib.listener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import simae.grammars.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import simae.lib.AnotacionMarca;

public class CPPListener extends CPP14BaseListener {

	private HashMap<String, String> strings;

	//declarar y asignar atributo de lista de marcas
	private final List<AnotacionMarca> marcas = new ArrayList<>();
	private final String nl = System.lineSeparator();	
	
	
	public CPPListener(CPP14Parser parser, HashMap<String, String> strings) {
		this.strings = strings;
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
	public void exitClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
		//classhead '{'  memberspecification? '}'
		Token tokenFinalizacion = ((TerminalNode)ctx.getChild(3)).getSymbol();
		String classCompleto = getOriginalCode(ctx.getStart(), ctx.classhead().getStop());
		String texto = strings.get("closes") + classCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(tokenFinalizacion.getLine(),
				ctx.getStop().getCharPositionInLine(),
				texto));
	}

	@Override
	public void enterClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
		//classhead '{'  memberspecification? '}'
		Token tokenFinalizacion = ((TerminalNode)ctx.getChild(3)).getSymbol();
		Token tokenArranque = ((TerminalNode)ctx.getChild(1)).getSymbol();
		String texto = strings.get("endsOn") + tokenFinalizacion.getLine();
		marcas.add(new AnotacionMarca(tokenArranque.getLine(),
				tokenArranque.getCharPositionInLine() - 1,
				texto));
	}

	//FIXME: no se deberían mostrar los tipos de datos que retorne?
	@Override
	public void exitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
		//attributespecifierseq? declspecifierseq? declarator virtspecifierseq? functionbody
		String texto = strings.get("closes") + getOriginalCode(ctx.declarator().getStart(),ctx.declarator().getStop(),0) + strings.get("ofLine") + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
		ctx.getStop().getCharPositionInLine(), texto));	
	}
	
	@Override
	public void enterFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
		//attributespecifierseq? declspecifierseq? declarator virtspecifierseq? functionbody
		String texto = strings.get("endsOn") + ctx.getStop().getLine();
	    Token ultimoAntesDeMarca = ctx.virtspecifierseq() != null ? ctx.virtspecifierseq().getStop() : ctx.declarator().getStop();
		marcas.add(new AnotacionMarca(ultimoAntesDeMarca.getLine(),
									 ultimoAntesDeMarca.getCharPositionInLine(),
									 texto));	
	}
		
	@Override
	public void exitSwitchStatement(CPP14Parser.SwitchStatementContext ctx) {
		//Switch '(' condition ')' statement	
		String switchCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = strings.get("closes") + switchCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.statement().getStop().getLine(),
			    					  ctx.getStop().getCharPositionInLine(),
				  					  texto));
	}
	
    @Override
    public void enterSwitchStatement(CPP14Parser.SwitchStatementContext ctx) {
		//Switch '(' condition ')' statement	
            String texto = strings.get("endsOn") + ctx.statement().getStop().getLine();
            Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
            marcas.add(new AnotacionMarca(parentesis.getLine(),
                                          parentesis.getCharPositionInLine(),
                                          texto));		
    }
	
	@Override
	public void enterIfElseStatement(CPP14Parser.IfElseStatementContext ctx) {
        //If '(' condition ')' statement elsestatement
		String texto = strings.get("endsOn") + ctx.statement().getStop().getLine();
        Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 3).getPayload();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                                      parentesis.getCharPositionInLine(),
                                      texto));
	}
	
	@Override
    public void enterIfStatement(CPP14Parser.IfStatementContext ctx) {
        //If '(' condition ')' statement		
        String texto = strings.get("endsOn") + ctx.getStop().getLine();
        Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                                      parentesis.getCharPositionInLine(),
                                      texto));		
    }
	
	@Override
	public void exitElsestatement(CPP14Parser.ElsestatementContext ctx) {
		String elseCompleto = "else";
		String texto = strings.get("closes") + elseCompleto + strings.get("ofLine") + ctx.statement().getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
									  ctx.getStop().getCharPositionInLine(),
									  texto));
	}
	
	@Override
	public void enterElsestatement(CPP14Parser.ElsestatementContext ctx) {
		String texto = strings.get("closes") + "EN LINEA " + ctx.statement().getStop().getLine();
		Token elseT = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
	    marcas.add(new AnotacionMarca(elseT.getLine(),
	    						  elseT.getCharPositionInLine() + 3,
			  					  texto));
	}
		
	@Override
	public void exitIfElseStatement(CPP14Parser.IfElseStatementContext ctx) {
		//If '(' condition ')' statement elsestatement
		String ifIncompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = strings.get("closes") + ifIncompleto + strings.get("ofLine") + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.statement().getStop().getLine(),
			  					  ctx.statement().getStop().getCharPositionInLine(),
			  					  texto));	
	}
	
	@Override
	public void exitIfStatement(CPP14Parser.IfStatementContext ctx) {
		//If '(' condition ')' statement		
		String ifCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = strings.get("closes") + ifCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                                      ctx.getStop().getCharPositionInLine(),
                                      texto));		
	}
	
	@Override
	public void exitWhileStatement(CPP14Parser.WhileStatementContext ctx) {
		//While '(' condition ')' statement
		String whileCompleto = getOriginalCode(ctx.getStart(), ctx.condition().getStop());
		String texto = strings.get("closes") + whileCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));		
	}
	
	@Override
	public void exitDoWhileStatement(CPP14Parser.DoWhileStatementContext ctx) {
		//Do statement While '(' expression ')' ';'
		String DoW = "do while";
		String texto = strings.get("closes") + DoW + strings.get("ofLine") + ctx.getStart().getLine();
		
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
		texto = strings.get("closes") + forCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));				
	}
	
	@Override
	public void exitForEachStatement(CPP14Parser.ForEachStatementContext ctx) {
		//For '(' forrangedeclaration ':' forrangeinitializer ')' statement	
		String forEachCompleto = getOriginalCode(ctx.getStart(), ctx.forrangeinitializer().getStop());
		String texto = strings.get("closes") + forEachCompleto + strings.get("ofLine") + ctx.getStart().getLine();
		
		marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
				  					  ctx.getStop().getCharPositionInLine(),
				  					  texto));	
	}
	
	@Override
	public void enterForEachStatement(CPP14Parser.ForEachStatementContext ctx) {
		//For '(' forrangedeclaration ':' forrangeinitializer ')' statement
		String texto = strings.get("endsOn") + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
						parentesis.getCharPositionInLine(),
						texto));
	}
	
	@Override
	public void enterWhileStatement(CPP14Parser.WhileStatementContext ctx) {
		//While '(' condition ')' statement
		String texto = strings.get("endsOn") + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				   parentesis.getCharPositionInLine(),
				   texto));		
	}
	
	@Override
	public void enterDoWhileStatement(CPP14Parser.DoWhileStatementContext ctx) {
		//Do statement While '(' expression ')' ';';
		String texto = strings.get("endsOn") + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 7).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				parentesis.getCharPositionInLine() + 1, //FIXME: es correcto esto?
				texto));
	}
	
	@Override
	public void enterForStatement(CPP14Parser.ForStatementContext ctx){
		//For '(' forinitstatement condition? ';' expression? ')' statement	
		String texto;
		texto = strings.get("endsOn") + ctx.getStop().getLine();
		Token parentesis = (Token)ctx.getChild(ctx.getChildCount() - 2).getPayload();
		marcas.add(new AnotacionMarca(parentesis.getLine(),
				  					  parentesis.getCharPositionInLine(),
				  					  texto));
	}
}
