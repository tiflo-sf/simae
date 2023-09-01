package simae.core.lib.listener;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.grammars.CPP14Parser;
import simae.grammars.CSharpParser;
import simae.grammars.CSharpParserBaseListener;
import simae.grammars.JavaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSharpListener extends CSharpParserBaseListener {


    private HashMap<String, String> strings;

    //declarar y asignar atributo de lista de marcas
    private final List<AnotacionMarca> marcas = new ArrayList<>();
    private final String nl = System.lineSeparator();

    public CSharpListener(CSharpParser parser, HashMap<String, String> strings) {
        this.strings = strings;
    }

    public List<AnotacionMarca> getMarcas() {
        return marcas;
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

    @Override
    public void exitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        //SWITCH OPEN_PARENS expression CLOSE_PARENS OPEN_BRACE switch_section* CLOSE_BRACE
        String switchCompleto = getOriginalCode(ctx.getStart(), ctx.expression().getStop());
        String texto = strings.get("closes") + switchCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.CLOSE_BRACE().getSymbol().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        //SWITCH OPEN_PARENS expression CLOSE_PARENS OPEN_BRACE switch_section* CLOSE_BRACE
        String texto = strings.get("endsOn") + ctx.CLOSE_BRACE().getSymbol().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {
        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
        //	    class_body ';'?
        //	;
        String texto = strings.get("endsOn") + ctx.getStop().getLine();
        Token identifier = ctx.identifier().getStop();
        marcas.add(new AnotacionMarca(identifier.getLine(),
                identifier.getCharPositionInLine() + (identifier.getText().length() - 1),
                texto));
    }

    @Override
    public void exitClass_definition(CSharpParser.Class_definitionContext ctx) {
        //: CLASS identifier type_parameter_list? class_base? type_parameter_constraints_clauses?
        //	    class_body ';'?
        //	;
        String classCompleto = ctx.identifier().getText();
        String texto = strings.get("closes") + classCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterWhileStatement(CSharpParser.WhileStatementContext ctx) {
        //	| WHILE OPEN_PARENS expression CLOSE_PARENS embedded_statement
        String texto = strings.get("endsOn") + ctx.embedded_statement().getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }

    @Override
    public void exitWhileStatement(CSharpParser.WhileStatementContext ctx) {
        //	| WHILE OPEN_PARENS expression CLOSE_PARENS embedded_statement
        String whileCompleto = getOriginalCode(ctx.getStart(), ctx.CLOSE_PARENS().getSymbol());
        String texto = strings.get("closes") + whileCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.embedded_statement().getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterDoStatement(CSharpParser.DoStatementContext ctx) {
        //	| DO embedded_statement WHILE OPEN_PARENS expression CLOSE_PARENS ';'
        String texto = strings.get("endsOn") + ctx.CLOSE_PARENS().getSymbol().getLine();
        Token parentesis = ctx.DO().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine() + 1,
                texto));
    }

    @Override
    public void exitDoStatement(CSharpParser.DoStatementContext ctx) {
        //	| DO embedded_statement WHILE OPEN_PARENS expression CLOSE_PARENS ';'
        String texto = strings.get("closes") + "DO" + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterForStatement(CSharpParser.ForStatementContext ctx) {
        // 	| FOR OPEN_PARENS for_initializer? ';' expression? ';' for_iterator? CLOSE_PARENS embedded_statement

        String texto = strings.get("endsOn") + ctx.embedded_statement().getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }

    @Override
    public void exitForStatement(CSharpParser.ForStatementContext ctx) {
        // 	| FOR OPEN_PARENS for_initializer? ';' expression? ';' for_iterator? CLOSE_PARENS embedded_statement
        String forCompleto = getOriginalCode(ctx.getStart(), ctx.CLOSE_PARENS().getSymbol());
        String texto = strings.get("closes") + forCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.embedded_statement().getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        // | AWAIT? FOREACH OPEN_PARENS local_variable_type identifier IN expression CLOSE_PARENS embedded_statement
        String texto = strings.get("endsOn") + ctx.embedded_statement().getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }

    @Override
    public void exitForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        // | AWAIT? FOREACH OPEN_PARENS local_variable_type identifier IN expression CLOSE_PARENS embedded_statement
        String forEachCompleto = getOriginalCode(ctx.getStart(), ctx.CLOSE_PARENS().getSymbol());
        String texto = strings.get("closes") + forEachCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.embedded_statement().getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterIfStatement(CSharpParser.IfStatementContext ctx) {
        // 	| IF OPEN_PARENS expression CLOSE_PARENS if_body (ELSE if_body)?               #ifStatement
        String texto = strings.get("endsOn") + ctx.getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }

    @Override
    public void exitIfStatement(CSharpParser.IfStatementContext ctx) {
        // 	| IF OPEN_PARENS expression CLOSE_PARENS if_body
        String ifCompleto = getOriginalCode(ctx.getStart(), ctx.CLOSE_PARENS().getSymbol());
        String texto = strings.get("closes") + ifCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    @Override
    public void enterIfElseStatement(CSharpParser.IfElseStatementContext ctx) {
        //	| IF OPEN_PARENS expression CLOSE_PARENS if_body ELSE if_body
        String texto = strings.get("endsOn") + ctx.if_body().getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));
    }


    @Override
    public void enterElsestatement(CSharpParser.ElsestatementContext ctx) {
        CSharpParser.IfElseStatementContext ifElse = (CSharpParser.IfElseStatementContext) ctx.getParent();

        String ifCompleto = getOriginalCode(ifElse.getStart(), ifElse.CLOSE_PARENS().getSymbol());
        String textoIf = strings.get("closes") + ifCompleto + strings.get("ofLine") + ifElse.getStart().getLine();

        marcas.add(new AnotacionMarca(ifElse.if_body().getStop().getLine(),
                ifElse.if_body().getStop().getCharPositionInLine(),
                textoIf));

        String texto = strings.get("endsOn") + ctx.if_body().getStop().getLine();
        Token elseT = (Token) ctx.getChild(ctx.getChildCount() - 2).getPayload();
        marcas.add(new AnotacionMarca(elseT.getLine(),
                elseT.getCharPositionInLine() + 3,
                texto));
    }

    @Override
    public void exitElsestatement(CSharpParser.ElsestatementContext ctx) {

        //Ahora se procesa el Else
        String textoElse = strings.get("closes") + "else" + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                textoElse));
    }

    @Override
    public void enterMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        // : method_member_name type_parameter_list? OPEN_PARENS formal_parameter_list? CLOSE_PARENS
        //	    type_parameter_constraints_clauses? (method_body | right_arrow throwable_expression ';')
        //	;
        String texto = strings.get("endsOn") + ctx.getStop().getLine();
        Token parentesis = ctx.CLOSE_PARENS().getSymbol();
        marcas.add(new AnotacionMarca(parentesis.getLine(),
                parentesis.getCharPositionInLine(),
                texto));

    }

    @Override
    public void exitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        // : method_member_name type_parameter_list? OPEN_PARENS formal_parameter_list? CLOSE_PARENS
        //	    type_parameter_constraints_clauses? (method_body | right_arrow throwable_expression ';')
        //	;
        String methodCompleto = getOriginalCode(ctx.getStart(), ctx.CLOSE_PARENS().getSymbol());
        String texto = strings.get("closes") + methodCompleto + strings.get("ofLine") + ctx.getStart().getLine();
        marcas.add(new AnotacionMarca(ctx.getStop().getLine(),
                ctx.getStop().getCharPositionInLine(),
                texto));
    }

    }
