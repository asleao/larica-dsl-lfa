// Generated from C:\Users\Psicologia Judo\Documents\ANA-RUBIA\LFA\larica-dsl-lfa\LaricaDoSurf\src\grammar\LaricaDoSurf.g4 by ANTLR 4.1

package antlr;

import java.util.LinkedList;
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
		RULE_operacoes = 4, RULE_expressao_simples = 5, RULE_atribuicao_valor = 6, 
		RULE_definicao_funcao = 7, RULE_chamada_funcao = 8, RULE_parametro_funcao = 9, 
		RULE_parametros_formal = 10, RULE_parametros_real = 11, RULE_funcao_print = 12, 
		RULE_expressao_condicional = 13, RULE_estrutura_repeticao = 14, RULE_id = 15, 
		RULE_condicao = 16, RULE_operadorcomparacao = 17, RULE_operador = 18, 
		RULE_tipagem = 19, RULE_valor = 20;
	public static final String[] ruleNames = {
		"prog", "bloco", "definicao", "expressao", "operacoes", "expressao_simples", 
		"atribuicao_valor", "definicao_funcao", "chamada_funcao", "parametro_funcao", 
		"parametros_formal", "parametros_real", "funcao_print", "expressao_condicional", 
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
			setState(42); bloco();
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
		public Bloco result;
		public DefinicaoContext def;
		public DefinicaoContext definicao;
		public ExpressaoContext expr;
		public ExpressaoContext expressao;
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); ((BlocoContext)_localctx).def = ((BlocoContext)_localctx).definicao = definicao();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0) );
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0)) {
				{
				{
				setState(49); ((BlocoContext)_localctx).expr = ((BlocoContext)_localctx).expressao = expressao();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((BlocoContext)_localctx).result =  new Bloco(((BlocoContext)_localctx).definicao.result, ((BlocoContext)_localctx).expressao.result);
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
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(57); ((DefinicaoContext)_localctx).t = tipagem();
				setState(58); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(59); match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63); ((DefinicaoContext)_localctx).t = tipagem();
				setState(64); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(65); match(ATRIBUICAO);
				setState(66); ((DefinicaoContext)_localctx).value = ((DefinicaoContext)_localctx).id = id();
				setState(67); match(TERMINAL);
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
		public Expr result;
		public Funcao_printContext p;
		public Chamada_funcaoContext c;
		public Expressao_simplesContext e;
		public Atribuicao_valorContext a;
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
		public Expressao_condicionalContext expressao_condicional() {
			return getRuleContext(Expressao_condicionalContext.class,0);
		}
		public Atribuicao_valorContext atribuicao_valor() {
			return getRuleContext(Atribuicao_valorContext.class,0);
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
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); expressao_condicional();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); ((ExpressaoContext)_localctx).p = funcao_print();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).p.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); estrutura_repeticao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); definicao_funcao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); ((ExpressaoContext)_localctx).c = chamada_funcao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).c.result;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82); ((ExpressaoContext)_localctx).e = expressao_simples();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).e.result;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85); ((ExpressaoContext)_localctx).a = atribuicao_valor();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).a.result;
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
			setState(90); ((OperacoesContext)_localctx).op = operador();
			setState(91); ((OperacoesContext)_localctx).v = id();
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
			setState(94); ((Expressao_simplesContext)_localctx).i = id();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95); ((Expressao_simplesContext)_localctx).op = operacoes();
				sttList.add(((Expressao_simplesContext)_localctx).op.result);
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
			setState(102); match(TERMINAL);
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

	public static class Atribuicao_valorContext extends ParserRuleContext {
		public AtribuicaoValor result;
		public Token var;
		public IdContext val;
		public Expressao_simplesContext exp;
		public TerminalNode ATRIBUICAO() { return getToken(LaricaDoSurfParser.ATRIBUICAO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
		public Atribuicao_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_valor; }
	}

	public final Atribuicao_valorContext atribuicao_valor() throws RecognitionException {
		Atribuicao_valorContext _localctx = new Atribuicao_valorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao_valor);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(106); match(ATRIBUICAO);
				setState(107); ((Atribuicao_valorContext)_localctx).val = id();
				setState(108); match(TERMINAL);
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).val.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(112); match(ATRIBUICAO);
				setState(113); ((Atribuicao_valorContext)_localctx).exp = expressao_simples();
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).exp.result);
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
			setState(118); match(DEF_FUNCAO);
			setState(119); match(LPAR);
			setState(120); parametros_formal();
			setState(121); match(RPAR);
			setState(122); match(LCOL);
			setState(123); bloco();
			setState(124); match(RCOL);
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
		public ChamadaFuncao result;
		public Token n;
		public Parametros_realContext p;
		public TerminalNode NOME_FUNCAO() { return getToken(LaricaDoSurfParser.NOME_FUNCAO, 0); }
		public TerminalNode LPAR() { return getToken(LaricaDoSurfParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LaricaDoSurfParser.RPAR, 0); }
		public TerminalNode TERMINAL() { return getToken(LaricaDoSurfParser.TERMINAL, 0); }
		public Parametros_realContext parametros_real() {
			return getRuleContext(Parametros_realContext.class,0);
		}
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
			setState(126); ((Chamada_funcaoContext)_localctx).n = match(NOME_FUNCAO);
			setState(127); match(LPAR);
			setState(128); ((Chamada_funcaoContext)_localctx).p = parametros_real();
			setState(129); match(RPAR);
			setState(130); match(TERMINAL);
			((Chamada_funcaoContext)_localctx).result =  new ChamadaFuncao((((Chamada_funcaoContext)_localctx).n!=null?((Chamada_funcaoContext)_localctx).n.getText():null), ((Chamada_funcaoContext)_localctx).p.args);
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

	public static class Parametro_funcaoContext extends ParserRuleContext {
		public Definicao result;
		public TipagemContext t;
		public Token var;
		public TipagemContext tipagem() {
			return getRuleContext(TipagemContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(LaricaDoSurfParser.VARIAVEL, 0); }
		public Parametro_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro_funcao; }
	}

	public final Parametro_funcaoContext parametro_funcao() throws RecognitionException {
		Parametro_funcaoContext _localctx = new Parametro_funcaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); ((Parametro_funcaoContext)_localctx).t = tipagem();
			setState(134); ((Parametro_funcaoContext)_localctx).var = match(VARIAVEL);
			((Parametro_funcaoContext)_localctx).result =  new Definicao(((Parametro_funcaoContext)_localctx).t.result, (((Parametro_funcaoContext)_localctx).var!=null?((Parametro_funcaoContext)_localctx).var.getText():null));
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
		public List<Definicao> args;
		public Parametro_funcaoContext parametro_funcao;
		public List<Parametro_funcaoContext> parametro_funcao() {
			return getRuleContexts(Parametro_funcaoContext.class);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LaricaDoSurfParser.VIRGULA, i);
		}
		public Parametro_funcaoContext parametro_funcao(int i) {
			return getRuleContext(Parametro_funcaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LaricaDoSurfParser.VIRGULA); }
		public Parametros_formalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formal; }
	}

	public final Parametros_formalContext parametros_formal() throws RecognitionException {
		Parametros_formalContext _localctx = new Parametros_formalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros_formal);

		    ((Parametros_formalContext)_localctx).args =  new LinkedList<Definicao>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0)) {
				{
				setState(137); ((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
				_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(139); match(VIRGULA);
					setState(140); ((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
					_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Parametros_realContext extends ParserRuleContext {
		public List<Id> args;
		public IdContext id;
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
		enterRule(_localctx, 22, RULE_parametros_real);

		    ((Parametros_realContext)_localctx).args =  new LinkedList<Id>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << VARIAVEL) | (1L << STRING))) != 0)) {
				{
				setState(150); ((Parametros_realContext)_localctx).id = id();
				_localctx.args.add(((Parametros_realContext)_localctx).id.result);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(152); match(VIRGULA);
					setState(153); ((Parametros_realContext)_localctx).id = id();
					_localctx.args.add(((Parametros_realContext)_localctx).id.result);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 24, RULE_funcao_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(PRINT);
			setState(164); match(LPAR);
			setState(165); ((Funcao_printContext)_localctx).i = id();
			setState(166); match(RPAR);
			setState(167); match(TERMINAL);
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
		enterRule(_localctx, 26, RULE_expressao_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(IF);
			setState(171); match(LPAR);
			setState(172); condicao();
			setState(173); match(RPAR);
			setState(174); match(LCOL);
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175); expressao();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(180); match(RCOL);
			setState(190);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(181); match(ELSE);
				setState(182); match(LCOL);
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183); expressao();
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
				setState(188); match(RCOL);
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
		enterRule(_localctx, 28, RULE_estrutura_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(WHILE);
			setState(193); match(LPAR);
			setState(194); condicao();
			setState(195); match(RPAR);
			setState(196); match(LCOL);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197); expressao();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(202); match(RCOL);
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
		enterRule(_localctx, 30, RULE_id);
		try {
			setState(209);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); ((IdContext)_localctx).VARIAVEL = match(VARIAVEL);
				((IdContext)_localctx).result = new Id ((((IdContext)_localctx).VARIAVEL!=null?((IdContext)_localctx).VARIAVEL.getText():null));
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); ((IdContext)_localctx).valor = valor();
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
		enterRule(_localctx, 32, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211); ((CondicaoContext)_localctx).var = match(VARIAVEL);
			setState(212); ((CondicaoContext)_localctx).opc = operadorcomparacao();
			setState(213); ((CondicaoContext)_localctx).val = valor();
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
		enterRule(_localctx, 34, RULE_operadorcomparacao);
		try {
			setState(229);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); ((OperadorcomparacaoContext)_localctx).i = match(IGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).i!=null?((OperadorcomparacaoContext)_localctx).i.getText():null));
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); ((OperadorcomparacaoContext)_localctx).d = match(DIFERENTE);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).d!=null?((OperadorcomparacaoContext)_localctx).d.getText():null));
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(221); ((OperadorcomparacaoContext)_localctx).maior = match(MAIOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maior!=null?((OperadorcomparacaoContext)_localctx).maior.getText():null));
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(223); ((OperadorcomparacaoContext)_localctx).menor = match(MENOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menor!=null?((OperadorcomparacaoContext)_localctx).menor.getText():null));
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(225); ((OperadorcomparacaoContext)_localctx).menorIgual = match(MENORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menorIgual!=null?((OperadorcomparacaoContext)_localctx).menorIgual.getText():null));
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(227); ((OperadorcomparacaoContext)_localctx).maiorIgual = match(MAIORIGUAL);
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
		enterRule(_localctx, 36, RULE_operador);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); ((OperadorContext)_localctx).s = match(SOMA);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).s!=null?((OperadorContext)_localctx).s.getText():null));
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); ((OperadorContext)_localctx).sub = match(SUB);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).sub!=null?((OperadorContext)_localctx).sub.getText():null));
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); ((OperadorContext)_localctx).d = match(DIV);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).d!=null?((OperadorContext)_localctx).d.getText():null));
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(237); ((OperadorContext)_localctx).m = match(MULT);
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
		enterRule(_localctx, 38, RULE_tipagem);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case TipoInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); ((TipagemContext)_localctx).tipo_integer = match(TipoInteger);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_integer!=null?((TipagemContext)_localctx).tipo_integer.getText():null));
				}
				break;
			case TipoString:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((TipagemContext)_localctx).tipo_string = match(TipoString);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_string!=null?((TipagemContext)_localctx).tipo_string.getText():null));
				}
				break;
			case TipoFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(245); ((TipagemContext)_localctx).tipo_float = match(TipoFloat);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_float!=null?((TipagemContext)_localctx).tipo_float.getText():null));
				}
				break;
			case TipoBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); ((TipagemContext)_localctx).tipo_boolean = match(TipoBoolean);
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
		enterRule(_localctx, 40, RULE_valor);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); ((ValorContext)_localctx).i = match(INT);
				((ValorContext)_localctx).result =  new Valor(Integer.parseInt((((ValorContext)_localctx).i!=null?((ValorContext)_localctx).i.getText():null)));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); ((ValorContext)_localctx).s = match(STRING);
				((ValorContext)_localctx).result =  new Valor((((ValorContext)_localctx).s!=null?((ValorContext)_localctx).s.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); ((ValorContext)_localctx).f = match(FLOAT);
				((ValorContext)_localctx).result =  new Valor(Float.parseFloat((((ValorContext)_localctx).f!=null?((ValorContext)_localctx).f.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(257); ((ValorContext)_localctx).b = match(BOOLEAN);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\6\3\60\n\3\r\3\16"+
		"\3\61\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\6\7e\n\7\r\7\16\7f\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0092\n\f\f\f"+
		"\16\f\u0095\13\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009f\n\r\f"+
		"\r\16\r\u00a2\13\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\6\17\u00b3\n\17\r\17\16\17\u00b4\3\17\3\17"+
		"\3\17\3\17\6\17\u00bb\n\17\r\17\16\17\u00bc\3\17\3\17\5\17\u00c1\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00c9\n\20\r\20\16\20\u00ca\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fc\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n\26\3\26\2\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\2\u0114\2,\3\2\2\2\4/\3\2\2\2\6I\3\2\2"+
		"\2\bZ\3\2\2\2\n\\\3\2\2\2\f`\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22\u0080"+
		"\3\2\2\2\24\u0087\3\2\2\2\26\u0096\3\2\2\2\30\u00a3\3\2\2\2\32\u00a5\3"+
		"\2\2\2\34\u00ac\3\2\2\2\36\u00c2\3\2\2\2 \u00d3\3\2\2\2\"\u00d5\3\2\2"+
		"\2$\u00e7\3\2\2\2&\u00f1\3\2\2\2(\u00fb\3\2\2\2*\u0105\3\2\2\2,-\5\4\3"+
		"\2-\3\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\66\3\2\2\2\63\65\5\b\5\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2"+
		"\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\b\3\1\2:\5\3\2\2\2;<\5(\25"+
		"\2<=\7\37\2\2=>\7\21\2\2>?\3\2\2\2?@\b\4\1\2@J\3\2\2\2AB\5(\25\2BC\7\37"+
		"\2\2CD\7\n\2\2DE\5 \21\2EF\7\21\2\2FG\3\2\2\2GH\b\4\1\2HJ\3\2\2\2I;\3"+
		"\2\2\2IA\3\2\2\2J\7\3\2\2\2K[\5\34\17\2LM\5\32\16\2MN\b\5\1\2N[\3\2\2"+
		"\2O[\5\36\20\2P[\5\20\t\2QR\5\22\n\2RS\b\5\1\2S[\3\2\2\2TU\5\f\7\2UV\b"+
		"\5\1\2V[\3\2\2\2WX\5\16\b\2XY\b\5\1\2Y[\3\2\2\2ZK\3\2\2\2ZL\3\2\2\2ZO"+
		"\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2[\t\3\2\2\2\\]\5&\24\2"+
		"]^\5 \21\2^_\b\6\1\2_\13\3\2\2\2`d\5 \21\2ab\5\n\6\2bc\b\7\1\2ce\3\2\2"+
		"\2da\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\21\2\2ij\b\7"+
		"\1\2j\r\3\2\2\2kl\7\37\2\2lm\7\n\2\2mn\5 \21\2no\7\21\2\2op\b\b\1\2pw"+
		"\3\2\2\2qr\7\37\2\2rs\7\n\2\2st\5\f\7\2tu\b\b\1\2uw\3\2\2\2vk\3\2\2\2"+
		"vq\3\2\2\2w\17\3\2\2\2xy\7!\2\2yz\7\22\2\2z{\5\26\f\2{|\7\23\2\2|}\7\24"+
		"\2\2}~\5\4\3\2~\177\7\25\2\2\177\21\3\2\2\2\u0080\u0081\7\"\2\2\u0081"+
		"\u0082\7\22\2\2\u0082\u0083\5\30\r\2\u0083\u0084\7\23\2\2\u0084\u0085"+
		"\7\21\2\2\u0085\u0086\b\n\1\2\u0086\23\3\2\2\2\u0087\u0088\5(\25\2\u0088"+
		"\u0089\7\37\2\2\u0089\u008a\b\13\1\2\u008a\25\3\2\2\2\u008b\u008c\5\24"+
		"\13\2\u008c\u0093\b\f\1\2\u008d\u008e\7#\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u0090\b\f\1\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2"+
		"\2\u0098\u0099\5 \21\2\u0099\u00a0\b\r\1\2\u009a\u009b\7#\2\2\u009b\u009c"+
		"\5 \21\2\u009c\u009d\b\r\1\2\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\31\3\2\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5 \21"+
		"\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\b\16\1\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00af\5\""+
		"\22\2\u00af\u00b0\7\23\2\2\u00b0\u00b2\7\24\2\2\u00b1\u00b3\5\b\5\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c0\7\25\2\2\u00b7\u00b8\7\34\2\2\u00b8"+
		"\u00ba\7\24\2\2\u00b9\u00bb\5\b\5\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\7\25\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\35\3\2\2\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\7\22\2\2\u00c4"+
		"\u00c5\5\"\22\2\u00c5\u00c6\7\23\2\2\u00c6\u00c8\7\24\2\2\u00c7\u00c9"+
		"\5\b\5\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\25\2\2\u00cd\37\3\2\2"+
		"\2\u00ce\u00cf\7\37\2\2\u00cf\u00d4\b\21\1\2\u00d0\u00d1\5*\26\2\u00d1"+
		"\u00d2\b\21\1\2\u00d2\u00d4\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3"+
		"\2\2\2\u00d4!\3\2\2\2\u00d5\u00d6\7\37\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8"+
		"\5*\26\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\22\1\2\u00da#\3\2\2\2\u00db"+
		"\u00dc\7\13\2\2\u00dc\u00e8\b\23\1\2\u00dd\u00de\7\16\2\2\u00de\u00e8"+
		"\b\23\1\2\u00df\u00e0\7\17\2\2\u00e0\u00e8\b\23\1\2\u00e1\u00e2\7\20\2"+
		"\2\u00e2\u00e8\b\23\1\2\u00e3\u00e4\7\f\2\2\u00e4\u00e8\b\23\1\2\u00e5"+
		"\u00e6\7\r\2\2\u00e6\u00e8\b\23\1\2\u00e7\u00db\3\2\2\2\u00e7\u00dd\3"+
		"\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8%\3\2\2\2\u00e9\u00ea\7\26\2\2\u00ea\u00f2\b\24\1"+
		"\2\u00eb\u00ec\7\27\2\2\u00ec\u00f2\b\24\1\2\u00ed\u00ee\7\30\2\2\u00ee"+
		"\u00f2\b\24\1\2\u00ef\u00f0\7\31\2\2\u00f0\u00f2\b\24\1\2\u00f1\u00e9"+
		"\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\'\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00fc\b\25\1\2\u00f5\u00f6\7\4\2"+
		"\2\u00f6\u00fc\b\25\1\2\u00f7\u00f8\7\5\2\2\u00f8\u00fc\b\25\1\2\u00f9"+
		"\u00fa\7\6\2\2\u00fa\u00fc\b\25\1\2\u00fb\u00f3\3\2\2\2\u00fb\u00f5\3"+
		"\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc)\3\2\2\2\u00fd\u00fe"+
		"\7\7\2\2\u00fe\u0106\b\26\1\2\u00ff\u0100\7 \2\2\u0100\u0106\b\26\1\2"+
		"\u0101\u0102\7\b\2\2\u0102\u0106\b\26\1\2\u0103\u0104\7\t\2\2\u0104\u0106"+
		"\b\26\1\2\u0105\u00fd\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0101\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0106+\3\2\2\2\25\61\66IZfv\u0093\u0096\u00a0\u00a3"+
		"\u00b4\u00bc\u00c0\u00ca\u00d3\u00e7\u00f1\u00fb\u0105";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}