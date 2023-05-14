// Generated from C:/Users/Lenovo/code/lp/anaSemantico/src/grammar\MyLanguage.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, TKN_EQUALS=3, TKN_COLON=4, TKN_LEFT_PAREN=5, TKN_RIGHT_PAREN=6, 
		TKN_LEFT_BRAC=7, TKN_RIGHT_BRAC=8, OR=9, AND=10, TKN_GEQ=11, TKN_LEQ=12, 
		TKN_DIFF=13, TKN_GREATER=14, TKN_LESS=15, TKN_PLUS=16, TKN_MINUS=17, TKN_TIMES=18, 
		TKN_DIV=19, TRUE=20, FALSE=21, TKN_PERIOD=22, TKN_COMMA=23, TEXTWINDOW=24, 
		ARRAY=25, STACK=26, PROGRAM=27, IF=28, THEN=29, ENDIF=30, ELSEIF=31, ELSE=32, 
		WHILE=33, ENDWHILE=34, FOR=35, TO=36, ENDFOR=37, STEP=38, SUB=39, ENDSUB=40, 
		GOTO=41, TKN_NUMBER=42, TKN_TEXT=43, ID=44;
	public static final int
		RULE_inicio = 0, RULE_comando = 1, RULE_declarar = 2, RULE_tipo = 3, RULE_matriz = 4, 
		RULE_identificador = 5, RULE_logico1 = 6, RULE_logico1p = 7, RULE_logico2 = 8, 
		RULE_logico2p = 9, RULE_logico3 = 10, RULE_logico3p = 11, RULE_operrel = 12, 
		RULE_aritmetica1 = 13, RULE_aritmetica1p = 14, RULE_opsuma = 15, RULE_aritmetica2 = 16, 
		RULE_aritmetica2p = 17, RULE_opmultiplicar = 18, RULE_aritmetica3 = 19, 
		RULE_aritmetica4 = 20, RULE_valor = 21, RULE_integrada = 22, RULE_palabrasfuncionales = 23, 
		RULE_parametros = 24, RULE_parametrosp = 25, RULE_comandos = 26, RULE_si = 27, 
		RULE_sinosis = 28, RULE_sino = 29, RULE_mientras = 30, RULE_para = 31, 
		RULE_paso = 32, RULE_funcion = 33, RULE_ir = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "comando", "declarar", "tipo", "matriz", "identificador", "logico1", 
			"logico1p", "logico2", "logico2p", "logico3", "logico3p", "operrel", 
			"aritmetica1", "aritmetica1p", "opsuma", "aritmetica2", "aritmetica2p", 
			"opmultiplicar", "aritmetica3", "aritmetica4", "valor", "integrada", 
			"palabrasfuncionales", "parametros", "parametrosp", "comandos", "si", 
			"sinosis", "sino", "mientras", "para", "paso", "funcion", "ir"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", "':'", "'('", "')'", "'['", "']'", "'Or'", "'And'", 
			"'>='", "'<='", "'<>'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", null, 
			null, "'.'", "','", "'TextWindow'", "'Array'", "'Stack'", "'Program'", 
			"'If'", "'Then'", "'EndIf'", "'ElseIf'", "'Else'", "'While'", "'EndWhile'", 
			"'For'", "'To'", "'EndFor'", "'Step'", "'Sub'", "'EndSub'", "'Goto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WS", "TKN_EQUALS", "TKN_COLON", "TKN_LEFT_PAREN", "TKN_RIGHT_PAREN", 
			"TKN_LEFT_BRAC", "TKN_RIGHT_BRAC", "OR", "AND", "TKN_GEQ", "TKN_LEQ", 
			"TKN_DIFF", "TKN_GREATER", "TKN_LESS", "TKN_PLUS", "TKN_MINUS", "TKN_TIMES", 
			"TKN_DIV", "TRUE", "FALSE", "TKN_PERIOD", "TKN_COMMA", "TEXTWINDOW", 
			"ARRAY", "STACK", "PROGRAM", "IF", "THEN", "ENDIF", "ELSEIF", "ELSE", 
			"WHILE", "ENDWHILE", "FOR", "TO", "ENDFOR", "STEP", "SUB", "ENDSUB", 
			"GOTO", "TKN_NUMBER", "TKN_TEXT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					comando();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19834679066624L) != 0) );
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB) {
					{
					{
					setState(75);
					funcion();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					funcion();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SUB );
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19834679066624L) != 0)) {
					{
					{
					setState(86);
					comando();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public IntegradaContext integrada() {
			return getRuleContext(IntegradaContext.class,0);
		}
		public IrContext ir() {
			return getRuleContext(IrContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				declarar();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				si();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				mientras();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				para();
				}
				break;
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				integrada();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				ir();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TKN_EQUALS() { return getToken(MyLanguageParser.TKN_EQUALS, 0); }
		public Aritmetica1Context aritmetica1() {
			return getRuleContext(Aritmetica1Context.class,0);
		}
		public List<MatrizContext> matriz() {
			return getRuleContexts(MatrizContext.class);
		}
		public MatrizContext matriz(int i) {
			return getRuleContext(MatrizContext.class,i);
		}
		public TerminalNode TKN_COLON() { return getToken(MyLanguageParser.TKN_COLON, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_EQUALS:
			case TKN_LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TKN_LEFT_BRAC) {
					{
					{
					setState(106);
					matriz();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(TKN_EQUALS);
				setState(113);
				aritmetica1();
				}
				break;
			case TKN_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(TKN_COLON);
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(TKN_LEFT_PAREN);
				setState(116);
				match(TKN_RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrizContext extends ParserRuleContext {
		public TerminalNode TKN_LEFT_BRAC() { return getToken(MyLanguageParser.TKN_LEFT_BRAC, 0); }
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public TerminalNode TKN_RIGHT_BRAC() { return getToken(MyLanguageParser.TKN_RIGHT_BRAC, 0); }
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(TKN_LEFT_BRAC);
			setState(120);
			logico1();
			setState(121);
			match(TKN_RIGHT_BRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public List<MatrizContext> matriz() {
			return getRuleContexts(MatrizContext.class);
		}
		public MatrizContext matriz(int i) {
			return getRuleContext(MatrizContext.class,i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_LEFT_BRAC) {
				{
				{
				setState(124);
				matriz();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico1Context extends ParserRuleContext {
		public Logico2Context logico2() {
			return getRuleContext(Logico2Context.class,0);
		}
		public Logico1pContext logico1p() {
			return getRuleContext(Logico1pContext.class,0);
		}
		public Logico1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico1Context logico1() throws RecognitionException {
		Logico1Context _localctx = new Logico1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_logico1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			logico2();
			setState(131);
			logico1p();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico1pContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MyLanguageParser.OR, 0); }
		public Logico2Context logico2() {
			return getRuleContext(Logico2Context.class,0);
		}
		public Logico1pContext logico1p() {
			return getRuleContext(Logico1pContext.class,0);
		}
		public Logico1pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico1p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico1p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico1p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico1p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico1pContext logico1p() throws RecognitionException {
		Logico1pContext _localctx = new Logico1pContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logico1p);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(OR);
				setState(134);
				logico2();
				setState(135);
				logico1p();
				}
				break;
			case TKN_RIGHT_PAREN:
			case TKN_RIGHT_BRAC:
			case TKN_COMMA:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case TO:
			case ENDFOR:
			case STEP:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico2Context extends ParserRuleContext {
		public Logico3Context logico3() {
			return getRuleContext(Logico3Context.class,0);
		}
		public Logico2pContext logico2p() {
			return getRuleContext(Logico2pContext.class,0);
		}
		public Logico2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico2Context logico2() throws RecognitionException {
		Logico2Context _localctx = new Logico2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_logico2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			logico3();
			setState(141);
			logico2p();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico2pContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MyLanguageParser.AND, 0); }
		public Logico3Context logico3() {
			return getRuleContext(Logico3Context.class,0);
		}
		public Logico2pContext logico2p() {
			return getRuleContext(Logico2pContext.class,0);
		}
		public Logico2pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico2p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico2p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico2p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico2p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico2pContext logico2p() throws RecognitionException {
		Logico2pContext _localctx = new Logico2pContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logico2p);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(AND);
				setState(144);
				logico3();
				setState(145);
				logico2p();
				}
				break;
			case TKN_RIGHT_PAREN:
			case TKN_RIGHT_BRAC:
			case OR:
			case TKN_COMMA:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case TO:
			case ENDFOR:
			case STEP:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico3Context extends ParserRuleContext {
		public Aritmetica1Context aritmetica1() {
			return getRuleContext(Aritmetica1Context.class,0);
		}
		public Logico3pContext logico3p() {
			return getRuleContext(Logico3pContext.class,0);
		}
		public Logico3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico3Context logico3() throws RecognitionException {
		Logico3Context _localctx = new Logico3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_logico3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			aritmetica1();
			setState(151);
			logico3p();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logico3pContext extends ParserRuleContext {
		public OperrelContext operrel() {
			return getRuleContext(OperrelContext.class,0);
		}
		public Aritmetica1Context aritmetica1() {
			return getRuleContext(Aritmetica1Context.class,0);
		}
		public Logico3pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico3p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogico3p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogico3p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogico3p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico3pContext logico3p() throws RecognitionException {
		Logico3pContext _localctx = new Logico3pContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logico3p);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_EQUALS:
			case TKN_GEQ:
			case TKN_LEQ:
			case TKN_DIFF:
			case TKN_GREATER:
			case TKN_LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				operrel();
				setState(154);
				aritmetica1();
				}
				break;
			case TKN_RIGHT_PAREN:
			case TKN_RIGHT_BRAC:
			case OR:
			case AND:
			case TKN_COMMA:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case TO:
			case ENDFOR:
			case STEP:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperrelContext extends ParserRuleContext {
		public TerminalNode TKN_EQUALS() { return getToken(MyLanguageParser.TKN_EQUALS, 0); }
		public TerminalNode TKN_DIFF() { return getToken(MyLanguageParser.TKN_DIFF, 0); }
		public TerminalNode TKN_GREATER() { return getToken(MyLanguageParser.TKN_GREATER, 0); }
		public TerminalNode TKN_LESS() { return getToken(MyLanguageParser.TKN_LESS, 0); }
		public TerminalNode TKN_GEQ() { return getToken(MyLanguageParser.TKN_GEQ, 0); }
		public TerminalNode TKN_LEQ() { return getToken(MyLanguageParser.TKN_LEQ, 0); }
		public OperrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operrel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterOperrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitOperrel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitOperrel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperrelContext operrel() throws RecognitionException {
		OperrelContext _localctx = new OperrelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63496L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica1Context extends ParserRuleContext {
		public Aritmetica2Context aritmetica2() {
			return getRuleContext(Aritmetica2Context.class,0);
		}
		public Aritmetica1pContext aritmetica1p() {
			return getRuleContext(Aritmetica1pContext.class,0);
		}
		public Aritmetica1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica1Context aritmetica1() throws RecognitionException {
		Aritmetica1Context _localctx = new Aritmetica1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_aritmetica1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			aritmetica2();
			setState(162);
			aritmetica1p();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica1pContext extends ParserRuleContext {
		public OpsumaContext opsuma() {
			return getRuleContext(OpsumaContext.class,0);
		}
		public Aritmetica2Context aritmetica2() {
			return getRuleContext(Aritmetica2Context.class,0);
		}
		public Aritmetica1pContext aritmetica1p() {
			return getRuleContext(Aritmetica1pContext.class,0);
		}
		public Aritmetica1pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica1p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica1p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica1p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica1p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica1pContext aritmetica1p() throws RecognitionException {
		Aritmetica1pContext _localctx = new Aritmetica1pContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aritmetica1p);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_PLUS:
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				opsuma();
				setState(165);
				aritmetica2();
				setState(166);
				aritmetica1p();
				}
				break;
			case EOF:
			case TKN_EQUALS:
			case TKN_RIGHT_PAREN:
			case TKN_RIGHT_BRAC:
			case OR:
			case AND:
			case TKN_GEQ:
			case TKN_LEQ:
			case TKN_DIFF:
			case TKN_GREATER:
			case TKN_LESS:
			case TKN_COMMA:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case ENDIF:
			case ELSEIF:
			case ELSE:
			case WHILE:
			case ENDWHILE:
			case FOR:
			case TO:
			case ENDFOR:
			case STEP:
			case SUB:
			case ENDSUB:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpsumaContext extends ParserRuleContext {
		public TerminalNode TKN_PLUS() { return getToken(MyLanguageParser.TKN_PLUS, 0); }
		public TerminalNode TKN_MINUS() { return getToken(MyLanguageParser.TKN_MINUS, 0); }
		public OpsumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opsuma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterOpsuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitOpsuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitOpsuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsumaContext opsuma() throws RecognitionException {
		OpsumaContext _localctx = new OpsumaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opsuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==TKN_PLUS || _la==TKN_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica2Context extends ParserRuleContext {
		public Aritmetica3Context aritmetica3() {
			return getRuleContext(Aritmetica3Context.class,0);
		}
		public Aritmetica2pContext aritmetica2p() {
			return getRuleContext(Aritmetica2pContext.class,0);
		}
		public Aritmetica2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica2Context aritmetica2() throws RecognitionException {
		Aritmetica2Context _localctx = new Aritmetica2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_aritmetica2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			aritmetica3();
			setState(174);
			aritmetica2p();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica2pContext extends ParserRuleContext {
		public OpmultiplicarContext opmultiplicar() {
			return getRuleContext(OpmultiplicarContext.class,0);
		}
		public Aritmetica3Context aritmetica3() {
			return getRuleContext(Aritmetica3Context.class,0);
		}
		public Aritmetica2pContext aritmetica2p() {
			return getRuleContext(Aritmetica2pContext.class,0);
		}
		public Aritmetica2pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica2p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica2p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica2p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica2p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica2pContext aritmetica2p() throws RecognitionException {
		Aritmetica2pContext _localctx = new Aritmetica2pContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aritmetica2p);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_TIMES:
			case TKN_DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				opmultiplicar();
				setState(177);
				aritmetica3();
				setState(178);
				aritmetica2p();
				}
				break;
			case EOF:
			case TKN_EQUALS:
			case TKN_RIGHT_PAREN:
			case TKN_RIGHT_BRAC:
			case OR:
			case AND:
			case TKN_GEQ:
			case TKN_LEQ:
			case TKN_DIFF:
			case TKN_GREATER:
			case TKN_LESS:
			case TKN_PLUS:
			case TKN_MINUS:
			case TKN_COMMA:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case ENDIF:
			case ELSEIF:
			case ELSE:
			case WHILE:
			case ENDWHILE:
			case FOR:
			case TO:
			case ENDFOR:
			case STEP:
			case SUB:
			case ENDSUB:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpmultiplicarContext extends ParserRuleContext {
		public TerminalNode TKN_TIMES() { return getToken(MyLanguageParser.TKN_TIMES, 0); }
		public TerminalNode TKN_DIV() { return getToken(MyLanguageParser.TKN_DIV, 0); }
		public OpmultiplicarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opmultiplicar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterOpmultiplicar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitOpmultiplicar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitOpmultiplicar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpmultiplicarContext opmultiplicar() throws RecognitionException {
		OpmultiplicarContext _localctx = new OpmultiplicarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opmultiplicar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==TKN_TIMES || _la==TKN_DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica3Context extends ParserRuleContext {
		public TerminalNode TKN_MINUS() { return getToken(MyLanguageParser.TKN_MINUS, 0); }
		public Aritmetica4Context aritmetica4() {
			return getRuleContext(Aritmetica4Context.class,0);
		}
		public Aritmetica3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica3Context aritmetica3() throws RecognitionException {
		Aritmetica3Context _localctx = new Aritmetica3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_aritmetica3);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(TKN_MINUS);
				setState(186);
				aritmetica4();
				}
				break;
			case TKN_LEFT_PAREN:
			case TRUE:
			case FALSE:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case TKN_NUMBER:
			case TKN_TEXT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				aritmetica4();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetica4Context extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public IntegradaContext integrada() {
			return getRuleContext(IntegradaContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public Aritmetica4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAritmetica4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAritmetica4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAritmetica4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aritmetica4Context aritmetica4() throws RecognitionException {
		Aritmetica4Context _localctx = new Aritmetica4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_aritmetica4);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case TKN_NUMBER:
			case TKN_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				valor();
				}
				break;
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				integrada();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				identificador();
				}
				break;
			case TKN_LEFT_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(TKN_LEFT_PAREN);
				setState(194);
				logico1();
				setState(195);
				match(TKN_RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MyLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyLanguageParser.FALSE, 0); }
		public TerminalNode TKN_NUMBER() { return getToken(MyLanguageParser.TKN_NUMBER, 0); }
		public TerminalNode TKN_TEXT() { return getToken(MyLanguageParser.TKN_TEXT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194142679040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegradaContext extends ParserRuleContext {
		public PalabrasfuncionalesContext palabrasfuncionales() {
			return getRuleContext(PalabrasfuncionalesContext.class,0);
		}
		public TerminalNode TKN_PERIOD() { return getToken(MyLanguageParser.TKN_PERIOD, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public IntegradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIntegrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIntegrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIntegrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegradaContext integrada() throws RecognitionException {
		IntegradaContext _localctx = new IntegradaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_integrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			palabrasfuncionales();
			setState(202);
			match(TKN_PERIOD);
			setState(203);
			match(ID);
			setState(204);
			match(TKN_LEFT_PAREN);
			setState(205);
			parametros();
			setState(206);
			match(TKN_RIGHT_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PalabrasfuncionalesContext extends ParserRuleContext {
		public TerminalNode TEXTWINDOW() { return getToken(MyLanguageParser.TEXTWINDOW, 0); }
		public TerminalNode ARRAY() { return getToken(MyLanguageParser.ARRAY, 0); }
		public TerminalNode STACK() { return getToken(MyLanguageParser.STACK, 0); }
		public TerminalNode PROGRAM() { return getToken(MyLanguageParser.PROGRAM, 0); }
		public PalabrasfuncionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabrasfuncionales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPalabrasfuncionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPalabrasfuncionales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPalabrasfuncionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalabrasfuncionalesContext palabrasfuncionales() throws RecognitionException {
		PalabrasfuncionalesContext _localctx = new PalabrasfuncionalesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_palabrasfuncionales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public ParametrospContext parametrosp() {
			return getRuleContext(ParametrospContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametros);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_LEFT_PAREN:
			case TKN_MINUS:
			case TRUE:
			case FALSE:
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case TKN_NUMBER:
			case TKN_TEXT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				logico1();
				setState(211);
				parametrosp();
				}
				break;
			case TKN_RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrospContext extends ParserRuleContext {
		public TerminalNode TKN_COMMA() { return getToken(MyLanguageParser.TKN_COMMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrospContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterParametrosp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitParametrosp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitParametrosp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrospContext parametrosp() throws RecognitionException {
		ParametrospContext _localctx = new ParametrospContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametrosp);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(TKN_COMMA);
				setState(217);
				parametros();
				}
				break;
			case TKN_RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comandos);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				comando();
				setState(222);
				comandos();
				}
				break;
			case ENDIF:
			case ELSEIF:
			case ELSE:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyLanguageParser.IF, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public TerminalNode THEN() { return getToken(MyLanguageParser.THEN, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SinosisContext sinosis() {
			return getRuleContext(SinosisContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(MyLanguageParser.ENDIF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IF);
			setState(228);
			match(TKN_LEFT_PAREN);
			setState(229);
			logico1();
			setState(230);
			match(TKN_RIGHT_PAREN);
			setState(231);
			match(THEN);
			setState(232);
			comandos();
			setState(233);
			sinosis();
			setState(234);
			sino();
			setState(235);
			match(ENDIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SinosisContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(MyLanguageParser.ELSEIF, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public TerminalNode THEN() { return getToken(MyLanguageParser.THEN, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SinosisContext sinosis() {
			return getRuleContext(SinosisContext.class,0);
		}
		public SinosisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinosis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSinosis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSinosis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSinosis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinosisContext sinosis() throws RecognitionException {
		SinosisContext _localctx = new SinosisContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sinosis);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSEIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ELSEIF);
				setState(238);
				match(TKN_LEFT_PAREN);
				setState(239);
				logico1();
				setState(240);
				match(TKN_RIGHT_PAREN);
				setState(241);
				match(THEN);
				setState(242);
				comandos();
				setState(243);
				sinosis();
				}
				break;
			case ENDIF:
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SinoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MyLanguageParser.ELSE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sino);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ELSE);
				setState(249);
				comandos();
				}
				break;
			case ENDIF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyLanguageParser.WHILE, 0); }
		public TerminalNode TKN_LEFT_PAREN() { return getToken(MyLanguageParser.TKN_LEFT_PAREN, 0); }
		public Logico1Context logico1() {
			return getRuleContext(Logico1Context.class,0);
		}
		public TerminalNode TKN_RIGHT_PAREN() { return getToken(MyLanguageParser.TKN_RIGHT_PAREN, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(MyLanguageParser.ENDWHILE, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			match(TKN_LEFT_PAREN);
			setState(255);
			logico1();
			setState(256);
			match(TKN_RIGHT_PAREN);
			setState(257);
			comandos();
			setState(258);
			match(ENDWHILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyLanguageParser.FOR, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_EQUALS() { return getToken(MyLanguageParser.TKN_EQUALS, 0); }
		public List<Logico1Context> logico1() {
			return getRuleContexts(Logico1Context.class);
		}
		public Logico1Context logico1(int i) {
			return getRuleContext(Logico1Context.class,i);
		}
		public TerminalNode TO() { return getToken(MyLanguageParser.TO, 0); }
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(MyLanguageParser.ENDFOR, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FOR);
			setState(261);
			identificador();
			setState(262);
			match(TKN_EQUALS);
			setState(263);
			logico1();
			setState(264);
			match(TO);
			setState(265);
			logico1();
			setState(266);
			paso();
			setState(267);
			comandos();
			setState(268);
			match(ENDFOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PasoContext extends ParserRuleContext {
		public TerminalNode STEP() { return getToken(MyLanguageParser.STEP, 0); }
		public Aritmetica1Context aritmetica1() {
			return getRuleContext(Aritmetica1Context.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_paso);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(STEP);
				setState(271);
				aritmetica1();
				}
				break;
			case TEXTWINDOW:
			case ARRAY:
			case STACK:
			case PROGRAM:
			case IF:
			case WHILE:
			case FOR:
			case ENDFOR:
			case GOTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(MyLanguageParser.SUB, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode ENDSUB() { return getToken(MyLanguageParser.ENDSUB, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(SUB);
			setState(276);
			match(ID);
			setState(277);
			comandos();
			setState(278);
			match(ENDSUB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IrContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(MyLanguageParser.GOTO, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public IrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IrContext ir() throws RecognitionException {
		IrContext _localctx = new IrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(GOTO);
			setState(281);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001,\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0001\u0000\u0005\u0000"+
		"M\b\u0000\n\u0000\f\u0000P\t\u0000\u0001\u0000\u0004\u0000S\b\u0000\u000b"+
		"\u0000\f\u0000T\u0001\u0000\u0005\u0000X\b\u0000\n\u0000\f\u0000[\t\u0000"+
		"\u0001\u0000\u0003\u0000^\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001f\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003"+
		"o\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003v\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005~\b\u0005\n\u0005\f\u0005\u0081\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009e\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00aa\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b6\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00bd\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00c6\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00d7\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00dc\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00e2\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00f7\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u00fc\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u0112"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0005\u0002\u0000\u0003"+
		"\u0003\u000b\u000f\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013\u0002"+
		"\u0000\u0014\u0015*+\u0001\u0000\u0018\u001b\u0116\u0000]\u0001\u0000"+
		"\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004g\u0001\u0000\u0000\u0000"+
		"\u0006u\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n{\u0001\u0000"+
		"\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000"+
		"\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000"+
		"\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000"+
		"\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00a1\u0001\u0000\u0000"+
		"\u0000\u001c\u00a9\u0001\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000"+
		"\u0000 \u00ad\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000"+
		"$\u00b7\u0001\u0000\u0000\u0000&\u00bc\u0001\u0000\u0000\u0000(\u00c5"+
		"\u0001\u0000\u0000\u0000*\u00c7\u0001\u0000\u0000\u0000,\u00c9\u0001\u0000"+
		"\u0000\u0000.\u00d0\u0001\u0000\u0000\u00000\u00d6\u0001\u0000\u0000\u0000"+
		"2\u00db\u0001\u0000\u0000\u00004\u00e1\u0001\u0000\u0000\u00006\u00e3"+
		"\u0001\u0000\u0000\u00008\u00f6\u0001\u0000\u0000\u0000:\u00fb\u0001\u0000"+
		"\u0000\u0000<\u00fd\u0001\u0000\u0000\u0000>\u0104\u0001\u0000\u0000\u0000"+
		"@\u0111\u0001\u0000\u0000\u0000B\u0113\u0001\u0000\u0000\u0000D\u0118"+
		"\u0001\u0000\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JN\u0001\u0000\u0000\u0000KM\u0003B!\u0000LK\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000O^\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0003"+
		"B!\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z^\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]G\u0001\u0000"+
		"\u0000\u0000]R\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0001"+
		"\u0001\u0000\u0000\u0000_f\u0003\u0004\u0002\u0000`f\u00036\u001b\u0000"+
		"af\u0003<\u001e\u0000bf\u0003>\u001f\u0000cf\u0003,\u0016\u0000df\u0003"+
		"D\"\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000ea\u0001"+
		"\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0003\u0001\u0000\u0000\u0000gh\u0005,\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000i\u0005\u0001\u0000\u0000\u0000jl\u0003"+
		"\b\u0004\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000qv\u0003\u001a\r\u0000"+
		"rv\u0005\u0004\u0000\u0000st\u0005\u0005\u0000\u0000tv\u0005\u0006\u0000"+
		"\u0000um\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000v\u0007\u0001\u0000\u0000\u0000wx\u0005\u0007\u0000\u0000"+
		"xy\u0003\f\u0006\u0000yz\u0005\b\u0000\u0000z\t\u0001\u0000\u0000\u0000"+
		"{\u007f\u0005,\u0000\u0000|~\u0003\b\u0004\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u000b\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083\u0084\u0003"+
		"\u000e\u0007\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086\u0005\t"+
		"\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u0088\u0003\u000e\u0007"+
		"\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000"+
		"\u008d\u008e\u0003\u0012\t\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\n\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092"+
		"\u0003\u0012\t\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0003"+
		"\u001a\r\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u0015\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003\u0018\f\u0000\u009a\u009b\u0003\u001a\r"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000"+
		"\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0000\u0000"+
		"\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003 \u0010\u0000"+
		"\u00a2\u00a3\u0003\u001c\u000e\u0000\u00a3\u001b\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0003\u001e\u000f\u0000\u00a5\u00a6\u0003 \u0010\u0000\u00a6"+
		"\u00a7\u0003\u001c\u000e\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0007\u0001\u0000\u0000\u00ac\u001f\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003&\u0013\u0000\u00ae\u00af\u0003\"\u0011\u0000\u00af!\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0003&\u0013"+
		"\u0000\u00b2\u00b3\u0003\"\u0011\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0007\u0002\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0011\u0000\u0000\u00ba\u00bd\u0003(\u0014\u0000\u00bb\u00bd\u0003"+
		"(\u0014\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\'\u0001\u0000\u0000\u0000\u00be\u00c6\u0003*\u0015"+
		"\u0000\u00bf\u00c6\u0003,\u0016\u0000\u00c0\u00c6\u0003\n\u0005\u0000"+
		"\u00c1\u00c2\u0005\u0005\u0000\u0000\u00c2\u00c3\u0003\f\u0006\u0000\u00c3"+
		"\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00be\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		")\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\u0003\u0000\u0000\u00c8+\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0003.\u0017\u0000\u00ca\u00cb\u0005\u0016"+
		"\u0000\u0000\u00cb\u00cc\u0005,\u0000\u0000\u00cc\u00cd\u0005\u0005\u0000"+
		"\u0000\u00cd\u00ce\u00030\u0018\u0000\u00ce\u00cf\u0005\u0006\u0000\u0000"+
		"\u00cf-\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007\u0004\u0000\u0000\u00d1"+
		"/\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\f\u0006\u0000\u00d3\u00d4"+
		"\u00032\u0019\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d71\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0017"+
		"\u0000\u0000\u00d9\u00dc\u00030\u0018\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc3\u0001\u0000\u0000\u0000\u00dd\u00de\u0003\u0002\u0001\u0000"+
		"\u00de\u00df\u00034\u001a\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e25\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u001c\u0000\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e6"+
		"\u0003\f\u0006\u0000\u00e6\u00e7\u0005\u0006\u0000\u0000\u00e7\u00e8\u0005"+
		"\u001d\u0000\u0000\u00e8\u00e9\u00034\u001a\u0000\u00e9\u00ea\u00038\u001c"+
		"\u0000\u00ea\u00eb\u0003:\u001d\u0000\u00eb\u00ec\u0005\u001e\u0000\u0000"+
		"\u00ec7\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u001f\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f0\u0003\f\u0006\u0000\u00f0\u00f1"+
		"\u0005\u0006\u0000\u0000\u00f1\u00f2\u0005\u001d\u0000\u0000\u00f2\u00f3"+
		"\u00034\u001a\u0000\u00f3\u00f4\u00038\u001c\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f79\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005 \u0000\u0000\u00f9\u00fc\u00034\u001a\u0000\u00fa"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc;\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005!\u0000\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff\u0100\u0003"+
		"\f\u0006\u0000\u0100\u0101\u0005\u0006\u0000\u0000\u0101\u0102\u00034"+
		"\u001a\u0000\u0102\u0103\u0005\"\u0000\u0000\u0103=\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005#\u0000\u0000\u0105\u0106\u0003\n\u0005\u0000"+
		"\u0106\u0107\u0005\u0003\u0000\u0000\u0107\u0108\u0003\f\u0006\u0000\u0108"+
		"\u0109\u0005$\u0000\u0000\u0109\u010a\u0003\f\u0006\u0000\u010a\u010b"+
		"\u0003@ \u0000\u010b\u010c\u00034\u001a\u0000\u010c\u010d\u0005%\u0000"+
		"\u0000\u010d?\u0001\u0000\u0000\u0000\u010e\u010f\u0005&\u0000\u0000\u010f"+
		"\u0112\u0003\u001a\r\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010e"+
		"\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112A\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\'\u0000\u0000\u0114\u0115\u0005,"+
		"\u0000\u0000\u0115\u0116\u00034\u001a\u0000\u0116\u0117\u0005(\u0000\u0000"+
		"\u0117C\u0001\u0000\u0000\u0000\u0118\u0119\u0005)\u0000\u0000\u0119\u011a"+
		"\u0005,\u0000\u0000\u011aE\u0001\u0000\u0000\u0000\u0016INTY]emu\u007f"+
		"\u008a\u0094\u009d\u00a9\u00b5\u00bc\u00c5\u00d6\u00db\u00e1\u00f6\u00fb"+
		"\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}