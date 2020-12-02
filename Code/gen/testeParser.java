// Generated from C:/Users/Kenny/Desktop/PLCG\teste.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TURMA=1, ID=2, NOME=3, NUM=4, VIRGULA=5, PONTOVIRGULA=6, PONTO=7, LPAREN=8, 
		RPAREN=9, WS=10;
	public static final int
		RULE_turma = 0, RULE_alunos = 1, RULE_aluno = 2, RULE_nome = 3, RULE_notas = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"turma", "alunos", "aluno", "nome", "notas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "','", "';'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TURMA", "ID", "NOME", "NUM", "VIRGULA", "PONTOVIRGULA", "PONTO", 
			"LPAREN", "RPAREN", "WS"
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

	@Override
	public String getGrammarFileName() { return "teste.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TurmaContext extends ParserRuleContext {
		public AlunosContext alunos;
		public TerminalNode TURMA() { return getToken(testeParser.TURMA, 0); }
		public TerminalNode ID() { return getToken(testeParser.ID, 0); }
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(testeParser.PONTO, 0); }
		public TurmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).enterTurma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).exitTurma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testeVisitor ) return ((testeVisitor<? extends T>)visitor).visitTurma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurmaContext turma() throws RecognitionException {
		TurmaContext _localctx = new TurmaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_turma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(TURMA);
			setState(11);
			match(ID);
			setState(12);
			((TurmaContext)_localctx).alunos = alunos();

			        System.out.println("Total de alunos: " + ((TurmaContext)_localctx).alunos.totalAlunos);
			    
			setState(14);
			match(PONTO);
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

	public static class AlunosContext extends ParserRuleContext {
		public int totalAlunos;
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(testeParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(testeParser.PONTOVIRGULA, i);
		}
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).enterAlunos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).exitAlunos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testeVisitor ) return ((testeVisitor<? extends T>)visitor).visitAlunos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alunos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			aluno();
			((AlunosContext)_localctx).totalAlunos = 1;
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(18);
				match(PONTOVIRGULA);
				setState(19);
				aluno();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.totalAlunos++;
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

	public static class AlunoContext extends ParserRuleContext {
		public NomeContext nome;
		public NotasContext notas;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public NotasContext notas() {
			return getRuleContext(NotasContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).enterAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).exitAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testeVisitor ) return ((testeVisitor<? extends T>)visitor).visitAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((AlunoContext)_localctx).nome = nome();
			setState(28);
			((AlunoContext)_localctx).notas = notas();

			     float media = ((AlunoContext)_localctx).notas.soma/((AlunoContext)_localctx).notas.totalNotas;
			     System.out.println("Media do " + (((AlunoContext)_localctx).nome!=null?_input.getText(((AlunoContext)_localctx).nome.start,((AlunoContext)_localctx).nome.stop):null) + ":" + media);
			    
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testeParser.ID, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testeVisitor ) return ((testeVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(ID);
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

	public static class NotasContext extends ParserRuleContext {
		public int soma;
		public int totalNotas;
		public Token n1;
		public Token n2;
		public TerminalNode LPAREN() { return getToken(testeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(testeParser.RPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(testeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(testeParser.NUM, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(testeParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(testeParser.VIRGULA, i);
		}
		public NotasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).enterNotas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testeListener ) ((testeListener)listener).exitNotas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testeVisitor ) return ((testeVisitor<? extends T>)visitor).visitNotas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotasContext notas() throws RecognitionException {
		NotasContext _localctx = new NotasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LPAREN);
			setState(34);
			((NotasContext)_localctx).n1 = match(NUM);
			((NotasContext)_localctx).soma =  (((NotasContext)_localctx).n1!=null?Integer.valueOf(((NotasContext)_localctx).n1.getText()):0); ((NotasContext)_localctx).totalNotas = 1;
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(36);
				match(VIRGULA);
				setState(37);
				((NotasContext)_localctx).n2 = match(NUM);
				_localctx.soma += (((NotasContext)_localctx).n2!=null?Integer.valueOf(((NotasContext)_localctx).n2.getText()):0); _localctx.totalNotas += 1;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RPAREN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2"+
		"-\2\f\3\2\2\2\4\22\3\2\2\2\6\35\3\2\2\2\b!\3\2\2\2\n#\3\2\2\2\f\r\7\3"+
		"\2\2\r\16\7\4\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\21\7\t\2\2\21\3\3\2\2"+
		"\2\22\23\5\6\4\2\23\30\b\3\1\2\24\25\7\b\2\2\25\27\5\6\4\2\26\24\3\2\2"+
		"\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2"+
		"\2\33\34\b\3\1\2\34\5\3\2\2\2\35\36\5\b\5\2\36\37\5\n\6\2\37 \b\4\1\2"+
		" \7\3\2\2\2!\"\7\4\2\2\"\t\3\2\2\2#$\7\n\2\2$%\7\6\2\2%+\b\6\1\2&\'\7"+
		"\7\2\2\'(\7\6\2\2(*\b\6\1\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,."+
		"\3\2\2\2-+\3\2\2\2./\7\13\2\2/\13\3\2\2\2\4\30+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}