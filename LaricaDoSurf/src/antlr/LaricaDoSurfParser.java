// Generated from C:\Users\Psicologia Judo\Documents\ANA-RUBIA\LFA\larica-dsl-lfa\LaricaDoSurf\src\grammar\LaricaDoSurf.g4 by ANTLR 4.1

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
import java.util.LinkedList;

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
		RULE_definicao_funcao = 7, RULE_chamada_funcao = 8, RULE_parametros_formal = 9, 
		RULE_parametros_real = 10, RULE_funcao_print = 11, RULE_expressao_condicional = 12, 
		RULE_estrutura_repeticao = 13, RULE_id = 14, RULE_condicao = 15, RULE_operadorcomparacao = 16, 
		RULE_operador = 17, RULE_tipagem = 18, RULE_valor = 19;
	public static final String[] ruleNames = {
		"prog", "bloco", "definicao", "expressao", "operacoes", "expressao_simples", 
		"atribuicao_valor", "definicao_funcao", "chamada_funcao", "parametros_formal", 
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
				setState(75); atribuicao_valor();
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
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(94); match(ATRIBUICAO);
				setState(95); ((Atribuicao_valorContext)_localctx).val = id();
				setState(96); match(TERMINAL);
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).val.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(100); match(ATRIBUICAO);
				setState(101); ((Atribuicao_valorContext)_localctx).exp = expressao_simples();
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
			setState(106); match(DEF_FUNCAO);
			setState(107); match(LPAR);
			setState(108); parametros_formal();
			setState(109); match(RPAR);
			setState(110); match(LCOL);
			setState(111); bloco();
			setState(112); match(RCOL);
			}
		}
		catch (RecognitionException re) {
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
			setState(114); match(NOME_FUNCAO);
			setState(115); match(LPAR);
			setState(116); parametros_real();
			setState(117); match(RPAR);
			setState(118); match(TERMINAL);
			}
		}
		catch (RecognitionException re) {
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
			setState(120); tipagem();
			setState(121); match(VARIAVEL);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(122); match(VIRGULA);
				setState(123); tipagem();
				setState(124); match(VARIAVEL);
				}
				}
				setState(130);
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
		enterRule(_localctx, 20, RULE_parametros_real);

		    ((Parametros_realContext)_localctx).args =  new LinkedList<Id>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << VARIAVEL) | (1L << STRING))) != 0)) {
				{
				setState(131); ((Parametros_realContext)_localctx).id = id();
				_localctx.args.add(((Parametros_realContext)_localctx).id.result);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(133); match(VIRGULA);
					setState(134); ((Parametros_realContext)_localctx).id = id();
					_localctx.args.add(((Parametros_realContext)_localctx).id.result);
					}
					}
					setState(141);
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
		enterRule(_localctx, 22, RULE_funcao_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(PRINT);
			setState(145); match(LPAR);
			setState(146); ((Funcao_printContext)_localctx).i = id();
			setState(147); match(RPAR);
			setState(148); match(TERMINAL);
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
			setState(151); match(IF);
			setState(152); match(LPAR);
			setState(153); condicao();
			setState(154); match(RPAR);
			setState(155); match(LCOL);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156); expressao();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(161); match(RCOL);
			setState(171);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(162); match(ELSE);
				setState(163); match(LCOL);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164); expressao();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
				setState(169); match(RCOL);
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
			setState(173); match(WHILE);
			setState(174); match(LPAR);
			setState(175); condicao();
			setState(176); match(RPAR);
			setState(177); match(LCOL);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178); expressao();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << NOME_FUNCAO))) != 0) );
			setState(183); match(RCOL);
			}
		}
		catch (RecognitionException re) {
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
			setState(190);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); ((IdContext)_localctx).VARIAVEL = match(VARIAVEL);
				((IdContext)_localctx).result = new Id ((((IdContext)_localctx).VARIAVEL!=null?((IdContext)_localctx).VARIAVEL.getText():null));
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); ((IdContext)_localctx).valor = valor();
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
			setState(192); ((CondicaoContext)_localctx).var = match(VARIAVEL);
			setState(193); ((CondicaoContext)_localctx).opc = operadorcomparacao();
			setState(194); ((CondicaoContext)_localctx).val = valor();
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
			setState(210);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(198); ((OperadorcomparacaoContext)_localctx).i = match(IGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).i!=null?((OperadorcomparacaoContext)_localctx).i.getText():null));
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); ((OperadorcomparacaoContext)_localctx).d = match(DIFERENTE);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).d!=null?((OperadorcomparacaoContext)_localctx).d.getText():null));
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); ((OperadorcomparacaoContext)_localctx).maior = match(MAIOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maior!=null?((OperadorcomparacaoContext)_localctx).maior.getText():null));
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(204); ((OperadorcomparacaoContext)_localctx).menor = match(MENOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menor!=null?((OperadorcomparacaoContext)_localctx).menor.getText():null));
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(206); ((OperadorcomparacaoContext)_localctx).menorIgual = match(MENORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menorIgual!=null?((OperadorcomparacaoContext)_localctx).menorIgual.getText():null));
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(208); ((OperadorcomparacaoContext)_localctx).maiorIgual = match(MAIORIGUAL);
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
			setState(220);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); ((OperadorContext)_localctx).s = match(SOMA);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).s!=null?((OperadorContext)_localctx).s.getText():null));
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); ((OperadorContext)_localctx).sub = match(SUB);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).sub!=null?((OperadorContext)_localctx).sub.getText():null));
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); ((OperadorContext)_localctx).d = match(DIV);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).d!=null?((OperadorContext)_localctx).d.getText():null));
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(218); ((OperadorContext)_localctx).m = match(MULT);
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
			setState(230);
			switch (_input.LA(1)) {
			case TipoInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); ((TipagemContext)_localctx).tipo_integer = match(TipoInteger);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_integer!=null?((TipagemContext)_localctx).tipo_integer.getText():null));
				}
				break;
			case TipoString:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); ((TipagemContext)_localctx).tipo_string = match(TipoString);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_string!=null?((TipagemContext)_localctx).tipo_string.getText():null));
				}
				break;
			case TipoFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); ((TipagemContext)_localctx).tipo_float = match(TipoFloat);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_float!=null?((TipagemContext)_localctx).tipo_float.getText():null));
				}
				break;
			case TipoBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(228); ((TipagemContext)_localctx).tipo_boolean = match(TipoBoolean);
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
			setState(240);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); ((ValorContext)_localctx).i = match(INT);
				((ValorContext)_localctx).result =  new Valor(Integer.parseInt((((ValorContext)_localctx).i!=null?((ValorContext)_localctx).i.getText():null)));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); ((ValorContext)_localctx).s = match(STRING);
				((ValorContext)_localctx).result =  new Valor((((ValorContext)_localctx).s!=null?((ValorContext)_localctx).s.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); ((ValorContext)_localctx).f = match(FLOAT);
				((ValorContext)_localctx).result =  new Valor(Float.parseFloat((((ValorContext)_localctx).f!=null?((ValorContext)_localctx).f.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(238); ((ValorContext)_localctx).b = match(BOOLEAN);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13"+
		"\16\13\u0084\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f"+
		"\13\f\5\f\u0091\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\6\16\u00a0\n\16\r\16\16\16\u00a1\3\16\3\16\3\16\3\16\6\16\u00a8"+
		"\n\16\r\16\16\16\u00a9\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\6\17\u00b6\n\17\r\17\16\17\u00b7\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d5\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00df\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00e9\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00f3\n\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2"+
		"\u0101\2*\3\2\2\2\4-\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fT\3\2\2"+
		"\2\16j\3\2\2\2\20l\3\2\2\2\22t\3\2\2\2\24z\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u0099\3\2\2\2\34\u00af\3\2\2\2\36\u00c0\3\2\2\2 \u00c2"+
		"\3\2\2\2\"\u00d4\3\2\2\2$\u00de\3\2\2\2&\u00e8\3\2\2\2(\u00f2\3\2\2\2"+
		"*+\5\4\3\2+\3\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2"+
		"\2\2\60\64\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\5&\24\289\7\37\2\29"+
		":\7\21\2\2:;\3\2\2\2;<\b\4\1\2<F\3\2\2\2=>\5&\24\2>?\7\37\2\2?@\7\n\2"+
		"\2@A\5\36\20\2AB\7\21\2\2BC\3\2\2\2CD\b\4\1\2DF\3\2\2\2E\67\3\2\2\2E="+
		"\3\2\2\2F\7\3\2\2\2GO\5\32\16\2HO\5\30\r\2IO\5\34\17\2JO\5\20\t\2KO\5"+
		"\22\n\2LO\5\f\7\2MO\5\16\b\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2N"+
		"K\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\5$\23\2QR\5\36\20\2RS\b\6\1"+
		"\2S\13\3\2\2\2TX\5\36\20\2UV\5\n\6\2VW\b\7\1\2WY\3\2\2\2XU\3\2\2\2YZ\3"+
		"\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\21\2\2]^\b\7\1\2^\r\3\2\2\2"+
		"_`\7\37\2\2`a\7\n\2\2ab\5\36\20\2bc\7\21\2\2cd\b\b\1\2dk\3\2\2\2ef\7\37"+
		"\2\2fg\7\n\2\2gh\5\f\7\2hi\b\b\1\2ik\3\2\2\2j_\3\2\2\2je\3\2\2\2k\17\3"+
		"\2\2\2lm\7!\2\2mn\7\22\2\2no\5\24\13\2op\7\23\2\2pq\7\24\2\2qr\5\4\3\2"+
		"rs\7\25\2\2s\21\3\2\2\2tu\7\"\2\2uv\7\22\2\2vw\5\26\f\2wx\7\23\2\2xy\7"+
		"\21\2\2y\23\3\2\2\2z{\5&\24\2{\u0082\7\37\2\2|}\7#\2\2}~\5&\24\2~\177"+
		"\7\37\2\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\36\20\2\u0086\u008d\b\f\1\2\u0087\u0088\7#\2\2\u0088\u0089\5"+
		"\36\20\2\u0089\u008a\b\f\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\27\3\2\2\2\u0092\u0093\7\36\2\2\u0093\u0094\7\22\2\2\u0094\u0095\5\36"+
		"\20\2\u0095\u0096\7\23\2\2\u0096\u0097\7\21\2\2\u0097\u0098\b\r\1\2\u0098"+
		"\31\3\2\2\2\u0099\u009a\7\33\2\2\u009a\u009b\7\22\2\2\u009b\u009c\5 \21"+
		"\2\u009c\u009d\7\23\2\2\u009d\u009f\7\24\2\2\u009e\u00a0\5\b\5\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ad\7\25\2\2\u00a4\u00a5\7\34\2\2\u00a5"+
		"\u00a7\7\24\2\2\u00a6\u00a8\5\b\5\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7\25\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\7\22\2\2\u00b1"+
		"\u00b2\5 \21\2\u00b2\u00b3\7\23\2\2\u00b3\u00b5\7\24\2\2\u00b4\u00b6\5"+
		"\b\5\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\25\2\2\u00ba\35\3\2\2"+
		"\2\u00bb\u00bc\7\37\2\2\u00bc\u00c1\b\20\1\2\u00bd\u00be\5(\25\2\u00be"+
		"\u00bf\b\20\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bd\3"+
		"\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4\5\"\22\2\u00c4"+
		"\u00c5\5(\25\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\21\1\2\u00c7!\3\2\2\2"+
		"\u00c8\u00c9\7\13\2\2\u00c9\u00d5\b\22\1\2\u00ca\u00cb\7\16\2\2\u00cb"+
		"\u00d5\b\22\1\2\u00cc\u00cd\7\17\2\2\u00cd\u00d5\b\22\1\2\u00ce\u00cf"+
		"\7\20\2\2\u00cf\u00d5\b\22\1\2\u00d0\u00d1\7\f\2\2\u00d1\u00d5\b\22\1"+
		"\2\u00d2\u00d3\7\r\2\2\u00d3\u00d5\b\22\1\2\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d0\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5#\3\2\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00df"+
		"\b\23\1\2\u00d8\u00d9\7\27\2\2\u00d9\u00df\b\23\1\2\u00da\u00db\7\30\2"+
		"\2\u00db\u00df\b\23\1\2\u00dc\u00dd\7\31\2\2\u00dd\u00df\b\23\1\2\u00de"+
		"\u00d6\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df%\3\2\2\2\u00e0\u00e1\7\3\2\2\u00e1\u00e9\b\24\1\2\u00e2\u00e3"+
		"\7\4\2\2\u00e3\u00e9\b\24\1\2\u00e4\u00e5\7\5\2\2\u00e5\u00e9\b\24\1\2"+
		"\u00e6\u00e7\7\6\2\2\u00e7\u00e9\b\24\1\2\u00e8\u00e0\3\2\2\2\u00e8\u00e2"+
		"\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\'\3\2\2\2\u00ea"+
		"\u00eb\7\7\2\2\u00eb\u00f3\b\25\1\2\u00ec\u00ed\7 \2\2\u00ed\u00f3\b\25"+
		"\1\2\u00ee\u00ef\7\b\2\2\u00ef\u00f3\b\25\1\2\u00f0\u00f1\7\t\2\2\u00f1"+
		"\u00f3\b\25\1\2\u00f2\u00ea\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f3)\3\2\2\2\24/\64ENZj\u0082\u008d\u0090"+
		"\u00a1\u00a9\u00ad\u00b7\u00c0\u00d4\u00de\u00e8\u00f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}