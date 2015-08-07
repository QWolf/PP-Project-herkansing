// Generated from YallVocab.g4 by ANTLR 4.4
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YallVocab extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		YALL=1, GLOBAL=2, LOCAL=3, IS=4, IF=5, THEN=6, ELSE=7, WHILE=8, LOCK=9, 
		UNLOCK=10, FORK=11, JOIN=12, DO=13, NONE=14, UP=15, INPUT=16, OUTPUT=17, 
		INTEGER=18, BOOLEAN=19, TRUE=20, FALSE=21, LPAR=22, RPAR=23, LBRACE=24, 
		RBRACE=25, SEMI=26, LBLOCK=27, RBLOCK=28, QUOTE=29, DQUOTE=30, COMMA=31, 
		EXCL=32, AT=33, PLUS=34, MINUS=35, TIMES=36, DIVIDE=37, AND=38, OR=39, 
		XOR=40, NOT=41, GT=42, LT=43, GE=44, LE=45, EQ=46, NE=47, ID=48, NUM=49, 
		COMMENT=50, COMMENTBLOCK=51, WS=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'"
	};
	public static final String[] ruleNames = {
		"YALL", "GLOBAL", "LOCAL", "IS", "IF", "THEN", "ELSE", "WHILE", "LOCK", 
		"UNLOCK", "FORK", "JOIN", "DO", "NONE", "UP", "INPUT", "OUTPUT", "INTEGER", 
		"BOOLEAN", "TRUE", "FALSE", "LPAR", "RPAR", "LBRACE", "RBRACE", "SEMI", 
		"LBLOCK", "RBLOCK", "QUOTE", "DQUOTE", "COMMA", "EXCL", "AT", "PLUS", 
		"MINUS", "TIMES", "DIVIDE", "AND", "OR", "XOR", "NOT", "GT", "LT", "GE", 
		"LE", "EQ", "NE", "ID", "NUM", "COMMENT", "COMMENTBLOCK", "WS", "LOWERCASE", 
		"UPPERCASE", "LETTER", "DIGIT"
	};


	public YallVocab(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YallVocab.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0169\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\7\61\u0136\n\61\f\61\16\61\u0139\13\61\3\62\3\62\7"+
		"\62\u013d\n\62\f\62\16\62\u0140\13\62\3\63\3\63\3\63\7\63\u0145\n\63\f"+
		"\63\16\63\u0148\13\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u0151\n"+
		"\64\f\64\16\64\u0154\13\64\3\64\3\64\3\64\3\64\3\64\3\65\6\65\u015c\n"+
		"\65\r\65\16\65\u015d\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\4\u0146"+
		"\u0152\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\2m\2o\2q\2\3\2\7\5\2\13\f\17\17\"\"\3\2c|\3\2C\\\4\2C\\c|\3\2\62"+
		";\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3s\3\2\2\2\5"+
		"x\3\2\2\2\7\177\3\2\2\2\t\u0085\3\2\2\2\13\u0088\3\2\2\2\r\u008b\3\2\2"+
		"\2\17\u0090\3\2\2\2\21\u0095\3\2\2\2\23\u009b\3\2\2\2\25\u00a0\3\2\2\2"+
		"\27\u00a7\3\2\2\2\31\u00ac\3\2\2\2\33\u00b1\3\2\2\2\35\u00b4\3\2\2\2\37"+
		"\u00b9\3\2\2\2!\u00bc\3\2\2\2#\u00c2\3\2\2\2%\u00c9\3\2\2\2\'\u00d1\3"+
		"\2\2\2)\u00d9\3\2\2\2+\u00de\3\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2\2\2\61"+
		"\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0"+
		"\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C"+
		"\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u0101\3\2\2\2I\u0107\3\2\2\2K\u010d\3\2"+
		"\2\2M\u0111\3\2\2\2O\u0115\3\2\2\2Q\u0118\3\2\2\2S\u011c\3\2\2\2U\u0120"+
		"\3\2\2\2W\u0123\3\2\2\2Y\u0126\3\2\2\2[\u0129\3\2\2\2]\u012c\3\2\2\2_"+
		"\u012f\3\2\2\2a\u0132\3\2\2\2c\u013a\3\2\2\2e\u0141\3\2\2\2g\u014d\3\2"+
		"\2\2i\u015b\3\2\2\2k\u0161\3\2\2\2m\u0163\3\2\2\2o\u0165\3\2\2\2q\u0167"+
		"\3\2\2\2st\7[\2\2tu\7C\2\2uv\7N\2\2vw\7N\2\2w\4\3\2\2\2xy\7i\2\2yz\7n"+
		"\2\2z{\7q\2\2{|\7d\2\2|}\7c\2\2}~\7n\2\2~\6\3\2\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2"+
		"\u0084\b\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7u\2\2\u0087\n\3\2\2\2"+
		"\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\f\3\2\2\2\u008b\u008c\7v"+
		"\2\2\u008c\u008d\7j\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f\16"+
		"\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7g\2\2\u0094\20\3\2\2\2\u0095\u0096\7y\2\2\u0096\u0097\7j\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\22\3\2\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e\7e\2\2\u009e\u009f\7m\2\2"+
		"\u009f\24\3\2\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7"+
		"n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7m\2\2\u00a6\26"+
		"\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"\u00ab\7m\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7l\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7q\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7w\2\2\u00ba"+
		"\u00bb\7r\2\2\u00bb \3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7r\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7v\2\2\u00c1\"\3\2\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7r\2\2"+
		"\u00c6\u00c7\7w\2\2\u00c7\u00c8\7v\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7k\2"+
		"\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7i\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0&\3\2\2\2\u00d1\u00d2"+
		"\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8(\3\2\2\2\u00d9"+
		"\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd*\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2"+
		"\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7"+
		"*\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7"+
		"}\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7\177\2\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7=\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7]\2\2\u00ef8\3\2\2\2\u00f0\u00f1"+
		"\7_\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7)\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7"+
		"$\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7.\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7#"+
		"\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7B\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7r\2"+
		"\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7u\2\2\u0100F\3\2"+
		"\2\2\u0101\u0102\7o\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105"+
		"\7w\2\2\u0105\u0106\7u\2\2\u0106H\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7o\2\2\u010a\u010b\7g\2\2\u010b\u010c\7u\2\2\u010c"+
		"J\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7x\2\2\u0110"+
		"L\3\2\2\2\u0111\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114"+
		"N\3\2\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117P\3\2\2\2\u0118\u0119"+
		"\7z\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2\u011bR\3\2\2\2\u011c\u011d"+
		"\7p\2\2\u011d\u011e\7q\2\2\u011e\u011f\7v\2\2\u011fT\3\2\2\2\u0120\u0121"+
		"\7@\2\2\u0121\u0122\7@\2\2\u0122V\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125"+
		"\7>\2\2\u0125X\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0128\7?\2\2\u0128Z\3"+
		"\2\2\2\u0129\u012a\7?\2\2\u012a\u012b\7>\2\2\u012b\\\3\2\2\2\u012c\u012d"+
		"\7?\2\2\u012d\u012e\7?\2\2\u012e^\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131"+
		"\7?\2\2\u0131`\3\2\2\2\u0132\u0137\5m\67\2\u0133\u0136\5o8\2\u0134\u0136"+
		"\5q9\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138b\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u013a\u013e\5q9\2\u013b\u013d\5q9\2\u013c\u013b\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fd\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\5A!\2\u0142\u0146\5A!\2\u0143\u0145\13\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\f\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\63\2\2\u014cf\3\2\2\2\u014d\u014e\5A!\2\u014e"+
		"\u0152\5C\"\2\u014f\u0151\13\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\5C\"\2\u0156\u0157\5A!\2\u0157\u0158\3\2\2"+
		"\2\u0158\u0159\b\64\2\2\u0159h\3\2\2\2\u015a\u015c\t\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\b\65\2\2\u0160j\3\2\2\2\u0161\u0162\t\3\2\2"+
		"\u0162l\3\2\2\2\u0163\u0164\t\4\2\2\u0164n\3\2\2\2\u0165\u0166\t\5\2\2"+
		"\u0166p\3\2\2\2\u0167\u0168\t\6\2\2\u0168r\3\2\2\2\t\2\u0135\u0137\u013e"+
		"\u0146\u0152\u015d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}