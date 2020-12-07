// Generated from C:/Users/Kenny/Desktop/PLCG\aprendizagem.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aprendizagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALUNOS=1, RECURSOS=2, CONCEITOS=3, VIRGULA=4, PONTOVIRGULA=5, PONTO=6, 
		LPAREN=7, RPAREN=8, NUM=9, NUMEROALUNO=10, CONCEITO=11, IDRECURSO=12, 
		IDCONCEITO=13, PALAVRA=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALUNOS", "RECURSOS", "CONCEITOS", "VIRGULA", "PONTOVIRGULA", "PONTO", 
			"LPAREN", "RPAREN", "NUM", "NUMEROALUNO", "CONCEITO", "IDRECURSO", "IDCONCEITO", 
			"PALAVRA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "','", "';'", "'.'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALUNOS", "RECURSOS", "CONCEITOS", "VIRGULA", "PONTOVIRGULA", "PONTO", 
			"LPAREN", "RPAREN", "NUM", "NUMEROALUNO", "CONCEITO", "IDRECURSO", "IDCONCEITO", 
			"PALAVRA", "WS"
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


	public aprendizagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "aprendizagem.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nG\n\n"+
		"\r\n\16\nH\3\13\3\13\3\13\5\13N\n\13\3\13\6\13Q\n\13\r\13\16\13R\3\f\3"+
		"\f\7\fW\n\f\f\f\16\fZ\13\f\3\r\3\r\3\r\3\r\6\r`\n\r\r\r\16\ra\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16j\n\16\r\16\16\16k\3\17\3\17\7\17p\n\17\f\17"+
		"\16\17s\13\17\3\20\5\20v\n\20\3\20\3\20\6\20z\n\20\r\20\16\20{\3\20\3"+
		"\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\22\4\2CCcc\4\2NNnn\4\2WWww\4\2PPpp\4\2QQqq\4\2UUu"+
		"u\4\2TTtt\4\2GGgg\4\2EEee\4\2KKkk\4\2VVvv\3\2\62;\4\2C\\c|\4\2%%--\5\2"+
		"\62;C\\c|\4\2\13\13\"\"\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3!\3\2\2\2\5(\3\2\2\2\7\61\3\2\2\2\t;\3\2\2\2\13=\3\2\2"+
		"\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23F\3\2\2\2\25M\3\2\2\2\27T\3\2"+
		"\2\2\31[\3\2\2\2\33c\3\2\2\2\35m\3\2\2\2\37y\3\2\2\2!\"\t\2\2\2\"#\t\3"+
		"\2\2#$\t\4\2\2$%\t\5\2\2%&\t\6\2\2&\'\t\7\2\2\'\4\3\2\2\2()\t\b\2\2)*"+
		"\t\t\2\2*+\t\n\2\2+,\t\4\2\2,-\t\b\2\2-.\t\7\2\2./\t\6\2\2/\60\t\7\2\2"+
		"\60\6\3\2\2\2\61\62\t\n\2\2\62\63\t\6\2\2\63\64\t\5\2\2\64\65\t\n\2\2"+
		"\65\66\t\t\2\2\66\67\t\13\2\2\678\t\f\2\289\t\6\2\29:\t\7\2\2:\b\3\2\2"+
		"\2;<\7.\2\2<\n\3\2\2\2=>\7=\2\2>\f\3\2\2\2?@\7\60\2\2@\16\3\2\2\2AB\7"+
		"]\2\2B\20\3\2\2\2CD\7_\2\2D\22\3\2\2\2EG\4\62;\2FE\3\2\2\2GH\3\2\2\2H"+
		"F\3\2\2\2HI\3\2\2\2I\24\3\2\2\2JN\7C\2\2KL\7R\2\2LN\7I\2\2MJ\3\2\2\2M"+
		"K\3\2\2\2NP\3\2\2\2OQ\t\r\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"S\26\3\2\2\2TX\t\16\2\2UW\t\17\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\30\3\2\2\2ZX\3\2\2\2[\\\7t\2\2\\]\7C\2\2]_\3\2\2\2^`\t\r\2\2_^\3"+
		"\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\32\3\2\2\2cd\7e\2\2de\7R\2\2ef\7"+
		"t\2\2fg\7i\2\2gi\3\2\2\2hj\t\r\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2l\34\3\2\2\2mq\t\16\2\2np\t\20\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2r\36\3\2\2\2sq\3\2\2\2tv\7\17\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2"+
		"\2wz\7\f\2\2xz\t\21\2\2yu\3\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\r\2HMRXakquy{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}