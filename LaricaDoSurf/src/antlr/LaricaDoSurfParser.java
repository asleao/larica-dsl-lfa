// Generated from /home/asleao/Projetos/larica-dsl-lfa/LaricaDoSurf/src/grammar/LaricaDoSurf.g4 by ANTLR 4.1

package antlr;

import ast.*;

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
		"'('", "')'", "'['", "']'", "'+'", "'-'", "'/'", "'*'", "'\"'", "'dropa'", 
		"'vaca'", "'caldo'", "'aloha'", "VARIAVEL", "STRING", "DEF_FUNCAO", "NOME_FUNCAO", 
		"','", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_definicao = 2, RULE_expressao = 3, 
		RULE_operacoes = 4, RULE_expressao_simples = 5, RULE_atribuicao = 6, RULE_definicao_funcao = 7, 
		RULE_chamada_funcao = 8, RULE_parametros_formal = 9, RULE_parametros_real = 10, 
		RULE_funcao_print = 11, RULE_expressao_condicional = 12, RULE_estrutura_repeticao = 13, 
		RULE_id = 14, RULE_condicao = 15, RULE_operadorcomparacao = 16, RULE_operador = 17, 
		RULE_tipagem = 18, RULE_valor = 19;
	public static final String[] ruleNames = {
		"prog", "bloco", "definicao", "expressao", "operacoes", "expressao_simples", 
		"atribuicao", "definicao_funcao", "chamada_funcao", "parametros_formal", 
		"parametros_real", "funcao_print", "expressao_condicional", "estrutura_repeticao", 
		"id", "condicao", "operadorcomparacao", "operador", "tipagem", "valor"
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
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); bloco();
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

	public static class BlocoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); definicao();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0) );
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0)) {
				{
				{
				setState(47); expressao();
				}
				}
				setState(52);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public Definicao result;
		public TipagemContext t;
		public Token var;
		public IdContext value;
		public IdContext id;
		public TerminalNode ATRIBUICAO() { return getToken(LaricaDoSurfParser.ATRIBUICAO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TipagemContext tipagem() {
			return getRuleContext(TipagemContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicao);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(53); ((DefinicaoContext)_localctx).t = tipagem();
				setState(54); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(55); match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(59); ((DefinicaoContext)_localctx).t = tipagem();
				setState(60); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(61); match(ATRIBUICAO);
				setState(62); ((DefinicaoContext)_localctx).value = ((DefinicaoContext)_localctx).id = id();
				setState(63); match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null),((DefinicaoContext)_localctx).id.result);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Estrutura_repeticaoContext estrutura_repeticao() {
			return getRuleContext(Estrutura_repeticaoContext.class,0);
		}
		public Funcao_printContext funcao_print() {
			return getRuleContext(Funcao_printContext.class,0);
		}
		public Definicao_funcaoContext definicao_funcao() {
			return getRuleContext(Definicao_funcaoContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Expressao_condicionalContext expressao_condicional() {
			return getRuleContext(Expressao_condicionalContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); expressao_condicional();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); funcao_print();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); estrutura_repeticao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); definicao_funcao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); chamada_funcao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74); expressao_simples();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75); atribuicao();
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

	public static class OperacoesContext extends ParserRuleContext {
		public Operacoes result;
		public OperadorContext op;
		public IdContext v;
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacoes; }
	}

	public final OperacoesContext operacoes() throws RecognitionException {
		OperacoesContext _localctx = new OperacoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((OperacoesContext)_localctx).op = operador();
			setState(79); ((OperacoesContext)_localctx).v = id();
			((OperacoesContext)_localctx).result =  new Operacoes(((OperacoesContext)_localctx).op.result,((OperacoesContext)_localctx).v.result);
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

	public static class Expressao_simplesContext extends ParserRuleContext {
		public ExprSmp result;
		public IdContext i;
		public OperacoesContext op;
		public List<OperacoesContext> operacoes() {
			return getRuleContexts(OperacoesContext.class);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperacoesContext operacoes(int i) {
			return getRuleContext(OperacoesContext.class,i);
		}
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressao_simples);

		           ArrayList<Operacoes> sttList = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((Expressao_simplesContext)_localctx).i = id();
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83); ((Expressao_simplesContext)_localctx).op = operacoes();
				sttList.add(((Expressao_simplesContext)_localctx).op.result);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
			setState(90); match(TERMINAL);
			((Expressao_simplesContext)_localctx).result =  new ExprSmp(((Expressao_simplesContext)_localctx).i.result,sttList);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LaricaDoSurfParser.ATRIBUICAO, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(VARIAVEL);
			setState(94); match(ATRIBUICAO);
			setState(95); id();
			setState(103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0)) {
				{
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96); operador();
					setState(97); id();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
				}
			}

			setState(105); match(TERMINAL);
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
		public TerminalNode RCOL() { return getToken(LaricaDoSurfParser.RCOL, 0); }
		public TerminalNode DEF_FUNCAO() { return getToken(LaricaDoSurfParser.DEF_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public Parametros_formalContext parametros_formal() {
			return getRuleContext(Parametros_formalContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode LCOL() { return getToken(LaricaDoSurfParser.LCOL, 0); }
		public Definicao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao_funcao; }
	}

	public final Definicao_funcaoContext definicao_funcao() throws RecognitionException {
		Definicao_funcaoContext _localctx = new Definicao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definicao_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(DEF_FUNCAO);
			setState(108); match(LPAR);
			setState(109); parametros_formal();
			setState(110); match(RPAR);
			setState(111); match(LCOL);
			setState(112); bloco();
			setState(113); match(RCOL);
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
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(NOME_FUNCAO);
			setState(116); match(LPAR);
			setState(117); parametros_real();
			setState(118); match(RPAR);
			setState(119); match(TERMINAL);
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
	}

	public final Parametros_formalContext parametros_formal() throws RecognitionException {
		Parametros_formalContext _localctx = new Parametros_formalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); tipagem();
			setState(122); match(VARIAVEL);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(123); match(VIRGULA);
				setState(124); tipagem();
				setState(125); match(VARIAVEL);
				}
				}
				setState(131);
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
	}

	public final Parametros_realContext parametros_real() throws RecognitionException {
		Parametros_realContext _localctx = new Parametros_realContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); id();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(133); match(VIRGULA);
				setState(134); id();
				}
				}
				setState(139);
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
		public FuncaoPrint result;
		public IdContext i;
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
	}

	public final Funcao_printContext funcao_print() throws RecognitionException {
		Funcao_printContext _localctx = new Funcao_printContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcao_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(PRINT);
			setState(141); match(LPAR);
			setState(142); ((Funcao_printContext)_localctx).i = id();
			setState(143); match(RPAR);
			setState(144); match(TERMINAL);
			((Funcao_printContext)_localctx).result =  new FuncaoPrint(((Funcao_printContext)_localctx).i.result);
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
	}

	public final Expressao_condicionalContext expressao_condicional() throws RecognitionException {
		Expressao_condicionalContext _localctx = new Expressao_condicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(IF);
			setState(148); match(LPAR);
			setState(149); condicao();
			setState(150); match(RPAR);
			setState(151); match(LCOL);
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152); expressao();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(157); match(RCOL);
			setState(167);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(158); match(ELSE);
				setState(159); match(LCOL);
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160); expressao();
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
				setState(165); match(RCOL);
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
	}

	public final Estrutura_repeticaoContext estrutura_repeticao() throws RecognitionException {
		Estrutura_repeticaoContext _localctx = new Estrutura_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_estrutura_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(WHILE);
			setState(170); match(LPAR);
			setState(171); condicao();
			setState(172); match(RPAR);
			setState(173); match(LCOL);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174); expressao();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(179); match(RCOL);
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
		public Id result;
		public Token VARIAVEL;
		public ValorContext valor;
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((IdContext)_localctx).VARIAVEL = match(VARIAVEL);
				((IdContext)_localctx).result = new Id ((((IdContext)_localctx).VARIAVEL!=null?((IdContext)_localctx).VARIAVEL.getText():null));
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); ((IdContext)_localctx).valor = valor();
				((IdContext)_localctx).result = new Id (((IdContext)_localctx).valor.result);
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
		public Condicao result;
		public Token var;
		public OperadorcomparacaoContext opc;
		public ValorContext val;
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
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188); ((CondicaoContext)_localctx).var = match(VARIAVEL);
			setState(189); ((CondicaoContext)_localctx).opc = operadorcomparacao();
			setState(190); ((CondicaoContext)_localctx).val = valor();
			}
			((CondicaoContext)_localctx).result =   new Condicao((((CondicaoContext)_localctx).var!=null?((CondicaoContext)_localctx).var.getText():null), ((CondicaoContext)_localctx).opc.result, ((CondicaoContext)_localctx).val.result);
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
		public OperadorComparacao result;
		public Token i;
		public Token d;
		public Token maior;
		public Token menor;
		public Token menorIgual;
		public Token maiorIgual;
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
	}

	public final OperadorcomparacaoContext operadorcomparacao() throws RecognitionException {
		OperadorcomparacaoContext _localctx = new OperadorcomparacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operadorcomparacao);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); ((OperadorcomparacaoContext)_localctx).i = match(IGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).i!=null?((OperadorcomparacaoContext)_localctx).i.getText():null));
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); ((OperadorcomparacaoContext)_localctx).d = match(DIFERENTE);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).d!=null?((OperadorcomparacaoContext)_localctx).d.getText():null));
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(198); ((OperadorcomparacaoContext)_localctx).maior = match(MAIOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maior!=null?((OperadorcomparacaoContext)_localctx).maior.getText():null));
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(200); ((OperadorcomparacaoContext)_localctx).menor = match(MENOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menor!=null?((OperadorcomparacaoContext)_localctx).menor.getText():null));
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(202); ((OperadorcomparacaoContext)_localctx).menorIgual = match(MENORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menorIgual!=null?((OperadorcomparacaoContext)_localctx).menorIgual.getText():null));
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(204); ((OperadorcomparacaoContext)_localctx).maiorIgual = match(MAIORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maiorIgual!=null?((OperadorcomparacaoContext)_localctx).maiorIgual.getText():null));
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

	public static class OperadorContext extends ParserRuleContext {
		public Operador result;
		public Token s;
		public Token sub;
		public Token d;
		public Token m;
		public TerminalNode SOMA() { return getToken(LaricaDoSurfParser.SOMA, 0); }
		public TerminalNode MULT() { return getToken(LaricaDoSurfParser.MULT, 0); }
		public TerminalNode SUB() { return getToken(LaricaDoSurfParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(LaricaDoSurfParser.DIV, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operador);
		try {
			setState(216);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); ((OperadorContext)_localctx).s = match(SOMA);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).s!=null?((OperadorContext)_localctx).s.getText():null));
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); ((OperadorContext)_localctx).sub = match(SUB);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).sub!=null?((OperadorContext)_localctx).sub.getText():null));
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); ((OperadorContext)_localctx).d = match(DIV);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).d!=null?((OperadorContext)_localctx).d.getText():null));
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(214); ((OperadorContext)_localctx).m = match(MULT);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).m!=null?((OperadorContext)_localctx).m.getText():null));
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

	public static class TipagemContext extends ParserRuleContext {
		public Tipagem result;
		public Token tipo_integer;
		public Token tipo_string;
		public Token tipo_float;
		public Token tipo_boolean;
		public TerminalNode TipoString() { return getToken(LaricaDoSurfParser.TipoString, 0); }
		public TerminalNode TipoBoolean() { return getToken(LaricaDoSurfParser.TipoBoolean, 0); }
		public TerminalNode TipoFloat() { return getToken(LaricaDoSurfParser.TipoFloat, 0); }
		public TerminalNode TipoInteger() { return getToken(LaricaDoSurfParser.TipoInteger, 0); }
		public TipagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipagem; }
	}

	public final TipagemContext tipagem() throws RecognitionException {
		TipagemContext _localctx = new TipagemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipagem);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case TipoInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); ((TipagemContext)_localctx).tipo_integer = match(TipoInteger);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_integer!=null?((TipagemContext)_localctx).tipo_integer.getText():null));
				}
				break;
			case TipoString:
				enterOuterAlt(_localctx, 2);
				{
				setState(220); ((TipagemContext)_localctx).tipo_string = match(TipoString);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_string!=null?((TipagemContext)_localctx).tipo_string.getText():null));
				}
				break;
			case TipoFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(222); ((TipagemContext)_localctx).tipo_float = match(TipoFloat);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_float!=null?((TipagemContext)_localctx).tipo_float.getText():null));
				}
				break;
			case TipoBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(224); ((TipagemContext)_localctx).tipo_boolean = match(TipoBoolean);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_boolean!=null?((TipagemContext)_localctx).tipo_boolean.getText():null));
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

	public static class ValorContext extends ParserRuleContext {
		public Valor result;
		public Token i;
		public Token s;
		public Token f;
		public Token b;
		public TerminalNode STRING() { return getToken(LaricaDoSurfParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LaricaDoSurfParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(LaricaDoSurfParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LaricaDoSurfParser.FLOAT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); ((ValorContext)_localctx).i = match(INT);
				((ValorContext)_localctx).result =  new Valor(Integer.parseInt((((ValorContext)_localctx).i!=null?((ValorContext)_localctx).i.getText():null)));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); ((ValorContext)_localctx).s = match(STRING);
				((ValorContext)_localctx).result =  new Valor((((ValorContext)_localctx).s!=null?((ValorContext)_localctx).s.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); ((ValorContext)_localctx).f = match(FLOAT);
				((ValorContext)_localctx).result =  new Valor(Float.parseFloat((((ValorContext)_localctx).f!=null?((ValorContext)_localctx).f.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(234); ((ValorContext)_localctx).b = match(BOOLEAN);
				((ValorContext)_localctx).result =  new Valor(Boolean.parseBoolean((((ValorContext)_localctx).b!=null?((ValorContext)_localctx).b.getText():null)));
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\6\bf\n\b\r\b\16\bg\5\bj\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0082\n"+
		"\13\f\13\16\13\u0085\13\13\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u009c"+
		"\n\16\r\16\16\16\u009d\3\16\3\16\3\16\3\16\6\16\u00a4\n\16\r\16\16\16"+
		"\u00a5\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00b2"+
		"\n\17\r\17\16\17\u00b3\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00bd\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00d1\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00db\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00e5\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ef\n\25\3"+
		"\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u00fd\2*\3\2"+
		"\2\2\4-\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fT\3\2\2\2\16_\3\2\2"+
		"\2\20m\3\2\2\2\22u\3\2\2\2\24{\3\2\2\2\26\u0086\3\2\2\2\30\u008e\3\2\2"+
		"\2\32\u0095\3\2\2\2\34\u00ab\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2\2\""+
		"\u00d0\3\2\2\2$\u00da\3\2\2\2&\u00e4\3\2\2\2(\u00ee\3\2\2\2*+\5\4\3\2"+
		"+\3\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\64"+
		"\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\5&\24\289\7\37\2\29:\7\21\2\2"+
		":;\3\2\2\2;<\b\4\1\2<F\3\2\2\2=>\5&\24\2>?\7\37\2\2?@\7\n\2\2@A\5\36\20"+
		"\2AB\7\21\2\2BC\3\2\2\2CD\b\4\1\2DF\3\2\2\2E\67\3\2\2\2E=\3\2\2\2F\7\3"+
		"\2\2\2GO\5\32\16\2HO\5\30\r\2IO\5\34\17\2JO\5\20\t\2KO\5\22\n\2LO\5\f"+
		"\7\2MO\5\16\b\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3"+
		"\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\5$\23\2QR\5\36\20\2RS\b\6\1\2S\13\3\2\2"+
		"\2TX\5\36\20\2UV\5\n\6\2VW\b\7\1\2WY\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\21\2\2]^\b\7\1\2^\r\3\2\2\2_`\7\37\2\2"+
		"`a\7\n\2\2ai\5\36\20\2bc\5$\23\2cd\5\36\20\2df\3\2\2\2eb\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ie\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\21"+
		"\2\2l\17\3\2\2\2mn\7!\2\2no\7\22\2\2op\5\24\13\2pq\7\23\2\2qr\7\24\2\2"+
		"rs\5\4\3\2st\7\25\2\2t\21\3\2\2\2uv\7\"\2\2vw\7\22\2\2wx\5\26\f\2xy\7"+
		"\23\2\2yz\7\21\2\2z\23\3\2\2\2{|\5&\24\2|\u0083\7\37\2\2}~\7#\2\2~\177"+
		"\5&\24\2\177\u0080\7\37\2\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008b\5\36\20\2\u0087\u0088\7#\2\2\u0088\u008a\5"+
		"\36\20\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\27\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\36\2"+
		"\2\u008f\u0090\7\22\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7\23\2\2\u0092"+
		"\u0093\7\21\2\2\u0093\u0094\b\r\1\2\u0094\31\3\2\2\2\u0095\u0096\7\33"+
		"\2\2\u0096\u0097\7\22\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\23\2\2\u0099"+
		"\u009b\7\24\2\2\u009a\u009c\5\b\5\2\u009b\u009a\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a9\7\25\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a3\7\24\2\2\u00a2\u00a4"+
		"\5\b\5\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\25\2\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00ac\7\35\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7"+
		"\23\2\2\u00af\u00b1\7\24\2\2\u00b0\u00b2\5\b\5\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\7\25\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\37\2\2\u00b8"+
		"\u00bd\b\20\1\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\b\20\1\2\u00bb\u00bd\3"+
		"\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\37\3\2\2\2\u00be"+
		"\u00bf\7\37\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\b\21\1\2\u00c3!\3\2\2\2\u00c4\u00c5\7\13\2\2\u00c5"+
		"\u00d1\b\22\1\2\u00c6\u00c7\7\16\2\2\u00c7\u00d1\b\22\1\2\u00c8\u00c9"+
		"\7\17\2\2\u00c9\u00d1\b\22\1\2\u00ca\u00cb\7\20\2\2\u00cb\u00d1\b\22\1"+
		"\2\u00cc\u00cd\7\f\2\2\u00cd\u00d1\b\22\1\2\u00ce\u00cf\7\r\2\2\u00cf"+
		"\u00d1\b\22\1\2\u00d0\u00c4\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c8\3"+
		"\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"#\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00db\b\23\1\2\u00d4\u00d5\7\27\2"+
		"\2\u00d5\u00db\b\23\1\2\u00d6\u00d7\7\30\2\2\u00d7\u00db\b\23\1\2\u00d8"+
		"\u00d9\7\31\2\2\u00d9\u00db\b\23\1\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3"+
		"\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d8\3\2\2\2\u00db%\3\2\2\2\u00dc\u00dd"+
		"\7\3\2\2\u00dd\u00e5\b\24\1\2\u00de\u00df\7\4\2\2\u00df\u00e5\b\24\1\2"+
		"\u00e0\u00e1\7\5\2\2\u00e1\u00e5\b\24\1\2\u00e2\u00e3\7\6\2\2\u00e3\u00e5"+
		"\b\24\1\2\u00e4\u00dc\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\'\3\2\2\2\u00e6\u00e7\7\7\2\2\u00e7\u00ef\b"+
		"\25\1\2\u00e8\u00e9\7 \2\2\u00e9\u00ef\b\25\1\2\u00ea\u00eb\7\b\2\2\u00eb"+
		"\u00ef\b\25\1\2\u00ec\u00ed\7\t\2\2\u00ed\u00ef\b\25\1\2\u00ee\u00e6\3"+
		"\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		")\3\2\2\2\24/\64ENZgi\u0083\u008b\u009d\u00a5\u00a9\u00b3\u00bc\u00d0"+
		"\u00da\u00e4\u00ee";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}