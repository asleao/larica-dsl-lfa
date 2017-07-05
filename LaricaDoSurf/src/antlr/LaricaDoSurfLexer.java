// Generated from /home/ana/Documentos/LFA/larica-dsl-lfa/LaricaDoSurf/src/grammar/LaricaDoSurf.g4 by ANTLR 4.1

package antlr;

import java.util.LinkedList;
import ast.*;

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
		STRING=30, DEF_FUNCAO=31, CHAMADA_FUNCAO=32, NOME_FUNCAO=33, VIRGULA=34, 
		WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'Integer'", "'String'", "'Float'", "'Boolean'", "INT", "FLOAT", "BOOLEAN", 
		"'larica'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "';'", "'('", 
		"')'", "'['", "']'", "'+'", "'-'", "'/'", "'*'", "'\"'", "'dropa'", "'vaca'", 
		"'caldo'", "'aloha'", "VARIAVEL", "STRING", "'def '", "'call '", "NOME_FUNCAO", 
		"','", "WS"
	};
	public static final String[] ruleNames = {
		"TipoInteger", "TipoString", "TipoFloat", "TipoBoolean", "NUMERO", "LETRAS", 
		"CARACTERES", "INT", "FLOAT", "BOOLEAN", "ATRIBUICAO", "IGUAL", "MENORIGUAL", 
		"MAIORIGUAL", "DIFERENTE", "MAIOR", "MENOR", "TERMINAL", "LPAR", "RPAR", 
		"LCOL", "RCOL", "SOMA", "SUB", "DIV", "MULT", "ASP", "IF", "ELSE", "WHILE", 
		"PRINT", "VARIAVEL", "STRING", "DEF_FUNCAO", "CHAMADA_FUNCAO", "NOME_FUNCAO", 
		"VIRGULA", "WS"
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
		case 37: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\tt\n\t\r\t\16\tu\3"+
		"\n\6\ny\n\n\r\n\16\nz\3\n\3\n\6\n\177\n\n\r\n\16\n\u0080\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\6!\u00d1\n!\r!\16!\u00d2\3!\6!\u00d6\n!\r!\16!\u00d7\5!\u00da"+
		"\n!\3\"\3\"\6\"\u00de\n\"\r\"\16\"\u00df\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\6%\u00f1\n%\r%\16%\u00f2\3%\3%\3&\3&\3\'\6\'\u00fa"+
		"\n\'\r\'\16\'\u00fb\3\'\3\'\2(\3\3\1\5\4\1\7\5\1\t\6\1\13\2\1\r\2\1\17"+
		"\2\1\21\7\1\23\b\1\25\t\1\27\n\1\31\13\1\33\f\1\35\r\1\37\16\1!\17\1#"+
		"\20\1%\21\1\'\22\1)\23\1+\24\1-\25\1/\26\1\61\27\1\63\30\1\65\31\1\67"+
		"\32\19\33\1;\34\1=\35\1?\36\1A\37\1C \1E!\1G\"\1I#\1K$\1M%\2\3\2\6\3\2"+
		"\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0105\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5W\3\2"+
		"\2\2\7^\3\2\2\2\td\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21s\3\2"+
		"\2\2\23x\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u0094\3\2\2\2\33"+
		"\u0097\3\2\2\2\35\u009a\3\2\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a2"+
		"\3\2\2\2%\u00a4\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2"+
		"-\u00ac\3\2\2\2/\u00ae\3\2\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4"+
		"\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00be\3\2\2\2=\u00c3\3\2\2\2"+
		"?\u00c9\3\2\2\2A\u00d0\3\2\2\2C\u00db\3\2\2\2E\u00e3\3\2\2\2G\u00e8\3"+
		"\2\2\2I\u00ee\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2\2\2OP\7K\2\2PQ\7p\2\2"+
		"QR\7v\2\2RS\7g\2\2ST\7i\2\2TU\7g\2\2UV\7t\2\2V\4\3\2\2\2WX\7U\2\2XY\7"+
		"v\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7i\2\2]\6\3\2\2\2^_\7H\2\2_`\7n\2"+
		"\2`a\7q\2\2ab\7c\2\2bc\7v\2\2c\b\3\2\2\2de\7D\2\2ef\7q\2\2fg\7q\2\2gh"+
		"\7n\2\2hi\7g\2\2ij\7c\2\2jk\7p\2\2k\n\3\2\2\2lm\t\2\2\2m\f\3\2\2\2no\t"+
		"\3\2\2o\16\3\2\2\2pq\t\4\2\2q\20\3\2\2\2rt\5\13\6\2sr\3\2\2\2tu\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\22\3\2\2\2wy\5\13\6\2xw\3\2\2\2yz\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2|~\13\2\2\2}\177\5\13\6\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\24\3\2\2\2\u0082\u0083"+
		"\7V\2\2\u0083\u0084\7t\2\2\u0084\u0085\7w\2\2\u0085\u008c\7g\2\2\u0086"+
		"\u0087\7H\2\2\u0087\u0088\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008c\7g\2\2\u008b\u0082\3\2\2\2\u008b\u0086\3\2\2\2\u008c\26\3"+
		"\2\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093\30\3\2\2\2\u0094"+
		"\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096\32\3\2\2\2\u0097\u0098\7>\2\2\u0098"+
		"\u0099\7?\2\2\u0099\34\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\7?\2\2\u009f \3\2\2\2\u00a0"+
		"\u00a1\7@\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3$\3\2\2\2\u00a4"+
		"\u00a5\7=\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7(\3\2\2\2\u00a8\u00a9"+
		"\7+\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7"+
		"_\2\2\u00ad.\3\2\2\2\u00ae\u00af\7-\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7"+
		"/\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\64\3\2\2\2\u00b4\u00b5"+
		"\7,\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7$\2\2\u00b78\3\2\2\2\u00b8\u00b9"+
		"\7f\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7c\2\2\u00bd:\3\2\2\2\u00be\u00bf\7x\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7e\2\2\u00c1\u00c2\7c\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2"+
		"\u00c8>\3\2\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7q\2"+
		"\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7c\2\2\u00ce@\3\2\2\2\u00cf\u00d1\5"+
		"\r\7\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d9\3\2\2\2\u00d4\u00d6\5\13\6\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00da\3\2\2\2\u00daB\3\2\2\2"+
		"\u00db\u00dd\5\67\34\2\u00dc\u00de\5\17\b\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\5\67\34\2\u00e2D\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7\"\2\2\u00e7F\3\2\2\2\u00e8\u00e9"+
		"\7e\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7\"\2\2\u00edH\3\2\2\2\u00ee\u00f0\7>\2\2\u00ef\u00f1\5\17\b\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5J\3\2\2\2\u00f6\u00f7"+
		"\7.\2\2\u00f7L\3\2\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\b\'\2\2\u00feN\3\2\2\2\r\2uz\u0080\u008b\u00d2\u00d7\u00d9\u00df"+
		"\u00f2\u00fb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}