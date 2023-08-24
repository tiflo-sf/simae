package simae.core.lib.listener;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import simae.core.lib.AnotacionMarca;
import simae.grammars.CPP14Parser;
import simae.grammars.CSharpParser;
import simae.grammars.CSharpParserBaseListener;

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


}
