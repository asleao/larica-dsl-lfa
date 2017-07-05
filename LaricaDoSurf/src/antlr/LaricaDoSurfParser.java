// Generated from /home/ana/Documentos/LFA/larica-dsl-lfa/LaricaDoSurf/src/grammar/LaricaDoSurf.g4 by ANTLR 4.1

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
		STRING=30, DEF_FUNCAO=31, CHAMADA_FUNCAO=32, NOME_FUNCAO=33, VIRGULA=34, 
		WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'Integer'", "'String'", "'Float'", "'Boolean'", "INT", "FLOAT", 
		"BOOLEAN", "'larica'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "';'", 
		"'('", "')'", "'['", "']'", "'+'", "'-'", "'/'", "'*'", "'\"'", "'dropa'", 
		"'vaca'", "'caldo'", "'aloha'", "VARIAVEL", "STRING", "'def '", "'call '", 
		"NOME_FUNCAO", "','", "WS"
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
		public DefinicaoContext d;
		public ExpressaoContext e;
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

		           ArrayList<Definicao> def = new ArrayList<>();
		           ArrayList<Expr> exp = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); ((BlocoContext)_localctx).d = definicao();
				def.add(((BlocoContext)_localctx).d.result);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0) );
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0)) {
				{
				{
				setState(51); ((BlocoContext)_localctx).e = expressao();
				exp.add(((BlocoContext)_localctx).e.result);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((BlocoContext)_localctx).result =  new Bloco(def,exp);
			}
		}
		catch (RecognitionException re) {
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
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(61); ((DefinicaoContext)_localctx).t = tipagem();
				setState(62); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(63); match(TERMINAL);
				}
				((DefinicaoContext)_localctx).result =  new Definicao(((DefinicaoContext)_localctx).t.result,(((DefinicaoContext)_localctx).var!=null?((DefinicaoContext)_localctx).var.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(67); ((DefinicaoContext)_localctx).t = tipagem();
				setState(68); ((DefinicaoContext)_localctx).var = match(VARIAVEL);
				setState(69); match(ATRIBUICAO);
				setState(70); ((DefinicaoContext)_localctx).value = ((DefinicaoContext)_localctx).id = id();
				setState(71); match(TERMINAL);
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
		public Estrutura_repeticaoContext er;
		public Definicao_funcaoContext d;
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); expressao_condicional();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); ((ExpressaoContext)_localctx).p = funcao_print();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).p.result;
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((ExpressaoContext)_localctx).er = estrutura_repeticao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).er.result;
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); ((ExpressaoContext)_localctx).d = definicao_funcao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).d.result;
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); ((ExpressaoContext)_localctx).c = chamada_funcao();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).c.result;
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90); ((ExpressaoContext)_localctx).e = expressao_simples();
				((ExpressaoContext)_localctx).result =  ((ExpressaoContext)_localctx).e.result;
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93); ((ExpressaoContext)_localctx).a = atribuicao_valor();
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
			setState(98); ((OperacoesContext)_localctx).op = operador();
			setState(99); ((OperacoesContext)_localctx).v = id();
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
			setState(102); ((Expressao_simplesContext)_localctx).i = id();
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103); ((Expressao_simplesContext)_localctx).op = operacoes();
				sttList.add(((Expressao_simplesContext)_localctx).op.result);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOMA) | (1L << SUB) | (1L << DIV) | (1L << MULT))) != 0) );
			setState(110); match(TERMINAL);
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(114); match(ATRIBUICAO);
				setState(115); ((Atribuicao_valorContext)_localctx).val = id();
				setState(116); match(TERMINAL);
				((Atribuicao_valorContext)_localctx).result =  new AtribuicaoValor((((Atribuicao_valorContext)_localctx).var!=null?((Atribuicao_valorContext)_localctx).var.getText():null),((Atribuicao_valorContext)_localctx).val.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); ((Atribuicao_valorContext)_localctx).var = match(VARIAVEL);
				setState(120); match(ATRIBUICAO);
				setState(121); ((Atribuicao_valorContext)_localctx).exp = expressao_simples();
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
		public DefFunc result;
		public Token n;
		public Parametros_formalContext p;
		public BlocoContext b;
		public TerminalNode RCOL() { return getToken(LaricaDoSurfParser.RCOL, 0); }
		public TerminalNode NOME_FUNCAO() { return getToken(LaricaDoSurfParser.NOME_FUNCAO, 0); }
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
			setState(126); match(DEF_FUNCAO);
			setState(127); ((Definicao_funcaoContext)_localctx).n = match(NOME_FUNCAO);
			setState(128); match(LPAR);
			setState(129); ((Definicao_funcaoContext)_localctx).p = parametros_formal();
			setState(130); match(RPAR);
			setState(131); match(LCOL);
			setState(132); ((Definicao_funcaoContext)_localctx).b = bloco();
			setState(133); match(RCOL);
			((Definicao_funcaoContext)_localctx).result =  new DefFunc((((Definicao_funcaoContext)_localctx).n!=null?((Definicao_funcaoContext)_localctx).n.getText():null), ((Definicao_funcaoContext)_localctx).p.args, ((Definicao_funcaoContext)_localctx).b.result);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CHAMADA_FUNCAO() { return getToken(LaricaDoSurfParser.CHAMADA_FUNCAO, 0); }
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
			setState(136); match(CHAMADA_FUNCAO);
			setState(137); ((Chamada_funcaoContext)_localctx).n = match(NOME_FUNCAO);
			setState(138); match(LPAR);
			setState(139); ((Chamada_funcaoContext)_localctx).p = parametros_real();
			setState(140); match(RPAR);
			setState(141); match(TERMINAL);
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
			setState(144); ((Parametro_funcaoContext)_localctx).t = tipagem();
			setState(145); ((Parametro_funcaoContext)_localctx).var = match(VARIAVEL);
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
			setState(159);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TipoInteger) | (1L << TipoString) | (1L << TipoFloat) | (1L << TipoBoolean))) != 0)) {
				{
				setState(148); ((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
				_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(150); match(VIRGULA);
					setState(151); ((Parametros_formalContext)_localctx).parametro_funcao = parametro_funcao();
					_localctx.args.add(((Parametros_formalContext)_localctx).parametro_funcao.result);
					}
					}
					setState(158);
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
			setState(172);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << VARIAVEL) | (1L << STRING))) != 0)) {
				{
				setState(161); ((Parametros_realContext)_localctx).id = id();
				_localctx.args.add(((Parametros_realContext)_localctx).id.result);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(163); match(VIRGULA);
					setState(164); ((Parametros_realContext)_localctx).id = id();
					_localctx.args.add(((Parametros_realContext)_localctx).id.result);
					}
					}
					setState(171);
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
			setState(174); match(PRINT);
			setState(175); match(LPAR);
			setState(176); ((Funcao_printContext)_localctx).i = id();
			setState(177); match(RPAR);
			setState(178); match(TERMINAL);
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
		public If result;
		public CondicaoContext c;
		public ExpressaoContext i;
		public ExpressaoContext e;
		public List<TerminalNode> RCOL() { return getTokens(LaricaDoSurfParser.RCOL); }
		public TerminalNode ELSE() { return getToken(LaricaDoSurfParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(LaricaDoSurfParser.IF, 0); }
		public TerminalNode RCOL(int i) {
			return getToken(LaricaDoSurfParser.RCOL, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
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

		           ArrayList<Expr> If = new ArrayList<>();
		           ArrayList<Expr> Else = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(IF);
			setState(182); match(LPAR);
			setState(183); ((Expressao_condicionalContext)_localctx).c = condicao();
			setState(184); match(RPAR);
			setState(185); match(LCOL);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186); ((Expressao_condicionalContext)_localctx).i = expressao();
				If.add(((Expressao_condicionalContext)_localctx).i.result);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
			setState(193); match(RCOL);
			setState(205);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(194); match(ELSE);
				setState(195); match(LCOL);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(196); ((Expressao_condicionalContext)_localctx).e = expressao();
					Else.add(((Expressao_condicionalContext)_localctx).e.result);
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
				setState(203); match(RCOL);
				}
			}

			((Expressao_condicionalContext)_localctx).result =  new If(((Expressao_condicionalContext)_localctx).c.result, If, Else);
			}
		}
		catch (RecognitionException re) {
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
		public While result;
		public CondicaoContext c;
		public ExpressaoContext e;
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

		           ArrayList<Expr> expr = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(WHILE);
			setState(210); match(LPAR);
			setState(211); ((Estrutura_repeticaoContext)_localctx).c = condicao();
			setState(212); match(RPAR);
			setState(213); match(LCOL);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214); ((Estrutura_repeticaoContext)_localctx).e = expressao();
				expr.add(((Estrutura_repeticaoContext)_localctx).e.result);
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << VARIAVEL) | (1L << STRING) | (1L << DEF_FUNCAO) | (1L << CHAMADA_FUNCAO))) != 0) );
			setState(221); match(RCOL);
			((Estrutura_repeticaoContext)_localctx).result =  new While(((Estrutura_repeticaoContext)_localctx).c.result, expr);
			}
		}
		catch (RecognitionException re) {
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
			setState(229);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); ((IdContext)_localctx).VARIAVEL = match(VARIAVEL);
				((IdContext)_localctx).result = new Id ((((IdContext)_localctx).VARIAVEL!=null?((IdContext)_localctx).VARIAVEL.getText():null));
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); ((IdContext)_localctx).valor = valor();
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
			setState(231); ((CondicaoContext)_localctx).var = match(VARIAVEL);
			setState(232); ((CondicaoContext)_localctx).opc = operadorcomparacao();
			setState(233); ((CondicaoContext)_localctx).val = valor();
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
			setState(249);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); ((OperadorcomparacaoContext)_localctx).i = match(IGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).i!=null?((OperadorcomparacaoContext)_localctx).i.getText():null));
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); ((OperadorcomparacaoContext)_localctx).d = match(DIFERENTE);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).d!=null?((OperadorcomparacaoContext)_localctx).d.getText():null));
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(241); ((OperadorcomparacaoContext)_localctx).maior = match(MAIOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).maior!=null?((OperadorcomparacaoContext)_localctx).maior.getText():null));
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(243); ((OperadorcomparacaoContext)_localctx).menor = match(MENOR);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menor!=null?((OperadorcomparacaoContext)_localctx).menor.getText():null));
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(245); ((OperadorcomparacaoContext)_localctx).menorIgual = match(MENORIGUAL);
				((OperadorcomparacaoContext)_localctx).result =  new OperadorComparacao((((OperadorcomparacaoContext)_localctx).menorIgual!=null?((OperadorcomparacaoContext)_localctx).menorIgual.getText():null));
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(247); ((OperadorcomparacaoContext)_localctx).maiorIgual = match(MAIORIGUAL);
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
			setState(259);
			switch (_input.LA(1)) {
			case SOMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); ((OperadorContext)_localctx).s = match(SOMA);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).s!=null?((OperadorContext)_localctx).s.getText():null));
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); ((OperadorContext)_localctx).sub = match(SUB);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).sub!=null?((OperadorContext)_localctx).sub.getText():null));
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); ((OperadorContext)_localctx).d = match(DIV);
				((OperadorContext)_localctx).result =  new Operador((((OperadorContext)_localctx).d!=null?((OperadorContext)_localctx).d.getText():null));
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(257); ((OperadorContext)_localctx).m = match(MULT);
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
			setState(269);
			switch (_input.LA(1)) {
			case TipoInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); ((TipagemContext)_localctx).tipo_integer = match(TipoInteger);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_integer!=null?((TipagemContext)_localctx).tipo_integer.getText():null));
				}
				break;
			case TipoString:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); ((TipagemContext)_localctx).tipo_string = match(TipoString);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_string!=null?((TipagemContext)_localctx).tipo_string.getText():null));
				}
				break;
			case TipoFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); ((TipagemContext)_localctx).tipo_float = match(TipoFloat);
				((TipagemContext)_localctx).result =  new Tipagem((((TipagemContext)_localctx).tipo_float!=null?((TipagemContext)_localctx).tipo_float.getText():null));
				}
				break;
			case TipoBoolean:
				enterOuterAlt(_localctx, 4);
				{
				setState(267); ((TipagemContext)_localctx).tipo_boolean = match(TipoBoolean);
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
			setState(279);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); ((ValorContext)_localctx).i = match(INT);
				((ValorContext)_localctx).result =  new Valor(Integer.parseInt((((ValorContext)_localctx).i!=null?((ValorContext)_localctx).i.getText():null)));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); ((ValorContext)_localctx).s = match(STRING);
				((ValorContext)_localctx).result =  new Valor((((ValorContext)_localctx).s!=null?((ValorContext)_localctx).s.getText():null));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); ((ValorContext)_localctx).f = match(FLOAT);
				((ValorContext)_localctx).result =  new Valor(Float.parseFloat((((ValorContext)_localctx).f!=null?((ValorContext)_localctx).f.getText():null)));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(277); ((ValorContext)_localctx).b = match(BOOLEAN);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3%\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\6\3\62\n"+
		"\3\r\3\16\3\63\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7m\n\7\r\7\16\7n\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\5\f\u00a2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\5\r\u00af"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\6\17\u00c0\n\17\r\17\16\17\u00c1\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\6\17\u00ca\n\17\r\17\16\17\u00cb\3\17\3\17\5\17\u00d0\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00dc\n\20\r\20\16\20"+
		"\u00dd\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00fc\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0106\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0110\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\26\2\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\u0128\2,\3\2\2\2\4"+
		"\61\3\2\2\2\6M\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fh\3\2\2\2\16~\3\2\2\2\20"+
		"\u0080\3\2\2\2\22\u008a\3\2\2\2\24\u0092\3\2\2\2\26\u00a1\3\2\2\2\30\u00ae"+
		"\3\2\2\2\32\u00b0\3\2\2\2\34\u00b7\3\2\2\2\36\u00d3\3\2\2\2 \u00e7\3\2"+
		"\2\2\"\u00e9\3\2\2\2$\u00fb\3\2\2\2&\u0105\3\2\2\2(\u010f\3\2\2\2*\u0119"+
		"\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\5\6\4\2/\60\b\3\1\2\60\62\3\2\2\2\61."+
		"\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64:\3\2\2\2\65\66\5"+
		"\b\5\2\66\67\b\3\1\2\679\3\2\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<:\3\2\2\2=>\b\3\1\2>\5\3\2\2\2?@\5(\25\2@A\7\37\2\2AB\7"+
		"\21\2\2BC\3\2\2\2CD\b\4\1\2DN\3\2\2\2EF\5(\25\2FG\7\37\2\2GH\7\n\2\2H"+
		"I\5 \21\2IJ\7\21\2\2JK\3\2\2\2KL\b\4\1\2LN\3\2\2\2M?\3\2\2\2ME\3\2\2\2"+
		"N\7\3\2\2\2Oc\5\34\17\2PQ\5\32\16\2QR\b\5\1\2Rc\3\2\2\2ST\5\36\20\2TU"+
		"\b\5\1\2Uc\3\2\2\2VW\5\20\t\2WX\b\5\1\2Xc\3\2\2\2YZ\5\22\n\2Z[\b\5\1\2"+
		"[c\3\2\2\2\\]\5\f\7\2]^\b\5\1\2^c\3\2\2\2_`\5\16\b\2`a\b\5\1\2ac\3\2\2"+
		"\2bO\3\2\2\2bP\3\2\2\2bS\3\2\2\2bV\3\2\2\2bY\3\2\2\2b\\\3\2\2\2b_\3\2"+
		"\2\2c\t\3\2\2\2de\5&\24\2ef\5 \21\2fg\b\6\1\2g\13\3\2\2\2hl\5 \21\2ij"+
		"\5\n\6\2jk\b\7\1\2km\3\2\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o"+
		"p\3\2\2\2pq\7\21\2\2qr\b\7\1\2r\r\3\2\2\2st\7\37\2\2tu\7\n\2\2uv\5 \21"+
		"\2vw\7\21\2\2wx\b\b\1\2x\177\3\2\2\2yz\7\37\2\2z{\7\n\2\2{|\5\f\7\2|}"+
		"\b\b\1\2}\177\3\2\2\2~s\3\2\2\2~y\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7"+
		"!\2\2\u0081\u0082\7#\2\2\u0082\u0083\7\22\2\2\u0083\u0084\5\26\f\2\u0084"+
		"\u0085\7\23\2\2\u0085\u0086\7\24\2\2\u0086\u0087\5\4\3\2\u0087\u0088\7"+
		"\25\2\2\u0088\u0089\b\t\1\2\u0089\21\3\2\2\2\u008a\u008b\7\"\2\2\u008b"+
		"\u008c\7#\2\2\u008c\u008d\7\22\2\2\u008d\u008e\5\30\r\2\u008e\u008f\7"+
		"\23\2\2\u008f\u0090\7\21\2\2\u0090\u0091\b\n\1\2\u0091\23\3\2\2\2\u0092"+
		"\u0093\5(\25\2\u0093\u0094\7\37\2\2\u0094\u0095\b\13\1\2\u0095\25\3\2"+
		"\2\2\u0096\u0097\5\24\13\2\u0097\u009e\b\f\1\2\u0098\u0099\7$\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009b\b\f\1\2\u009b\u009d\3\2\2\2\u009c\u0098\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00ab\b\r\1\2\u00a5\u00a6"+
		"\7$\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\b\r\1\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b2\7\22"+
		"\2\2\u00b2\u00b3\5 \21\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\7\21\2\2\u00b5"+
		"\u00b6\b\16\1\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00b9\7\22"+
		"\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\7\23\2\2\u00bb\u00bf\7\24\2\2\u00bc"+
		"\u00bd\5\b\5\2\u00bd\u00be\b\17\1\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00cf\7\25\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c9\7"+
		"\24\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\b\17\1\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00c4\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\17"+
		"\1\2\u00d2\35\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\7\22\2\2\u00d5"+
		"\u00d6\5\"\22\2\u00d6\u00d7\7\23\2\2\u00d7\u00db\7\24\2\2\u00d8\u00d9"+
		"\5\b\5\2\u00d9\u00da\b\20\1\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\b\20\1\2\u00e1\37\3\2\2\2\u00e2"+
		"\u00e3\7\37\2\2\u00e3\u00e8\b\21\1\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\b"+
		"\21\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"!\3\2\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\5*\26\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\22\1\2\u00ee#\3\2\2\2\u00ef\u00f0\7"+
		"\13\2\2\u00f0\u00fc\b\23\1\2\u00f1\u00f2\7\16\2\2\u00f2\u00fc\b\23\1\2"+
		"\u00f3\u00f4\7\17\2\2\u00f4\u00fc\b\23\1\2\u00f5\u00f6\7\20\2\2\u00f6"+
		"\u00fc\b\23\1\2\u00f7\u00f8\7\f\2\2\u00f8\u00fc\b\23\1\2\u00f9\u00fa\7"+
		"\r\2\2\u00fa\u00fc\b\23\1\2\u00fb\u00ef\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc%\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u0106\b\24\1\2\u00ff\u0100"+
		"\7\27\2\2\u0100\u0106\b\24\1\2\u0101\u0102\7\30\2\2\u0102\u0106\b\24\1"+
		"\2\u0103\u0104\7\31\2\2\u0104\u0106\b\24\1\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u00ff\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u0106\'\3\2\2\2"+
		"\u0107\u0108\7\3\2\2\u0108\u0110\b\25\1\2\u0109\u010a\7\4\2\2\u010a\u0110"+
		"\b\25\1\2\u010b\u010c\7\5\2\2\u010c\u0110\b\25\1\2\u010d\u010e\7\6\2\2"+
		"\u010e\u0110\b\25\1\2\u010f\u0107\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010b"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110)\3\2\2\2\u0111\u0112\7\7\2\2\u0112"+
		"\u011a\b\26\1\2\u0113\u0114\7 \2\2\u0114\u011a\b\26\1\2\u0115\u0116\7"+
		"\b\2\2\u0116\u011a\b\26\1\2\u0117\u0118\7\t\2\2\u0118\u011a\b\26\1\2\u0119"+
		"\u0111\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a+\3\2\2\2\25\63:Mbn~\u009e\u00a1\u00ab\u00ae\u00c1\u00cb\u00cf"+
		"\u00dd\u00e7\u00fb\u0105\u010f\u0119";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}