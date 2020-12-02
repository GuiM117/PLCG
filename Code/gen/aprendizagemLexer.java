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
		ALUNOS=1, RECURSOS=2, VIRGULA=3, PONTOVIRGULA=4, PONTO=5, LPAREN=6, RPAREN=7, 
		NUM=8, NUMEROALUNO=9, PALAVRA=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALUNOS", "RECURSOS", "VIRGULA", "PONTOVIRGULA", "PONTO", "LPAREN", "RPAREN", 
			"NUM", "NUMEROALUNO", "PALAVRA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "','", "';'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALUNOS", "RECURSOS", "VIRGULA", "PONTOVIRGULA", "PONTO", "LPAREN", 
			"RPAREN", "NUM", "NUMEROALUNO", "PALAVRA", "WS"
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



	     /* Definir objectos...

	     public class aluno(){
	        private String nome;
	        private int numero;
	        private int idade;
	        private List<String> caracteristicas;
	        ...
	     }
	     public class recurso(){
	        private int id;
	        private String nome;
	        private String descricao;
	        private List<String> caracteristicasR;
	        ...
	     }
	     public class topico(){
	        private int id;
	        private String nome;
	        private String descricao;
	        ...
	     }*/


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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rP\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\65\n\t\r\t\16\t"+
		"\66\3\n\3\n\6\n;\n\n\r\n\16\n<\3\13\3\13\7\13A\n\13\f\13\16\13D\13\13"+
		"\3\f\5\fG\n\f\3\f\3\f\6\fK\n\f\r\f\16\fL\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\17\4\2CCcc\4\2NNnn\4\2WWww\4\2"+
		"PPpp\4\2QQqq\4\2UUuu\4\2TTtt\4\2GGgg\4\2EEee\3\2\62;\4\2C\\c|\5\2\62;"+
		"C\\c|\4\2\13\13\"\"\2U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5 \3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13"+
		"-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\64\3\2\2\2\238\3\2\2\2\25>\3\2\2"+
		"\2\27J\3\2\2\2\31\32\t\2\2\2\32\33\t\3\2\2\33\34\t\4\2\2\34\35\t\5\2\2"+
		"\35\36\t\6\2\2\36\37\t\7\2\2\37\4\3\2\2\2 !\t\b\2\2!\"\t\t\2\2\"#\t\n"+
		"\2\2#$\t\4\2\2$%\t\b\2\2%&\t\7\2\2&\'\t\6\2\2\'(\t\7\2\2(\6\3\2\2\2)*"+
		"\7.\2\2*\b\3\2\2\2+,\7=\2\2,\n\3\2\2\2-.\7\60\2\2.\f\3\2\2\2/\60\7*\2"+
		"\2\60\16\3\2\2\2\61\62\7+\2\2\62\20\3\2\2\2\63\65\4\62;\2\64\63\3\2\2"+
		"\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\22\3\2\2\28:\7C\2\29;"+
		"\t\13\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\24\3\2\2\2>B\t\f\2"+
		"\2?A\t\r\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\26\3\2\2\2DB\3\2"+
		"\2\2EG\7\17\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HK\7\f\2\2IK\t\16\2\2JF\3"+
		"\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\f\2\2O\30"+
		"\3\2\2\2\t\2\66<BFJL\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}