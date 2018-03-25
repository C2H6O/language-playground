// Generated from net/doubov/minicalc/MiniCalcLexer.g4 by ANTLR 4.5.1
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
public class MiniCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, WS=2, INPUT=3, VAR=4, PRINT=5, AS=6, INT=7, DECIMAL=8, STRING=9, 
		INTLIT=10, DECLIT=11, PLUS=12, MINUS=13, ASTERISK=14, DIVISION=15, ASSIGN=16, 
		LPAREN=17, RPAREN=18, ID=19, STRING_OPEN=20, UNMATCHED=21, ESCAPE_STRING_DELIMITER=22, 
		ESCAPE_SLASH=23, ESCAPE_NEWLINE=24, ESCAPE_SHARP=25, STRING_CLOSE=26, 
		INTERPOLATION_OPEN=27, STRING_CONTENT=28, INTERPOLATION_CLOSE=29, INTERP_WS=30;
	public static final int
		WHITESPACE=2;
	public static final int MODE_IN_STRING = 1;
	public static final int MODE_IN_INTERPOLATION = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "MODE_IN_STRING", "MODE_IN_INTERPOLATION"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "WS", "INPUT", "VAR", "PRINT", "AS", "INT", "DECIMAL", "STRING", 
		"INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", 
		"LPAREN", "RPAREN", "ID", "STRING_OPEN", "UNMATCHED", "ESCAPE_STRING_DELIMITER", 
		"ESCAPE_SLASH", "ESCAPE_NEWLINE", "ESCAPE_SHARP", "STRING_CLOSE", "INTERPOLATION_OPEN", 
		"STRING_CONTENT", "STR_UNMATCHED", "INTERPOLATION_CLOSE", "INTERP_WS", 
		"INTERP_AS", "INTERP_INT", "INTERP_DECIMAL", "INTERP_STRING", "INTERP_INTLIT", 
		"INTERP_DECLIT", "INTERP_PLUS", "INTERP_MINUS", "INTERP_ASTERISK", "INTERP_DIVISION", 
		"INTERP_ASSIGN", "INTERP_LPAREN", "INTERP_RPAREN", "INTERP_ID", "INTERP_STRING_OPEN", 
		"INTERP_UNMATCHED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'input'", "'var'", "'print'", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'\\\"'", "'\\\\'", "'\\n'", "'\\#'", null, "'#{'", null, "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "WS", "INPUT", "VAR", "PRINT", "AS", "INT", "DECIMAL", 
		"STRING", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", 
		"ASSIGN", "LPAREN", "RPAREN", "ID", "STRING_OPEN", "UNMATCHED", "ESCAPE_STRING_DELIMITER", 
		"ESCAPE_SLASH", "ESCAPE_NEWLINE", "ESCAPE_SHARP", "STRING_CLOSE", "INTERPOLATION_OPEN", 
		"STRING_CONTENT", "INTERPOLATION_CLOSE", "INTERP_WS"
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


	public MiniCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniCalcLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u0169\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\5\2g\n\2\3\3\6\3"+
		"j\n\3\r\3\16\3k\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0099\n\13\f"+
		"\13\16\13\u009c\13\13\5\13\u009e\n\13\3\f\3\f\3\f\7\f\u00a3\n\f\f\f\16"+
		"\f\u00a6\13\f\3\f\3\f\6\f\u00aa\n\f\r\f\16\f\u00ab\5\f\u00ae\n\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\7"+
		"\24\u00bf\n\24\f\24\16\24\u00c2\13\24\3\24\3\24\7\24\u00c6\n\24\f\24\16"+
		"\24\u00c9\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\6\35\u00e7\n\35\r\35\16\35\u00e8\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \6 \u00f4\n \r \16 \u00f5\3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\7%\u011b\n%\f%\16%\u011e\13%\5%\u0120\n%\3%\3%\3&"+
		"\3&\3&\7&\u0127\n&\f&\16&\u012a\13&\5&\u012c\n&\3&\3&\6&\u0130\n&\r&\16"+
		"&\u0131\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\7.\u0153\n.\f.\16.\u0156\13.\3.\3."+
		"\7.\u015a\n.\f.\16.\u015d\13.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\2\2\61\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\2?\37A C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2\5\2\3\4\n\4"+
		"\2\f\f\17\17\4\2\13\13\"\"\3\2\63;\3\2\62;\3\2aa\3\2c|\6\2\62;C\\aac|"+
		"\6\2\13\f\17\17$%^^\u0178\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3"+
		"\2\2\2\3;\3\2\2\2\3=\3\2\2\2\4?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\4E\3\2\2"+
		"\2\4G\3\2\2\2\4I\3\2\2\2\4K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4"+
		"S\3\2\2\2\4U\3\2\2\2\4W\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3"+
		"\2\2\2\4a\3\2\2\2\5f\3\2\2\2\7i\3\2\2\2\to\3\2\2\2\13u\3\2\2\2\ry\3\2"+
		"\2\2\17\177\3\2\2\2\21\u0082\3\2\2\2\23\u0086\3\2\2\2\25\u008e\3\2\2\2"+
		"\27\u009d\3\2\2\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37"+
		"\u00b3\3\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3"+
		"\2\2\2)\u00c0\3\2\2\2+\u00ca\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d3\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2\2\2\67\u00dc\3\2\2\29\u00e0"+
		"\3\2\2\2;\u00e6\3\2\2\2=\u00ea\3\2\2\2?\u00ee\3\2\2\2A\u00f3\3\2\2\2C"+
		"\u00f9\3\2\2\2E\u00fe\3\2\2\2G\u0104\3\2\2\2I\u010e\3\2\2\2K\u011f\3\2"+
		"\2\2M\u012b\3\2\2\2O\u0135\3\2\2\2Q\u0139\3\2\2\2S\u013d\3\2\2\2U\u0141"+
		"\3\2\2\2W\u0145\3\2\2\2Y\u0149\3\2\2\2[\u014d\3\2\2\2]\u0154\3\2\2\2_"+
		"\u0160\3\2\2\2a\u0165\3\2\2\2cd\7\17\2\2dg\7\f\2\2eg\t\2\2\2fc\3\2\2\2"+
		"fe\3\2\2\2g\6\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2lm\3\2\2\2mn\b\3\2\2n\b\3\2\2\2op\7k\2\2pq\7p\2\2qr\7r\2\2rs\7w\2\2"+
		"st\7v\2\2t\n\3\2\2\2uv\7x\2\2vw\7c\2\2wx\7t\2\2x\f\3\2\2\2yz\7r\2\2z{"+
		"\7t\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~\16\3\2\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7u\2\2\u0081\20\3\2\2\2\u0082\u0083\7K\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7v\2\2\u0085\22\3\2\2\2\u0086\u0087\7F\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7k\2\2\u008a\u008b\7o\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7n\2\2\u008d\24\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7"+
		"v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7i\2\2\u0094\26\3\2\2\2\u0095\u009e\7\62\2\2\u0096\u009a\t\4\2\2\u0097"+
		"\u0099\t\5\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009e\30\3\2\2\2\u009f\u00ae\7\62\2"+
		"\2\u00a0\u00a4\t\4\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\7\60\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ae\32\3\2\2"+
		"\2\u00af\u00b0\7-\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\36\3\2"+
		"\2\2\u00b3\u00b4\7,\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\"\3"+
		"\2\2\2\u00b7\u00b8\7?\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba&\3\2"+
		"\2\2\u00bb\u00bc\7+\2\2\u00bc(\3\2\2\2\u00bd\u00bf\t\6\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c7\t\7\2\2\u00c4\u00c6\t\b"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8*\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b\25\3\2\u00cd,\3\2\2\2\u00ce\u00cf\13\2\2"+
		"\2\u00cf.\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1\u00d2\7$\2\2\u00d2\60\3\2\2"+
		"\2\u00d3\u00d4\7^\2\2\u00d4\u00d5\7^\2\2\u00d5\62\3\2\2\2\u00d6\u00d7"+
		"\7^\2\2\u00d7\u00d8\7p\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00db"+
		"\7%\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b\33\4\2\u00df8\3\2\2\2\u00e0\u00e1\7%\2\2\u00e1\u00e2\7}\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\b\34\5\2\u00e4:\3\2\2\2\u00e5\u00e7\n\t\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9<\3\2\2\2\u00ea\u00eb\13\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\b\36\6\2\u00ed>\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef\u00f0\3\2\2"+
		"\2\u00f0\u00f1\b\37\4\2\u00f1@\3\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b \7\2\u00f8B\3\2\2\2\u00f9\u00fa\7c\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b!\b\2\u00fdD\3\2\2\2\u00fe"+
		"\u00ff\7K\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102\3\2\2"+
		"\2\u0102\u0103\b\"\t\2\u0103F\3\2\2\2\u0104\u0105\7F\2\2\u0105\u0106\7"+
		"g\2\2\u0106\u0107\7e\2\2\u0107\u0108\7k\2\2\u0108\u0109\7o\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b#\n\2\u010d"+
		"H\3\2\2\2\u010e\u010f\7U\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7i\2\2\u0114\u0115\3\2\2"+
		"\2\u0115\u0116\b$\13\2\u0116J\3\2\2\2\u0117\u0120\7\62\2\2\u0118\u011c"+
		"\t\4\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\b%\f\2\u0122L\3\2\2\2\u0123\u012c\7\62\2\2\u0124\u0128\t\4\2\2"+
		"\u0125\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\7\60"+
		"\2\2\u012e\u0130\t\5\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b&"+
		"\r\2\u0134N\3\2\2\2\u0135\u0136\7-\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\b\'\16\2\u0138P\3\2\2\2\u0139\u013a\7/\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b(\17\2\u013cR\3\2\2\2\u013d\u013e\7,\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\b)\20\2\u0140T\3\2\2\2\u0141\u0142\7\61\2\2\u0142\u0143\3\2\2\2"+
		"\u0143\u0144\b*\21\2\u0144V\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\b+\22\2\u0148X\3\2\2\2\u0149\u014a\7*\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\b,\23\2\u014cZ\3\2\2\2\u014d\u014e\7+\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\b-\24\2\u0150\\\3\2\2\2\u0151\u0153\t\6\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\t\7\2\2\u0158"+
		"\u015a\t\b\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\b.\25\2\u015f^\3\2\2\2\u0160\u0161\7$\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b/\26\2\u0163\u0164\b/\3\2\u0164`\3\2\2\2\u0165\u0166\13\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167\u0168\b\60\6\2\u0168b\3\2\2\2\27\2\3\4fk\u009a"+
		"\u009d\u00a4\u00ab\u00ad\u00c0\u00c7\u00e8\u00f5\u011c\u011f\u0128\u012b"+
		"\u0131\u0154\u015b\27\2\4\2\7\3\2\6\2\2\7\4\2\t\27\2\b\2\2\t\b\2\t\t\2"+
		"\t\n\2\t\13\2\t\f\2\t\r\2\t\16\2\t\17\2\t\20\2\t\21\2\t\22\2\t\23\2\t"+
		"\24\2\t\25\2\t\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}