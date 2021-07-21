// Generated from CPP14.g4 by ANTLR 4.4

package sources;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, MultiLineMacro=7, Directive=8, 
		Alignas=9, Alignof=10, Asm=11, Auto=12, Bool=13, Break=14, Case=15, Catch=16, 
		Char=17, Char16=18, Char32=19, Class=20, Const=21, Constexpr=22, Const_cast=23, 
		Continue=24, Decltype=25, Default=26, Delete=27, Do=28, Double=29, Dynamic_cast=30, 
		Else=31, Enum=32, Explicit=33, Export=34, Extern=35, False=36, Final=37, 
		Float=38, For=39, Friend=40, Goto=41, If=42, Inline=43, Int=44, Long=45, 
		Mutable=46, Namespace=47, New=48, Noexcept=49, Nullptr=50, Operator=51, 
		Override=52, Private=53, Protected=54, Public=55, Register=56, Reinterpret_cast=57, 
		Return=58, Short=59, Signed=60, Sizeof=61, Static=62, Static_assert=63, 
		Static_cast=64, Struct=65, Switch=66, Template=67, This=68, Thread_local=69, 
		Throw=70, True=71, Try=72, Typedef=73, Typeid_=74, Typename_=75, Union=76, 
		Unsigned=77, Using=78, Virtual=79, Void=80, Volatile=81, Wchar=82, While=83, 
		LeftParen=84, RightParen=85, LeftBracket=86, RightBracket=87, LeftBrace=88, 
		RightBrace=89, Plus=90, Minus=91, Star=92, Div=93, Mod=94, Caret=95, And=96, 
		Or=97, Tilde=98, Not=99, Assign=100, Less=101, Greater=102, PlusAssign=103, 
		MinusAssign=104, StarAssign=105, DivAssign=106, ModAssign=107, XorAssign=108, 
		AndAssign=109, OrAssign=110, LeftShift=111, RightShift=112, LeftShiftAssign=113, 
		RightShiftAssign=114, Equal=115, NotEqual=116, LessEqual=117, GreaterEqual=118, 
		AndAnd=119, OrOr=120, PlusPlus=121, MinusMinus=122, Comma=123, ArrowStar=124, 
		Arrow=125, Question=126, Colon=127, Doublecolon=128, Semi=129, Dot=130, 
		DotStar=131, Ellipsis=132, Identifier=133, Integerliteral=134, Decimalliteral=135, 
		Octalliteral=136, Hexadecimalliteral=137, Binaryliteral=138, Integersuffix=139, 
		Characterliteral=140, Floatingliteral=141, Stringliteral=142, Userdefinedintegerliteral=143, 
		Userdefinedfloatingliteral=144, Userdefinedstringliteral=145, Userdefinedcharacterliteral=146, 
		Whitespace=147, Newline=148, BlockComment=149, LineComment=150;
	public static final String[] tokenNames = {
		"<INVALID>", "'||'", "'&&'", "'or'", "'!'", "'and'", "'not'", "MultiLineMacro", 
		"Directive", "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
		"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
		"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", "Not", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", 
		"'<='", "'>='", "AndAnd", "OrOr", "'++'", "'--'", "','", "'->*'", "'->'", 
		"'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'", "Identifier", "Integerliteral", 
		"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
		"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
		"Userdefinedintegerliteral", "Userdefinedfloatingliteral", "Userdefinedstringliteral", 
		"Userdefinedcharacterliteral", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_typeidofexpr = 16, RULE_typeidofthetypeid = 17, RULE_expressionlist = 18, 
		RULE_pseudodestructorname = 19, RULE_unaryexpression = 20, RULE_unaryoperator = 21, 
		RULE_newexpression = 22, RULE_newplacement = 23, RULE_newtypeid = 24, 
		RULE_newdeclarator = 25, RULE_noptrnewdeclarator = 26, RULE_newinitializer = 27, 
		RULE_deleteexpression = 28, RULE_noexceptexpression = 29, RULE_castexpression = 30, 
		RULE_pmexpression = 31, RULE_multiplicativeexpression = 32, RULE_additiveexpression = 33, 
		RULE_shiftexpression = 34, RULE_shiftoperator = 35, RULE_relationalexpression = 36, 
		RULE_equalityexpression = 37, RULE_andexpression = 38, RULE_exclusiveorexpression = 39, 
		RULE_inclusiveorexpression = 40, RULE_logicalandexpression = 41, RULE_logicalorexpression = 42, 
		RULE_conditionalexpression = 43, RULE_assignmentexpression = 44, RULE_assignmentoperator = 45, 
		RULE_expression = 46, RULE_constantexpression = 47, RULE_statement = 48, 
		RULE_labeledstatement = 49, RULE_expressionstatement = 50, RULE_compoundstatement = 51, 
		RULE_statementseq = 52, RULE_selectionstatement = 53, RULE_elsestatement = 54, 
		RULE_condition = 55, RULE_iterationstatement = 56, RULE_forinitstatement = 57, 
		RULE_forrangedeclaration = 58, RULE_forrangeinitializer = 59, RULE_jumpstatement = 60, 
		RULE_declarationstatement = 61, RULE_declarationseq = 62, RULE_declaration = 63, 
		RULE_blockdeclaration = 64, RULE_aliasdeclaration = 65, RULE_simpledeclaration = 66, 
		RULE_static_assertdeclaration = 67, RULE_emptydeclaration = 68, RULE_attributedeclaration = 69, 
		RULE_declspecifier = 70, RULE_declspecifierseq = 71, RULE_storageclassspecifier = 72, 
		RULE_functionspecifier = 73, RULE_typedefname = 74, RULE_typespecifier = 75, 
		RULE_trailingtypespecifier = 76, RULE_typespecifierseq = 77, RULE_trailingtypespecifierseq = 78, 
		RULE_simpletypespecifier = 79, RULE_thetypename = 80, RULE_decltypespecifier = 81, 
		RULE_elaboratedtypespecifier = 82, RULE_enumname = 83, RULE_enumspecifier = 84, 
		RULE_enumhead = 85, RULE_opaqueenumdeclaration = 86, RULE_enumkey = 87, 
		RULE_enumbase = 88, RULE_enumeratorlist = 89, RULE_enumeratordefinition = 90, 
		RULE_enumerator = 91, RULE_namespacename = 92, RULE_originalnamespacename = 93, 
		RULE_namespacedefinition = 94, RULE_namednamespacedefinition = 95, RULE_originalnamespacedefinition = 96, 
		RULE_extensionnamespacedefinition = 97, RULE_unnamednamespacedefinition = 98, 
		RULE_namespacebody = 99, RULE_namespacealias = 100, RULE_namespacealiasdefinition = 101, 
		RULE_qualifiednamespacespecifier = 102, RULE_usingdeclaration = 103, RULE_usingdirective = 104, 
		RULE_asmdefinition = 105, RULE_linkagespecification = 106, RULE_attributespecifierseq = 107, 
		RULE_attributespecifier = 108, RULE_alignmentspecifier = 109, RULE_attributelist = 110, 
		RULE_attribute = 111, RULE_attributetoken = 112, RULE_attributescopedtoken = 113, 
		RULE_attributenamespace = 114, RULE_attributeargumentclause = 115, RULE_balancedtokenseq = 116, 
		RULE_balancedtoken = 117, RULE_initdeclaratorlist = 118, RULE_initdeclarator = 119, 
		RULE_declarator = 120, RULE_ptrdeclarator = 121, RULE_noptrdeclarator = 122, 
		RULE_parametersandqualifiers = 123, RULE_trailingreturntype = 124, RULE_ptroperator = 125, 
		RULE_cvqualifierseq = 126, RULE_cvqualifier = 127, RULE_refqualifier = 128, 
		RULE_declaratorid = 129, RULE_thetypeid = 130, RULE_abstractdeclarator = 131, 
		RULE_ptrabstractdeclarator = 132, RULE_noptrabstractdeclarator = 133, 
		RULE_abstractpackdeclarator = 134, RULE_noptrabstractpackdeclarator = 135, 
		RULE_parameterdeclarationclause = 136, RULE_parameterdeclarationlist = 137, 
		RULE_parameterdeclaration = 138, RULE_functiondefinition = 139, RULE_functionbody = 140, 
		RULE_initializer = 141, RULE_braceorequalinitializer = 142, RULE_initializerclause = 143, 
		RULE_initializerlist = 144, RULE_bracedinitlist = 145, RULE_classname = 146, 
		RULE_classspecifier = 147, RULE_classhead = 148, RULE_classheadname = 149, 
		RULE_classvirtspecifier = 150, RULE_classkey = 151, RULE_memberspecification = 152, 
		RULE_memberdeclaration = 153, RULE_memberdeclaratorlist = 154, RULE_memberdeclarator = 155, 
		RULE_virtspecifierseq = 156, RULE_virtspecifier = 157, RULE_purespecifier = 158, 
		RULE_baseclause = 159, RULE_basespecifierlist = 160, RULE_basespecifier = 161, 
		RULE_classordecltype = 162, RULE_basetypespecifier = 163, RULE_accessspecifier = 164, 
		RULE_conversionfunctionid = 165, RULE_conversiontypeid = 166, RULE_conversiondeclarator = 167, 
		RULE_ctorinitializer = 168, RULE_meminitializerlist = 169, RULE_meminitializer = 170, 
		RULE_meminitializerid = 171, RULE_operatorfunctionid = 172, RULE_literaloperatorid = 173, 
		RULE_templatedeclaration = 174, RULE_templateparameterlist = 175, RULE_templateparameter = 176, 
		RULE_typeparameter = 177, RULE_simpletemplateid = 178, RULE_templateid = 179, 
		RULE_templatename = 180, RULE_templateargumentlist = 181, RULE_templateargument = 182, 
		RULE_typenamespecifier = 183, RULE_explicitinstantiation = 184, RULE_explicitspecialization = 185, 
		RULE_tryblock = 186, RULE_functiontryblock = 187, RULE_handlerseq = 188, 
		RULE_handler = 189, RULE_exceptiondeclaration = 190, RULE_throwexpression = 191, 
		RULE_exceptionspecification = 192, RULE_dynamicexceptionspecification = 193, 
		RULE_typeidlist = 194, RULE_noexceptspecification = 195, RULE_theoperator = 196, 
		RULE_literal = 197, RULE_booleanliteral = 198, RULE_pointerliteral = 199, 
		RULE_userdefinedliteral = 200;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "typeidofexpr", 
		"typeidofthetypeid", "expressionlist", "pseudodestructorname", "unaryexpression", 
		"unaryoperator", "newexpression", "newplacement", "newtypeid", "newdeclarator", 
		"noptrnewdeclarator", "newinitializer", "deleteexpression", "noexceptexpression", 
		"castexpression", "pmexpression", "multiplicativeexpression", "additiveexpression", 
		"shiftexpression", "shiftoperator", "relationalexpression", "equalityexpression", 
		"andexpression", "exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
		"logicalorexpression", "conditionalexpression", "assignmentexpression", 
		"assignmentoperator", "expression", "constantexpression", "statement", 
		"labeledstatement", "expressionstatement", "compoundstatement", "statementseq", 
		"selectionstatement", "elsestatement", "condition", "iterationstatement", 
		"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
		"declarationstatement", "declarationseq", "declaration", "blockdeclaration", 
		"aliasdeclaration", "simpledeclaration", "static_assertdeclaration", "emptydeclaration", 
		"attributedeclaration", "declspecifier", "declspecifierseq", "storageclassspecifier", 
		"functionspecifier", "typedefname", "typespecifier", "trailingtypespecifier", 
		"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
		"thetypename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
		"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
		"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "thetypeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "theoperator", "literal", "booleanliteral", 
		"pointerliteral", "userdefinedliteral"
	};

	@Override
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(402); declarationseq(0);
				}
			}

			setState(405); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(408); match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(409); match(LeftParen);
				setState(410); expression(0);
				setState(411); match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(413); idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(414); lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417); unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418); qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423); conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424); literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425); match(Tilde);
				setState(426); classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427); match(Tilde);
				setState(428); decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429); templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); nestednamespecifier(0);
			setState(434);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(433); match(Template);
				}
			}

			setState(436); unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(439); match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(440); thetypename();
				setState(441); match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(443); namespacename();
				setState(444); match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(446); decltypespecifier();
				setState(447); match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(451);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(452); match(Identifier);
						setState(453); match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(454);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(456);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(455); match(Template);
							}
						}

						setState(458); simpletemplateid();
						setState(459); match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); lambdaintroducer();
			setState(468);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(467); lambdadeclarator();
				}
			}

			setState(470); compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(LeftBracket);
			setState(474);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (This - 68)) | (1L << (And - 68)) | (1L << (Assign - 68)))) != 0) || _la==Identifier) {
				{
				setState(473); lambdacapture();
				}
			}

			setState(476); match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(484);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479); capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480); capturedefault();
				setState(481); match(Comma);
				setState(482); capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489); capture();
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(490); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(501);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(494); match(Comma);
					setState(495); capture();
					setState(497);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(496); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504); simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(512);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(508); match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); match(And);
				setState(510); match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(511); match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(514); match(Identifier);
				setState(515); initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(516); match(And);
				setState(517); match(Identifier);
				setState(518); initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(LeftParen);
			setState(522); parameterdeclarationclause();
			setState(523); match(RightParen);
			setState(525);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(524); match(Mutable);
				}
			}

			setState(528);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(527); exceptionspecification();
				}
			}

			setState(531);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(530); attributespecifierseq(0);
				}
			}

			setState(534);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(533); trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypeidofthetypeidContext typeidofthetypeid() {
			return getRuleContext(TypeidofthetypeidContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(537); primaryexpression();
				}
				break;
			case 2:
				{
				setState(538); simpletypespecifier();
				setState(539); match(LeftParen);
				setState(541);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(540); expressionlist();
					}
				}

				setState(543); match(RightParen);
				}
				break;
			case 3:
				{
				setState(545); typenamespecifier();
				setState(546); match(LeftParen);
				setState(548);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(547); expressionlist();
					}
				}

				setState(550); match(RightParen);
				}
				break;
			case 4:
				{
				setState(552); simpletypespecifier();
				setState(553); bracedinitlist();
				}
				break;
			case 5:
				{
				setState(555); typenamespecifier();
				setState(556); bracedinitlist();
				}
				break;
			case 6:
				{
				setState(558); match(Dynamic_cast);
				setState(559); match(Less);
				setState(560); thetypeid();
				setState(561); match(Greater);
				setState(562); match(LeftParen);
				setState(563); expression(0);
				setState(564); match(RightParen);
				}
				break;
			case 7:
				{
				setState(566); match(Static_cast);
				setState(567); match(Less);
				setState(568); thetypeid();
				setState(569); match(Greater);
				setState(570); match(LeftParen);
				setState(571); expression(0);
				setState(572); match(RightParen);
				}
				break;
			case 8:
				{
				setState(574); match(Reinterpret_cast);
				setState(575); match(Less);
				setState(576); thetypeid();
				setState(577); match(Greater);
				setState(578); match(LeftParen);
				setState(579); expression(0);
				setState(580); match(RightParen);
				}
				break;
			case 9:
				{
				setState(582); match(Const_cast);
				setState(583); match(Less);
				setState(584); thetypeid();
				setState(585); match(Greater);
				setState(586); match(LeftParen);
				setState(587); expression(0);
				setState(588); match(RightParen);
				}
				break;
			case 10:
				{
				setState(590); typeidofthetypeid();
				setState(591); match(LeftParen);
				setState(592); expression(0);
				setState(593); match(RightParen);
				}
				break;
			case 11:
				{
				setState(595); typeidofthetypeid();
				setState(596); match(LeftParen);
				setState(597); thetypeid();
				setState(598); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(640);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(602);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(603); match(LeftBracket);
						setState(604); expression(0);
						setState(605); match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(607);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(608); match(LeftBracket);
						setState(609); bracedinitlist();
						setState(610); match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(612);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(613); match(LeftParen);
						setState(615);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(614); expressionlist();
							}
						}

						setState(617); match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(618);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(619); match(Dot);
						setState(621);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(620); match(Template);
							}
						}

						setState(623); idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(624);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(625); match(Arrow);
						setState(627);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(626); match(Template);
							}
						}

						setState(629); idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(630);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(631); match(Dot);
						setState(632); pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(633);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(634); match(Arrow);
						setState(635); pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(636);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(637); match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(638);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(639); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeidofexprContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidofexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidofexpr(this);
		}
	}

	public final TypeidofexprContext typeidofexpr() throws RecognitionException {
		TypeidofexprContext _localctx = new TypeidofexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidofthetypeidContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(CPP14Parser.Typeid_, 0); }
		public TypeidofthetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofthetypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidofthetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidofthetypeid(this);
		}
	}

	public final TypeidofthetypeidContext typeidofthetypeid() throws RecognitionException {
		TypeidofthetypeidContext _localctx = new TypeidofthetypeidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); match(Typeid_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public List<ThetypenameContext> thetypename() {
			return getRuleContexts(ThetypenameContext.class);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ThetypenameContext thetypename(int i) {
			return getRuleContext(ThetypenameContext.class,i);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudodestructorname);
		int _la;
		try {
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(651); nestednamespecifier(0);
					}
					break;
				}
				setState(654); thetypename();
				setState(655); match(Doublecolon);
				setState(656); match(Tilde);
				setState(657); thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659); nestednamespecifier(0);
				setState(660); match(Template);
				setState(661); simpletemplateid();
				setState(662); match(Doublecolon);
				setState(663); match(Tilde);
				setState(664); thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(666); nestednamespecifier(0);
					}
				}

				setState(669); match(Tilde);
				setState(670); thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671); match(Tilde);
				setState(672); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryexpression);
		try {
			setState(703);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675); postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676); match(PlusPlus);
				setState(677); castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678); match(MinusMinus);
				setState(679); castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(680); unaryoperator();
				setState(681); castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(683); match(Sizeof);
				setState(684); unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685); match(Sizeof);
				setState(686); match(LeftParen);
				setState(687); thetypeid();
				setState(688); match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(690); match(Sizeof);
				setState(691); match(Ellipsis);
				setState(692); match(LeftParen);
				setState(693); match(Identifier);
				setState(694); match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(695); match(Alignof);
				setState(696); match(LeftParen);
				setState(697); thetypeid();
				setState(698); match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(700); noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(701); newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(702); deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__0 || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Plus - 90)) | (1L << (Minus - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Or - 90)) | (1L << (Tilde - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newexpression);
		int _la;
		try {
			setState(731);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(707); match(Doublecolon);
					}
				}

				setState(710); match(New);
				setState(712);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(711); newplacement();
					}
				}

				setState(714); newtypeid();
				setState(716);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(715); newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(718); match(Doublecolon);
					}
				}

				setState(721); match(New);
				setState(723);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(722); newplacement();
					}
					break;
				}
				setState(725); match(LeftParen);
				setState(726); thetypeid();
				setState(727); match(RightParen);
				setState(729);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(728); newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); match(LeftParen);
			setState(734); expressionlist();
			setState(735); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); typespecifierseq();
			setState(739);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(738); newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newdeclarator);
		try {
			setState(746);
			switch (_input.LA(1)) {
			case T__4:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(741); ptroperator();
				setState(743);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(742); newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(745); noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(749); match(LeftBracket);
			setState(750); expression(0);
			setState(751); match(RightBracket);
			setState(753);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(752); attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(755);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(756); match(LeftBracket);
					setState(757); constantexpression();
					setState(758); match(RightBracket);
					setState(760);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(759); attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newinitializer);
		int _la;
		try {
			setState(773);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(767); match(LeftParen);
				setState(769);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(768); expressionlist();
					}
				}

				setState(771); match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteexpression);
		int _la;
		try {
			setState(787);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(775); match(Doublecolon);
					}
				}

				setState(778); match(Delete);
				setState(779); castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(780); match(Doublecolon);
					}
				}

				setState(783); match(Delete);
				setState(784); match(LeftBracket);
				setState(785); match(RightBracket);
				setState(786); castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789); match(Noexcept);
			setState(790); match(LeftParen);
			setState(791); expression(0);
			setState(792); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_castexpression);
		try {
			setState(800);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794); unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795); match(LeftParen);
				setState(796); thetypeid();
				setState(797); match(RightParen);
				setState(798); castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(803); castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(811);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(805);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(806); match(DotStar);
						setState(807); castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(808);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(809); match(ArrowStar);
						setState(810); castexpression();
						}
						break;
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817); pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(828);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(819);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(820); match(Star);
						setState(821); pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(822);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(823); match(Div);
						setState(824); pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(825);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(826); match(Mod);
						setState(827); pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(834); multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(842);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(836);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(837); match(Plus);
						setState(838); multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(839);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(840); match(Minus);
						setState(841); multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftoperatorContext shiftoperator() {
			return getRuleContext(ShiftoperatorContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(848); additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(850);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(851); shiftoperator();
					setState(852); additiveexpression(0);
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftoperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public ShiftoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftoperator(this);
		}
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(862); shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(876);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(864);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(865); match(Less);
						setState(866); shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(867);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(868); match(Greater);
						setState(869); shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(870);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(871); match(LessEqual);
						setState(872); shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(873);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(874); match(GreaterEqual);
						setState(875); shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(882); relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(890);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(884);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(885); match(Equal);
						setState(886); relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(887);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(888); match(NotEqual);
						setState(889); relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(896); equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(898);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(899); match(And);
					setState(900); equalityexpression(0);
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(907); andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(909);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(910); match(Caret);
					setState(911); andexpression(0);
					}
					} 
				}
				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(918); exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(920);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(921); match(Or);
					setState(922); exclusiveorexpression(0);
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(929); inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(937);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(931);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(932); match(T__4);
						setState(933); inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(934);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(935); match(T__1);
						setState(936); inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(943); logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(953);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(951);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(945);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(946); match(T__5);
						setState(947); logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(948);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(949); match(T__3);
						setState(950); logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalexpression);
		try {
			setState(963);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956); logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957); logicalorexpression(0);
				setState(958); match(Question);
				setState(959); expression(0);
				setState(960); match(Colon);
				setState(961); assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentexpression);
		try {
			setState(971);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965); conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966); logicalorexpression(0);
				setState(967); assignmentoperator();
				setState(968); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970); throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (Assign - 100)) | (1L << (PlusAssign - 100)) | (1L << (MinusAssign - 100)) | (1L << (StarAssign - 100)) | (1L << (DivAssign - 100)) | (1L << (ModAssign - 100)) | (1L << (XorAssign - 100)) | (1L << (AndAssign - 100)) | (1L << (OrAssign - 100)) | (1L << (LeftShiftAssign - 100)) | (1L << (RightShiftAssign - 100)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(976); assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(978);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(979); match(Comma);
					setState(980); assignmentexpression();
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986); conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			setState(1014);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988); labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(989); attributespecifierseq(0);
					}
					break;
				}
				setState(992); expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(993); attributespecifierseq(0);
					}
				}

				setState(996); compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(998);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(997); attributespecifierseq(0);
					}
				}

				setState(1000); selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1001); attributespecifierseq(0);
					}
				}

				setState(1004); iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1006);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1005); attributespecifierseq(0);
					}
				}

				setState(1008); jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1009); declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1011);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1010); attributespecifierseq(0);
					}
				}

				setState(1013); tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
	 
		public LabeledstatementContext() { }
		public void copyFrom(LabeledstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseStatementContext extends LabeledstatementContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public CaseStatementContext(LabeledstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCaseStatement(this);
		}
	}
	public static class IdentifierStatementContext extends LabeledstatementContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierStatementContext(LabeledstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdentifierStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdentifierStatement(this);
		}
	}
	public static class DefaultStatementContext extends LabeledstatementContext {
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefaultStatementContext(LabeledstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDefaultStatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labeledstatement);
		int _la;
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new IdentifierStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1016); attributespecifierseq(0);
					}
				}

				setState(1019); match(Identifier);
				setState(1020); match(Colon);
				setState(1021); statement();
				}
				break;
			case 2:
				_localctx = new CaseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1022); attributespecifierseq(0);
					}
				}

				setState(1025); match(Case);
				setState(1026); constantexpression();
				setState(1027); match(Colon);
				setState(1028); statement();
				}
				break;
			case 3:
				_localctx = new DefaultStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1030); attributespecifierseq(0);
					}
				}

				setState(1033); match(Default);
				setState(1034); match(Colon);
				setState(1035); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1038); expression(0);
				}
			}

			setState(1041); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043); match(LeftBrace);
			setState(1045);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__2) | (1L << T__0) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1044); statementseq(0);
				}
			}

			setState(1047); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1050); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1052);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1053); statement();
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
	 
		public SelectionstatementContext() { }
		public void copyFrom(SelectionstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends SelectionstatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatementContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIfStatement(this);
		}
	}
	public static class SwitchStatementContext extends SelectionstatementContext {
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SwitchStatementContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSwitchStatement(this);
		}
	}
	public static class IfElseStatementContext extends SelectionstatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfElseStatementContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIfElseStatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionstatement);
		try {
			setState(1078);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059); match(If);
				setState(1060); match(LeftParen);
				setState(1061); condition();
				setState(1062); match(RightParen);
				setState(1063); statement();
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1065); match(If);
				setState(1066); match(LeftParen);
				setState(1067); condition();
				setState(1068); match(RightParen);
				setState(1069); statement();
				setState(1070); elsestatement();
				}
				break;
			case 3:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1072); match(Switch);
				setState(1073); match(LeftParen);
				setState(1074); condition();
				setState(1075); match(RightParen);
				setState(1076); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElsestatement(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); match(Else);
			setState(1081); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_condition);
		int _la;
		try {
			setState(1099);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1084); attributespecifierseq(0);
					}
				}

				setState(1087); declspecifierseq();
				setState(1088); declarator();
				setState(1089); match(Assign);
				setState(1090); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1092); attributespecifierseq(0);
					}
				}

				setState(1095); declspecifierseq();
				setState(1096); declarator();
				setState(1097); bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
	 
		public IterationstatementContext() { }
		public void copyFrom(IterationstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends IterationstatementContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileStatementContext(IterationstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationstatementContext {
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForStatementContext(IterationstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForStatement(this);
		}
	}
	public static class DoWhileStatementContext extends IterationstatementContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(IterationstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDoWhileStatement(this);
		}
	}
	public static class ForEachStatementContext extends IterationstatementContext {
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public ForEachStatementContext(IterationstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForEachStatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_iterationstatement);
		int _la;
		try {
			setState(1136);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1101); match(While);
				setState(1102); match(LeftParen);
				setState(1103); condition();
				setState(1104); match(RightParen);
				setState(1105); statement();
				}
				break;
			case 2:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1107); match(Do);
				setState(1108); statement();
				setState(1109); match(While);
				setState(1110); match(LeftParen);
				setState(1111); expression(0);
				setState(1112); match(RightParen);
				setState(1113); match(Semi);
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1115); match(For);
				setState(1116); match(LeftParen);
				setState(1117); forinitstatement();
				setState(1119);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1118); condition();
					}
				}

				setState(1121); match(Semi);
				setState(1123);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1122); expression(0);
					}
				}

				setState(1125); match(RightParen);
				setState(1126); statement();
				}
				break;
			case 4:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1128); match(For);
				setState(1129); match(LeftParen);
				setState(1130); forrangedeclaration();
				setState(1131); match(Colon);
				setState(1132); forrangeinitializer();
				setState(1133); match(RightParen);
				setState(1134); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forinitstatement);
		try {
			setState(1140);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138); expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139); simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1142); attributespecifierseq(0);
				}
			}

			setState(1145); declspecifierseq();
			setState(1146); declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_forrangeinitializer);
		try {
			setState(1150);
			switch (_input.LA(1)) {
			case T__2:
			case T__0:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148); expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
	 
		public JumpstatementContext() { }
		public void copyFrom(JumpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpstatementContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public BreakStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBreakStatement(this);
		}
	}
	public static class BracedInitListStatementContext extends JumpstatementContext {
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BracedInitListStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedInitListStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedInitListStatement(this);
		}
	}
	public static class GotoStatementContext extends JumpstatementContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public GotoStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitGotoStatement(this);
		}
	}
	public static class ExpressionTestStatementContext extends JumpstatementContext {
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionTestStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionTestStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionTestStatement(this);
		}
	}
	public static class ContinueStatementContext extends JumpstatementContext {
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public ContinueStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitContinueStatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_jumpstatement);
		int _la;
		try {
			setState(1168);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1152); match(Break);
				setState(1153); match(Semi);
				}
				break;
			case 2:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1154); match(Continue);
				setState(1155); match(Semi);
				}
				break;
			case 3:
				_localctx = new ExpressionTestStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1156); match(Return);
				setState(1158);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1157); expression(0);
					}
				}

				setState(1160); match(Semi);
				}
				break;
			case 4:
				_localctx = new BracedInitListStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1161); match(Return);
				setState(1162); bracedinitlist();
				setState(1163); match(Semi);
				}
				break;
			case 5:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1165); match(Goto);
				setState(1166); match(Identifier);
				setState(1167); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170); blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1173); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1175);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1176); declaration();
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declaration);
		try {
			setState(1191);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182); blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183); functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184); templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1185); explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1186); explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1187); linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1188); namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1189); emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1190); attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_blockdeclaration);
		try {
			setState(1201);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193); simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1194); asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1195); namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196); usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1197); usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1198); static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1199); aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1200); opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); match(Using);
			setState(1204); match(Identifier);
			setState(1206);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1205); attributespecifierseq(0);
				}
			}

			setState(1208); match(Assign);
			setState(1209); thetypeid();
			setState(1210); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_simpledeclaration);
		int _la;
		try {
			setState(1226);
			switch (_input.LA(1)) {
			case T__4:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1212); declspecifierseq();
					}
					break;
				}
				setState(1216);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(1215); initdeclaratorlist(0);
					}
				}

				setState(1218); match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219); attributespecifierseq(0);
				setState(1221);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1220); declspecifierseq();
					}
					break;
				}
				setState(1223); initdeclaratorlist(0);
				setState(1224); match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228); match(Static_assert);
			setState(1229); match(LeftParen);
			setState(1230); constantexpression();
			setState(1231); match(Comma);
			setState(1232); match(Stringliteral);
			setState(1233); match(RightParen);
			setState(1234); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238); attributespecifierseq(0);
			setState(1239); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_declspecifier);
		try {
			setState(1247);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241); storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242); typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243); functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1244); match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1245); match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1246); match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declspecifierseq);
		try {
			setState(1256);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249); declspecifier();
				setState(1251);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1250); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253); declspecifier();
				setState(1254); declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (Extern - 35)) | (1L << (Mutable - 35)) | (1L << (Register - 35)) | (1L << (Static - 35)) | (1L << (Thread_local - 35)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Explicit - 33)) | (1L << (Inline - 33)) | (1L << (Virtual - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typespecifier);
		try {
			setState(1267);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264); trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265); classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266); enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingtypespecifier);
		try {
			setState(1273);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269); simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270); elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271); typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1272); cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_typespecifierseq);
		try {
			setState(1282);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275); typespecifier();
				setState(1277);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1276); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279); typespecifier();
				setState(1280); typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_trailingtypespecifierseq);
		try {
			setState(1291);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284); trailingtypespecifier();
				setState(1286);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1285); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288); trailingtypespecifier();
				setState(1289); trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_simpletypespecifier);
		try {
			setState(1316);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1293); nestednamespecifier(0);
					}
					break;
				}
				setState(1296); thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297); nestednamespecifier(0);
				setState(1298); match(Template);
				setState(1299); simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301); match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1302); match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1303); match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1304); match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1305); match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1306); match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1307); match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1308); match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1309); match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1310); match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1311); match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1312); match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1313); match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1314); match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1315); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThetypenameContext extends ParserRuleContext {
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ThetypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThetypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThetypename(this);
		}
	}

	public final ThetypenameContext thetypename() throws RecognitionException {
		ThetypenameContext _localctx = new ThetypenameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_thetypename);
		try {
			setState(1322);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318); classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319); enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1320); typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1321); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_decltypespecifier);
		try {
			setState(1333);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1324); match(Decltype);
				setState(1325); match(LeftParen);
				setState(1326); expression(0);
				setState(1327); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329); match(Decltype);
				setState(1330); match(LeftParen);
				setState(1331); match(Auto);
				setState(1332); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1359);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335); classkey();
				setState(1337);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1336); attributespecifierseq(0);
					}
				}

				setState(1340);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1339); nestednamespecifier(0);
					}
					break;
				}
				setState(1342); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344); classkey();
				setState(1345); simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1347); classkey();
				setState(1348); nestednamespecifier(0);
				setState(1350);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1349); match(Template);
					}
				}

				setState(1352); simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1354); match(Enum);
				setState(1356);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1355); nestednamespecifier(0);
					}
					break;
				}
				setState(1358); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumspecifier);
		int _la;
		try {
			setState(1376);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363); enumhead();
				setState(1364); match(LeftBrace);
				setState(1366);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1365); enumeratorlist(0);
					}
				}

				setState(1368); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370); enumhead();
				setState(1371); match(LeftBrace);
				setState(1372); enumeratorlist(0);
				setState(1373); match(Comma);
				setState(1374); match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumhead);
		int _la;
		try {
			setState(1397);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378); enumkey();
				setState(1380);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1379); attributespecifierseq(0);
					}
				}

				setState(1383);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1382); match(Identifier);
					}
				}

				setState(1386);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1385); enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1388); enumkey();
				setState(1390);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1389); attributespecifierseq(0);
					}
				}

				setState(1392); nestednamespecifier(0);
				setState(1393); match(Identifier);
				setState(1395);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1394); enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399); enumkey();
			setState(1401);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1400); attributespecifierseq(0);
				}
			}

			setState(1403); match(Identifier);
			setState(1405);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1404); enumbase();
				}
			}

			setState(1407); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumkey);
		try {
			setState(1414);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409); match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410); match(Enum);
				setState(1411); match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1412); match(Enum);
				setState(1413); match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416); match(Colon);
			setState(1417); typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1420); enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1423); match(Comma);
					setState(1424); enumeratordefinition();
					}
					} 
				}
				setState(1429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumeratordefinition);
		try {
			setState(1435);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430); enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431); enumerator();
				setState(1432); match(Assign);
				setState(1433); constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespacename);
		try {
			setState(1441);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439); originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440); namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespacedefinition);
		try {
			setState(1447);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445); namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446); unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namednamespacedefinition);
		try {
			setState(1451);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449); originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450); extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1453); match(Inline);
				}
			}

			setState(1456); match(Namespace);
			setState(1457); match(Identifier);
			setState(1458); match(LeftBrace);
			setState(1459); namespacebody();
			setState(1460); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1462); match(Inline);
				}
			}

			setState(1465); match(Namespace);
			setState(1466); originalnamespacename();
			setState(1467); match(LeftBrace);
			setState(1468); namespacebody();
			setState(1469); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1471); match(Inline);
				}
			}

			setState(1474); match(Namespace);
			setState(1475); match(LeftBrace);
			setState(1476); namespacebody();
			setState(1477); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(1479); declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484); match(Namespace);
			setState(1485); match(Identifier);
			setState(1486); match(Assign);
			setState(1487); qualifiednamespacespecifier();
			setState(1488); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1490); nestednamespecifier(0);
				}
				break;
			}
			setState(1493); namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_usingdeclaration);
		int _la;
		try {
			setState(1508);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495); match(Using);
				setState(1497);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1496); match(Typename_);
					}
				}

				setState(1499); nestednamespecifier(0);
				setState(1500); unqualifiedid();
				setState(1501); match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503); match(Using);
				setState(1504); match(Doublecolon);
				setState(1505); unqualifiedid();
				setState(1506); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1510); attributespecifierseq(0);
				}
			}

			setState(1513); match(Using);
			setState(1514); match(Namespace);
			setState(1516);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1515); nestednamespecifier(0);
				}
				break;
			}
			setState(1518); namespacename();
			setState(1519); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521); match(Asm);
			setState(1522); match(LeftParen);
			setState(1523); match(Stringliteral);
			setState(1524); match(RightParen);
			setState(1525); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_linkagespecification);
		int _la;
		try {
			setState(1537);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527); match(Extern);
				setState(1528); match(Stringliteral);
				setState(1529); match(LeftBrace);
				setState(1531);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(1530); declarationseq(0);
					}
				}

				setState(1533); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534); match(Extern);
				setState(1535); match(Stringliteral);
				setState(1536); declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1540); attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1542);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1543); attributespecifier();
					}
					} 
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributespecifier);
		try {
			setState(1556);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1549); match(LeftBracket);
				setState(1550); match(LeftBracket);
				setState(1551); attributelist(0);
				setState(1552); match(RightBracket);
				setState(1553); match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1555); alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1574);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558); match(Alignas);
				setState(1559); match(LeftParen);
				setState(1560); thetypeid();
				setState(1562);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1561); match(Ellipsis);
					}
				}

				setState(1564); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566); match(Alignas);
				setState(1567); match(LeftParen);
				setState(1568); constantexpression();
				setState(1570);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1569); match(Ellipsis);
					}
				}

				setState(1572); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1578);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1577); attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1580); attribute();
				setState(1581); match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1595);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1585);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1586); match(Comma);
						setState(1588);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1587); attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1590);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1591); match(Comma);
						setState(1592); attribute();
						setState(1593); match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600); attributetoken();
			setState(1602);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1601); attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attributetoken);
		try {
			setState(1606);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605); attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608); attributenamespace();
			setState(1609); match(Doublecolon);
			setState(1610); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614); match(LeftParen);
			setState(1615); balancedtokenseq(0);
			setState(1616); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 232;
		enterRecursionRule(_localctx, 232, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1620);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1619); balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1622);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1623); balancedtoken();
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1646);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1629); match(LeftParen);
				setState(1630); balancedtokenseq(0);
				setState(1631); match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633); match(LeftBracket);
				setState(1634); balancedtokenseq(0);
				setState(1635); match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1637); match(LeftBrace);
				setState(1638); balancedtokenseq(0);
				setState(1639); match(RightBrace);
				}
				break;
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShift:
			case RightShift:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case Integerliteral:
			case Decimalliteral:
			case Octalliteral:
			case Hexadecimalliteral:
			case Binaryliteral:
			case Integersuffix:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1642); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1641);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (RightParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (RightBracket - 84)) | (1L << (LeftBrace - 84)) | (1L << (RightBrace - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1644); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1649); initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1656);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1651);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1652); match(Comma);
					setState(1653); initdeclarator();
					}
					} 
				}
				setState(1658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659); declarator();
			setState(1661);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1660); initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_declarator);
		try {
			setState(1668);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663); ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1664); noptrdeclarator(0);
				setState(1665); parametersandqualifiers();
				setState(1666); trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ptrdeclarator);
		try {
			setState(1674);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670); noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671); ptroperator();
				setState(1672); ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1677); declaratorid();
				setState(1679);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1678); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1681); match(LeftParen);
				setState(1682); ptrdeclarator();
				setState(1683); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1698);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1687);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1688); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1689);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1690); match(LeftBracket);
						setState(1692);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1691); constantexpression();
							}
						}

						setState(1694); match(RightBracket);
						setState(1696);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1695); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703); match(LeftParen);
			setState(1704); parameterdeclarationclause();
			setState(1705); match(RightParen);
			setState(1707);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1706); cvqualifierseq();
				}
				break;
			}
			setState(1710);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1709); refqualifier();
				}
				break;
			}
			setState(1713);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1712); exceptionspecification();
				}
				break;
			}
			setState(1716);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1715); attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718); match(Arrow);
			setState(1719); trailingtypespecifierseq();
			setState(1721);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1720); abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ptroperator);
		try {
			setState(1746);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723); match(Star);
				setState(1725);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1724); attributespecifierseq(0);
					}
					break;
				}
				setState(1728);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1727); cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1730); match(And);
				setState(1732);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1731); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734); match(T__4);
				setState(1736);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1735); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1738); nestednamespecifier(0);
				setState(1739); match(Star);
				setState(1741);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1740); attributespecifierseq(0);
					}
					break;
				}
				setState(1744);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1743); cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); cvqualifier();
			setState(1750);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1749); cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==And) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1756); match(Ellipsis);
				}
			}

			setState(1759); idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThetypeidContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ThetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThetypeid(this);
		}
	}

	public final ThetypeidContext thetypeid() throws RecognitionException {
		ThetypeidContext _localctx = new ThetypeidContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761); typespecifierseq();
			setState(1763);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1762); abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_abstractdeclarator);
		try {
			setState(1773);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1765); ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1766); noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1769); parametersandqualifiers();
				setState(1770); trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1772); abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_ptrabstractdeclarator);
		try {
			setState(1780);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775); noptrabstractdeclarator(0);
				}
				break;
			case T__4:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776); ptroperator();
				setState(1778);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1777); ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1783); parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1784); match(LeftBracket);
				setState(1786);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1785); constantexpression();
					}
				}

				setState(1788); match(RightBracket);
				setState(1790);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1789); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1792); match(LeftParen);
				setState(1793); ptrabstractdeclarator();
				setState(1794); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1809);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1798);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1799); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1800);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1801); match(LeftBracket);
						setState(1803);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1802); constantexpression();
							}
						}

						setState(1805); match(RightBracket);
						setState(1807);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1806); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_abstractpackdeclarator);
		try {
			setState(1818);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814); noptrabstractpackdeclarator(0);
				}
				break;
			case T__4:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1815); ptroperator();
				setState(1816); abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1821); match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1834);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1823);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1824); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1825);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1826); match(LeftBracket);
						setState(1828);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
							{
							setState(1827); constantexpression();
							}
						}

						setState(1830); match(RightBracket);
						setState(1832);
						switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
						case 1:
							{
							setState(1831); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1849);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (Alignas - 9)) | (1L << (Auto - 9)) | (1L << (Bool - 9)) | (1L << (Char - 9)) | (1L << (Char16 - 9)) | (1L << (Char32 - 9)) | (1L << (Class - 9)) | (1L << (Const - 9)) | (1L << (Constexpr - 9)) | (1L << (Decltype - 9)) | (1L << (Double - 9)) | (1L << (Enum - 9)) | (1L << (Explicit - 9)) | (1L << (Extern - 9)) | (1L << (Float - 9)) | (1L << (Friend - 9)) | (1L << (Inline - 9)) | (1L << (Int - 9)) | (1L << (Long - 9)) | (1L << (Mutable - 9)) | (1L << (Register - 9)) | (1L << (Short - 9)) | (1L << (Signed - 9)) | (1L << (Static - 9)) | (1L << (Struct - 9)) | (1L << (Thread_local - 9)))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Typedef - 73)) | (1L << (Typename_ - 73)) | (1L << (Union - 73)) | (1L << (Unsigned - 73)) | (1L << (Virtual - 73)) | (1L << (Void - 73)) | (1L << (Volatile - 73)) | (1L << (Wchar - 73)) | (1L << (LeftBracket - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1839); parameterdeclarationlist(0);
					}
				}

				setState(1843);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1842); match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1845); parameterdeclarationlist(0);
				setState(1846); match(Comma);
				setState(1847); match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1852); parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1854);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1855); match(Comma);
					setState(1856); parameterdeclaration();
					}
					} 
				}
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1893);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1862); attributespecifierseq(0);
					}
				}

				setState(1865); declspecifierseq();
				setState(1866); declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1868); attributespecifierseq(0);
					}
				}

				setState(1871); declspecifierseq();
				setState(1872); declarator();
				setState(1873); match(Assign);
				setState(1874); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1876); attributespecifierseq(0);
					}
				}

				setState(1879); declspecifierseq();
				setState(1881);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1880); abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1884);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1883); attributespecifierseq(0);
					}
				}

				setState(1886); declspecifierseq();
				setState(1888);
				_la = _input.LA(1);
				if (_la==T__4 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(1887); abstractdeclarator();
					}
				}

				setState(1890); match(Assign);
				setState(1891); initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1895); attributespecifierseq(0);
				}
			}

			setState(1899);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1898); declspecifierseq();
				}
				break;
			}
			setState(1901); declarator();
			setState(1903);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1902); virtspecifierseq(0);
				}
			}

			setState(1905); functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_functionbody);
		int _la;
		try {
			setState(1918);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1907); ctorinitializer();
					}
				}

				setState(1910); compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911); functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1912); match(Assign);
				setState(1913); match(Default);
				setState(1914); match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1915); match(Assign);
				setState(1916); match(Delete);
				setState(1917); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_initializer);
		try {
			setState(1925);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920); braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921); match(LeftParen);
				setState(1922); expressionlist();
				setState(1923); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_braceorequalinitializer);
		try {
			setState(1930);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927); match(Assign);
				setState(1928); initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1929); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_initializerclause);
		try {
			setState(1934);
			switch (_input.LA(1)) {
			case T__2:
			case T__0:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932); assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1933); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 288;
		enterRecursionRule(_localctx, 288, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1937); initializerclause();
			setState(1939);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1938); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1941);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1942); match(Comma);
					setState(1943); initializerclause();
					setState(1945);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						setState(1944); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bracedinitlist);
		int _la;
		try {
			setState(1961);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1952); match(LeftBrace);
				setState(1953); initializerlist(0);
				setState(1955);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1954); match(Comma);
					}
				}

				setState(1957); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959); match(LeftBrace);
				setState(1960); match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classname);
		try {
			setState(1965);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1964); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967); classhead();
			setState(1968); match(LeftBrace);
			setState(1970);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(1969); memberspecification();
				}
			}

			setState(1972); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classhead);
		int _la;
		try {
			setState(1992);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1974); classkey();
				setState(1976);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1975); attributespecifierseq(0);
					}
				}

				setState(1978); classheadname();
				setState(1980);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1979); classvirtspecifier();
					}
				}

				setState(1983);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1982); baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985); classkey();
				setState(1987);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1986); attributespecifierseq(0);
					}
				}

				setState(1990);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1989); baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1994); nestednamespecifier(0);
				}
				break;
			}
			setState(1997); classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1999); match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (Class - 20)) | (1L << (Struct - 20)) | (1L << (Union - 20)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_memberspecification);
		int _la;
		try {
			setState(2012);
			switch (_input.LA(1)) {
			case T__4:
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2003); memberdeclaration();
				setState(2005);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2004); memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007); accessspecifier();
				setState(2008); match(Colon);
				setState(2010);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Struct - 65)) | (1L << (Template - 65)) | (1L << (Thread_local - 65)) | (1L << (Typedef - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Using - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Tilde - 65)) | (1L << (Colon - 65)) | (1L << (Doublecolon - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
					{
					setState(2009); memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_memberdeclaration);
		int _la;
		try {
			setState(2030);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2014); attributespecifierseq(0);
					}
					break;
				}
				setState(2018);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2017); declspecifierseq();
					}
					break;
				}
				setState(2021);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Tilde - 84)) | (1L << (Colon - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2020); memberdeclaratorlist(0);
					}
				}

				setState(2023); match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2024); functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2025); usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026); static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2027); templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2028); aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2029); emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 308;
		enterRecursionRule(_localctx, 308, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2033); memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2036); match(Comma);
					setState(2037); memberdeclarator();
					}
					} 
				}
				setState(2042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_memberdeclarator);
		int _la;
		try {
			setState(2062);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2043); declarator();
				setState(2045);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2044); virtspecifierseq(0);
					}
					break;
				}
				setState(2048);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2047); purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2050); declarator();
				setState(2052);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2051); braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2055);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2054); match(Identifier);
					}
				}

				setState(2058);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2057); attributespecifierseq(0);
					}
				}

				setState(2060); match(Colon);
				setState(2061); constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2065); virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2071);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2067);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2068); virtspecifier();
					}
					} 
				}
				setState(2073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076); match(Assign);
			setState(2077); ((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080); match(Colon);
			setState(2081); basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 320;
		enterRecursionRule(_localctx, 320, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2084); basespecifier();
			setState(2086);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2085); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2096);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2088);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2089); match(Comma);
					setState(2090); basespecifier();
					setState(2092);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2091); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2098);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_basespecifier);
		int _la;
		try {
			setState(2120);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2100);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2099); attributespecifierseq(0);
					}
				}

				setState(2102); basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2104);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2103); attributespecifierseq(0);
					}
				}

				setState(2106); match(Virtual);
				setState(2108);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2107); accessspecifier();
					}
				}

				setState(2110); basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2112);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2111); attributespecifierseq(0);
					}
				}

				setState(2114); accessspecifier();
				setState(2116);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2115); match(Virtual);
					}
				}

				setState(2118); basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_classordecltype);
		try {
			setState(2127);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2123);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2122); nestednamespecifier(0);
					}
					break;
				}
				setState(2125); classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129); classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133); match(Operator);
			setState(2134); conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136); typespecifierseq();
			setState(2138);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2137); conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140); ptroperator();
			setState(2142);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2141); conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2144); match(Colon);
			setState(2145); meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_meminitializerlist);
		int _la;
		try {
			setState(2158);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2147); meminitializer();
				setState(2149);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2148); match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151); meminitializer();
				setState(2153);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2152); match(Ellipsis);
					}
				}

				setState(2155); match(Comma);
				setState(2156); meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_meminitializer);
		int _la;
		try {
			setState(2170);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2160); meminitializerid();
				setState(2161); match(LeftParen);
				setState(2163);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (This - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2162); expressionlist();
					}
				}

				setState(2165); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167); meminitializerid();
				setState(2168); bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_meminitializerid);
		try {
			setState(2174);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2172); classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2173); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TheoperatorContext theoperator() {
			return getRuleContext(TheoperatorContext.class,0);
		}
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2176); match(Operator);
			setState(2177); theoperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_literaloperatorid);
		try {
			setState(2184);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179); match(Operator);
				setState(2180); match(Stringliteral);
				setState(2181); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182); match(Operator);
				setState(2183); match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186); match(Template);
			setState(2187); match(Less);
			setState(2188); templateparameterlist(0);
			setState(2189); match(Greater);
			setState(2190); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2193); templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2196); match(Comma);
					setState(2197); templateparameter();
					}
					} 
				}
				setState(2202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_templateparameter);
		try {
			setState(2205);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2203); typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204); parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_typeparameter);
		int _la;
		try {
			setState(2255);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2207); match(Class);
				setState(2209);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2208); match(Ellipsis);
					}
					break;
				}
				setState(2212);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2211); match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214); match(Class);
				setState(2216);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2215); match(Identifier);
					}
				}

				setState(2218); match(Assign);
				setState(2219); thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2220); match(Typename_);
				setState(2222);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2221); match(Ellipsis);
					}
					break;
				}
				setState(2225);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2224); match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2227); match(Typename_);
				setState(2229);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2228); match(Identifier);
					}
				}

				setState(2231); match(Assign);
				setState(2232); thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2233); match(Template);
				setState(2234); match(Less);
				setState(2235); templateparameterlist(0);
				setState(2236); match(Greater);
				setState(2237); match(Class);
				setState(2239);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2238); match(Ellipsis);
					}
					break;
				}
				setState(2242);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2241); match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2244); match(Template);
				setState(2245); match(Less);
				setState(2246); templateparameterlist(0);
				setState(2247); match(Greater);
				setState(2248); match(Class);
				setState(2250);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2249); match(Identifier);
					}
				}

				setState(2252); match(Assign);
				setState(2253); idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2257); templatename();
			setState(2258); match(Less);
			setState(2260);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(2259); templateargumentlist(0);
				}
			}

			setState(2262); match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_templateid);
		int _la;
		try {
			setState(2279);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264); simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265); operatorfunctionid();
				setState(2266); match(Less);
				setState(2268);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2267); templateargumentlist(0);
					}
				}

				setState(2270); match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2272); literaloperatorid();
				setState(2273); match(Less);
				setState(2275);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__0) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (True - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(2274); templateargumentlist(0);
					}
				}

				setState(2277); match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 362;
		enterRecursionRule(_localctx, 362, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2284); templateargument();
			setState(2286);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2285); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2289); match(Comma);
					setState(2290); templateargument();
					setState(2292);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2291); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_templateargument);
		try {
			setState(2302);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2299); thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300); constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2301); idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(CPP14Parser.Typename_, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_typenamespecifier);
		int _la;
		try {
			setState(2315);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2304); match(Typename_);
				setState(2305); nestednamespecifier(0);
				setState(2306); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2308); match(Typename_);
				setState(2309); nestednamespecifier(0);
				setState(2311);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2310); match(Template);
					}
				}

				setState(2313); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2318);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2317); match(Extern);
				}
			}

			setState(2320); match(Template);
			setState(2321); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323); match(Template);
			setState(2324); match(Less);
			setState(2325); match(Greater);
			setState(2326); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328); match(Try);
			setState(2329); compoundstatement();
			setState(2330); handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332); match(Try);
			setState(2334);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2333); ctorinitializer();
				}
			}

			setState(2336); compoundstatement();
			setState(2337); handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339); handler();
			setState(2341);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2340); handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343); match(Catch);
			setState(2344); match(LeftParen);
			setState(2345); exceptiondeclaration();
			setState(2346); match(RightParen);
			setState(2347); compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2363);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2350);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2349); attributespecifierseq(0);
					}
				}

				setState(2352); typespecifierseq();
				setState(2353); declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2356);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2355); attributespecifierseq(0);
					}
				}

				setState(2358); typespecifierseq();
				setState(2360);
				_la = _input.LA(1);
				if (_la==T__4 || _la==Decltype || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LeftParen - 84)) | (1L << (LeftBracket - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Doublecolon - 84)) | (1L << (Ellipsis - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					setState(2359); abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2362); match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365); match(Throw);
			setState(2367);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2366); assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_exceptionspecification);
		try {
			setState(2371);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2369); dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2370); noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373); match(Throw);
			setState(2374); match(LeftParen);
			setState(2376);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Const - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Float - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Struct - 12)) | (1L << (Typename_ - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (Doublecolon - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				setState(2375); typeidlist(0);
				}
			}

			setState(2378); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 388;
		enterRecursionRule(_localctx, 388, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2381); thetypeid();
			setState(2383);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2382); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2385);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2386); match(Comma);
					setState(2387); thetypeid();
					setState(2389);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						setState(2388); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_noexceptspecification);
		try {
			setState(2402);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2396); match(Noexcept);
				setState(2397); match(LeftParen);
				setState(2398); constantexpression();
				setState(2399); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2401); match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode RightShift() { return getToken(CPP14Parser.RightShift, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPP14Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTheoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTheoperator(this);
		}
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_theoperator);
		try {
			setState(2455);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2404); match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405); match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2406); match(New);
				setState(2407); match(LeftBracket);
				setState(2408); match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2409); match(Delete);
				setState(2410); match(LeftBracket);
				setState(2411); match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2412); match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2413); match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2414); match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2415); match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2416); match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2417); match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2418); match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2419); match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2420); match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2421); match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2422); match(T__0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2423); match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2424); match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2425); match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2426); match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2427); match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2428); match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2429); match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2430); match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2431); match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2432); match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2433); match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2434); match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2435); match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2436); match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2437); match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2438); match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2439); match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2440); match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2441); match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2442); match(T__4);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2443); match(T__1);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2444); match(T__5);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2445); match(T__3);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2446); match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2447); match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2448); match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2449); match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2450); match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2451); match(LeftParen);
				setState(2452); match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2453); match(LeftBracket);
				setState(2454); match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_literal);
		try {
			setState(2464);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2457); match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2458); match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2459); match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2460); match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2461); booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2462); pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2463); userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2468); match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (Userdefinedintegerliteral - 143)) | (1L << (Userdefinedfloatingliteral - 143)) | (1L << (Userdefinedstringliteral - 143)) | (1L << (Userdefinedcharacterliteral - 143)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10: return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15: return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 26: return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 31: return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 32: return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 33: return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 34: return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 36: return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 37: return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 38: return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 39: return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 40: return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 41: return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 42: return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 46: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 52: return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 62: return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 89: return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 107: return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 110: return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 116: return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 118: return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 122: return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 133: return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 135: return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 137: return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 144: return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 154: return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 156: return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 160: return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 175: return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 181: return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 194: return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: return precpred(_ctx, 3);
		case 44: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return precpred(_ctx, 2);
		case 19: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: return precpred(_ctx, 3);
		case 40: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: return precpred(_ctx, 2);
		case 33: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: return precpred(_ctx, 2);
		case 47: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: return precpred(_ctx, 5);
		case 46: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25: return precpred(_ctx, 2);
		case 26: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: return precpred(_ctx, 2);
		case 31: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 19);
		case 4: return precpred(_ctx, 18);
		case 5: return precpred(_ctx, 17);
		case 6: return precpred(_ctx, 12);
		case 7: return precpred(_ctx, 11);
		case 8: return precpred(_ctx, 10);
		case 9: return precpred(_ctx, 9);
		case 10: return precpred(_ctx, 8);
		case 11: return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return precpred(_ctx, 4);
		case 22: return precpred(_ctx, 3);
		case 23: return precpred(_ctx, 2);
		case 24: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);
		case 17: return precpred(_ctx, 1);
		case 15: return precpred(_ctx, 3);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0098\u09ab\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\3\2\5\2\u0196\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u01a2\n\3\3\4\3\4\5\4\u01a6\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u01b1\n\5\3\6\3\6\5\6\u01b5\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c4\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u01cb\n\7\3\7\3\7\3\7\7\7\u01d0\n\7\f\7\16\7\u01d3\13\7\3\b\3"+
		"\b\5\b\u01d7\n\b\3\b\3\b\3\t\3\t\5\t\u01dd\n\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u01e7\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01ee\n\f\3\f\3\f\3\f"+
		"\3\f\5\f\u01f4\n\f\7\f\u01f6\n\f\f\f\16\f\u01f9\13\f\3\r\3\r\5\r\u01fd"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u0203\n\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u020a\n\17\3\20\3\20\3\20\3\20\5\20\u0210\n\20\3\20\5\20\u0213\n\20\3"+
		"\20\5\20\u0216\n\20\3\20\5\20\u0219\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0220\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0227\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u025b\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u026a\n\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0270\n\21\3\21\3\21\3\21\3\21\5\21\u0276\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0283\n\21\f\21\16\21\u0286"+
		"\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u028f\n\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u029e\n\25"+
		"\3\25\3\25\3\25\3\25\5\25\u02a4\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02c2\n\26\3\27\3\27\3\30\5\30"+
		"\u02c7\n\30\3\30\3\30\5\30\u02cb\n\30\3\30\3\30\5\30\u02cf\n\30\3\30\5"+
		"\30\u02d2\n\30\3\30\3\30\5\30\u02d6\n\30\3\30\3\30\3\30\3\30\5\30\u02dc"+
		"\n\30\5\30\u02de\n\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u02e6\n\32\3"+
		"\33\3\33\5\33\u02ea\n\33\3\33\5\33\u02ed\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u02f4\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u02fb\n\34\7\34\u02fd\n"+
		"\34\f\34\16\34\u0300\13\34\3\35\3\35\5\35\u0304\n\35\3\35\3\35\5\35\u0308"+
		"\n\35\3\36\5\36\u030b\n\36\3\36\3\36\3\36\5\36\u0310\n\36\3\36\3\36\3"+
		"\36\3\36\5\36\u0316\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5"+
		" \u0323\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u032e\n!\f!\16!\u0331\13!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u033f\n\"\f\"\16\"\u0342"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u034d\n#\f#\16#\u0350\13#\3$\3$\3"+
		"$\3$\3$\3$\3$\7$\u0359\n$\f$\16$\u035c\13$\3%\3%\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\7&\u036f\n&\f&\16&\u0372\13&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u037d\n\'\f\'\16\'\u0380\13\'\3(\3(\3(\3(\3("+
		"\3(\7(\u0388\n(\f(\16(\u038b\13(\3)\3)\3)\3)\3)\3)\7)\u0393\n)\f)\16)"+
		"\u0396\13)\3*\3*\3*\3*\3*\3*\7*\u039e\n*\f*\16*\u03a1\13*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\7+\u03ac\n+\f+\16+\u03af\13+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\7,\u03ba\n,\f,\16,\u03bd\13,\3-\3-\3-\3-\3-\3-\3-\5-\u03c6\n-\3.\3."+
		"\3.\3.\3.\3.\5.\u03ce\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03d8"+
		"\n\60\f\60\16\60\u03db\13\60\3\61\3\61\3\62\3\62\5\62\u03e1\n\62\3\62"+
		"\3\62\5\62\u03e5\n\62\3\62\3\62\5\62\u03e9\n\62\3\62\3\62\5\62\u03ed\n"+
		"\62\3\62\3\62\5\62\u03f1\n\62\3\62\3\62\3\62\5\62\u03f6\n\62\3\62\5\62"+
		"\u03f9\n\62\3\63\5\63\u03fc\n\63\3\63\3\63\3\63\3\63\5\63\u0402\n\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\5\63\u040a\n\63\3\63\3\63\3\63\5\63\u040f"+
		"\n\63\3\64\5\64\u0412\n\64\3\64\3\64\3\65\3\65\5\65\u0418\n\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\7\66\u0421\n\66\f\66\16\66\u0424\13\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u0439\n\67\38\38\38\39\39\59\u0440\n9\39"+
		"\39\39\39\39\39\59\u0448\n9\39\39\39\39\59\u044e\n9\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0462\n:\3:\3:\5:\u0466\n:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0473\n:\3;\3;\5;\u0477\n;\3<\5<\u047a"+
		"\n<\3<\3<\3<\3=\3=\5=\u0481\n=\3>\3>\3>\3>\3>\3>\5>\u0489\n>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\5>\u0493\n>\3?\3?\3@\3@\3@\3@\3@\7@\u049c\n@\f@\16@\u049f"+
		"\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04aa\nA\3B\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u04b4\nB\3C\3C\3C\5C\u04b9\nC\3C\3C\3C\3C\3D\5D\u04c0\nD\3D\5D\u04c3"+
		"\nD\3D\3D\3D\5D\u04c8\nD\3D\3D\3D\5D\u04cd\nD\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\5H\u04e2\nH\3I\3I\5I\u04e6\nI\3I\3I"+
		"\3I\5I\u04eb\nI\3J\3J\3K\3K\3L\3L\3M\3M\3M\5M\u04f6\nM\3N\3N\3N\3N\5N"+
		"\u04fc\nN\3O\3O\5O\u0500\nO\3O\3O\3O\5O\u0505\nO\3P\3P\5P\u0509\nP\3P"+
		"\3P\3P\5P\u050e\nP\3Q\5Q\u0511\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0527\nQ\3R\3R\3R\3R\5R\u052d\nR\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\5S\u0538\nS\3T\3T\5T\u053c\nT\3T\5T\u053f\nT\3T\3T"+
		"\3T\3T\3T\3T\3T\3T\5T\u0549\nT\3T\3T\3T\3T\5T\u054f\nT\3T\5T\u0552\nT"+
		"\3U\3U\3V\3V\3V\5V\u0559\nV\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0563\nV\3W\3W"+
		"\5W\u0567\nW\3W\5W\u056a\nW\3W\5W\u056d\nW\3W\3W\5W\u0571\nW\3W\3W\3W"+
		"\5W\u0576\nW\5W\u0578\nW\3X\3X\5X\u057c\nX\3X\3X\5X\u0580\nX\3X\3X\3Y"+
		"\3Y\3Y\3Y\3Y\5Y\u0589\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\7[\u0594\n[\f[\16"+
		"[\u0597\13[\3\\\3\\\3\\\3\\\3\\\5\\\u059e\n\\\3]\3]\3^\3^\5^\u05a4\n^"+
		"\3_\3_\3`\3`\5`\u05aa\n`\3a\3a\5a\u05ae\na\3b\5b\u05b1\nb\3b\3b\3b\3b"+
		"\3b\3b\3c\5c\u05ba\nc\3c\3c\3c\3c\3c\3c\3d\5d\u05c3\nd\3d\3d\3d\3d\3d"+
		"\3e\5e\u05cb\ne\3f\3f\3g\3g\3g\3g\3g\3g\3h\5h\u05d6\nh\3h\3h\3i\3i\5i"+
		"\u05dc\ni\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05e7\ni\3j\5j\u05ea\nj\3j\3j"+
		"\3j\5j\u05ef\nj\3j\3j\3j\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\5l\u05fe\nl\3l"+
		"\3l\3l\3l\5l\u0604\nl\3m\3m\3m\3m\3m\7m\u060b\nm\fm\16m\u060e\13m\3n\3"+
		"n\3n\3n\3n\3n\3n\5n\u0617\nn\3o\3o\3o\3o\5o\u061d\no\3o\3o\3o\3o\3o\3"+
		"o\5o\u0625\no\3o\3o\5o\u0629\no\3p\3p\5p\u062d\np\3p\3p\3p\5p\u0632\n"+
		"p\3p\3p\3p\5p\u0637\np\3p\3p\3p\3p\3p\7p\u063e\np\fp\16p\u0641\13p\3q"+
		"\3q\5q\u0645\nq\3r\3r\5r\u0649\nr\3s\3s\3s\3s\3t\3t\3u\3u\3u\3u\3v\3v"+
		"\5v\u0657\nv\3v\3v\7v\u065b\nv\fv\16v\u065e\13v\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\6w\u066d\nw\rw\16w\u066e\5w\u0671\nw\3x\3x\3x\3x\3x\3"+
		"x\7x\u0679\nx\fx\16x\u067c\13x\3y\3y\5y\u0680\ny\3z\3z\3z\3z\3z\5z\u0687"+
		"\nz\3{\3{\3{\3{\5{\u068d\n{\3|\3|\3|\5|\u0692\n|\3|\3|\3|\3|\5|\u0698"+
		"\n|\3|\3|\3|\3|\3|\5|\u069f\n|\3|\3|\5|\u06a3\n|\7|\u06a5\n|\f|\16|\u06a8"+
		"\13|\3}\3}\3}\3}\5}\u06ae\n}\3}\5}\u06b1\n}\3}\5}\u06b4\n}\3}\5}\u06b7"+
		"\n}\3~\3~\3~\5~\u06bc\n~\3\177\3\177\5\177\u06c0\n\177\3\177\5\177\u06c3"+
		"\n\177\3\177\3\177\5\177\u06c7\n\177\3\177\3\177\5\177\u06cb\n\177\3\177"+
		"\3\177\3\177\5\177\u06d0\n\177\3\177\5\177\u06d3\n\177\5\177\u06d5\n\177"+
		"\3\u0080\3\u0080\5\u0080\u06d9\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\5\u0083\u06e0\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\5\u0084"+
		"\u06e6\n\u0084\3\u0085\3\u0085\5\u0085\u06ea\n\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u06f0\n\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u06f5"+
		"\n\u0086\5\u0086\u06f7\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u06fd\n\u0087\3\u0087\3\u0087\5\u0087\u0701\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u0707\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u070e\n\u0087\3\u0087\3\u0087\5\u0087\u0712\n\u0087\7\u0087"+
		"\u0714\n\u0087\f\u0087\16\u0087\u0717\13\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u071d\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u0727\n\u0089\3\u0089\3\u0089\5\u0089"+
		"\u072b\n\u0089\7\u0089\u072d\n\u0089\f\u0089\16\u0089\u0730\13\u0089\3"+
		"\u008a\5\u008a\u0733\n\u008a\3\u008a\5\u008a\u0736\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u073c\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\7\u008b\u0744\n\u008b\f\u008b\16\u008b\u0747\13\u008b"+
		"\3\u008c\5\u008c\u074a\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0750\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0758\n\u008c\3\u008c\3\u008c\5\u008c\u075c\n\u008c\3\u008c\5\u008c\u075f"+
		"\n\u008c\3\u008c\3\u008c\5\u008c\u0763\n\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0768\n\u008c\3\u008d\5\u008d\u076b\n\u008d\3\u008d\5\u008d\u076e"+
		"\n\u008d\3\u008d\3\u008d\5\u008d\u0772\n\u008d\3\u008d\3\u008d\3\u008e"+
		"\5\u008e\u0777\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0781\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u0788\n\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u078d\n"+
		"\u0090\3\u0091\3\u0091\5\u0091\u0791\n\u0091\3\u0092\3\u0092\3\u0092\5"+
		"\u0092\u0796\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u079c\n\u0092"+
		"\7\u0092\u079e\n\u0092\f\u0092\16\u0092\u07a1\13\u0092\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u07a6\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u07ac\n\u0093\3\u0094\3\u0094\5\u0094\u07b0\n\u0094\3\u0095\3\u0095\3"+
		"\u0095\5\u0095\u07b5\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u07bb"+
		"\n\u0096\3\u0096\3\u0096\5\u0096\u07bf\n\u0096\3\u0096\5\u0096\u07c2\n"+
		"\u0096\3\u0096\3\u0096\5\u0096\u07c6\n\u0096\3\u0096\5\u0096\u07c9\n\u0096"+
		"\5\u0096\u07cb\n\u0096\3\u0097\5\u0097\u07ce\n\u0097\3\u0097\3\u0097\3"+
		"\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u07d8\n\u009a\3"+
		"\u009a\3\u009a\3\u009a\5\u009a\u07dd\n\u009a\5\u009a\u07df\n\u009a\3\u009b"+
		"\5\u009b\u07e2\n\u009b\3\u009b\5\u009b\u07e5\n\u009b\3\u009b\5\u009b\u07e8"+
		"\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u07f1\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c"+
		"\u07f9\n\u009c\f\u009c\16\u009c\u07fc\13\u009c\3\u009d\3\u009d\5\u009d"+
		"\u0800\n\u009d\3\u009d\5\u009d\u0803\n\u009d\3\u009d\3\u009d\5\u009d\u0807"+
		"\n\u009d\3\u009d\5\u009d\u080a\n\u009d\3\u009d\5\u009d\u080d\n\u009d\3"+
		"\u009d\3\u009d\5\u009d\u0811\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3"+
		"\u009e\7\u009e\u0818\n\u009e\f\u009e\16\u009e\u081b\13\u009e\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u0829\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u082f\n\u00a2\7\u00a2\u0831\n\u00a2\f\u00a2\16\u00a2\u0834\13"+
		"\u00a2\3\u00a3\5\u00a3\u0837\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u083b\n\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u083f\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u0843\n"+
		"\u00a3\3\u00a3\3\u00a3\5\u00a3\u0847\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u084b"+
		"\n\u00a3\3\u00a4\5\u00a4\u084e\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u0852\n"+
		"\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\5\u00a8\u085d\n\u00a8\3\u00a9\3\u00a9\5\u00a9\u0861\n\u00a9\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\5\u00ab\u0868\n\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u086c\n\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0871\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0876\n\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\5\u00ac\u087d\n\u00ac\3\u00ad\3\u00ad\5\u00ad\u0881\n"+
		"\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u088b\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0899\n\u00b1"+
		"\f\u00b1\16\u00b1\u089c\13\u00b1\3\u00b2\3\u00b2\5\u00b2\u08a0\n\u00b2"+
		"\3\u00b3\3\u00b3\5\u00b3\u08a4\n\u00b3\3\u00b3\5\u00b3\u08a7\n\u00b3\3"+
		"\u00b3\3\u00b3\5\u00b3\u08ab\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5"+
		"\u00b3\u08b1\n\u00b3\3\u00b3\5\u00b3\u08b4\n\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u08b8\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u08c2\n\u00b3\3\u00b3\5\u00b3\u08c5\n\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u08cd\n\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\5\u00b3\u08d2\n\u00b3\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u08d7"+
		"\n\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08df"+
		"\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08e6\n\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u08ea\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u08f1\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7"+
		"\u08f7\n\u00b7\7\u00b7\u08f9\n\u00b7\f\u00b7\16\u00b7\u08fc\13\u00b7\3"+
		"\u00b8\3\u00b8\3\u00b8\5\u00b8\u0901\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u090a\n\u00b9\3\u00b9\3\u00b9\5"+
		"\u00b9\u090e\n\u00b9\3\u00ba\5\u00ba\u0911\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\5\u00bd\u0921\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be"+
		"\3\u00be\5\u00be\u0928\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00c0\5\u00c0\u0931\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\5\u00c0\u0937\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u093b\n\u00c0\3\u00c0\5"+
		"\u00c0\u093e\n\u00c0\3\u00c1\3\u00c1\5\u00c1\u0942\n\u00c1\3\u00c2\3\u00c2"+
		"\5\u00c2\u0946\n\u00c2\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u094b\n\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0952\n\u00c4\3\u00c4\3"+
		"\u00c4\3\u00c4\3\u00c4\5\u00c4\u0958\n\u00c4\7\u00c4\u095a\n\u00c4\f\u00c4"+
		"\16\u00c4\u095d\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0965\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u099a\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u09a3\n\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\2$\f\26 \66@BDFJLNPRTV^j~\u00b4\u00d8\u00de\u00ea\u00ee"+
		"\u00f6\u010c\u0110\u0114\u0122\u0136\u013a\u0142\u0160\u016c\u0186\u00cb"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\2\20"+
		"\4\2bbff\6\2\6\6\b\b\\^bd\3\2qr\5\2ffipst\7\2%%\60\60::@@GG\5\2##--QQ"+
		"\3\2V[\4\2\27\27SS\4\2\4\4bb\5\2\26\26CCNN\4\2\'\'\66\66\3\2\679\4\2&"+
		"&II\3\2\u0091\u0094\u0ac6\2\u0195\3\2\2\2\4\u01a1\3\2\2\2\6\u01a5\3\2"+
		"\2\2\b\u01b0\3\2\2\2\n\u01b2\3\2\2\2\f\u01c3\3\2\2\2\16\u01d4\3\2\2\2"+
		"\20\u01da\3\2\2\2\22\u01e6\3\2\2\2\24\u01e8\3\2\2\2\26\u01ea\3\2\2\2\30"+
		"\u01fc\3\2\2\2\32\u0202\3\2\2\2\34\u0209\3\2\2\2\36\u020b\3\2\2\2 \u025a"+
		"\3\2\2\2\"\u0287\3\2\2\2$\u0289\3\2\2\2&\u028b\3\2\2\2(\u02a3\3\2\2\2"+
		"*\u02c1\3\2\2\2,\u02c3\3\2\2\2.\u02dd\3\2\2\2\60\u02df\3\2\2\2\62\u02e3"+
		"\3\2\2\2\64\u02ec\3\2\2\2\66\u02ee\3\2\2\28\u0307\3\2\2\2:\u0315\3\2\2"+
		"\2<\u0317\3\2\2\2>\u0322\3\2\2\2@\u0324\3\2\2\2B\u0332\3\2\2\2D\u0343"+
		"\3\2\2\2F\u0351\3\2\2\2H\u035d\3\2\2\2J\u035f\3\2\2\2L\u0373\3\2\2\2N"+
		"\u0381\3\2\2\2P\u038c\3\2\2\2R\u0397\3\2\2\2T\u03a2\3\2\2\2V\u03b0\3\2"+
		"\2\2X\u03c5\3\2\2\2Z\u03cd\3\2\2\2\\\u03cf\3\2\2\2^\u03d1\3\2\2\2`\u03dc"+
		"\3\2\2\2b\u03f8\3\2\2\2d\u040e\3\2\2\2f\u0411\3\2\2\2h\u0415\3\2\2\2j"+
		"\u041b\3\2\2\2l\u0438\3\2\2\2n\u043a\3\2\2\2p\u044d\3\2\2\2r\u0472\3\2"+
		"\2\2t\u0476\3\2\2\2v\u0479\3\2\2\2x\u0480\3\2\2\2z\u0492\3\2\2\2|\u0494"+
		"\3\2\2\2~\u0496\3\2\2\2\u0080\u04a9\3\2\2\2\u0082\u04b3\3\2\2\2\u0084"+
		"\u04b5\3\2\2\2\u0086\u04cc\3\2\2\2\u0088\u04ce\3\2\2\2\u008a\u04d6\3\2"+
		"\2\2\u008c\u04d8\3\2\2\2\u008e\u04e1\3\2\2\2\u0090\u04ea\3\2\2\2\u0092"+
		"\u04ec\3\2\2\2\u0094\u04ee\3\2\2\2\u0096\u04f0\3\2\2\2\u0098\u04f5\3\2"+
		"\2\2\u009a\u04fb\3\2\2\2\u009c\u0504\3\2\2\2\u009e\u050d\3\2\2\2\u00a0"+
		"\u0526\3\2\2\2\u00a2\u052c\3\2\2\2\u00a4\u0537\3\2\2\2\u00a6\u0551\3\2"+
		"\2\2\u00a8\u0553\3\2\2\2\u00aa\u0562\3\2\2\2\u00ac\u0577\3\2\2\2\u00ae"+
		"\u0579\3\2\2\2\u00b0\u0588\3\2\2\2\u00b2\u058a\3\2\2\2\u00b4\u058d\3\2"+
		"\2\2\u00b6\u059d\3\2\2\2\u00b8\u059f\3\2\2\2\u00ba\u05a3\3\2\2\2\u00bc"+
		"\u05a5\3\2\2\2\u00be\u05a9\3\2\2\2\u00c0\u05ad\3\2\2\2\u00c2\u05b0\3\2"+
		"\2\2\u00c4\u05b9\3\2\2\2\u00c6\u05c2\3\2\2\2\u00c8\u05ca\3\2\2\2\u00ca"+
		"\u05cc\3\2\2\2\u00cc\u05ce\3\2\2\2\u00ce\u05d5\3\2\2\2\u00d0\u05e6\3\2"+
		"\2\2\u00d2\u05e9\3\2\2\2\u00d4\u05f3\3\2\2\2\u00d6\u0603\3\2\2\2\u00d8"+
		"\u0605\3\2\2\2\u00da\u0616\3\2\2\2\u00dc\u0628\3\2\2\2\u00de\u0631\3\2"+
		"\2\2\u00e0\u0642\3\2\2\2\u00e2\u0648\3\2\2\2\u00e4\u064a\3\2\2\2\u00e6"+
		"\u064e\3\2\2\2\u00e8\u0650\3\2\2\2\u00ea\u0654\3\2\2\2\u00ec\u0670\3\2"+
		"\2\2\u00ee\u0672\3\2\2\2\u00f0\u067d\3\2\2\2\u00f2\u0686\3\2\2\2\u00f4"+
		"\u068c\3\2\2\2\u00f6\u0697\3\2\2\2\u00f8\u06a9\3\2\2\2\u00fa\u06b8\3\2"+
		"\2\2\u00fc\u06d4\3\2\2\2\u00fe\u06d6\3\2\2\2\u0100\u06da\3\2\2\2\u0102"+
		"\u06dc\3\2\2\2\u0104\u06df\3\2\2\2\u0106\u06e3\3\2\2\2\u0108\u06ef\3\2"+
		"\2\2\u010a\u06f6\3\2\2\2\u010c\u0706\3\2\2\2\u010e\u071c\3\2\2\2\u0110"+
		"\u071e\3\2\2\2\u0112\u073b\3\2\2\2\u0114\u073d\3\2\2\2\u0116\u0767\3\2"+
		"\2\2\u0118\u076a\3\2\2\2\u011a\u0780\3\2\2\2\u011c\u0787\3\2\2\2\u011e"+
		"\u078c\3\2\2\2\u0120\u0790\3\2\2\2\u0122\u0792\3\2\2\2\u0124\u07ab\3\2"+
		"\2\2\u0126\u07af\3\2\2\2\u0128\u07b1\3\2\2\2\u012a\u07ca\3\2\2\2\u012c"+
		"\u07cd\3\2\2\2\u012e\u07d1\3\2\2\2\u0130\u07d3\3\2\2\2\u0132\u07de\3\2"+
		"\2\2\u0134\u07f0\3\2\2\2\u0136\u07f2\3\2\2\2\u0138\u0810\3\2\2\2\u013a"+
		"\u0812\3\2\2\2\u013c\u081c\3\2\2\2\u013e\u081e\3\2\2\2\u0140\u0822\3\2"+
		"\2\2\u0142\u0825\3\2\2\2\u0144\u084a\3\2\2\2\u0146\u0851\3\2\2\2\u0148"+
		"\u0853\3\2\2\2\u014a\u0855\3\2\2\2\u014c\u0857\3\2\2\2\u014e\u085a\3\2"+
		"\2\2\u0150\u085e\3\2\2\2\u0152\u0862\3\2\2\2\u0154\u0870\3\2\2\2\u0156"+
		"\u087c\3\2\2\2\u0158\u0880\3\2\2\2\u015a\u0882\3\2\2\2\u015c\u088a\3\2"+
		"\2\2\u015e\u088c\3\2\2\2\u0160\u0892\3\2\2\2\u0162\u089f\3\2\2\2\u0164"+
		"\u08d1\3\2\2\2\u0166\u08d3\3\2\2\2\u0168\u08e9\3\2\2\2\u016a\u08eb\3\2"+
		"\2\2\u016c\u08ed\3\2\2\2\u016e\u0900\3\2\2\2\u0170\u090d\3\2\2\2\u0172"+
		"\u0910\3\2\2\2\u0174\u0915\3\2\2\2\u0176\u091a\3\2\2\2\u0178\u091e\3\2"+
		"\2\2\u017a\u0925\3\2\2\2\u017c\u0929\3\2\2\2\u017e\u093d\3\2\2\2\u0180"+
		"\u093f\3\2\2\2\u0182\u0945\3\2\2\2\u0184\u0947\3\2\2\2\u0186\u094e\3\2"+
		"\2\2\u0188\u0964\3\2\2\2\u018a\u0999\3\2\2\2\u018c\u09a2\3\2\2\2\u018e"+
		"\u09a4\3\2\2\2\u0190\u09a6\3\2\2\2\u0192\u09a8\3\2\2\2\u0194\u0196\5~"+
		"@\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\7\2\2\3\u0198\3\3\2\2\2\u0199\u01a2\5\u018c\u00c7\2\u019a\u01a2"+
		"\7F\2\2\u019b\u019c\7V\2\2\u019c\u019d\5^\60\2\u019d\u019e\7W\2\2\u019e"+
		"\u01a2\3\2\2\2\u019f\u01a2\5\6\4\2\u01a0\u01a2\5\16\b\2\u01a1\u0199\3"+
		"\2\2\2\u01a1\u019a\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\5\3\2\2\2\u01a3\u01a6\5\b\5\2\u01a4\u01a6\5\n\6\2"+
		"\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\7\3\2\2\2\u01a7\u01b1\7"+
		"\u0087\2\2\u01a8\u01b1\5\u015a\u00ae\2\u01a9\u01b1\5\u014c\u00a7\2\u01aa"+
		"\u01b1\5\u015c\u00af\2\u01ab\u01ac\7d\2\2\u01ac\u01b1\5\u0126\u0094\2"+
		"\u01ad\u01ae\7d\2\2\u01ae\u01b1\5\u00a4S\2\u01af\u01b1\5\u0168\u00b5\2"+
		"\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01aa"+
		"\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"\t\3\2\2\2\u01b2\u01b4\5\f\7\2\u01b3\u01b5\7E\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\5\b\5\2\u01b7\13"+
		"\3\2\2\2\u01b8\u01b9\b\7\1\2\u01b9\u01c4\7\u0082\2\2\u01ba\u01bb\5\u00a2"+
		"R\2\u01bb\u01bc\7\u0082\2\2\u01bc\u01c4\3\2\2\2\u01bd\u01be\5\u00ba^\2"+
		"\u01be\u01bf\7\u0082\2\2\u01bf\u01c4\3\2\2\2\u01c0\u01c1\5\u00a4S\2\u01c1"+
		"\u01c2\7\u0082\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01b8\3\2\2\2\u01c3\u01ba"+
		"\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01d1\3\2\2\2\u01c5"+
		"\u01c6\f\4\2\2\u01c6\u01c7\7\u0087\2\2\u01c7\u01d0\7\u0082\2\2\u01c8\u01ca"+
		"\f\3\2\2\u01c9\u01cb\7E\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\5\u0166\u00b4\2\u01cd\u01ce\7\u0082\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c8\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\r\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d4\u01d6\5\20\t\2\u01d5\u01d7\5\36\20\2\u01d6\u01d5\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\5h\65\2\u01d9\17"+
		"\3\2\2\2\u01da\u01dc\7X\2\2\u01db\u01dd\5\22\n\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7Y\2\2\u01df\21\3\2\2\2"+
		"\u01e0\u01e7\5\24\13\2\u01e1\u01e7\5\26\f\2\u01e2\u01e3\5\24\13\2\u01e3"+
		"\u01e4\7}\2\2\u01e4\u01e5\5\26\f\2\u01e5\u01e7\3\2\2\2\u01e6\u01e0\3\2"+
		"\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7\23\3\2\2\2\u01e8\u01e9"+
		"\t\2\2\2\u01e9\25\3\2\2\2\u01ea\u01eb\b\f\1\2\u01eb\u01ed\5\30\r\2\u01ec"+
		"\u01ee\7\u0086\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f7"+
		"\3\2\2\2\u01ef\u01f0\f\3\2\2\u01f0\u01f1\7}\2\2\u01f1\u01f3\5\30\r\2\u01f2"+
		"\u01f4\7\u0086\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\27\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\5\32\16"+
		"\2\u01fb\u01fd\5\34\17\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\31\3\2\2\2\u01fe\u0203\7\u0087\2\2\u01ff\u0200\7b\2\2\u0200\u0203\7\u0087"+
		"\2\2\u0201\u0203\7F\2\2\u0202\u01fe\3\2\2\2\u0202\u01ff\3\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\33\3\2\2\2\u0204\u0205\7\u0087\2\2\u0205\u020a\5"+
		"\u011c\u008f\2\u0206\u0207\7b\2\2\u0207\u0208\7\u0087\2\2\u0208\u020a"+
		"\5\u011c\u008f\2\u0209\u0204\3\2\2\2\u0209\u0206\3\2\2\2\u020a\35\3\2"+
		"\2\2\u020b\u020c\7V\2\2\u020c\u020d\5\u0112\u008a\2\u020d\u020f\7W\2\2"+
		"\u020e\u0210\7\60\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\3\2\2\2\u0211\u0213\5\u0182\u00c2\2\u0212\u0211\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\5\u00d8m\2\u0215\u0214\3\2\2\2"+
		"\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0219\5\u00fa~\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\37\3\2\2\2\u021a\u021b\b\21\1"+
		"\2\u021b\u025b\5\4\3\2\u021c\u021d\5\u00a0Q\2\u021d\u021f\7V\2\2\u021e"+
		"\u0220\5&\24\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0222\7W\2\2\u0222\u025b\3\2\2\2\u0223\u0224\5\u0170\u00b9"+
		"\2\u0224\u0226\7V\2\2\u0225\u0227\5&\24\2\u0226\u0225\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7W\2\2\u0229\u025b\3\2\2\2\u022a"+
		"\u022b\5\u00a0Q\2\u022b\u022c\5\u0124\u0093\2\u022c\u025b\3\2\2\2\u022d"+
		"\u022e\5\u0170\u00b9\2\u022e\u022f\5\u0124\u0093\2\u022f\u025b\3\2\2\2"+
		"\u0230\u0231\7 \2\2\u0231\u0232\7g\2\2\u0232\u0233\5\u0106\u0084\2\u0233"+
		"\u0234\7h\2\2\u0234\u0235\7V\2\2\u0235\u0236\5^\60\2\u0236\u0237\7W\2"+
		"\2\u0237\u025b\3\2\2\2\u0238\u0239\7B\2\2\u0239\u023a\7g\2\2\u023a\u023b"+
		"\5\u0106\u0084\2\u023b\u023c\7h\2\2\u023c\u023d\7V\2\2\u023d\u023e\5^"+
		"\60\2\u023e\u023f\7W\2\2\u023f\u025b\3\2\2\2\u0240\u0241\7;\2\2\u0241"+
		"\u0242\7g\2\2\u0242\u0243\5\u0106\u0084\2\u0243\u0244\7h\2\2\u0244\u0245"+
		"\7V\2\2\u0245\u0246\5^\60\2\u0246\u0247\7W\2\2\u0247\u025b\3\2\2\2\u0248"+
		"\u0249\7\31\2\2\u0249\u024a\7g\2\2\u024a\u024b\5\u0106\u0084\2\u024b\u024c"+
		"\7h\2\2\u024c\u024d\7V\2\2\u024d\u024e\5^\60\2\u024e\u024f\7W\2\2\u024f"+
		"\u025b\3\2\2\2\u0250\u0251\5$\23\2\u0251\u0252\7V\2\2\u0252\u0253\5^\60"+
		"\2\u0253\u0254\7W\2\2\u0254\u025b\3\2\2\2\u0255\u0256\5$\23\2\u0256\u0257"+
		"\7V\2\2\u0257\u0258\5\u0106\u0084\2\u0258\u0259\7W\2\2\u0259\u025b\3\2"+
		"\2\2\u025a\u021a\3\2\2\2\u025a\u021c\3\2\2\2\u025a\u0223\3\2\2\2\u025a"+
		"\u022a\3\2\2\2\u025a\u022d\3\2\2\2\u025a\u0230\3\2\2\2\u025a\u0238\3\2"+
		"\2\2\u025a\u0240\3\2\2\2\u025a\u0248\3\2\2\2\u025a\u0250\3\2\2\2\u025a"+
		"\u0255\3\2\2\2\u025b\u0284\3\2\2\2\u025c\u025d\f\25\2\2\u025d\u025e\7"+
		"X\2\2\u025e\u025f\5^\60\2\u025f\u0260\7Y\2\2\u0260\u0283\3\2\2\2\u0261"+
		"\u0262\f\24\2\2\u0262\u0263\7X\2\2\u0263\u0264\5\u0124\u0093\2\u0264\u0265"+
		"\7Y\2\2\u0265\u0283\3\2\2\2\u0266\u0267\f\23\2\2\u0267\u0269\7V\2\2\u0268"+
		"\u026a\5&\24\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u0283\7W\2\2\u026c\u026d\f\16\2\2\u026d\u026f\7\u0084\2\2\u026e"+
		"\u0270\7E\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0283\5\6\4\2\u0272\u0273\f\r\2\2\u0273\u0275\7\177\2\2\u0274"+
		"\u0276\7E\2\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277\u0283\5\6\4\2\u0278\u0279\f\f\2\2\u0279\u027a\7\u0084\2\2\u027a"+
		"\u0283\5(\25\2\u027b\u027c\f\13\2\2\u027c\u027d\7\177\2\2\u027d\u0283"+
		"\5(\25\2\u027e\u027f\f\n\2\2\u027f\u0283\7{\2\2\u0280\u0281\f\t\2\2\u0281"+
		"\u0283\7|\2\2\u0282\u025c\3\2\2\2\u0282\u0261\3\2\2\2\u0282\u0266\3\2"+
		"\2\2\u0282\u026c\3\2\2\2\u0282\u0272\3\2\2\2\u0282\u0278\3\2\2\2\u0282"+
		"\u027b\3\2\2\2\u0282\u027e\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0286\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285!\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0287\u0288\7L\2\2\u0288#\3\2\2\2\u0289\u028a\7L\2\2\u028a%\3"+
		"\2\2\2\u028b\u028c\5\u0122\u0092\2\u028c\'\3\2\2\2\u028d\u028f\5\f\7\2"+
		"\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291"+
		"\5\u00a2R\2\u0291\u0292\7\u0082\2\2\u0292\u0293\7d\2\2\u0293\u0294\5\u00a2"+
		"R\2\u0294\u02a4\3\2\2\2\u0295\u0296\5\f\7\2\u0296\u0297\7E\2\2\u0297\u0298"+
		"\5\u0166\u00b4\2\u0298\u0299\7\u0082\2\2\u0299\u029a\7d\2\2\u029a\u029b"+
		"\5\u00a2R\2\u029b\u02a4\3\2\2\2\u029c\u029e\5\f\7\2\u029d\u029c\3\2\2"+
		"\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7d\2\2\u02a0\u02a4"+
		"\5\u00a2R\2\u02a1\u02a2\7d\2\2\u02a2\u02a4\5\u00a4S\2\u02a3\u028e\3\2"+
		"\2\2\u02a3\u0295\3\2\2\2\u02a3\u029d\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		")\3\2\2\2\u02a5\u02c2\5 \21\2\u02a6\u02a7\7{\2\2\u02a7\u02c2\5> \2\u02a8"+
		"\u02a9\7|\2\2\u02a9\u02c2\5> \2\u02aa\u02ab\5,\27\2\u02ab\u02ac\5> \2"+
		"\u02ac\u02c2\3\2\2\2\u02ad\u02ae\7?\2\2\u02ae\u02c2\5*\26\2\u02af\u02b0"+
		"\7?\2\2\u02b0\u02b1\7V\2\2\u02b1\u02b2\5\u0106\u0084\2\u02b2\u02b3\7W"+
		"\2\2\u02b3\u02c2\3\2\2\2\u02b4\u02b5\7?\2\2\u02b5\u02b6\7\u0086\2\2\u02b6"+
		"\u02b7\7V\2\2\u02b7\u02b8\7\u0087\2\2\u02b8\u02c2\7W\2\2\u02b9\u02ba\7"+
		"\f\2\2\u02ba\u02bb\7V\2\2\u02bb\u02bc\5\u0106\u0084\2\u02bc\u02bd\7W\2"+
		"\2\u02bd\u02c2\3\2\2\2\u02be\u02c2\5<\37\2\u02bf\u02c2\5.\30\2\u02c0\u02c2"+
		"\5:\36\2\u02c1\u02a5\3\2\2\2\u02c1\u02a6\3\2\2\2\u02c1\u02a8\3\2\2\2\u02c1"+
		"\u02aa\3\2\2\2\u02c1\u02ad\3\2\2\2\u02c1\u02af\3\2\2\2\u02c1\u02b4\3\2"+
		"\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c0\3\2\2\2\u02c2+\3\2\2\2\u02c3\u02c4\t\3\2\2\u02c4-\3\2\2\2\u02c5"+
		"\u02c7\7\u0082\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02ca\7\62\2\2\u02c9\u02cb\5\60\31\2\u02ca\u02c9\3\2\2"+
		"\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\5\62\32\2\u02cd"+
		"\u02cf\58\35\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02de\3\2"+
		"\2\2\u02d0\u02d2\7\u0082\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d5\7\62\2\2\u02d4\u02d6\5\60\31\2\u02d5\u02d4"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\7V\2\2\u02d8"+
		"\u02d9\5\u0106\u0084\2\u02d9\u02db\7W\2\2\u02da\u02dc\58\35\2\u02db\u02da"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02c6\3\2\2\2\u02dd"+
		"\u02d1\3\2\2\2\u02de/\3\2\2\2\u02df\u02e0\7V\2\2\u02e0\u02e1\5&\24\2\u02e1"+
		"\u02e2\7W\2\2\u02e2\61\3\2\2\2\u02e3\u02e5\5\u009cO\2\u02e4\u02e6\5\64"+
		"\33\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\63\3\2\2\2\u02e7\u02e9"+
		"\5\u00fc\177\2\u02e8\u02ea\5\64\33\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3"+
		"\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02ed\5\66\34\2\u02ec\u02e7\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\65\3\2\2\2\u02ee\u02ef\b\34\1\2\u02ef\u02f0\7X\2"+
		"\2\u02f0\u02f1\5^\60\2\u02f1\u02f3\7Y\2\2\u02f2\u02f4\5\u00d8m\2\u02f3"+
		"\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fe\3\2\2\2\u02f5\u02f6\f\3"+
		"\2\2\u02f6\u02f7\7X\2\2\u02f7\u02f8\5`\61\2\u02f8\u02fa\7Y\2\2\u02f9\u02fb"+
		"\5\u00d8m\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2"+
		"\2\u02fc\u02f5\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\67\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303\7V\2\2\u0302"+
		"\u0304\5&\24\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0308\7W\2\2\u0306\u0308\5\u0124\u0093\2\u0307\u0301\3\2\2"+
		"\2\u0307\u0306\3\2\2\2\u03089\3\2\2\2\u0309\u030b\7\u0082\2\2\u030a\u0309"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\7\35\2\2"+
		"\u030d\u0316\5> \2\u030e\u0310\7\u0082\2\2\u030f\u030e\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\7\35\2\2\u0312\u0313\7X\2\2\u0313"+
		"\u0314\7Y\2\2\u0314\u0316\5> \2\u0315\u030a\3\2\2\2\u0315\u030f\3\2\2"+
		"\2\u0316;\3\2\2\2\u0317\u0318\7\63\2\2\u0318\u0319\7V\2\2\u0319\u031a"+
		"\5^\60\2\u031a\u031b\7W\2\2\u031b=\3\2\2\2\u031c\u0323\5*\26\2\u031d\u031e"+
		"\7V\2\2\u031e\u031f\5\u0106\u0084\2\u031f\u0320\7W\2\2\u0320\u0321\5>"+
		" \2\u0321\u0323\3\2\2\2\u0322\u031c\3\2\2\2\u0322\u031d\3\2\2\2\u0323"+
		"?\3\2\2\2\u0324\u0325\b!\1\2\u0325\u0326\5> \2\u0326\u032f\3\2\2\2\u0327"+
		"\u0328\f\4\2\2\u0328\u0329\7\u0085\2\2\u0329\u032e\5> \2\u032a\u032b\f"+
		"\3\2\2\u032b\u032c\7~\2\2\u032c\u032e\5> \2\u032d\u0327\3\2\2\2\u032d"+
		"\u032a\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330A\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\b\"\1\2\u0333\u0334"+
		"\5@!\2\u0334\u0340\3\2\2\2\u0335\u0336\f\5\2\2\u0336\u0337\7^\2\2\u0337"+
		"\u033f\5@!\2\u0338\u0339\f\4\2\2\u0339\u033a\7_\2\2\u033a\u033f\5@!\2"+
		"\u033b\u033c\f\3\2\2\u033c\u033d\7`\2\2\u033d\u033f\5@!\2\u033e\u0335"+
		"\3\2\2\2\u033e\u0338\3\2\2\2\u033e\u033b\3\2\2\2\u033f\u0342\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341C\3\2\2\2\u0342\u0340\3\2\2\2"+
		"\u0343\u0344\b#\1\2\u0344\u0345\5B\"\2\u0345\u034e\3\2\2\2\u0346\u0347"+
		"\f\4\2\2\u0347\u0348\7\\\2\2\u0348\u034d\5B\"\2\u0349\u034a\f\3\2\2\u034a"+
		"\u034b\7]\2\2\u034b\u034d\5B\"\2\u034c\u0346\3\2\2\2\u034c\u0349\3\2\2"+
		"\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034fE"+
		"\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\b$\1\2\u0352\u0353\5D#\2\u0353"+
		"\u035a\3\2\2\2\u0354\u0355\f\3\2\2\u0355\u0356\5H%\2\u0356\u0357\5D#\2"+
		"\u0357\u0359\3\2\2\2\u0358\u0354\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035bG\3\2\2\2\u035c\u035a\3\2\2\2\u035d"+
		"\u035e\t\4\2\2\u035eI\3\2\2\2\u035f\u0360\b&\1\2\u0360\u0361\5F$\2\u0361"+
		"\u0370\3\2\2\2\u0362\u0363\f\6\2\2\u0363\u0364\7g\2\2\u0364\u036f\5F$"+
		"\2\u0365\u0366\f\5\2\2\u0366\u0367\7h\2\2\u0367\u036f\5F$\2\u0368\u0369"+
		"\f\4\2\2\u0369\u036a\7w\2\2\u036a\u036f\5F$\2\u036b\u036c\f\3\2\2\u036c"+
		"\u036d\7x\2\2\u036d\u036f\5F$\2\u036e\u0362\3\2\2\2\u036e\u0365\3\2\2"+
		"\2\u036e\u0368\3\2\2\2\u036e\u036b\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371K\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0374\b\'\1\2\u0374\u0375\5J&\2\u0375\u037e\3\2\2\2\u0376\u0377\f\4\2"+
		"\2\u0377\u0378\7u\2\2\u0378\u037d\5J&\2\u0379\u037a\f\3\2\2\u037a\u037b"+
		"\7v\2\2\u037b\u037d\5J&\2\u037c\u0376\3\2\2\2\u037c\u0379\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037fM\3\2\2\2"+
		"\u0380\u037e\3\2\2\2\u0381\u0382\b(\1\2\u0382\u0383\5L\'\2\u0383\u0389"+
		"\3\2\2\2\u0384\u0385\f\3\2\2\u0385\u0386\7b\2\2\u0386\u0388\5L\'\2\u0387"+
		"\u0384\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2"+
		"\2\2\u038aO\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038d\b)\1\2\u038d\u038e"+
		"\5N(\2\u038e\u0394\3\2\2\2\u038f\u0390\f\3\2\2\u0390\u0391\7a\2\2\u0391"+
		"\u0393\5N(\2\u0392\u038f\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2"+
		"\2\u0394\u0395\3\2\2\2\u0395Q\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u0398"+
		"\b*\1\2\u0398\u0399\5P)\2\u0399\u039f\3\2\2\2\u039a\u039b\f\3\2\2\u039b"+
		"\u039c\7c\2\2\u039c\u039e\5P)\2\u039d\u039a\3\2\2\2\u039e\u03a1\3\2\2"+
		"\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0S\3\2\2\2\u03a1\u039f"+
		"\3\2\2\2\u03a2\u03a3\b+\1\2\u03a3\u03a4\5R*\2\u03a4\u03ad\3\2\2\2\u03a5"+
		"\u03a6\f\4\2\2\u03a6\u03a7\7\4\2\2\u03a7\u03ac\5R*\2\u03a8\u03a9\f\3\2"+
		"\2\u03a9\u03aa\7\7\2\2\u03aa\u03ac\5R*\2\u03ab\u03a5\3\2\2\2\u03ab\u03a8"+
		"\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"U\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b1\b,\1\2\u03b1\u03b2\5T+\2\u03b2"+
		"\u03bb\3\2\2\2\u03b3\u03b4\f\4\2\2\u03b4\u03b5\7\3\2\2\u03b5\u03ba\5T"+
		"+\2\u03b6\u03b7\f\3\2\2\u03b7\u03b8\7\5\2\2\u03b8\u03ba\5T+\2\u03b9\u03b3"+
		"\3\2\2\2\u03b9\u03b6\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bcW\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03c6\5V,\2\u03bf"+
		"\u03c0\5V,\2\u03c0\u03c1\7\u0080\2\2\u03c1\u03c2\5^\60\2\u03c2\u03c3\7"+
		"\u0081\2\2\u03c3\u03c4\5Z.\2\u03c4\u03c6\3\2\2\2\u03c5\u03be\3\2\2\2\u03c5"+
		"\u03bf\3\2\2\2\u03c6Y\3\2\2\2\u03c7\u03ce\5X-\2\u03c8\u03c9\5V,\2\u03c9"+
		"\u03ca\5\\/\2\u03ca\u03cb\5\u0120\u0091\2\u03cb\u03ce\3\2\2\2\u03cc\u03ce"+
		"\5\u0180\u00c1\2\u03cd\u03c7\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03cc\3"+
		"\2\2\2\u03ce[\3\2\2\2\u03cf\u03d0\t\5\2\2\u03d0]\3\2\2\2\u03d1\u03d2\b"+
		"\60\1\2\u03d2\u03d3\5Z.\2\u03d3\u03d9\3\2\2\2\u03d4\u03d5\f\3\2\2\u03d5"+
		"\u03d6\7}\2\2\u03d6\u03d8\5Z.\2\u03d7\u03d4\3\2\2\2\u03d8\u03db\3\2\2"+
		"\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da_\3\2\2\2\u03db\u03d9"+
		"\3\2\2\2\u03dc\u03dd\5X-\2\u03dda\3\2\2\2\u03de\u03f9\5d\63\2\u03df\u03e1"+
		"\5\u00d8m\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2"+
		"\2\u03e2\u03f9\5f\64\2\u03e3\u03e5\5\u00d8m\2\u03e4\u03e3\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03f9\5h\65\2\u03e7\u03e9\5\u00d8"+
		"m\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03f9\5l\67\2\u03eb\u03ed\5\u00d8m\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f9\5r:\2\u03ef\u03f1\5\u00d8m\2"+
		"\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f9"+
		"\5z>\2\u03f3\u03f9\5|?\2\u03f4\u03f6\5\u00d8m\2\u03f5\u03f4\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\5\u0176\u00bc\2\u03f8\u03de"+
		"\3\2\2\2\u03f8\u03e0\3\2\2\2\u03f8\u03e4\3\2\2\2\u03f8\u03e8\3\2\2\2\u03f8"+
		"\u03ec\3\2\2\2\u03f8\u03f0\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f8\u03f5\3\2"+
		"\2\2\u03f9c\3\2\2\2\u03fa\u03fc\5\u00d8m\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7\u0087\2\2\u03fe\u03ff\7\u0081"+
		"\2\2\u03ff\u040f\5b\62\2\u0400\u0402\5\u00d8m\2\u0401\u0400\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\7\21\2\2\u0404\u0405\5"+
		"`\61\2\u0405\u0406\7\u0081\2\2\u0406\u0407\5b\62\2\u0407\u040f\3\2\2\2"+
		"\u0408\u040a\5\u00d8m\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040c\7\34\2\2\u040c\u040d\7\u0081\2\2\u040d\u040f"+
		"\5b\62\2\u040e\u03fb\3\2\2\2\u040e\u0401\3\2\2\2\u040e\u0409\3\2\2\2\u040f"+
		"e\3\2\2\2\u0410\u0412\5^\60\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2"+
		"\u0412\u0413\3\2\2\2\u0413\u0414\7\u0083\2\2\u0414g\3\2\2\2\u0415\u0417"+
		"\7Z\2\2\u0416\u0418\5j\66\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041a\7[\2\2\u041ai\3\2\2\2\u041b\u041c\b\66\1\2"+
		"\u041c\u041d\5b\62\2\u041d\u0422\3\2\2\2\u041e\u041f\f\3\2\2\u041f\u0421"+
		"\5b\62\2\u0420\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423k\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\7,\2\2\u0426"+
		"\u0427\7V\2\2\u0427\u0428\5p9\2\u0428\u0429\7W\2\2\u0429\u042a\5b\62\2"+
		"\u042a\u0439\3\2\2\2\u042b\u042c\7,\2\2\u042c\u042d\7V\2\2\u042d\u042e"+
		"\5p9\2\u042e\u042f\7W\2\2\u042f\u0430\5b\62\2\u0430\u0431\5n8\2\u0431"+
		"\u0439\3\2\2\2\u0432\u0433\7D\2\2\u0433\u0434\7V\2\2\u0434\u0435\5p9\2"+
		"\u0435\u0436\7W\2\2\u0436\u0437\5b\62\2\u0437\u0439\3\2\2\2\u0438\u0425"+
		"\3\2\2\2\u0438\u042b\3\2\2\2\u0438\u0432\3\2\2\2\u0439m\3\2\2\2\u043a"+
		"\u043b\7!\2\2\u043b\u043c\5b\62\2\u043co\3\2\2\2\u043d\u044e\5^\60\2\u043e"+
		"\u0440\5\u00d8m\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441"+
		"\3\2\2\2\u0441\u0442\5\u0090I\2\u0442\u0443\5\u00f2z\2\u0443\u0444\7f"+
		"\2\2\u0444\u0445\5\u0120\u0091\2\u0445\u044e\3\2\2\2\u0446\u0448\5\u00d8"+
		"m\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044a\5\u0090I\2\u044a\u044b\5\u00f2z\2\u044b\u044c\5\u0124\u0093\2\u044c"+
		"\u044e\3\2\2\2\u044d\u043d\3\2\2\2\u044d\u043f\3\2\2\2\u044d\u0447\3\2"+
		"\2\2\u044eq\3\2\2\2\u044f\u0450\7U\2\2\u0450\u0451\7V\2\2\u0451\u0452"+
		"\5p9\2\u0452\u0453\7W\2\2\u0453\u0454\5b\62\2\u0454\u0473\3\2\2\2\u0455"+
		"\u0456\7\36\2\2\u0456\u0457\5b\62\2\u0457\u0458\7U\2\2\u0458\u0459\7V"+
		"\2\2\u0459\u045a\5^\60\2\u045a\u045b\7W\2\2\u045b\u045c\7\u0083\2\2\u045c"+
		"\u0473\3\2\2\2\u045d\u045e\7)\2\2\u045e\u045f\7V\2\2\u045f\u0461\5t;\2"+
		"\u0460\u0462\5p9\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463"+
		"\3\2\2\2\u0463\u0465\7\u0083\2\2\u0464\u0466\5^\60\2\u0465\u0464\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\7W\2\2\u0468\u0469"+
		"\5b\62\2\u0469\u0473\3\2\2\2\u046a\u046b\7)\2\2\u046b\u046c\7V\2\2\u046c"+
		"\u046d\5v<\2\u046d\u046e\7\u0081\2\2\u046e\u046f\5x=\2\u046f\u0470\7W"+
		"\2\2\u0470\u0471\5b\62\2\u0471\u0473\3\2\2\2\u0472\u044f\3\2\2\2\u0472"+
		"\u0455\3\2\2\2\u0472\u045d\3\2\2\2\u0472\u046a\3\2\2\2\u0473s\3\2\2\2"+
		"\u0474\u0477\5f\64\2\u0475\u0477\5\u0086D\2\u0476\u0474\3\2\2\2\u0476"+
		"\u0475\3\2\2\2\u0477u\3\2\2\2\u0478\u047a\5\u00d8m\2\u0479\u0478\3\2\2"+
		"\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\5\u0090I\2\u047c"+
		"\u047d\5\u00f2z\2\u047dw\3\2\2\2\u047e\u0481\5^\60\2\u047f\u0481\5\u0124"+
		"\u0093\2\u0480\u047e\3\2\2\2\u0480\u047f\3\2\2\2\u0481y\3\2\2\2\u0482"+
		"\u0483\7\20\2\2\u0483\u0493\7\u0083\2\2\u0484\u0485\7\32\2\2\u0485\u0493"+
		"\7\u0083\2\2\u0486\u0488\7<\2\2\u0487\u0489\5^\60\2\u0488\u0487\3\2\2"+
		"\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u0493\7\u0083\2\2\u048b"+
		"\u048c\7<\2\2\u048c\u048d\5\u0124\u0093\2\u048d\u048e\7\u0083\2\2\u048e"+
		"\u0493\3\2\2\2\u048f\u0490\7+\2\2\u0490\u0491\7\u0087\2\2\u0491\u0493"+
		"\7\u0083\2\2\u0492\u0482\3\2\2\2\u0492\u0484\3\2\2\2\u0492\u0486\3\2\2"+
		"\2\u0492\u048b\3\2\2\2\u0492\u048f\3\2\2\2\u0493{\3\2\2\2\u0494\u0495"+
		"\5\u0082B\2\u0495}\3\2\2\2\u0496\u0497\b@\1\2\u0497\u0498\5\u0080A\2\u0498"+
		"\u049d\3\2\2\2\u0499\u049a\f\3\2\2\u049a\u049c\5\u0080A\2\u049b\u0499"+
		"\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\177\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04aa\5\u0082B\2\u04a1\u04aa\5"+
		"\u0118\u008d\2\u04a2\u04aa\5\u015e\u00b0\2\u04a3\u04aa\5\u0172\u00ba\2"+
		"\u04a4\u04aa\5\u0174\u00bb\2\u04a5\u04aa\5\u00d6l\2\u04a6\u04aa\5\u00be"+
		"`\2\u04a7\u04aa\5\u008aF\2\u04a8\u04aa\5\u008cG\2\u04a9\u04a0\3\2\2\2"+
		"\u04a9\u04a1\3\2\2\2\u04a9\u04a2\3\2\2\2\u04a9\u04a3\3\2\2\2\u04a9\u04a4"+
		"\3\2\2\2\u04a9\u04a5\3\2\2\2\u04a9\u04a6\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9"+
		"\u04a8\3\2\2\2\u04aa\u0081\3\2\2\2\u04ab\u04b4\5\u0086D\2\u04ac\u04b4"+
		"\5\u00d4k\2\u04ad\u04b4\5\u00ccg\2\u04ae\u04b4\5\u00d0i\2\u04af\u04b4"+
		"\5\u00d2j\2\u04b0\u04b4\5\u0088E\2\u04b1\u04b4\5\u0084C\2\u04b2\u04b4"+
		"\5\u00aeX\2\u04b3\u04ab\3\2\2\2\u04b3\u04ac\3\2\2\2\u04b3\u04ad\3\2\2"+
		"\2\u04b3\u04ae\3\2\2\2\u04b3\u04af\3\2\2\2\u04b3\u04b0\3\2\2\2\u04b3\u04b1"+
		"\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4\u0083\3\2\2\2\u04b5\u04b6\7P\2\2\u04b6"+
		"\u04b8\7\u0087\2\2\u04b7\u04b9\5\u00d8m\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7f\2\2\u04bb\u04bc\5\u0106\u0084"+
		"\2\u04bc\u04bd\7\u0083\2\2\u04bd\u0085\3\2\2\2\u04be\u04c0\5\u0090I\2"+
		"\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\3\2\2\2\u04c1\u04c3"+
		"\5\u00eex\2\u04c2\u04c1\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2"+
		"\2\u04c4\u04cd\7\u0083\2\2\u04c5\u04c7\5\u00d8m\2\u04c6\u04c8\5\u0090"+
		"I\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\5\u00eex\2\u04ca\u04cb\7\u0083\2\2\u04cb\u04cd\3\2\2\2\u04cc\u04bf"+
		"\3\2\2\2\u04cc\u04c5\3\2\2\2\u04cd\u0087\3\2\2\2\u04ce\u04cf\7A\2\2\u04cf"+
		"\u04d0\7V\2\2\u04d0\u04d1\5`\61\2\u04d1\u04d2\7}\2\2\u04d2\u04d3\7\u0090"+
		"\2\2\u04d3\u04d4\7W\2\2\u04d4\u04d5\7\u0083\2\2\u04d5\u0089\3\2\2\2\u04d6"+
		"\u04d7\7\u0083\2\2\u04d7\u008b\3\2\2\2\u04d8\u04d9\5\u00d8m\2\u04d9\u04da"+
		"\7\u0083\2\2\u04da\u008d\3\2\2\2\u04db\u04e2\5\u0092J\2\u04dc\u04e2\5"+
		"\u0098M\2\u04dd\u04e2\5\u0094K\2\u04de\u04e2\7*\2\2\u04df\u04e2\7K\2\2"+
		"\u04e0\u04e2\7\30\2\2\u04e1\u04db\3\2\2\2\u04e1\u04dc\3\2\2\2\u04e1\u04dd"+
		"\3\2\2\2\u04e1\u04de\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2"+
		"\u008f\3\2\2\2\u04e3\u04e5\5\u008eH\2\u04e4\u04e6\5\u00d8m\2\u04e5\u04e4"+
		"\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04eb\3\2\2\2\u04e7\u04e8\5\u008eH"+
		"\2\u04e8\u04e9\5\u0090I\2\u04e9\u04eb\3\2\2\2\u04ea\u04e3\3\2\2\2\u04ea"+
		"\u04e7\3\2\2\2\u04eb\u0091\3\2\2\2\u04ec\u04ed\t\6\2\2\u04ed\u0093\3\2"+
		"\2\2\u04ee\u04ef\t\7\2\2\u04ef\u0095\3\2\2\2\u04f0\u04f1\7\u0087\2\2\u04f1"+
		"\u0097\3\2\2\2\u04f2\u04f6\5\u009aN\2\u04f3\u04f6\5\u0128\u0095\2\u04f4"+
		"\u04f6\5\u00aaV\2\u04f5\u04f2\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f4"+
		"\3\2\2\2\u04f6\u0099\3\2\2\2\u04f7\u04fc\5\u00a0Q\2\u04f8\u04fc\5\u00a6"+
		"T\2\u04f9\u04fc\5\u0170\u00b9\2\u04fa\u04fc\5\u0100\u0081\2\u04fb\u04f7"+
		"\3\2\2\2\u04fb\u04f8\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fc"+
		"\u009b\3\2\2\2\u04fd\u04ff\5\u0098M\2\u04fe\u0500\5\u00d8m\2\u04ff\u04fe"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0505\3\2\2\2\u0501\u0502\5\u0098M"+
		"\2\u0502\u0503\5\u009cO\2\u0503\u0505\3\2\2\2\u0504\u04fd\3\2\2\2\u0504"+
		"\u0501\3\2\2\2\u0505\u009d\3\2\2\2\u0506\u0508\5\u009aN\2\u0507\u0509"+
		"\5\u00d8m\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050e\3\2\2"+
		"\2\u050a\u050b\5\u009aN\2\u050b\u050c\5\u009eP\2\u050c\u050e\3\2\2\2\u050d"+
		"\u0506\3\2\2\2\u050d\u050a\3\2\2\2\u050e\u009f\3\2\2\2\u050f\u0511\5\f"+
		"\7\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0527\5\u00a2R\2\u0513\u0514\5\f\7\2\u0514\u0515\7E\2\2\u0515\u0516\5"+
		"\u0166\u00b4\2\u0516\u0527\3\2\2\2\u0517\u0527\7\23\2\2\u0518\u0527\7"+
		"\24\2\2\u0519\u0527\7\25\2\2\u051a\u0527\7T\2\2\u051b\u0527\7\17\2\2\u051c"+
		"\u0527\7=\2\2\u051d\u0527\7.\2\2\u051e\u0527\7/\2\2\u051f\u0527\7>\2\2"+
		"\u0520\u0527\7O\2\2\u0521\u0527\7(\2\2\u0522\u0527\7\37\2\2\u0523\u0527"+
		"\7R\2\2\u0524\u0527\7\16\2\2\u0525\u0527\5\u00a4S\2\u0526\u0510\3\2\2"+
		"\2\u0526\u0513\3\2\2\2\u0526\u0517\3\2\2\2\u0526\u0518\3\2\2\2\u0526\u0519"+
		"\3\2\2\2\u0526\u051a\3\2\2\2\u0526\u051b\3\2\2\2\u0526\u051c\3\2\2\2\u0526"+
		"\u051d\3\2\2\2\u0526\u051e\3\2\2\2\u0526\u051f\3\2\2\2\u0526\u0520\3\2"+
		"\2\2\u0526\u0521\3\2\2\2\u0526\u0522\3\2\2\2\u0526\u0523\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0525\3\2\2\2\u0527\u00a1\3\2\2\2\u0528\u052d\5\u0126"+
		"\u0094\2\u0529\u052d\5\u00a8U\2\u052a\u052d\5\u0096L\2\u052b\u052d\5\u0166"+
		"\u00b4\2\u052c\u0528\3\2\2\2\u052c\u0529\3\2\2\2\u052c\u052a\3\2\2\2\u052c"+
		"\u052b\3\2\2\2\u052d\u00a3\3\2\2\2\u052e\u052f\7\33\2\2\u052f\u0530\7"+
		"V\2\2\u0530\u0531\5^\60\2\u0531\u0532\7W\2\2\u0532\u0538\3\2\2\2\u0533"+
		"\u0534\7\33\2\2\u0534\u0535\7V\2\2\u0535\u0536\7\16\2\2\u0536\u0538\7"+
		"W\2\2\u0537\u052e\3\2\2\2\u0537\u0533\3\2\2\2\u0538\u00a5\3\2\2\2\u0539"+
		"\u053b\5\u0130\u0099\2\u053a\u053c\5\u00d8m\2\u053b\u053a\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u053f\5\f\7\2\u053e\u053d\3\2"+
		"\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\7\u0087\2\2\u0541"+
		"\u0552\3\2\2\2\u0542\u0543\5\u0130\u0099\2\u0543\u0544\5\u0166\u00b4\2"+
		"\u0544\u0552\3\2\2\2\u0545\u0546\5\u0130\u0099\2\u0546\u0548\5\f\7\2\u0547"+
		"\u0549\7E\2\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2"+
		"\2\2\u054a\u054b\5\u0166\u00b4\2\u054b\u0552\3\2\2\2\u054c\u054e\7\"\2"+
		"\2\u054d\u054f\5\f\7\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550"+
		"\3\2\2\2\u0550\u0552\7\u0087\2\2\u0551\u0539\3\2\2\2\u0551\u0542\3\2\2"+
		"\2\u0551\u0545\3\2\2\2\u0551\u054c\3\2\2\2\u0552\u00a7\3\2\2\2\u0553\u0554"+
		"\7\u0087\2\2\u0554\u00a9\3\2\2\2\u0555\u0556\5\u00acW\2\u0556\u0558\7"+
		"Z\2\2\u0557\u0559\5\u00b4[\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055a\3\2\2\2\u055a\u055b\7[\2\2\u055b\u0563\3\2\2\2\u055c\u055d\5\u00ac"+
		"W\2\u055d\u055e\7Z\2\2\u055e\u055f\5\u00b4[\2\u055f\u0560\7}\2\2\u0560"+
		"\u0561\7[\2\2\u0561\u0563\3\2\2\2\u0562\u0555\3\2\2\2\u0562\u055c\3\2"+
		"\2\2\u0563\u00ab\3\2\2\2\u0564\u0566\5\u00b0Y\2\u0565\u0567\5\u00d8m\2"+
		"\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u056a"+
		"\7\u0087\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2\2"+
		"\2\u056b\u056d\5\u00b2Z\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d"+
		"\u0578\3\2\2\2\u056e\u0570\5\u00b0Y\2\u056f\u0571\5\u00d8m\2\u0570\u056f"+
		"\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\5\f\7\2\u0573"+
		"\u0575\7\u0087\2\2\u0574\u0576\5\u00b2Z\2\u0575\u0574\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0564\3\2\2\2\u0577\u056e\3\2\2\2\u0578"+
		"\u00ad\3\2\2\2\u0579\u057b\5\u00b0Y\2\u057a\u057c\5\u00d8m\2\u057b\u057a"+
		"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\7\u0087\2"+
		"\2\u057e\u0580\5\u00b2Z\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0582\7\u0083\2\2\u0582\u00af\3\2\2\2\u0583\u0589"+
		"\7\"\2\2\u0584\u0585\7\"\2\2\u0585\u0589\7\26\2\2\u0586\u0587\7\"\2\2"+
		"\u0587\u0589\7C\2\2\u0588\u0583\3\2\2\2\u0588\u0584\3\2\2\2\u0588\u0586"+
		"\3\2\2\2\u0589\u00b1\3\2\2\2\u058a\u058b\7\u0081\2\2\u058b\u058c\5\u009c"+
		"O\2\u058c\u00b3\3\2\2\2\u058d\u058e\b[\1\2\u058e\u058f\5\u00b6\\\2\u058f"+
		"\u0595\3\2\2\2\u0590\u0591\f\3\2\2\u0591\u0592\7}\2\2\u0592\u0594\5\u00b6"+
		"\\\2\u0593\u0590\3\2\2\2\u0594\u0597\3\2\2\2\u0595\u0593\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u00b5\3\2\2\2\u0597\u0595\3\2\2\2\u0598\u059e\5\u00b8"+
		"]\2\u0599\u059a\5\u00b8]\2\u059a\u059b\7f\2\2\u059b\u059c\5`\61\2\u059c"+
		"\u059e\3\2\2\2\u059d\u0598\3\2\2\2\u059d\u0599\3\2\2\2\u059e\u00b7\3\2"+
		"\2\2\u059f\u05a0\7\u0087\2\2\u05a0\u00b9\3\2\2\2\u05a1\u05a4\5\u00bc_"+
		"\2\u05a2\u05a4\5\u00caf\2\u05a3\u05a1\3\2\2\2\u05a3\u05a2\3\2\2\2\u05a4"+
		"\u00bb\3\2\2\2\u05a5\u05a6\7\u0087\2\2\u05a6\u00bd\3\2\2\2\u05a7\u05aa"+
		"\5\u00c0a\2\u05a8\u05aa\5\u00c6d\2\u05a9\u05a7\3\2\2\2\u05a9\u05a8\3\2"+
		"\2\2\u05aa\u00bf\3\2\2\2\u05ab\u05ae\5\u00c2b\2\u05ac\u05ae\5\u00c4c\2"+
		"\u05ad\u05ab\3\2\2\2\u05ad\u05ac\3\2\2\2\u05ae\u00c1\3\2\2\2\u05af\u05b1"+
		"\7-\2\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"\u05b3\7\61\2\2\u05b3\u05b4\7\u0087\2\2\u05b4\u05b5\7Z\2\2\u05b5\u05b6"+
		"\5\u00c8e\2\u05b6\u05b7\7[\2\2\u05b7\u00c3\3\2\2\2\u05b8\u05ba\7-\2\2"+
		"\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc"+
		"\7\61\2\2\u05bc\u05bd\5\u00bc_\2\u05bd\u05be\7Z\2\2\u05be\u05bf\5\u00c8"+
		"e\2\u05bf\u05c0\7[\2\2\u05c0\u00c5\3\2\2\2\u05c1\u05c3\7-\2\2\u05c2\u05c1"+
		"\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\7\61\2\2"+
		"\u05c5\u05c6\7Z\2\2\u05c6\u05c7\5\u00c8e\2\u05c7\u05c8\7[\2\2\u05c8\u00c7"+
		"\3\2\2\2\u05c9\u05cb\5~@\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u00c9\3\2\2\2\u05cc\u05cd\7\u0087\2\2\u05cd\u00cb\3\2\2\2\u05ce\u05cf"+
		"\7\61\2\2\u05cf\u05d0\7\u0087\2\2\u05d0\u05d1\7f\2\2\u05d1\u05d2\5\u00ce"+
		"h\2\u05d2\u05d3\7\u0083\2\2\u05d3\u00cd\3\2\2\2\u05d4\u05d6\5\f\7\2\u05d5"+
		"\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\5\u00ba"+
		"^\2\u05d8\u00cf\3\2\2\2\u05d9\u05db\7P\2\2\u05da\u05dc\7M\2\2\u05db\u05da"+
		"\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\5\f\7\2\u05de"+
		"\u05df\5\b\5\2\u05df\u05e0\7\u0083\2\2\u05e0\u05e7\3\2\2\2\u05e1\u05e2"+
		"\7P\2\2\u05e2\u05e3\7\u0082\2\2\u05e3\u05e4\5\b\5\2\u05e4\u05e5\7\u0083"+
		"\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05d9\3\2\2\2\u05e6\u05e1\3\2\2\2\u05e7"+
		"\u00d1\3\2\2\2\u05e8\u05ea\5\u00d8m\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea"+
		"\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\7P\2\2\u05ec\u05ee\7\61\2\2\u05ed"+
		"\u05ef\5\f\7\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f1\5\u00ba^\2\u05f1\u05f2\7\u0083\2\2\u05f2\u00d3\3\2\2"+
		"\2\u05f3\u05f4\7\r\2\2\u05f4\u05f5\7V\2\2\u05f5\u05f6\7\u0090\2\2\u05f6"+
		"\u05f7\7W\2\2\u05f7\u05f8\7\u0083\2\2\u05f8\u00d5\3\2\2\2\u05f9\u05fa"+
		"\7%\2\2\u05fa\u05fb\7\u0090\2\2\u05fb\u05fd\7Z\2\2\u05fc\u05fe\5~@\2\u05fd"+
		"\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0604\7["+
		"\2\2\u0600\u0601\7%\2\2\u0601\u0602\7\u0090\2\2\u0602\u0604\5\u0080A\2"+
		"\u0603\u05f9\3\2\2\2\u0603\u0600\3\2\2\2\u0604\u00d7\3\2\2\2\u0605\u0606"+
		"\bm\1\2\u0606\u0607\5\u00dan\2\u0607\u060c\3\2\2\2\u0608\u0609\f\3\2\2"+
		"\u0609\u060b\5\u00dan\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2\2\u060c"+
		"\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u00d9\3\2\2\2\u060e\u060c\3\2"+
		"\2\2\u060f\u0610\7X\2\2\u0610\u0611\7X\2\2\u0611\u0612\5\u00dep\2\u0612"+
		"\u0613\7Y\2\2\u0613\u0614\7Y\2\2\u0614\u0617\3\2\2\2\u0615\u0617\5\u00dc"+
		"o\2\u0616\u060f\3\2\2\2\u0616\u0615\3\2\2\2\u0617\u00db\3\2\2\2\u0618"+
		"\u0619\7\13\2\2\u0619\u061a\7V\2\2\u061a\u061c\5\u0106\u0084\2\u061b\u061d"+
		"\7\u0086\2\2\u061c\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2\2"+
		"\2\u061e\u061f\7W\2\2\u061f\u0629\3\2\2\2\u0620\u0621\7\13\2\2\u0621\u0622"+
		"\7V\2\2\u0622\u0624\5`\61\2\u0623\u0625\7\u0086\2\2\u0624\u0623\3\2\2"+
		"\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\7W\2\2\u0627\u0629"+
		"\3\2\2\2\u0628\u0618\3\2\2\2\u0628\u0620\3\2\2\2\u0629\u00dd\3\2\2\2\u062a"+
		"\u062c\bp\1\2\u062b\u062d\5\u00e0q\2\u062c\u062b\3\2\2\2\u062c\u062d\3"+
		"\2\2\2\u062d\u0632\3\2\2\2\u062e\u062f\5\u00e0q\2\u062f\u0630\7\u0086"+
		"\2\2\u0630\u0632\3\2\2\2\u0631\u062a\3\2\2\2\u0631\u062e\3\2\2\2\u0632"+
		"\u063f\3\2\2\2\u0633\u0634\f\5\2\2\u0634\u0636\7}\2\2\u0635\u0637\5\u00e0"+
		"q\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u063e\3\2\2\2\u0638"+
		"\u0639\f\3\2\2\u0639\u063a\7}\2\2\u063a\u063b\5\u00e0q\2\u063b\u063c\7"+
		"\u0086\2\2\u063c\u063e\3\2\2\2\u063d\u0633\3\2\2\2\u063d\u0638\3\2\2\2"+
		"\u063e\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u00df"+
		"\3\2\2\2\u0641\u063f\3\2\2\2\u0642\u0644\5\u00e2r\2\u0643\u0645\5\u00e8"+
		"u\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u00e1\3\2\2\2\u0646"+
		"\u0649\7\u0087\2\2\u0647\u0649\5\u00e4s\2\u0648\u0646\3\2\2\2\u0648\u0647"+
		"\3\2\2\2\u0649\u00e3\3\2\2\2\u064a\u064b\5\u00e6t\2\u064b\u064c\7\u0082"+
		"\2\2\u064c\u064d\7\u0087\2\2\u064d\u00e5\3\2\2\2\u064e\u064f\7\u0087\2"+
		"\2\u064f\u00e7\3\2\2\2\u0650\u0651\7V\2\2\u0651\u0652\5\u00eav\2\u0652"+
		"\u0653\7W\2\2\u0653\u00e9\3\2\2\2\u0654\u0656\bv\1\2\u0655\u0657\5\u00ec"+
		"w\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u065c\3\2\2\2\u0658"+
		"\u0659\f\3\2\2\u0659\u065b\5\u00ecw\2\u065a\u0658\3\2\2\2\u065b\u065e"+
		"\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u00eb\3\2\2\2\u065e"+
		"\u065c\3\2\2\2\u065f\u0660\7V\2\2\u0660\u0661\5\u00eav\2\u0661\u0662\7"+
		"W\2\2\u0662\u0671\3\2\2\2\u0663\u0664\7X\2\2\u0664\u0665\5\u00eav\2\u0665"+
		"\u0666\7Y\2\2\u0666\u0671\3\2\2\2\u0667\u0668\7Z\2\2\u0668\u0669\5\u00ea"+
		"v\2\u0669\u066a\7[\2\2\u066a\u0671\3\2\2\2\u066b\u066d\n\b\2\2\u066c\u066b"+
		"\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f"+
		"\u0671\3\2\2\2\u0670\u065f\3\2\2\2\u0670\u0663\3\2\2\2\u0670\u0667\3\2"+
		"\2\2\u0670\u066c\3\2\2\2\u0671\u00ed\3\2\2\2\u0672\u0673\bx\1\2\u0673"+
		"\u0674\5\u00f0y\2\u0674\u067a\3\2\2\2\u0675\u0676\f\3\2\2\u0676\u0677"+
		"\7}\2\2\u0677\u0679\5\u00f0y\2\u0678\u0675\3\2\2\2\u0679\u067c\3\2\2\2"+
		"\u067a\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u00ef\3\2\2\2\u067c\u067a"+
		"\3\2\2\2\u067d\u067f\5\u00f2z\2\u067e\u0680\5\u011c\u008f\2\u067f\u067e"+
		"\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u00f1\3\2\2\2\u0681\u0687\5\u00f4{"+
		"\2\u0682\u0683\5\u00f6|\2\u0683\u0684\5\u00f8}\2\u0684\u0685\5\u00fa~"+
		"\2\u0685\u0687\3\2\2\2\u0686\u0681\3\2\2\2\u0686\u0682\3\2\2\2\u0687\u00f3"+
		"\3\2\2\2\u0688\u068d\5\u00f6|\2\u0689\u068a\5\u00fc\177\2\u068a\u068b"+
		"\5\u00f4{\2\u068b\u068d\3\2\2\2\u068c\u0688\3\2\2\2\u068c\u0689\3\2\2"+
		"\2\u068d\u00f5\3\2\2\2\u068e\u068f\b|\1\2\u068f\u0691\5\u0104\u0083\2"+
		"\u0690\u0692\5\u00d8m\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692"+
		"\u0698\3\2\2\2\u0693\u0694\7V\2\2\u0694\u0695\5\u00f4{\2\u0695\u0696\7"+
		"W\2\2\u0696\u0698\3\2\2\2\u0697\u068e\3\2\2\2\u0697\u0693\3\2\2\2\u0698"+
		"\u06a6\3\2\2\2\u0699\u069a\f\5\2\2\u069a\u06a5\5\u00f8}\2\u069b\u069c"+
		"\f\4\2\2\u069c\u069e\7X\2\2\u069d\u069f\5`\61\2\u069e\u069d\3\2\2\2\u069e"+
		"\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a2\7Y\2\2\u06a1\u06a3\5\u00d8"+
		"m\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4"+
		"\u0699\3\2\2\2\u06a4\u069b\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4\3\2"+
		"\2\2\u06a6\u06a7\3\2\2\2\u06a7\u00f7\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9"+
		"\u06aa\7V\2\2\u06aa\u06ab\5\u0112\u008a\2\u06ab\u06ad\7W\2\2\u06ac\u06ae"+
		"\5\u00fe\u0080\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0\3"+
		"\2\2\2\u06af\u06b1\5\u0102\u0082\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2"+
		"\2\2\u06b1\u06b3\3\2\2\2\u06b2\u06b4\5\u0182\u00c2\2\u06b3\u06b2\3\2\2"+
		"\2\u06b3\u06b4\3\2\2\2\u06b4\u06b6\3\2\2\2\u06b5\u06b7\5\u00d8m\2\u06b6"+
		"\u06b5\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u00f9\3\2\2\2\u06b8\u06b9\7\177"+
		"\2\2\u06b9\u06bb\5\u009eP\2\u06ba\u06bc\5\u0108\u0085\2\u06bb\u06ba\3"+
		"\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u00fb\3\2\2\2\u06bd\u06bf\7^\2\2\u06be"+
		"\u06c0\5\u00d8m\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2"+
		"\3\2\2\2\u06c1\u06c3\5\u00fe\u0080\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3"+
		"\2\2\2\u06c3\u06d5\3\2\2\2\u06c4\u06c6\7b\2\2\u06c5\u06c7\5\u00d8m\2\u06c6"+
		"\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06d5\3\2\2\2\u06c8\u06ca\7\4"+
		"\2\2\u06c9\u06cb\5\u00d8m\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb"+
		"\u06d5\3\2\2\2\u06cc\u06cd\5\f\7\2\u06cd\u06cf\7^\2\2\u06ce\u06d0\5\u00d8"+
		"m\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d2\3\2\2\2\u06d1"+
		"\u06d3\5\u00fe\u0080\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5"+
		"\3\2\2\2\u06d4\u06bd\3\2\2\2\u06d4\u06c4\3\2\2\2\u06d4\u06c8\3\2\2\2\u06d4"+
		"\u06cc\3\2\2\2\u06d5\u00fd\3\2\2\2\u06d6\u06d8\5\u0100\u0081\2\u06d7\u06d9"+
		"\5\u00fe\u0080\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u00ff\3"+
		"\2\2\2\u06da\u06db\t\t\2\2\u06db\u0101\3\2\2\2\u06dc\u06dd\t\n\2\2\u06dd"+
		"\u0103\3\2\2\2\u06de\u06e0\7\u0086\2\2\u06df\u06de\3\2\2\2\u06df\u06e0"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\5\6\4\2\u06e2\u0105\3\2\2\2\u06e3"+
		"\u06e5\5\u009cO\2\u06e4\u06e6\5\u0108\u0085\2\u06e5\u06e4\3\2\2\2\u06e5"+
		"\u06e6\3\2\2\2\u06e6\u0107\3\2\2\2\u06e7\u06f0\5\u010a\u0086\2\u06e8\u06ea"+
		"\5\u010c\u0087\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\3"+
		"\2\2\2\u06eb\u06ec\5\u00f8}\2\u06ec\u06ed\5\u00fa~\2\u06ed\u06f0\3\2\2"+
		"\2\u06ee\u06f0\5\u010e\u0088\2\u06ef\u06e7\3\2\2\2\u06ef\u06e9\3\2\2\2"+
		"\u06ef\u06ee\3\2\2\2\u06f0\u0109\3\2\2\2\u06f1\u06f7\5\u010c\u0087\2\u06f2"+
		"\u06f4\5\u00fc\177\2\u06f3\u06f5\5\u010a\u0086\2\u06f4\u06f3\3\2\2\2\u06f4"+
		"\u06f5\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f1\3\2\2\2\u06f6\u06f2\3\2"+
		"\2\2\u06f7\u010b\3\2\2\2\u06f8\u06f9\b\u0087\1\2\u06f9\u0707\5\u00f8}"+
		"\2\u06fa\u06fc\7X\2\2\u06fb\u06fd\5`\61\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd"+
		"\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\7Y\2\2\u06ff\u0701\5\u00d8m\2"+
		"\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0707\3\2\2\2\u0702\u0703"+
		"\7V\2\2\u0703\u0704\5\u010a\u0086\2\u0704\u0705\7W\2\2\u0705\u0707\3\2"+
		"\2\2\u0706\u06f8\3\2\2\2\u0706\u06fa\3\2\2\2\u0706\u0702\3\2\2\2\u0707"+
		"\u0715\3\2\2\2\u0708\u0709\f\7\2\2\u0709\u0714\5\u00f8}\2\u070a\u070b"+
		"\f\5\2\2\u070b\u070d\7X\2\2\u070c\u070e\5`\61\2\u070d\u070c\3\2\2\2\u070d"+
		"\u070e\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\7Y\2\2\u0710\u0712\5\u00d8"+
		"m\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714\3\2\2\2\u0713"+
		"\u0708\3\2\2\2\u0713\u070a\3\2\2\2\u0714\u0717\3\2\2\2\u0715\u0713\3\2"+
		"\2\2\u0715\u0716\3\2\2\2\u0716\u010d\3\2\2\2\u0717\u0715\3\2\2\2\u0718"+
		"\u071d\5\u0110\u0089\2\u0719\u071a\5\u00fc\177\2\u071a\u071b\5\u010e\u0088"+
		"\2\u071b\u071d\3\2\2\2\u071c\u0718\3\2\2\2\u071c\u0719\3\2\2\2\u071d\u010f"+
		"\3\2\2\2\u071e\u071f\b\u0089\1\2\u071f\u0720\7\u0086\2\2\u0720\u072e\3"+
		"\2\2\2\u0721\u0722\f\5\2\2\u0722\u072d\5\u00f8}\2\u0723\u0724\f\4\2\2"+
		"\u0724\u0726\7X\2\2\u0725\u0727\5`\61\2\u0726\u0725\3\2\2\2\u0726\u0727"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\7Y\2\2\u0729\u072b\5\u00d8m\2"+
		"\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072d\3\2\2\2\u072c\u0721"+
		"\3\2\2\2\u072c\u0723\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e"+
		"\u072f\3\2\2\2\u072f\u0111\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0733\5\u0114"+
		"\u008b\2\u0732\u0731\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734"+
		"\u0736\7\u0086\2\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u073c"+
		"\3\2\2\2\u0737\u0738\5\u0114\u008b\2\u0738\u0739\7}\2\2\u0739\u073a\7"+
		"\u0086\2\2\u073a\u073c\3\2\2\2\u073b\u0732\3\2\2\2\u073b\u0737\3\2\2\2"+
		"\u073c\u0113\3\2\2\2\u073d\u073e\b\u008b\1\2\u073e\u073f\5\u0116\u008c"+
		"\2\u073f\u0745\3\2\2\2\u0740\u0741\f\3\2\2\u0741\u0742\7}\2\2\u0742\u0744"+
		"\5\u0116\u008c\2\u0743\u0740\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3"+
		"\2\2\2\u0745\u0746\3\2\2\2\u0746\u0115\3\2\2\2\u0747\u0745\3\2\2\2\u0748"+
		"\u074a\5\u00d8m\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074b"+
		"\3\2\2\2\u074b\u074c\5\u0090I\2\u074c\u074d\5\u00f2z\2\u074d\u0768\3\2"+
		"\2\2\u074e\u0750\5\u00d8m\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0752\5\u0090I\2\u0752\u0753\5\u00f2z\2\u0753\u0754"+
		"\7f\2\2\u0754\u0755\5\u0120\u0091\2\u0755\u0768\3\2\2\2\u0756\u0758\5"+
		"\u00d8m\2\u0757\u0756\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\3\2\2\2"+
		"\u0759\u075b\5\u0090I\2\u075a\u075c\5\u0108\u0085\2\u075b\u075a\3\2\2"+
		"\2\u075b\u075c\3\2\2\2\u075c\u0768\3\2\2\2\u075d\u075f\5\u00d8m\2\u075e"+
		"\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\5\u0090"+
		"I\2\u0761\u0763\5\u0108\u0085\2\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2"+
		"\2\u0763\u0764\3\2\2\2\u0764\u0765\7f\2\2\u0765\u0766\5\u0120\u0091\2"+
		"\u0766\u0768\3\2\2\2\u0767\u0749\3\2\2\2\u0767\u074f\3\2\2\2\u0767\u0757"+
		"\3\2\2\2\u0767\u075e\3\2\2\2\u0768\u0117\3\2\2\2\u0769\u076b\5\u00d8m"+
		"\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2\2\2\u076c\u076e"+
		"\5\u0090I\2\u076d\u076c\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\3\2\2"+
		"\2\u076f\u0771\5\u00f2z\2\u0770\u0772\5\u013a\u009e\2\u0771\u0770\3\2"+
		"\2\2\u0771\u0772\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\5\u011a\u008e"+
		"\2\u0774\u0119\3\2\2\2\u0775\u0777\5\u0152\u00aa\2\u0776\u0775\3\2\2\2"+
		"\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0781\5h\65\2\u0779\u0781"+
		"\5\u0178\u00bd\2\u077a\u077b\7f\2\2\u077b\u077c\7\34\2\2\u077c\u0781\7"+
		"\u0083\2\2\u077d\u077e\7f\2\2\u077e\u077f\7\35\2\2\u077f\u0781\7\u0083"+
		"\2\2\u0780\u0776\3\2\2\2\u0780\u0779\3\2\2\2\u0780\u077a\3\2\2\2\u0780"+
		"\u077d\3\2\2\2\u0781\u011b\3\2\2\2\u0782\u0788\5\u011e\u0090\2\u0783\u0784"+
		"\7V\2\2\u0784\u0785\5&\24\2\u0785\u0786\7W\2\2\u0786\u0788\3\2\2\2\u0787"+
		"\u0782\3\2\2\2\u0787\u0783\3\2\2\2\u0788\u011d\3\2\2\2\u0789\u078a\7f"+
		"\2\2\u078a\u078d\5\u0120\u0091\2\u078b\u078d\5\u0124\u0093\2\u078c\u0789"+
		"\3\2\2\2\u078c\u078b\3\2\2\2\u078d\u011f\3\2\2\2\u078e\u0791\5Z.\2\u078f"+
		"\u0791\5\u0124\u0093\2\u0790\u078e\3\2\2\2\u0790\u078f\3\2\2\2\u0791\u0121"+
		"\3\2\2\2\u0792\u0793\b\u0092\1\2\u0793\u0795\5\u0120\u0091\2\u0794\u0796"+
		"\7\u0086\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u079f\3\2\2"+
		"\2\u0797\u0798\f\3\2\2\u0798\u0799\7}\2\2\u0799\u079b\5\u0120\u0091\2"+
		"\u079a\u079c\7\u0086\2\2\u079b\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c"+
		"\u079e\3\2\2\2\u079d\u0797\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d\3\2"+
		"\2\2\u079f\u07a0\3\2\2\2\u07a0\u0123\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2"+
		"\u07a3\7Z\2\2\u07a3\u07a5\5\u0122\u0092\2\u07a4\u07a6\7}\2\2\u07a5\u07a4"+
		"\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\7[\2\2\u07a8"+
		"\u07ac\3\2\2\2\u07a9\u07aa\7Z\2\2\u07aa\u07ac\7[\2\2\u07ab\u07a2\3\2\2"+
		"\2\u07ab\u07a9\3\2\2\2\u07ac\u0125\3\2\2\2\u07ad\u07b0\7\u0087\2\2\u07ae"+
		"\u07b0\5\u0166\u00b4\2\u07af\u07ad\3\2\2\2\u07af\u07ae\3\2\2\2\u07b0\u0127"+
		"\3\2\2\2\u07b1\u07b2\5\u012a\u0096\2\u07b2\u07b4\7Z\2\2\u07b3\u07b5\5"+
		"\u0132\u009a\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2"+
		"\2\2\u07b6\u07b7\7[\2\2\u07b7\u0129\3\2\2\2\u07b8\u07ba\5\u0130\u0099"+
		"\2\u07b9\u07bb\5\u00d8m\2\u07ba\u07b9\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07bc\3\2\2\2\u07bc\u07be\5\u012c\u0097\2\u07bd\u07bf\5\u012e\u0098\2"+
		"\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c1\3\2\2\2\u07c0\u07c2"+
		"\5\u0140\u00a1\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07cb\3"+
		"\2\2\2\u07c3\u07c5\5\u0130\u0099\2\u07c4\u07c6\5\u00d8m\2\u07c5\u07c4"+
		"\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\3\2\2\2\u07c7\u07c9\5\u0140\u00a1"+
		"\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07b8"+
		"\3\2\2\2\u07ca\u07c3\3\2\2\2\u07cb\u012b\3\2\2\2\u07cc\u07ce\5\f\7\2\u07cd"+
		"\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u07d0\5\u0126"+
		"\u0094\2\u07d0\u012d\3\2\2\2\u07d1\u07d2\7\'\2\2\u07d2\u012f\3\2\2\2\u07d3"+
		"\u07d4\t\13\2\2\u07d4\u0131\3\2\2\2\u07d5\u07d7\5\u0134\u009b\2\u07d6"+
		"\u07d8\5\u0132\u009a\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07df"+
		"\3\2\2\2\u07d9\u07da\5\u014a\u00a6\2\u07da\u07dc\7\u0081\2\2\u07db\u07dd"+
		"\5\u0132\u009a\2\u07dc\u07db\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\3"+
		"\2\2\2\u07de\u07d5\3\2\2\2\u07de\u07d9\3\2\2\2\u07df\u0133\3\2\2\2\u07e0"+
		"\u07e2\5\u00d8m\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e4"+
		"\3\2\2\2\u07e3\u07e5\5\u0090I\2\u07e4\u07e3\3\2\2\2\u07e4\u07e5\3\2\2"+
		"\2\u07e5\u07e7\3\2\2\2\u07e6\u07e8\5\u0136\u009c\2\u07e7\u07e6\3\2\2\2"+
		"\u07e7\u07e8\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07f1\7\u0083\2\2\u07ea"+
		"\u07f1\5\u0118\u008d\2\u07eb\u07f1\5\u00d0i\2\u07ec\u07f1\5\u0088E\2\u07ed"+
		"\u07f1\5\u015e\u00b0\2\u07ee\u07f1\5\u0084C\2\u07ef\u07f1\5\u008aF\2\u07f0"+
		"\u07e1\3\2\2\2\u07f0\u07ea\3\2\2\2\u07f0\u07eb\3\2\2\2\u07f0\u07ec\3\2"+
		"\2\2\u07f0\u07ed\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0\u07ef\3\2\2\2\u07f1"+
		"\u0135\3\2\2\2\u07f2\u07f3\b\u009c\1\2\u07f3\u07f4\5\u0138\u009d\2\u07f4"+
		"\u07fa\3\2\2\2\u07f5\u07f6\f\3\2\2\u07f6\u07f7\7}\2\2\u07f7\u07f9\5\u0138"+
		"\u009d\2\u07f8\u07f5\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u0137\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd\u07ff\5\u00f2"+
		"z\2\u07fe\u0800\5\u013a\u009e\2\u07ff\u07fe\3\2\2\2\u07ff\u0800\3\2\2"+
		"\2\u0800\u0802\3\2\2\2\u0801\u0803\5\u013e\u00a0\2\u0802\u0801\3\2\2\2"+
		"\u0802\u0803\3\2\2\2\u0803\u0811\3\2\2\2\u0804\u0806\5\u00f2z\2\u0805"+
		"\u0807\5\u011e\u0090\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0811"+
		"\3\2\2\2\u0808\u080a\7\u0087\2\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2\2"+
		"\2\u080a\u080c\3\2\2\2\u080b\u080d\5\u00d8m\2\u080c\u080b\3\2\2\2\u080c"+
		"\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\7\u0081\2\2\u080f\u0811"+
		"\5`\61\2\u0810\u07fd\3\2\2\2\u0810\u0804\3\2\2\2\u0810\u0809\3\2\2\2\u0811"+
		"\u0139\3\2\2\2\u0812\u0813\b\u009e\1\2\u0813\u0814\5\u013c\u009f\2\u0814"+
		"\u0819\3\2\2\2\u0815\u0816\f\3\2\2\u0816\u0818\5\u013c\u009f\2\u0817\u0815"+
		"\3\2\2\2\u0818\u081b\3\2\2\2\u0819\u0817\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u013b\3\2\2\2\u081b\u0819\3\2\2\2\u081c\u081d\t\f\2\2\u081d\u013d\3\2"+
		"\2\2\u081e\u081f\7f\2\2\u081f\u0820\7\u008a\2\2\u0820\u0821\b\u00a0\1"+
		"\2\u0821\u013f\3\2\2\2\u0822\u0823\7\u0081\2\2\u0823\u0824\5\u0142\u00a2"+
		"\2\u0824\u0141\3\2\2\2\u0825\u0826\b\u00a2\1\2\u0826\u0828\5\u0144\u00a3"+
		"\2\u0827\u0829\7\u0086\2\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829"+
		"\u0832\3\2\2\2\u082a\u082b\f\3\2\2\u082b\u082c\7}\2\2\u082c\u082e\5\u0144"+
		"\u00a3\2\u082d\u082f\7\u0086\2\2\u082e\u082d\3\2\2\2\u082e\u082f\3\2\2"+
		"\2\u082f\u0831\3\2\2\2\u0830\u082a\3\2\2\2\u0831\u0834\3\2\2\2\u0832\u0830"+
		"\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0143\3\2\2\2\u0834\u0832\3\2\2\2\u0835"+
		"\u0837\5\u00d8m\2\u0836\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838"+
		"\3\2\2\2\u0838\u084b\5\u0148\u00a5\2\u0839\u083b\5\u00d8m\2\u083a\u0839"+
		"\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083e\7Q\2\2\u083d"+
		"\u083f\5\u014a\u00a6\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u084b\5\u0148\u00a5\2\u0841\u0843\5\u00d8m\2\u0842\u0841"+
		"\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0846\5\u014a\u00a6"+
		"\2\u0845\u0847\7Q\2\2\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u0849\5\u0148\u00a5\2\u0849\u084b\3\2\2\2\u084a\u0836\3"+
		"\2\2\2\u084a\u083a\3\2\2\2\u084a\u0842\3\2\2\2\u084b\u0145\3\2\2\2\u084c"+
		"\u084e\5\f\7\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2"+
		"\2\2\u084f\u0852\5\u0126\u0094\2\u0850\u0852\5\u00a4S\2\u0851\u084d\3"+
		"\2\2\2\u0851\u0850\3\2\2\2\u0852\u0147\3\2\2\2\u0853\u0854\5\u0146\u00a4"+
		"\2\u0854\u0149\3\2\2\2\u0855\u0856\t\r\2\2\u0856\u014b\3\2\2\2\u0857\u0858"+
		"\7\65\2\2\u0858\u0859\5\u014e\u00a8\2\u0859\u014d\3\2\2\2\u085a\u085c"+
		"\5\u009cO\2\u085b\u085d\5\u0150\u00a9\2\u085c\u085b\3\2\2\2\u085c\u085d"+
		"\3\2\2\2\u085d\u014f\3\2\2\2\u085e\u0860\5\u00fc\177\2\u085f\u0861\5\u0150"+
		"\u00a9\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0151\3\2\2\2\u0862"+
		"\u0863\7\u0081\2\2\u0863\u0864\5\u0154\u00ab\2\u0864\u0153\3\2\2\2\u0865"+
		"\u0867\5\u0156\u00ac\2\u0866\u0868\7\u0086\2\2\u0867\u0866\3\2\2\2\u0867"+
		"\u0868\3\2\2\2\u0868\u0871\3\2\2\2\u0869\u086b\5\u0156\u00ac\2\u086a\u086c"+
		"\7\u0086\2\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086d\3\2\2"+
		"\2\u086d\u086e\7}\2\2\u086e\u086f\5\u0154\u00ab\2\u086f\u0871\3\2\2\2"+
		"\u0870\u0865\3\2\2\2\u0870\u0869\3\2\2\2\u0871\u0155\3\2\2\2\u0872\u0873"+
		"\5\u0158\u00ad\2\u0873\u0875\7V\2\2\u0874\u0876\5&\24\2\u0875\u0874\3"+
		"\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\7W\2\2\u0878"+
		"\u087d\3\2\2\2\u0879\u087a\5\u0158\u00ad\2\u087a\u087b\5\u0124\u0093\2"+
		"\u087b\u087d\3\2\2\2\u087c\u0872\3\2\2\2\u087c\u0879\3\2\2\2\u087d\u0157"+
		"\3\2\2\2\u087e\u0881\5\u0146\u00a4\2\u087f\u0881\7\u0087\2\2\u0880\u087e"+
		"\3\2\2\2\u0880\u087f\3\2\2\2\u0881\u0159\3\2\2\2\u0882\u0883\7\65\2\2"+
		"\u0883\u0884\5\u018a\u00c6\2\u0884\u015b\3\2\2\2\u0885\u0886\7\65\2\2"+
		"\u0886\u0887\7\u0090\2\2\u0887\u088b\7\u0087\2\2\u0888\u0889\7\65\2\2"+
		"\u0889\u088b\7\u0093\2\2\u088a\u0885\3\2\2\2\u088a\u0888\3\2\2\2\u088b"+
		"\u015d\3\2\2\2\u088c\u088d\7E\2\2\u088d\u088e\7g\2\2\u088e\u088f\5\u0160"+
		"\u00b1\2\u088f\u0890\7h\2\2\u0890\u0891\5\u0080A\2\u0891\u015f\3\2\2\2"+
		"\u0892\u0893\b\u00b1\1\2\u0893\u0894\5\u0162\u00b2\2\u0894\u089a\3\2\2"+
		"\2\u0895\u0896\f\3\2\2\u0896\u0897\7}\2\2\u0897\u0899\5\u0162\u00b2\2"+
		"\u0898\u0895\3\2\2\2\u0899\u089c\3\2\2\2\u089a\u0898\3\2\2\2\u089a\u089b"+
		"\3\2\2\2\u089b\u0161\3\2\2\2\u089c\u089a\3\2\2\2\u089d\u08a0\5\u0164\u00b3"+
		"\2\u089e\u08a0\5\u0116\u008c\2\u089f\u089d\3\2\2\2\u089f\u089e\3\2\2\2"+
		"\u08a0\u0163\3\2\2\2\u08a1\u08a3\7\26\2\2\u08a2\u08a4\7\u0086\2\2\u08a3"+
		"\u08a2\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a6\3\2\2\2\u08a5\u08a7\7\u0087"+
		"\2\2\u08a6\u08a5\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08d2\3\2\2\2\u08a8"+
		"\u08aa\7\26\2\2\u08a9\u08ab\7\u0087\2\2\u08aa\u08a9\3\2\2\2\u08aa\u08ab"+
		"\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ad\7f\2\2\u08ad\u08d2\5\u0106\u0084"+
		"\2\u08ae\u08b0\7M\2\2\u08af\u08b1\7\u0086\2\2\u08b0\u08af\3\2\2\2\u08b0"+
		"\u08b1\3\2\2\2\u08b1\u08b3\3\2\2\2\u08b2\u08b4\7\u0087\2\2\u08b3\u08b2"+
		"\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08d2\3\2\2\2\u08b5\u08b7\7M\2\2\u08b6"+
		"\u08b8\7\u0087\2\2\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9"+
		"\3\2\2\2\u08b9\u08ba\7f\2\2\u08ba\u08d2\5\u0106\u0084\2\u08bb\u08bc\7"+
		"E\2\2\u08bc\u08bd\7g\2\2\u08bd\u08be\5\u0160\u00b1\2\u08be\u08bf\7h\2"+
		"\2\u08bf\u08c1\7\26\2\2\u08c0\u08c2\7\u0086\2\2\u08c1\u08c0\3\2\2\2\u08c1"+
		"\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3\u08c5\7\u0087\2\2\u08c4\u08c3"+
		"\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08d2\3\2\2\2\u08c6\u08c7\7E\2\2\u08c7"+
		"\u08c8\7g\2\2\u08c8\u08c9\5\u0160\u00b1\2\u08c9\u08ca\7h\2\2\u08ca\u08cc"+
		"\7\26\2\2\u08cb\u08cd\7\u0087\2\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2"+
		"\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf\7f\2\2\u08cf\u08d0\5\6\4\2\u08d0"+
		"\u08d2\3\2\2\2\u08d1\u08a1\3\2\2\2\u08d1\u08a8\3\2\2\2\u08d1\u08ae\3\2"+
		"\2\2\u08d1\u08b5\3\2\2\2\u08d1\u08bb\3\2\2\2\u08d1\u08c6\3\2\2\2\u08d2"+
		"\u0165\3\2\2\2\u08d3\u08d4\5\u016a\u00b6\2\u08d4\u08d6\7g\2\2\u08d5\u08d7"+
		"\5\u016c\u00b7\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3"+
		"\2\2\2\u08d8\u08d9\7h\2\2\u08d9\u0167\3\2\2\2\u08da\u08ea\5\u0166\u00b4"+
		"\2\u08db\u08dc\5\u015a\u00ae\2\u08dc\u08de\7g\2\2\u08dd\u08df\5\u016c"+
		"\u00b7\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0"+
		"\u08e1\7h\2\2\u08e1\u08ea\3\2\2\2\u08e2\u08e3\5\u015c\u00af\2\u08e3\u08e5"+
		"\7g\2\2\u08e4\u08e6\5\u016c\u00b7\2\u08e5\u08e4\3\2\2\2\u08e5\u08e6\3"+
		"\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\7h\2\2\u08e8\u08ea\3\2\2\2\u08e9"+
		"\u08da\3\2\2\2\u08e9\u08db\3\2\2\2\u08e9\u08e2\3\2\2\2\u08ea\u0169\3\2"+
		"\2\2\u08eb\u08ec\7\u0087\2\2\u08ec\u016b\3\2\2\2\u08ed\u08ee\b\u00b7\1"+
		"\2\u08ee\u08f0\5\u016e\u00b8\2\u08ef\u08f1\7\u0086\2\2\u08f0\u08ef\3\2"+
		"\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08fa\3\2\2\2\u08f2\u08f3\f\3\2\2\u08f3"+
		"\u08f4\7}\2\2\u08f4\u08f6\5\u016e\u00b8\2\u08f5\u08f7\7\u0086\2\2\u08f6"+
		"\u08f5\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08f2\3\2"+
		"\2\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb"+
		"\u016d\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fd\u0901\5\u0106\u0084\2\u08fe\u0901"+
		"\5`\61\2\u08ff\u0901\5\6\4\2\u0900\u08fd\3\2\2\2\u0900\u08fe\3\2\2\2\u0900"+
		"\u08ff\3\2\2\2\u0901\u016f\3\2\2\2\u0902\u0903\7M\2\2\u0903\u0904\5\f"+
		"\7\2\u0904\u0905\7\u0087\2\2\u0905\u090e\3\2\2\2\u0906\u0907\7M\2\2\u0907"+
		"\u0909\5\f\7\2\u0908\u090a\7E\2\2\u0909\u0908\3\2\2\2\u0909\u090a\3\2"+
		"\2\2\u090a\u090b\3\2\2\2\u090b\u090c\5\u0166\u00b4\2\u090c\u090e\3\2\2"+
		"\2\u090d\u0902\3\2\2\2\u090d\u0906\3\2\2\2\u090e\u0171\3\2\2\2\u090f\u0911"+
		"\7%\2\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912"+
		"\u0913\7E\2\2\u0913\u0914\5\u0080A\2\u0914\u0173\3\2\2\2\u0915\u0916\7"+
		"E\2\2\u0916\u0917\7g\2\2\u0917\u0918\7h\2\2\u0918\u0919\5\u0080A\2\u0919"+
		"\u0175\3\2\2\2\u091a\u091b\7J\2\2\u091b\u091c\5h\65\2\u091c\u091d\5\u017a"+
		"\u00be\2\u091d\u0177\3\2\2\2\u091e\u0920\7J\2\2\u091f\u0921\5\u0152\u00aa"+
		"\2\u0920\u091f\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923"+
		"\5h\65\2\u0923\u0924\5\u017a\u00be\2\u0924\u0179\3\2\2\2\u0925\u0927\5"+
		"\u017c\u00bf\2\u0926\u0928\5\u017a\u00be\2\u0927\u0926\3\2\2\2\u0927\u0928"+
		"\3\2\2\2\u0928\u017b\3\2\2\2\u0929\u092a\7\22\2\2\u092a\u092b\7V\2\2\u092b"+
		"\u092c\5\u017e\u00c0\2\u092c\u092d\7W\2\2\u092d\u092e\5h\65\2\u092e\u017d"+
		"\3\2\2\2\u092f\u0931\5\u00d8m\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2"+
		"\2\u0931\u0932\3\2\2\2\u0932\u0933\5\u009cO\2\u0933\u0934\5\u00f2z\2\u0934"+
		"\u093e\3\2\2\2\u0935\u0937\5\u00d8m\2\u0936\u0935\3\2\2\2\u0936\u0937"+
		"\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u093a\5\u009cO\2\u0939\u093b\5\u0108"+
		"\u0085\2\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093e\3\2\2\2\u093c"+
		"\u093e\7\u0086\2\2\u093d\u0930\3\2\2\2\u093d\u0936\3\2\2\2\u093d\u093c"+
		"\3\2\2\2\u093e\u017f\3\2\2\2\u093f\u0941\7H\2\2\u0940\u0942\5Z.\2\u0941"+
		"\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0181\3\2\2\2\u0943\u0946\5\u0184"+
		"\u00c3\2\u0944\u0946\5\u0188\u00c5\2\u0945\u0943\3\2\2\2\u0945\u0944\3"+
		"\2\2\2\u0946\u0183\3\2\2\2\u0947\u0948\7H\2\2\u0948\u094a\7V\2\2\u0949"+
		"\u094b\5\u0186\u00c4\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c"+
		"\3\2\2\2\u094c\u094d\7W\2\2\u094d\u0185\3\2\2\2\u094e\u094f\b\u00c4\1"+
		"\2\u094f\u0951\5\u0106\u0084\2\u0950\u0952\7\u0086\2\2\u0951\u0950\3\2"+
		"\2\2\u0951\u0952\3\2\2\2\u0952\u095b\3\2\2\2\u0953\u0954\f\3\2\2\u0954"+
		"\u0955\7}\2\2\u0955\u0957\5\u0106\u0084\2\u0956\u0958\7\u0086\2\2\u0957"+
		"\u0956\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u095a\3\2\2\2\u0959\u0953\3\2"+
		"\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c"+
		"\u0187\3\2\2\2\u095d\u095b\3\2\2\2\u095e\u095f\7\63\2\2\u095f\u0960\7"+
		"V\2\2\u0960\u0961\5`\61\2\u0961\u0962\7W\2\2\u0962\u0965\3\2\2\2\u0963"+
		"\u0965\7\63\2\2\u0964\u095e\3\2\2\2\u0964\u0963\3\2\2\2\u0965\u0189\3"+
		"\2\2\2\u0966\u099a\7\62\2\2\u0967\u099a\7\35\2\2\u0968\u0969\7\62\2\2"+
		"\u0969\u096a\7X\2\2\u096a\u099a\7Y\2\2\u096b\u096c\7\35\2\2\u096c\u096d"+
		"\7X\2\2\u096d\u099a\7Y\2\2\u096e\u099a\7\\\2\2\u096f\u099a\7]\2\2\u0970"+
		"\u099a\7^\2\2\u0971\u099a\7_\2\2\u0972\u099a\7`\2\2\u0973\u099a\7a\2\2"+
		"\u0974\u099a\7b\2\2\u0975\u099a\7c\2\2\u0976\u099a\7d\2\2\u0977\u099a"+
		"\7\6\2\2\u0978\u099a\7\b\2\2\u0979\u099a\7f\2\2\u097a\u099a\7g\2\2\u097b"+
		"\u099a\7h\2\2\u097c\u099a\7i\2\2\u097d\u099a\7j\2\2\u097e\u099a\7k\2\2"+
		"\u097f\u099a\7l\2\2\u0980\u099a\7m\2\2\u0981\u099a\7n\2\2\u0982\u099a"+
		"\7o\2\2\u0983\u099a\7p\2\2\u0984\u099a\7q\2\2\u0985\u099a\7r\2\2\u0986"+
		"\u099a\7t\2\2\u0987\u099a\7s\2\2\u0988\u099a\7u\2\2\u0989\u099a\7v\2\2"+
		"\u098a\u099a\7w\2\2\u098b\u099a\7x\2\2\u098c\u099a\7\4\2\2\u098d\u099a"+
		"\7\7\2\2\u098e\u099a\7\3\2\2\u098f\u099a\7\5\2\2\u0990\u099a\7{\2\2\u0991"+
		"\u099a\7|\2\2\u0992\u099a\7}\2\2\u0993\u099a\7~\2\2\u0994\u099a\7\177"+
		"\2\2\u0995\u0996\7V\2\2\u0996\u099a\7W\2\2\u0997\u0998\7X\2\2\u0998\u099a"+
		"\7Y\2\2\u0999\u0966\3\2\2\2\u0999\u0967\3\2\2\2\u0999\u0968\3\2\2\2\u0999"+
		"\u096b\3\2\2\2\u0999\u096e\3\2\2\2\u0999\u096f\3\2\2\2\u0999\u0970\3\2"+
		"\2\2\u0999\u0971\3\2\2\2\u0999\u0972\3\2\2\2\u0999\u0973\3\2\2\2\u0999"+
		"\u0974\3\2\2\2\u0999\u0975\3\2\2\2\u0999\u0976\3\2\2\2\u0999\u0977\3\2";
	private static final String _serializedATNSegment1 =
		"\2\2\u0999\u0978\3\2\2\2\u0999\u0979\3\2\2\2\u0999\u097a\3\2\2\2\u0999"+
		"\u097b\3\2\2\2\u0999\u097c\3\2\2\2\u0999\u097d\3\2\2\2\u0999\u097e\3\2"+
		"\2\2\u0999\u097f\3\2\2\2\u0999\u0980\3\2\2\2\u0999\u0981\3\2\2\2\u0999"+
		"\u0982\3\2\2\2\u0999\u0983\3\2\2\2\u0999\u0984\3\2\2\2\u0999\u0985\3\2"+
		"\2\2\u0999\u0986\3\2\2\2\u0999\u0987\3\2\2\2\u0999\u0988\3\2\2\2\u0999"+
		"\u0989\3\2\2\2\u0999\u098a\3\2\2\2\u0999\u098b\3\2\2\2\u0999\u098c\3\2"+
		"\2\2\u0999\u098d\3\2\2\2\u0999\u098e\3\2\2\2\u0999\u098f\3\2\2\2\u0999"+
		"\u0990\3\2\2\2\u0999\u0991\3\2\2\2\u0999\u0992\3\2\2\2\u0999\u0993\3\2"+
		"\2\2\u0999\u0994\3\2\2\2\u0999\u0995\3\2\2\2\u0999\u0997\3\2\2\2\u099a"+
		"\u018b\3\2\2\2\u099b\u09a3\7\u0088\2\2\u099c\u09a3\7\u008e\2\2\u099d\u09a3"+
		"\7\u008f\2\2\u099e\u09a3\7\u0090\2\2\u099f\u09a3\5\u018e\u00c8\2\u09a0"+
		"\u09a3\5\u0190\u00c9\2\u09a1\u09a3\5\u0192\u00ca\2\u09a2\u099b\3\2\2\2"+
		"\u09a2\u099c\3\2\2\2\u09a2\u099d\3\2\2\2\u09a2\u099e\3\2\2\2\u09a2\u099f"+
		"\3\2\2\2\u09a2\u09a0\3\2\2\2\u09a2\u09a1\3\2\2\2\u09a3\u018d\3\2\2\2\u09a4"+
		"\u09a5\t\16\2\2\u09a5\u018f\3\2\2\2\u09a6\u09a7\7\64\2\2\u09a7\u0191\3"+
		"\2\2\2\u09a8\u09a9\t\17\2\2\u09a9\u0193\3\2\2\2\u013e\u0195\u01a1\u01a5"+
		"\u01b0\u01b4\u01c3\u01ca\u01cf\u01d1\u01d6\u01dc\u01e6\u01ed\u01f3\u01f7"+
		"\u01fc\u0202\u0209\u020f\u0212\u0215\u0218\u021f\u0226\u025a\u0269\u026f"+
		"\u0275\u0282\u0284\u028e\u029d\u02a3\u02c1\u02c6\u02ca\u02ce\u02d1\u02d5"+
		"\u02db\u02dd\u02e5\u02e9\u02ec\u02f3\u02fa\u02fe\u0303\u0307\u030a\u030f"+
		"\u0315\u0322\u032d\u032f\u033e\u0340\u034c\u034e\u035a\u036e\u0370\u037c"+
		"\u037e\u0389\u0394\u039f\u03ab\u03ad\u03b9\u03bb\u03c5\u03cd\u03d9\u03e0"+
		"\u03e4\u03e8\u03ec\u03f0\u03f5\u03f8\u03fb\u0401\u0409\u040e\u0411\u0417"+
		"\u0422\u0438\u043f\u0447\u044d\u0461\u0465\u0472\u0476\u0479\u0480\u0488"+
		"\u0492\u049d\u04a9\u04b3\u04b8\u04bf\u04c2\u04c7\u04cc\u04e1\u04e5\u04ea"+
		"\u04f5\u04fb\u04ff\u0504\u0508\u050d\u0510\u0526\u052c\u0537\u053b\u053e"+
		"\u0548\u054e\u0551\u0558\u0562\u0566\u0569\u056c\u0570\u0575\u0577\u057b"+
		"\u057f\u0588\u0595\u059d\u05a3\u05a9\u05ad\u05b0\u05b9\u05c2\u05ca\u05d5"+
		"\u05db\u05e6\u05e9\u05ee\u05fd\u0603\u060c\u0616\u061c\u0624\u0628\u062c"+
		"\u0631\u0636\u063d\u063f\u0644\u0648\u0656\u065c\u066e\u0670\u067a\u067f"+
		"\u0686\u068c\u0691\u0697\u069e\u06a2\u06a4\u06a6\u06ad\u06b0\u06b3\u06b6"+
		"\u06bb\u06bf\u06c2\u06c6\u06ca\u06cf\u06d2\u06d4\u06d8\u06df\u06e5\u06e9"+
		"\u06ef\u06f4\u06f6\u06fc\u0700\u0706\u070d\u0711\u0713\u0715\u071c\u0726"+
		"\u072a\u072c\u072e\u0732\u0735\u073b\u0745\u0749\u074f\u0757\u075b\u075e"+
		"\u0762\u0767\u076a\u076d\u0771\u0776\u0780\u0787\u078c\u0790\u0795\u079b"+
		"\u079f\u07a5\u07ab\u07af\u07b4\u07ba\u07be\u07c1\u07c5\u07c8\u07ca\u07cd"+
		"\u07d7\u07dc\u07de\u07e1\u07e4\u07e7\u07f0\u07fa\u07ff\u0802\u0806\u0809"+
		"\u080c\u0810\u0819\u0828\u082e\u0832\u0836\u083a\u083e\u0842\u0846\u084a"+
		"\u084d\u0851\u085c\u0860\u0867\u086b\u0870\u0875\u087c\u0880\u088a\u089a"+
		"\u089f\u08a3\u08a6\u08aa\u08b0\u08b3\u08b7\u08c1\u08c4\u08cc\u08d1\u08d6"+
		"\u08de\u08e5\u08e9\u08f0\u08f6\u08fa\u0900\u0909\u090d\u0910\u0920\u0927"+
		"\u0930\u0936\u093a\u093d\u0941\u0945\u094a\u0951\u0957\u095b\u0964\u0999"+
		"\u09a2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}