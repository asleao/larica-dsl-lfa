// Generated from /home/aleao/Projetos/larica-dsl-lfa/LaricaDoSurf/src/grammar/LaricaDoSurf.g4 by ANTLR 4.1

package antlr;

import ast.Tipagem;
import ast.Valor;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaricaDoSurfLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TipoInteger=1, TipoString=2, TipoFloat=3, TipoBoolean=4, INT=5, FLOAT=6, 
		BOOLEAN=7, ATRIBUICAO=8, IGUAL=9, MENORIGUAL=10, MAIORIGUAL=11, DIFERENTE=12, 
		MAIOR=13, MENOR=14, TERMINAL=15, LPAR=16, RPAR=17, LCOL=18, RCOL=19, SOMA=20, 
		SUB=21, DIV=22, MULT=23, ASP=24, IF=25, ELSE=26, WHILE=27, PRINT=28, VARIAVEL=29, 
		STRING=30, DEF_FUNCAO=31, NOME_FUNCAO=32, VIRGULA=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Integer'", "'String'", "'Float'", "'Boolean'", "INT", "FLOAT", "BOOLEAN", 
		"'larica'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "';'", "'('", 
		"')'", "'['", "']'", "'+'", "'-'", "'\\'", "'*'", "'\"'", "'dropa'", "'vaca'", 
		"'caldo'", "'aloha'", "VARIAVEL", "STRING", "DEF_FUNCAO", "NOME_FUNCAO", 
		"','", "WS"
	};
	public static final String[] ruleNames = {
		"TipoInteger", "TipoString", "TipoFloat", "TipoBoolean", "NUMERO", "LETRAS", 
		"CARACTERES", "INT", "FLOAT", "BOOLEAN", "ATRIBUICAO", "IGUAL", "MENORIGUAL", 
		"MAIORIGUAL", "DIFERENTE", "MAIOR", "MENOR", "TERMINAL", "LPAR", "RPAR", 
		"LCOL", "RCOL", "SOMA", "SUB", "DIV", "MULT", "ASP", "IF", "ELSE", "WHILE", 
		"PRINT", "VARIAVEL", "STRING", "DEF_FUNCAO", "NOME_FUNCAO", "VIRGULA", 
		"WS"
	};


	public LaricaDoSurfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaricaDoSurf.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2$\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\tr\n\t\r\t\16\ts\3\n\6\nw\n"+
		"\n\r\n\16\nx\3\n\3\n\6\n}\n\n\r\n\16\n~\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\6!\u00cf"+
		"\n!\r!\16!\u00d0\3!\6!\u00d4\n!\r!\16!\u00d5\5!\u00d8\n!\3\"\3\"\6\"\u00dc"+
		"\n\"\r\"\16\"\u00dd\3\"\3\"\3#\3#\3#\3#\3#\3#\6#\u00e8\n#\r#\16#\u00e9"+
		"\3$\3$\3$\3$\3$\3$\3$\6$\u00f3\n$\r$\16$\u00f4\3%\3%\3&\6&\u00fa\n&\r"+
		"&\16&\u00fb\3&\3&\2\'\3\3\1\5\4\1\7\5\1\t\6\1\13\2\1\r\2\1\17\2\1\21\7"+
		"\1\23\b\1\25\t\1\27\n\1\31\13\1\33\f\1\35\r\1\37\16\1!\17\1#\20\1%\21"+
		"\1\'\22\1)\23\1+\24\1-\25\1/\26\1\61\27\1\63\30\1\65\31\1\67\32\19\33"+
		"\1;\34\1=\35\1?\36\1A\37\1C \1E!\1G\"\1I#\1K$\2\3\2\6\3\2\62;\4\2C\\c"+
		"|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5U\3\2\2\2\7\\\3\2\2\2\tb\3\2"+
		"\2\2\13j\3\2\2\2\rl\3\2\2\2\17n\3\2\2\2\21q\3\2\2\2\23v\3\2\2\2\25\u0089"+
		"\3\2\2\2\27\u008b\3\2\2\2\31\u0092\3\2\2\2\33\u0095\3\2\2\2\35\u0098\3"+
		"\2\2\2\37\u009b\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'"+
		"\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2"+
		"\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2"+
		"\29\u00b6\3\2\2\2;\u00bc\3\2\2\2=\u00c1\3\2\2\2?\u00c7\3\2\2\2A\u00ce"+
		"\3\2\2\2C\u00d9\3\2\2\2E\u00e1\3\2\2\2G\u00eb\3\2\2\2I\u00f6\3\2\2\2K"+
		"\u00f9\3\2\2\2MN\7K\2\2NO\7p\2\2OP\7v\2\2PQ\7g\2\2QR\7i\2\2RS\7g\2\2S"+
		"T\7t\2\2T\4\3\2\2\2UV\7U\2\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7i"+
		"\2\2[\6\3\2\2\2\\]\7H\2\2]^\7n\2\2^_\7q\2\2_`\7c\2\2`a\7v\2\2a\b\3\2\2"+
		"\2bc\7D\2\2cd\7q\2\2de\7q\2\2ef\7n\2\2fg\7g\2\2gh\7c\2\2hi\7p\2\2i\n\3"+
		"\2\2\2jk\t\2\2\2k\f\3\2\2\2lm\t\3\2\2m\16\3\2\2\2no\t\4\2\2o\20\3\2\2"+
		"\2pr\5\13\6\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\22\3\2\2\2uw\5"+
		"\13\6\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\13\2\2\2{"+
		"}\5\13\6\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\24\3\2\2\2\u0080"+
		"\u0081\7V\2\2\u0081\u0082\7t\2\2\u0082\u0083\7w\2\2\u0083\u008a\7g\2\2"+
		"\u0084\u0085\7H\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u008a\7g\2\2\u0089\u0080\3\2\2\2\u0089\u0084\3\2\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\7n\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7e\2\2\u0090\u0091\7c\2\2\u0091\30\3\2\2\2\u0092"+
		"\u0093\7?\2\2\u0093\u0094\7?\2\2\u0094\32\3\2\2\2\u0095\u0096\7>\2\2\u0096"+
		"\u0097\7?\2\2\u0097\34\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a"+
		"\36\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7?\2\2\u009d \3\2\2\2\u009e"+
		"\u009f\7@\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1$\3\2\2\2\u00a2"+
		"\u00a3\7=\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5(\3\2\2\2\u00a6\u00a7"+
		"\7+\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7"+
		"_\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7"+
		"/\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7^\2\2\u00b1\64\3\2\2\2\u00b2\u00b3"+
		"\7,\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7$\2\2\u00b58\3\2\2\2\u00b6\u00b7"+
		"\7f\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7r\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6>\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7q\2"+
		"\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7c\2\2\u00cc@\3\2\2\2\u00cd\u00cf\5"+
		"\r\7\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d4\5\13\6\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8B\3\2\2\2"+
		"\u00d9\u00db\5\67\34\2\u00da\u00dc\5\17\b\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\5\67\34\2\u00e0D\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e8\5\17\b\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7\"\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00f3\5\17\b\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5H\3\2\2\2\u00f6\u00f7"+
		"\7.\2\2\u00f7J\3\2\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\b&\2\2\u00feL\3\2\2\2\16\2sx~\u0089\u00d0\u00d5\u00d7\u00dd\u00e9"+
		"\u00f4\u00fb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}