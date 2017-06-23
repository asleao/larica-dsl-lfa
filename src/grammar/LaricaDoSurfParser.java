// Generated from /home/asleao/Google_Drive/IFES/LFA/2017-1/Trabalho Final LFA/LaricaDoSurf.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaricaDoSurfParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TipoInteger=1, TipoString=2, TipoFloat=3, TipoBoolean=4, INT=5, FLOAT=6, 
		BOOLEAN=7, ATRIBUICAO=8, IGUAL=9, MENORIGUAL=10, MAIORIGUAL=11, DIFERENTE=12, 
		MAIOR=13, MENOR=14, TERMINAL=15, LPAR=16, RPAR=17, LCOL=18, RCOL=19, SOMA=20, 
		SUB=21, DIV=22, MULT=23, ASP=24, IF=25, ELSE=26, WHILE=27, PRINT=28, VARIAVEL=29, 
		STRING=30, DEF_FUNCAO=31, NOME_FUNCAO=32, VIRGULA=33, WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'Integer'", "'String'", "'Float'", "'Boolean'", "INT", "FLOAT", 
		"BOOLEAN", "'larica'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "';'", 
		"'('", "')'", "'['", "']'", "'+'", "'-'", "'\\'", "'*'", "'\"'", "'dropa'", 
		"'vaca'", "'caldo'", "'aloha'", "VARIAVEL", "STRING", "DEF_FUNCAO", "NOME_FUNCAO", 
		"','", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_definicao = 1, RULE_expressao = 2, RULE_definicao_funcao = 3, 
		RULE_chamada_funcao = 4, RULE_corpo = 5, RULE_parametros_formal = 6, RULE_parametros_real = 7, 
		RULE_funcao_print = 8, RULE_expressao_condicional = 9, RULE_estrutura_repeticao = 10, 
		RULE_id = 11, RULE_condicao = 12, RULE_operadorcomparacao = 13, RULE_operador = 14, 
		RULE_tipagem = 15, RULE_valor = 16;
	public static final String[] ruleNames = {
		"prog", "definicao", "expressao", "definicao_funcao", "chamada_funcao", 
		"corpo", "parametros_formal", "parametros_real", "funcao_print", "expressao_condicional", 
		"estrutura_repeticao", "id", "condicao", "operadorcomparacao", "operador", 
		"tipagem", "valor"
	};

	@Override
	public String getGrammarFileName() { return "LaricaDoSurf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaricaDoSurfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); definicao();
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

	public static class DefinicaoContext extends ParserRuleContext {
		public List<TerminalNode> ATRIBUICAO() { return getTokens(LaricaDoSurfParser.ATRIBUICAO); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TipagemContext> tipagem() {
			return getRuleContexts(TipagemContext.class);
		}
		public TipagemContext tipagem(int i) {
			return getRuleContext(TipagemContext.class,i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(LaricaDoSurfParser.VARIAVEL); }
		public List<TerminalNode> TERMINAL() { return getTokens(LaricaDoSurfParser.TERMINAL); }
		public TerminalNode ATRIBUICAO(int i) {
			return getToken(LaricaDoSurfParser.ATRIBUICAO, i);
		}
		public TerminalNode VARIAVEL(int i) {
			return getToken(LaricaDoSurfParser.VARIAVEL, i);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode TERMINAL(int i) {
			return getToken(LaricaDoSurfParser.TERMINAL, i);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterDefinicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitDefinicao(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); tipagem();
				setState(37); match(VARIAVEL);
				setState(40);
				_la = _input.LA(1);
				if (_la==ATRIBUICAO) {
					{
					setState(38); match(ATRIBUICAO);
					setState(39); id();
					}
				}

				setState(42); match(TERMINAL);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0) );
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0)) {
				{
				{
				setState(48); expressao();
				}
				}
				setState(53);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public Estrutura_repeticaoContext estrutura_repeticao() {
			return getRuleContext(Estrutura_repeticaoContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LaricaDoSurfParser.ATRIBUICAO, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Funcao_printContext funcao_print() {
			return getRuleContext(Funcao_printContext.class,0);
		}
		public Definicao_funcaoContext definicao_funcao() {
			return getRuleContext(Definicao_funcaoContext.class,0);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public Expressao_condicionalContext expressao_condicional() {
			return getRuleContext(Expressao_condicionalContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressao);
		int _la;
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); id();
				setState(55); operador();
				setState(56); id();
				setState(64);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0)) {
					{
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(57); operador();
						setState(58); id();
						}
						}
						setState(62); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
					}
				}

				setState(66); match(TERMINAL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); match(VARIAVEL);
				setState(69); match(ATRIBUICAO);
				setState(70); id();
				setState(78);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0)) {
					{
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(71); operador();
						setState(72); id();
						}
						}
						setState(76); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
					}
				}

				setState(80); match(TERMINAL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); expressao_condicional();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); funcao_print();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); estrutura_repeticao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85); definicao_funcao();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86); chamada_funcao();
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

	public static class Definicao_funcaoContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode RCOL() { return getToken(LaricaDoSurfParser.RCOL, 0); }
		public TerminalNode DEF_FUNCAO() { return getToken(LaricaDoSurfParser.DEF_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public Parametros_formalContext parametros_formal() {
			return getRuleContext(Parametros_formalContext.class,0);
		}
		public TerminalNode LCOL() { return getToken(LaricaDoSurfParser.LCOL, 0); }
		public Definicao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterDefinicao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitDefinicao_funcao(this);
		}
	}

	public final Definicao_funcaoContext definicao_funcao() throws RecognitionException {
		Definicao_funcaoContext _localctx = new Definicao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicao_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(DEF_FUNCAO);
			setState(90); match(LPAR);
			setState(91); parametros_formal();
			setState(92); match(RPAR);
			setState(93); match(LCOL);
			setState(94); corpo();
			setState(95); match(RCOL);
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode NOME_FUNCAO() { return getToken(LaricaDoSurfParser.NOME_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public Parametros_realContext parametros_real() {
			return getRuleContext(Parametros_realContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(NOME_FUNCAO);
			setState(98); match(LPAR);
			setState(99); parametros_real();
			setState(100); match(RPAR);
			setState(101); match(TERMINAL);
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

	public static class CorpoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_corpo);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case TipoInteger:
			case TipoString:
			case TipoFloat:
			case TipoBoolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); definicao();
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case IF:
			case WHILE:
			case PRINT:
			case VARIAVEL:
			case STRING:
			case DEF_FUNCAO:
			case NOME_FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); expressao();
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

	public static class Parametros_formalContext extends ParserRuleContext {
		public TerminalNode VIRGULA(int i) {
			return getToken(LaricaDoSurfParser.VIRGULA, i);
		}
		public List<TipagemContext> tipagem() {
			return getRuleContexts(TipagemContext.class);
		}
		public TipagemContext tipagem(int i) {
			return getRuleContext(TipagemContext.class,i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(LaricaDoSurfParser.VARIAVEL); }
		public List<TerminalNode> VIRGULA() { return getTokens(LaricaDoSurfParser.VIRGULA); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(LaricaDoSurfParser.VARIAVEL, i);
		}
		public Parametros_formalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterParametros_formal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitParametros_formal(this);
		}
	}

	public final Parametros_formalContext parametros_formal() throws RecognitionException {
		Parametros_formalContext _localctx = new Parametros_formalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); tipagem();
			setState(108); match(VARIAVEL);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(109); match(VIRGULA);
				setState(110); tipagem();
				setState(111); match(VARIAVEL);
				}
				}
				setState(117);
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

	public static class Parametros_realContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LaricaDoSurfParser.VIRGULA, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaricaDoSurfParser.VIRGULA); }
		public Parametros_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterParametros_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitParametros_real(this);
		}
	}

	public final Parametros_realContext parametros_real() throws RecognitionException {
		Parametros_realContext _localctx = new Parametros_realContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); id();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(119); match(VIRGULA);
				setState(120); id();
				}
				}
				setState(125);
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

	public static class Funcao_printContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LaricaDoSurfParser.PRINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public Funcao_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterFuncao_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitFuncao_print(this);
		}
	}

	public final Funcao_printContext funcao_print() throws RecognitionException {
		Funcao_printContext _localctx = new Funcao_printContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcao_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(PRINT);
			setState(127); match(LPAR);
			setState(128); id();
			setState(129); match(RPAR);
			setState(130); match(TERMINAL);
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

	public static class Expressao_condicionalContext extends ParserRuleContext {
		public List<TerminalNode> RCOL() { return getTokens(LaricaDoSurfParser.RCOL); }
		public TerminalNode ELSE() { return getToken(LaricaDoSurfParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(LaricaDoSurfParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RCOL(int i) {
			return getToken(LaricaDoSurfParser.RCOL, i);
		}
		public TerminalNode LCOL(int i) {
			return getToken(LaricaDoSurfParser.LCOL, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> LCOL() { return getTokens(LaricaDoSurfParser.LCOL); }
		public Expressao_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterExpressao_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitExpressao_condicional(this);
		}
	}

	public final Expressao_condicionalContext expressao_condicional() throws RecognitionException {
		Expressao_condicionalContext _localctx = new Expressao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(IF);
			setState(133); match(LPAR);
			setState(134); condicao();
			setState(135); match(RPAR);
			setState(136); match(LCOL);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137); expressao();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(142); match(RCOL);
			setState(152);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(143); match(ELSE);
				setState(144); match(LCOL);
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145); expressao();
					}
					}
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
				setState(150); match(RCOL);
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

	public static class Estrutura_repeticaoContext extends ParserRuleContext {
		public TerminalNode RCOL() { return getToken(LaricaDoSurfParser.RCOL, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public TerminalNode WHILE() { return getToken(LaricaDoSurfParser.WHILE, 0); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode LCOL() { return getToken(LaricaDoSurfParser.LCOL, 0); }
		public Estrutura_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterEstrutura_repeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitEstrutura_repeticao(this);
		}
	}

	public final Estrutura_repeticaoContext estrutura_repeticao() throws RecognitionException {
		Estrutura_repeticaoContext _localctx = new Estrutura_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estrutura_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(WHILE);
			setState(155); match(LPAR);
			setState(156); condicao();
			setState(157); match(RPAR);
			setState(158); match(LCOL);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159); expressao();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(164); match(RCOL);
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

	public static class IdContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); match(VARIAVEL);
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); valor();
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

	public static class CondicaoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperadorcomparacaoContext operadorcomparacao() {
			return getRuleContext(OperadorcomparacaoContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170); match(VARIAVEL);
			setState(171); operadorcomparacao();
			setState(172); valor();
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

	public static class OperadorcomparacaoContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(LaricaDoSurfParser.MENOR, 0); }
		public TerminalNode DIFERENTE() { return getToken(LaricaDoSurfParser.DIFERENTE, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(LaricaDoSurfParser.MAIORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(LaricaDoSurfParser.IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(LaricaDoSurfParser.MAIOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(LaricaDoSurfParser.MENORIGUAL, 0); }
		public OperadorcomparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorcomparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterOperadorcomparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitOperadorcomparacao(this);
		}
	}

	public final OperadorcomparacaoContext operadorcomparacao() throws RecognitionException {
		OperadorcomparacaoContext _localctx = new OperadorcomparacaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorcomparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MENORIGUAL) | (1L << MAIORIGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MENOR))) != 0)) ) {
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LaricaDoSurfParser.SOMA, 0); }
		public TerminalNode MULT() { return getToken(LaricaDoSurfParser.MULT, 0); }
		public TerminalNode SUB() { return getToken(LaricaDoSurfParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(LaricaDoSurfParser.DIV, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0)) ) {
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

	public static class TipagemContext extends ParserRuleContext {
		public TerminalNode TipoString() { return getToken(LaricaDoSurfParser.TipoString, 0); }
		public TerminalNode TipoBoolean() { return getToken(LaricaDoSurfParser.TipoBoolean, 0); }
		public TerminalNode TipoFloat() { return getToken(LaricaDoSurfParser.TipoFloat, 0); }
		public TerminalNode TipoInteger() { return getToken(LaricaDoSurfParser.TipoInteger, 0); }
		public TipagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterTipagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitTipagem(this);
		}
	}

	public final TipagemContext tipagem() throws RecognitionException {
		TipagemContext _localctx = new TipagemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipagem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0)) ) {
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LaricaDoSurfParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LaricaDoSurfParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(LaricaDoSurfParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LaricaDoSurfParser.FLOAT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaricaDoSurfListener ) ((LaricaDoSurfListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\7\3"+
		"\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4?\n\4\r\4\16\4@\5"+
		"\4C\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\5\4Q\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bt\n"+
		"\b\f\b\16\bw\13\b\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u008d\n\13\r\13\16\13\u008e"+
		"\3\13\3\13\3\13\3\13\6\13\u0095\n\13\r\13\16\13\u0096\3\13\3\13\5\13\u009b"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00a3\n\f\r\f\16\f\u00a4\3\f\3\f\3\r"+
		"\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\13"+
		"\20\3\2\26\31\3\2\3\6\4\2\7\t  \u00bc\2$\3\2\2\2\4.\3\2\2\2\6Y\3\2\2\2"+
		"\b[\3\2\2\2\nc\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20x\3\2\2\2\22\u0080\3\2"+
		"\2\2\24\u0086\3\2\2\2\26\u009c\3\2\2\2\30\u00aa\3\2\2\2\32\u00ac\3\2\2"+
		"\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00b6\3\2\2\2$%"+
		"\5\4\3\2%\3\3\2\2\2&\'\5 \21\2\'*\7\37\2\2()\7\n\2\2)+\5\30\r\2*(\3\2"+
		"\2\2*+\3\2\2\2+,\3\2\2\2,-\7\21\2\2-/\3\2\2\2.&\3\2\2\2/\60\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\65\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\5\30"+
		"\r\29:\5\36\20\2:B\5\30\r\2;<\5\36\20\2<=\5\30\r\2=?\3\2\2\2>;\3\2\2\2"+
		"?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B>\3\2\2\2BC\3\2\2\2CD\3\2\2\2"+
		"DE\7\21\2\2EZ\3\2\2\2FG\7\37\2\2GH\7\n\2\2HP\5\30\r\2IJ\5\36\20\2JK\5"+
		"\30\r\2KM\3\2\2\2LI\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PL"+
		"\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\21\2\2SZ\3\2\2\2TZ\5\24\13\2UZ\5\22\n"+
		"\2VZ\5\26\f\2WZ\5\b\5\2XZ\5\n\6\2Y8\3\2\2\2YF\3\2\2\2YT\3\2\2\2YU\3\2"+
		"\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\7!\2\2\\]\7\22\2\2]^"+
		"\5\16\b\2^_\7\23\2\2_`\7\24\2\2`a\5\f\7\2ab\7\25\2\2b\t\3\2\2\2cd\7\""+
		"\2\2de\7\22\2\2ef\5\20\t\2fg\7\23\2\2gh\7\21\2\2h\13\3\2\2\2il\5\4\3\2"+
		"jl\5\6\4\2ki\3\2\2\2kj\3\2\2\2l\r\3\2\2\2mn\5 \21\2nu\7\37\2\2op\7#\2"+
		"\2pq\5 \21\2qr\7\37\2\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\17\3\2\2\2wu\3\2\2\2x}\5\30\r\2yz\7#\2\2z|\5\30\r\2{y\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\36"+
		"\2\2\u0081\u0082\7\22\2\2\u0082\u0083\5\30\r\2\u0083\u0084\7\23\2\2\u0084"+
		"\u0085\7\21\2\2\u0085\23\3\2\2\2\u0086\u0087\7\33\2\2\u0087\u0088\7\22"+
		"\2\2\u0088\u0089\5\32\16\2\u0089\u008a\7\23\2\2\u008a\u008c\7\24\2\2\u008b"+
		"\u008d\5\6\4\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009a\7\25\2\2\u0091"+
		"\u0092\7\34\2\2\u0092\u0094\7\24\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\7\25\2\2\u0099\u009b\3\2\2\2\u009a\u0091\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\7\35\2\2\u009d"+
		"\u009e\7\22\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\7\23\2\2\u00a0\u00a2"+
		"\7\24\2\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\7\25\2\2\u00a7\27\3\2\2\2\u00a8\u00ab\7\37\2\2\u00a9\u00ab\5\"\22\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\37\2"+
		"\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\5\"\22\2\u00af\33\3\2\2\2\u00b0\u00b1"+
		"\t\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3\37\3\2\2\2\u00b4\u00b5"+
		"\t\4\2\2\u00b5!\3\2\2\2\u00b6\u00b7\t\5\2\2\u00b7#\3\2\2\2\22*\60\65@"+
		"BNPYku}\u008e\u0096\u009a\u00a4\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}