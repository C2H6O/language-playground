// Generated from net/doubov/minicalc/SMLexer.g4 by ANTLR 4.5.1
package net.doubov.minicalc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, NEWLINE=2, WS=3, SM=4, INPUT=5, VAR=6, EVENT=7, PRINT=8, AS=9, 
		INT=10, DECIMAL=11, STRING=12, START=13, STATE=14, ON=15, ENTRY=16, EXIT=17, 
		ID=18, INTLIT=19, DECLIT=20, STRINGLIT=21, PLUS=22, MINUS=23, ASTERISK=24, 
		DIVISION=25, ASSIGN=26, COLON=27, LPAREN=28, RPAREN=29, LBRACKET=30, RBRACKET=31, 
		ARROW=32, UNMATCHED=33;
	public static final int
		COMMENT_CH=2, WHITESPACE_CH=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "NEWLINE", "WS", "SM", "INPUT", "VAR", "EVENT", "PRINT", "AS", 
		"INT", "DECIMAL", "STRING", "START", "STATE", "ON", "ENTRY", "EXIT", "ID", 
		"INTLIT", "DECLIT", "STRINGLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"ASSIGN", "COLON", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "ARROW", 
		"UNMATCHED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'statemachine'", "'input'", "'var'", "'event'", 
		"'print'", "'as'", "'Int'", "'Decimal'", "'String'", "'start'", "'state'", 
		"'on'", "'entry'", "'exit'", null, null, null, null, "'+'", "'-'", "'*'", 
		"'/'", "'='", "':'", "'('", "')'", "'{'", "'}'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "NEWLINE", "WS", "SM", "INPUT", "VAR", "EVENT", "PRINT", 
		"AS", "INT", "DECIMAL", "STRING", "START", "STATE", "ON", "ENTRY", "EXIT", 
		"ID", "INTLIT", "DECLIT", "STRINGLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"ASSIGN", "COLON", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "ARROW", 
		"UNMATCHED"
	};
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


	public SMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SMLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\5\3T\n\3\3\3\3\3\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\7\23\u00b3\n\23\f\23\16\23\u00b6\13\23\3\23\3\23\7\23\u00ba\n\23\f\23"+
		"\16\23\u00bd\13\23\3\24\3\24\3\24\7\24\u00c2\n\24\f\24\16\24\u00c5\13"+
		"\24\5\24\u00c7\n\24\3\25\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf\13"+
		"\25\3\25\3\25\6\25\u00d3\n\25\r\25\16\25\u00d4\5\25\u00d7\n\25\3\26\3"+
		"\26\7\26\u00db\n\26\f\26\16\26\u00de\13\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\n\4\2\f\f\17\17\4\2\13\13"+
		"\"\"\3\2aa\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2$$\u0104\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5S\3\2\2\2\7X\3\2\2"+
		"\2\t^\3\2\2\2\13k\3\2\2\2\rq\3\2\2\2\17u\3\2\2\2\21{\3\2\2\2\23\u0081"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0088\3\2\2\2\31\u0090\3\2\2\2\33\u0097\3"+
		"\2\2\2\35\u009d\3\2\2\2\37\u00a3\3\2\2\2!\u00a6\3\2\2\2#\u00ac\3\2\2\2"+
		"%\u00b4\3\2\2\2\'\u00c6\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00e1\3"+
		"\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2\63\u00e7\3\2\2\2\65\u00e9\3\2\2"+
		"\2\67\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2?\u00f3"+
		"\3\2\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3\2\2\2"+
		"HJ\n\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2"+
		"NO\b\2\2\2O\4\3\2\2\2PQ\7\17\2\2QT\7\f\2\2RT\t\2\2\2SP\3\2\2\2SR\3\2\2"+
		"\2TU\3\2\2\2UV\b\3\3\2V\6\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\4\3\2]\b\3\2\2\2^_\7u\2\2_`\7v\2\2`a\7"+
		"c\2\2ab\7v\2\2bc\7g\2\2cd\7o\2\2de\7c\2\2ef\7e\2\2fg\7j\2\2gh\7k\2\2h"+
		"i\7p\2\2ij\7g\2\2j\n\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7r\2\2no\7w\2\2op\7v"+
		"\2\2p\f\3\2\2\2qr\7x\2\2rs\7c\2\2st\7t\2\2t\16\3\2\2\2uv\7g\2\2vw\7x\2"+
		"\2wx\7g\2\2xy\7p\2\2yz\7v\2\2z\20\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~"+
		"\177\7p\2\2\177\u0080\7v\2\2\u0080\22\3\2\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7u\2\2\u0083\24\3\2\2\2\u0084\u0085\7K\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7v\2\2\u0087\26\3\2\2\2\u0088\u0089\7F\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7e\2\2\u008b\u008c\7k\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2"+
		"\u008e\u008f\7n\2\2\u008f\30\3\2\2\2\u0090\u0091\7U\2\2\u0091\u0092\7"+
		"v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7i\2\2\u0096\32\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009b\7t\2\2\u009b\u009c\7v\2\2\u009c\34\3\2\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		" \3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa\u00ab\7{\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7z\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7v\2\2\u00b0$\3\2\2\2\u00b1"+
		"\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00bb\t\5\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00c7\7\62\2\2\u00bf\u00c3\t\7\2\2\u00c0\u00c2\t\b\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6"+
		"\u00bf\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00d7\7\62\2\2\u00c9\u00cd\t\7\2\2"+
		"\u00ca\u00cc\t\b\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d2\7\60\2\2\u00d1\u00d3\t\b\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00c8\3\2\2\2\u00d6\u00c9\3\2\2\2\u00d7*\3\2\2\2\u00d8\u00dc\7$\2\2\u00d9"+
		"\u00db\n\t\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7$\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2.\3\2\2\2\u00e3\u00e4"+
		"\7/\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6\62\3\2\2\2\u00e7\u00e8"+
		"\7\61\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7?\2\2\u00ea\66\3\2\2\2\u00eb\u00ec"+
		"\7<\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7"+
		"+\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7}\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7\177"+
		"\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\7@\2\2\u00f7B\3\2\2"+
		"\2\u00f8\u00f9\13\2\2\2\u00f9D\3\2\2\2\16\2KSZ\u00b4\u00bb\u00c3\u00c6"+
		"\u00cd\u00d4\u00d6\u00dc\4\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}