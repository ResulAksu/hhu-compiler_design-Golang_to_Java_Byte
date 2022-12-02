// Generated from C:/Users/resul/Desktop/all/compilerbau antlr/src/antlr\Expr.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, PACKAGE=3, MAIN=4, IMPORT=5, NOTATIONS=6, FMT=7, FUNC=8, 
		LEFTPAR=9, RIGHTPAR=10, LEFTBRACE=11, RIGHTBRACE=12, ASSERT=13, MODULO=14, 
		EQUALS=15, SMALLER=16, SMALLER_OR_EQUAL=17, GREATER=18, GREATER_OR_EQUAL=19, 
		NOT_EQUAL=20, LOGICAL_AND=21, LOGICAL_OR=22, LOGICAL_NOT=23, IF_TOKEN=24, 
		ELSE_TOKEN=25, FOR_TOKEN=26, VAR=27, LETTER=28, DIGITINCL=29, INT=30, 
		FLOAT64=31, BOOLEAN=32, STRING=33, DOT=34, TRUE=35, FALSE=36, PRINT_LN=37, 
		ADD=38, SUB=39, MUL=40, DIV=41, RETURN=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WS", "PACKAGE", "MAIN", "IMPORT", "NOTATIONS", "FMT", "FUNC", 
			"LEFTPAR", "RIGHTPAR", "LEFTBRACE", "RIGHTBRACE", "ASSERT", "MODULO", 
			"EQUALS", "SMALLER", "SMALLER_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", 
			"NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "IF_TOKEN", 
			"ELSE_TOKEN", "FOR_TOKEN", "VAR", "LETTER", "DIGITINCL", "INT", "FLOAT64", 
			"BOOLEAN", "STRING", "DOT", "TRUE", "FALSE", "PRINT_LN", "ADD", "SUB", 
			"MUL", "DIV", "RETURN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'package'", "'main'", "'import'", "'\"'", "'fmt'", 
			"'func'", "'('", "')'", "'{'", "'}'", "'='", "'%'", "'=='", "'<'", "'<='", 
			"'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'if'", "'else'", "'for'", 
			"'var'", null, null, "'int'", "'float64'", "'bool'", "'string'", "'.'", 
			"'true'", "'false'", "'Println'", "'+'", "'-'", "'*'", "'/'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "PACKAGE", "MAIN", "IMPORT", "NOTATIONS", "FMT", "FUNC", 
			"LEFTPAR", "RIGHTPAR", "LEFTBRACE", "RIGHTBRACE", "ASSERT", "MODULO", 
			"EQUALS", "SMALLER", "SMALLER_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", 
			"NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "IF_TOKEN", 
			"ELSE_TOKEN", "FOR_TOKEN", "VAR", "LETTER", "DIGITINCL", "INT", "FLOAT64", 
			"BOOLEAN", "STRING", "DOT", "TRUE", "FALSE", "PRINT_LN", "ADD", "SUB", 
			"MUL", "DIV", "RETURN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000*\u00f2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001Y\b\u0001\u000b\u0001\f\u0001Z\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u00b3\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0000\u0000*\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*\u0001\u0000\u0003"+
		"\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0001\u000009\u00f2\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0001U\u0001"+
		"\u0000\u0000\u0000\u0003X\u0001\u0000\u0000\u0000\u0005^\u0001\u0000\u0000"+
		"\u0000\u0007f\u0001\u0000\u0000\u0000\tk\u0001\u0000\u0000\u0000\u000b"+
		"r\u0001\u0000\u0000\u0000\rt\u0001\u0000\u0000\u0000\u000fx\u0001\u0000"+
		"\u0000\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u007f\u0001\u0000\u0000"+
		"\u0000\u0015\u0081\u0001\u0000\u0000\u0000\u0017\u0083\u0001\u0000\u0000"+
		"\u0000\u0019\u0085\u0001\u0000\u0000\u0000\u001b\u0087\u0001\u0000\u0000"+
		"\u0000\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u008c\u0001\u0000\u0000"+
		"\u0000!\u008e\u0001\u0000\u0000\u0000#\u0091\u0001\u0000\u0000\u0000%"+
		"\u0093\u0001\u0000\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000)\u0099"+
		"\u0001\u0000\u0000\u0000+\u009c\u0001\u0000\u0000\u0000-\u009f\u0001\u0000"+
		"\u0000\u0000/\u00a1\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u0000"+
		"3\u00a9\u0001\u0000\u0000\u00005\u00ad\u0001\u0000\u0000\u00007\u00b2"+
		"\u0001\u0000\u0000\u00009\u00b4\u0001\u0000\u0000\u0000;\u00b6\u0001\u0000"+
		"\u0000\u0000=\u00ba\u0001\u0000\u0000\u0000?\u00c2\u0001\u0000\u0000\u0000"+
		"A\u00c7\u0001\u0000\u0000\u0000C\u00ce\u0001\u0000\u0000\u0000E\u00d0"+
		"\u0001\u0000\u0000\u0000G\u00d5\u0001\u0000\u0000\u0000I\u00db\u0001\u0000"+
		"\u0000\u0000K\u00e3\u0001\u0000\u0000\u0000M\u00e5\u0001\u0000\u0000\u0000"+
		"O\u00e7\u0001\u0000\u0000\u0000Q\u00e9\u0001\u0000\u0000\u0000S\u00eb"+
		"\u0001\u0000\u0000\u0000UV\u0005,\u0000\u0000V\u0002\u0001\u0000\u0000"+
		"\u0000WY\u0007\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0006\u0001\u0000\u0000]\u0004\u0001\u0000\u0000"+
		"\u0000^_\u0005p\u0000\u0000_`\u0005a\u0000\u0000`a\u0005c\u0000\u0000"+
		"ab\u0005k\u0000\u0000bc\u0005a\u0000\u0000cd\u0005g\u0000\u0000de\u0005"+
		"e\u0000\u0000e\u0006\u0001\u0000\u0000\u0000fg\u0005m\u0000\u0000gh\u0005"+
		"a\u0000\u0000hi\u0005i\u0000\u0000ij\u0005n\u0000\u0000j\b\u0001\u0000"+
		"\u0000\u0000kl\u0005i\u0000\u0000lm\u0005m\u0000\u0000mn\u0005p\u0000"+
		"\u0000no\u0005o\u0000\u0000op\u0005r\u0000\u0000pq\u0005t\u0000\u0000"+
		"q\n\u0001\u0000\u0000\u0000rs\u0005\"\u0000\u0000s\f\u0001\u0000\u0000"+
		"\u0000tu\u0005f\u0000\u0000uv\u0005m\u0000\u0000vw\u0005t\u0000\u0000"+
		"w\u000e\u0001\u0000\u0000\u0000xy\u0005f\u0000\u0000yz\u0005u\u0000\u0000"+
		"z{\u0005n\u0000\u0000{|\u0005c\u0000\u0000|\u0010\u0001\u0000\u0000\u0000"+
		"}~\u0005(\u0000\u0000~\u0012\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		")\u0000\u0000\u0080\u0014\u0001\u0000\u0000\u0000\u0081\u0082\u0005{\u0000"+
		"\u0000\u0082\u0016\u0001\u0000\u0000\u0000\u0083\u0084\u0005}\u0000\u0000"+
		"\u0084\u0018\u0001\u0000\u0000\u0000\u0085\u0086\u0005=\u0000\u0000\u0086"+
		"\u001a\u0001\u0000\u0000\u0000\u0087\u0088\u0005%\u0000\u0000\u0088\u001c"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a\u008b\u0005"+
		"=\u0000\u0000\u008b\u001e\u0001\u0000\u0000\u0000\u008c\u008d\u0005<\u0000"+
		"\u0000\u008d \u0001\u0000\u0000\u0000\u008e\u008f\u0005<\u0000\u0000\u008f"+
		"\u0090\u0005=\u0000\u0000\u0090\"\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005>\u0000\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005>"+
		"\u0000\u0000\u0094\u0095\u0005=\u0000\u0000\u0095&\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005!\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u0098("+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005&\u0000\u0000\u009a\u009b\u0005"+
		"&\u0000\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0005|\u0000"+
		"\u0000\u009d\u009e\u0005|\u0000\u0000\u009e,\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005!\u0000\u0000\u00a0.\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"i\u0000\u0000\u00a2\u00a3\u0005f\u0000\u0000\u00a30\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u00a6\u0005l\u0000\u0000\u00a6"+
		"\u00a7\u0005s\u0000\u0000\u00a7\u00a8\u0005e\u0000\u0000\u00a82\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005f\u0000\u0000\u00aa\u00ab\u0005o\u0000"+
		"\u0000\u00ab\u00ac\u0005r\u0000\u0000\u00ac4\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005v\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af\u00b0\u0005"+
		"r\u0000\u0000\u00b06\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0001\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b38\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5:\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005n\u0000\u0000\u00b8\u00b9\u0005"+
		"t\u0000\u0000\u00b9<\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005f\u0000"+
		"\u0000\u00bb\u00bc\u0005l\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000\u00bd"+
		"\u00be\u0005a\u0000\u0000\u00be\u00bf\u0005t\u0000\u0000\u00bf\u00c0\u0005"+
		"6\u0000\u0000\u00c0\u00c1\u00054\u0000\u0000\u00c1>\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005b\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4"+
		"\u00c5\u0005o\u0000\u0000\u00c5\u00c6\u0005l\u0000\u0000\u00c6@\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005s\u0000\u0000\u00c8\u00c9\u0005t\u0000"+
		"\u0000\u00c9\u00ca\u0005r\u0000\u0000\u00ca\u00cb\u0005i\u0000\u0000\u00cb"+
		"\u00cc\u0005n\u0000\u0000\u00cc\u00cd\u0005g\u0000\u0000\u00cdB\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005.\u0000\u0000\u00cfD\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1\u00d2\u0005r\u0000\u0000\u00d2"+
		"\u00d3\u0005u\u0000\u0000\u00d3\u00d4\u0005e\u0000\u0000\u00d4F\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005f\u0000\u0000\u00d6\u00d7\u0005a\u0000"+
		"\u0000\u00d7\u00d8\u0005l\u0000\u0000\u00d8\u00d9\u0005s\u0000\u0000\u00d9"+
		"\u00da\u0005e\u0000\u0000\u00daH\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"P\u0000\u0000\u00dc\u00dd\u0005r\u0000\u0000\u00dd\u00de\u0005i\u0000"+
		"\u0000\u00de\u00df\u0005n\u0000\u0000\u00df\u00e0\u0005t\u0000\u0000\u00e0"+
		"\u00e1\u0005l\u0000\u0000\u00e1\u00e2\u0005n\u0000\u0000\u00e2J\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0005+\u0000\u0000\u00e4L\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005-\u0000\u0000\u00e6N\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005*\u0000\u0000\u00e8P\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"/\u0000\u0000\u00eaR\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005r\u0000"+
		"\u0000\u00ec\u00ed\u0005e\u0000\u0000\u00ed\u00ee\u0005t\u0000\u0000\u00ee"+
		"\u00ef\u0005u\u0000\u0000\u00ef\u00f0\u0005r\u0000\u0000\u00f0\u00f1\u0005"+
		"n\u0000\u0000\u00f1T\u0001\u0000\u0000\u0000\u0003\u0000Z\u00b2\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}