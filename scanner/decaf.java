// Generated from decaf.g by ANTLR 4.3

  package scanner.decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class decaf extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PROGRAM=2, VOID=3, IF=4, ELSE=5, FOR=6, RETURN=7, BREAK=8, CONTINUE=9, 
		MASIGUAL=10, COMA=11, DOSPUNTOS=12, LLAVES_A=13, LLAVES_C=14, CORCHETES_A=15, 
		CORCHETES_C=16, STRING=17, INT=18, PARENTESIS_A=19, PARENTESIS_C=20, CALLOUT=21, 
		SUMA=22, RESTA=23, MULT=24, DIV=25, PROSENTAJE=26, MENOR=27, MAYOR=28, 
		MENOROIGUAL=29, MAYOROIGUAL=30, IGUALIGUAL=31, NOTIGUAL=32, AND=33, OR=34, 
		LITERAL=35, ALPHANUMERICO=36, BOOLEAN=37, ENTERO=38, BOOL=39, FLOAT=40, 
		HEX=41, TRUE=42, FALSE=43, VAR=44, ESPACIOS=45, CHAR=46;
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
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'"
	};
	public static final String[] ruleNames = {
		"DECIMAL", "LHEX", "LETRA", "CLASS", "PROGRAM", "VOID", "IF", "ELSE", 
		"FOR", "RETURN", "BREAK", "CONTINUE", "MASIGUAL", "COMA", "DOSPUNTOS", 
		"LLAVES_A", "LLAVES_C", "CORCHETES_A", "CORCHETES_C", "STRING", "INT", 
		"PARENTESIS_A", "PARENTESIS_C", "CALLOUT", "SUMA", "RESTA", "MULT", "DIV", 
		"PROSENTAJE", "MENOR", "MAYOR", "MENOROIGUAL", "MAYOROIGUAL", "IGUALIGUAL", 
		"NOTIGUAL", "AND", "OR", "LITERAL", "ALPHANUMERICO", "BOOLEAN", "ENTERO", 
		"BOOL", "FLOAT", "HEX", "TRUE", "FALSE", "VAR", "ESPACIOS", "CHAR"
	};


	public decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "decaf.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 47: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0148\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u00b2\n\25\f\25\16\25\u00b5\13"+
		"\25\3\25\3\25\3\26\6\26\u00ba\n\26\r\26\16\26\u00bb\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\5\'\u00ed\n\'\3(\3(\5(\u00f1\n(\3"+
		")\3)\5)\u00f5\n)\3*\3*\3*\6*\u00fa\n*\r*\16*\u00fb\3+\3+\3+\3+\3+\3+\3"+
		"+\6+\u0105\n+\r+\16+\u0106\3,\7,\u010a\n,\f,\16,\u010d\13,\3,\3,\7,\u0111"+
		"\n,\f,\16,\u0114\13,\6,\u0116\n,\r,\16,\u0117\3-\3-\3-\3-\7-\u011e\n-"+
		"\f-\16-\u0121\13-\6-\u0123\n-\r-\16-\u0124\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\6\60\u0135\n\60\r\60\16\60\u0136\3\61\6\61\u013a"+
		"\n\61\r\61\16\61\u013b\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\2\2\63\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13"+
		"\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67"+
		"\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60\3\2\6\4"+
		"\2C\\c|\5\2\13\f\17\17$$\4\2ZZzz\5\2\13\f\17\17\"\"\u0155\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2"+
		"\2\tk\3\2\2\2\13q\3\2\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0081\3\2\2\2\23\u0086"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u0091\3\2\2\2\31\u0097\3\2\2\2\33\u00a0\3"+
		"\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2"+
		"%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b9\3\2\2\2-\u00bd\3"+
		"\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2"+
		"\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E\u00dd\3\2\2\2G\u00e0\3\2\2\2I"+
		"\u00e3\3\2\2\2K\u00e6\3\2\2\2M\u00ec\3\2\2\2O\u00f0\3\2\2\2Q\u00f4\3\2"+
		"\2\2S\u00f9\3\2\2\2U\u0104\3\2\2\2W\u0115\3\2\2\2Y\u0122\3\2\2\2[\u0126"+
		"\3\2\2\2]\u012b\3\2\2\2_\u0131\3\2\2\2a\u0139\3\2\2\2c\u013f\3\2\2\2e"+
		"f\4\62;\2f\4\3\2\2\2gh\4CH\2h\6\3\2\2\2ij\t\2\2\2j\b\3\2\2\2kl\7e\2\2"+
		"lm\7n\2\2mn\7c\2\2no\7u\2\2op\7u\2\2p\n\3\2\2\2qr\7R\2\2rs\7t\2\2st\7"+
		"q\2\2tu\7i\2\2uv\7t\2\2vw\7c\2\2wx\7o\2\2x\f\3\2\2\2yz\7x\2\2z{\7q\2\2"+
		"{|\7k\2\2|}\7f\2\2}\16\3\2\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\20\3"+
		"\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7g\2\2\u0085\22\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088"+
		"\u0089\7t\2\2\u0089\24\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7w\2\2\u008e\u008f\7t\2\2\u008f\u0090\7p\2\2"+
		"\u0090\26\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7t\2\2\u0093\u0094\7"+
		"g\2\2\u0094\u0095\7c\2\2\u0095\u0096\7m\2\2\u0096\30\3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7w\2\2\u009e\u009f\7g\2\2"+
		"\u009f\32\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\7?\2\2\u00a2\34\3\2\2"+
		"\2\u00a3\u00a4\7.\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6 \3\2\2"+
		"\2\u00a7\u00a8\7}\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa$\3\2"+
		"\2\2\u00ab\u00ac\7]\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae(\3\2\2"+
		"\2\u00af\u00b3\7$\2\2\u00b0\u00b2\n\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7*\3\2\2\2\u00b8\u00ba\5\3\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc,\3\2\2\2\u00bd\u00be\7*\2\2\u00be.\3\2\2\2\u00bf\u00c0\7+\2"+
		"\2\u00c0\60\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\64\3\2\2\2\u00cb"+
		"\u00cc\7/\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce8\3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7\'\2\2\u00d2<\3\2\2\2\u00d3"+
		"\u00d4\7>\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6@\3\2\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8\u00d9\7?\2\2\u00d9B\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc"+
		"\7?\2\2\u00dcD\3\2\2\2\u00dd\u00de\7?\2\2\u00de\u00df\7?\2\2\u00dfF\3"+
		"\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7?\2\2\u00e2H\3\2\2\2\u00e3\u00e4"+
		"\7(\2\2\u00e4\u00e5\7(\2\2\u00e5J\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7\u00e8"+
		"\7~\2\2\u00e8L\3\2\2\2\u00e9\u00ed\5+\26\2\u00ea\u00ed\5c\62\2\u00eb\u00ed"+
		"\5Q)\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"N\3\2\2\2\u00ee\u00f1\5\3\2\2\u00ef\u00f1\5\7\4\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1P\3\2\2\2\u00f2\u00f5\5[.\2\u00f3\u00f5\5]/"+
		"\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5R\3\2\2\2\u00f6\u00f7"+
		"\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00fa\7v\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcT\3\2\2\2"+
		"\u00fd\u00fe\7d\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0105\7p\2\2\u0104"+
		"\u00fd\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107V\3\2\2\2\u0108\u010a\5\3\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0112\7\60\2\2\u010f\u0111\5\3\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u010b\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118X\3\2\2\2\u0119\u011a"+
		"\7Q\2\2\u011a\u011f\t\4\2\2\u011b\u011e\5\3\2\2\u011c\u011e\5\5\3\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0119\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125Z\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129"+
		"\7w\2\2\u0129\u012a\7g\2\2\u012a\\\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d"+
		"\7c\2\2\u012d\u012e\7n\2\2\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130"+
		"^\3\2\2\2\u0131\u0134\5\7\4\2\u0132\u0135\5\7\4\2\u0133\u0135\5\3\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137`\3\2\2\2\u0138\u013a\t\5\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\61\2\2\u013eb\3\2\2\2\u013f\u0140"+
		"\7\u201c\2\2\u0140\u0141\7\u00c6\2\2\u0141\u0142\7\u00f6\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\5\7\4\2\u0144\u0145\7\u201c\2\2\u0145\u0146\7\u00c6"+
		"\2\2\u0146\u0147\7\u00f6\2\2\u0147d\3\2\2\2\23\2\u00b3\u00bb\u00ec\u00f0"+
		"\u00f4\u00fb\u0106\u010b\u0112\u0117\u011d\u011f\u0124\u0134\u0136\u013b"+
		"\3\3\61\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}