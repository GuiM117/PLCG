// Generated from C:/Users/Kenny/Desktop/PLCG\aprendizagem.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aprendizagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALUNOS=1, RECURSOS=2, CONCEITOS=3, VIRGULA=4, PONTOVIRGULA=5, PONTO=6, 
		LPAREN=7, RPAREN=8, NUM=9, NUMEROALUNO=10, CONCEITO=11, IDRECURSO=12, 
		IDCONCEITO=13, PALAVRA=14, WS=15;
	public static final int
		RULE_cNe = 0, RULE_alunos = 1, RULE_recursos = 2, RULE_conceitos = 3, 
		RULE_listaRecursos = 4, RULE_listaAlunos = 5, RULE_listaConceitos = 6, 
		RULE_rA = 7, RULE_aL = 8, RULE_conceito = 9, RULE_caracteristicas = 10, 
		RULE_temRecurso = 11, RULE_temConceito = 12, RULE_idadeAluno = 13, RULE_idadeIdeal = 14, 
		RULE_caracteristica = 15, RULE_nomeAluno = 16, RULE_idConceito = 17, RULE_nomeConceito = 18, 
		RULE_descr = 19, RULE_idRecurso = 20, RULE_nomeRecurso = 21, RULE_curso = 22, 
		RULE_numero = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"cNe", "alunos", "recursos", "conceitos", "listaRecursos", "listaAlunos", 
			"listaConceitos", "rA", "aL", "conceito", "caracteristicas", "temRecurso", 
			"temConceito", "idadeAluno", "idadeIdeal", "caracteristica", "nomeAluno", 
			"idConceito", "nomeConceito", "descr", "idRecurso", "nomeRecurso", "curso", 
			"numero"
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

	@Override
	public String getGrammarFileName() { return "aprendizagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aprendizagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CNeContext extends ParserRuleContext {
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public ConceitosContext conceitos() {
			return getRuleContext(ConceitosContext.class,0);
		}
		public CNeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cNe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterCNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitCNe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitCNe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CNeContext cNe() throws RecognitionException {
		CNeContext _localctx = new CNeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cNe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			alunos();
			setState(49);
			recursos();
			setState(50);
			conceitos();
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
		public TerminalNode ALUNOS() { return getToken(aprendizagemParser.ALUNOS, 0); }
		public ListaAlunosContext listaAlunos() {
			return getRuleContext(ListaAlunosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(aprendizagemParser.PONTO, 0); }
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterAlunos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitAlunos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitAlunos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alunos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ALUNOS);
			setState(53);
			listaAlunos();
			setState(54);
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

	public static class RecursosContext extends ParserRuleContext {
		public TerminalNode RECURSOS() { return getToken(aprendizagemParser.RECURSOS, 0); }
		public ListaRecursosContext listaRecursos() {
			return getRuleContext(ListaRecursosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(aprendizagemParser.PONTO, 0); }
		public RecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursosContext recursos() throws RecognitionException {
		RecursosContext _localctx = new RecursosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_recursos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(RECURSOS);
			setState(57);
			listaRecursos();
			setState(58);
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

	public static class ConceitosContext extends ParserRuleContext {
		public TerminalNode CONCEITOS() { return getToken(aprendizagemParser.CONCEITOS, 0); }
		public ListaConceitosContext listaConceitos() {
			return getRuleContext(ListaConceitosContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(aprendizagemParser.PONTO, 0); }
		public ConceitosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceitos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterConceitos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitConceitos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitConceitos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceitosContext conceitos() throws RecognitionException {
		ConceitosContext _localctx = new ConceitosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conceitos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONCEITOS);
			setState(61);
			listaConceitos();
			setState(62);
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

	public static class ListaRecursosContext extends ParserRuleContext {
		public List<RAContext> rA() {
			return getRuleContexts(RAContext.class);
		}
		public RAContext rA(int i) {
			return getRuleContext(RAContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(aprendizagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(aprendizagemParser.PONTOVIRGULA, i);
		}
		public ListaRecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaRecursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterListaRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitListaRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitListaRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaRecursosContext listaRecursos() throws RecognitionException {
		ListaRecursosContext _localctx = new ListaRecursosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaRecursos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			rA();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(65);
				match(PONTOVIRGULA);
				setState(66);
				rA();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ListaAlunosContext extends ParserRuleContext {
		public List<ALContext> aL() {
			return getRuleContexts(ALContext.class);
		}
		public ALContext aL(int i) {
			return getRuleContext(ALContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(aprendizagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(aprendizagemParser.PONTOVIRGULA, i);
		}
		public ListaAlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAlunos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterListaAlunos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitListaAlunos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitListaAlunos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaAlunosContext listaAlunos() throws RecognitionException {
		ListaAlunosContext _localctx = new ListaAlunosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaAlunos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			aL();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(73);
				match(PONTOVIRGULA);
				setState(74);
				aL();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ListaConceitosContext extends ParserRuleContext {
		public List<ConceitoContext> conceito() {
			return getRuleContexts(ConceitoContext.class);
		}
		public ConceitoContext conceito(int i) {
			return getRuleContext(ConceitoContext.class,i);
		}
		public List<TerminalNode> PONTOVIRGULA() { return getTokens(aprendizagemParser.PONTOVIRGULA); }
		public TerminalNode PONTOVIRGULA(int i) {
			return getToken(aprendizagemParser.PONTOVIRGULA, i);
		}
		public ListaConceitosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaConceitos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterListaConceitos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitListaConceitos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitListaConceitos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaConceitosContext listaConceitos() throws RecognitionException {
		ListaConceitosContext _localctx = new ListaConceitosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaConceitos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			conceito();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(81);
				match(PONTOVIRGULA);
				setState(82);
				conceito();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class RAContext extends ParserRuleContext {
		public IdRecursoContext idRecurso;
		public NomeRecursoContext nomeRecurso;
		public DescrContext descr;
		public IdadeIdealContext idadeIdeal;
		public IdRecursoContext idRecurso() {
			return getRuleContext(IdRecursoContext.class,0);
		}
		public NomeRecursoContext nomeRecurso() {
			return getRuleContext(NomeRecursoContext.class,0);
		}
		public DescrContext descr() {
			return getRuleContext(DescrContext.class,0);
		}
		public IdadeIdealContext idadeIdeal() {
			return getRuleContext(IdadeIdealContext.class,0);
		}
		public CaracteristicasContext caracteristicas() {
			return getRuleContext(CaracteristicasContext.class,0);
		}
		public RAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterRA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitRA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitRA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RAContext rA() throws RecognitionException {
		RAContext _localctx = new RAContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((RAContext)_localctx).idRecurso = idRecurso();
			setState(89);
			((RAContext)_localctx).nomeRecurso = nomeRecurso();
			setState(90);
			((RAContext)_localctx).descr = descr();
			setState(91);
			((RAContext)_localctx).idadeIdeal = idadeIdeal();
			setState(92);
			caracteristicas();

			    /* recurso ter um intervalo de idade e não idadeIdeal ou intervalo acima da idadeIdeal*/
			    System.out.println("ID: " + (((RAContext)_localctx).idRecurso!=null?_input.getText(((RAContext)_localctx).idRecurso.start,((RAContext)_localctx).idRecurso.stop):null));
			    System.out.println("Recurso: " + (((RAContext)_localctx).nomeRecurso!=null?_input.getText(((RAContext)_localctx).nomeRecurso.start,((RAContext)_localctx).nomeRecurso.stop):null));
			    System.out.println("Descrição: " + (((RAContext)_localctx).descr!=null?_input.getText(((RAContext)_localctx).descr.start,((RAContext)_localctx).descr.stop):null));
			    System.out.println("Idade Ideal: " + (((RAContext)_localctx).idadeIdeal!=null?_input.getText(((RAContext)_localctx).idadeIdeal.start,((RAContext)_localctx).idadeIdeal.stop):null));
			    System.out.println("------------");
			    
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

	public static class ALContext extends ParserRuleContext {
		public NomeAlunoContext nomeAluno;
		public NumeroContext numero;
		public IdadeAlunoContext idadeAluno;
		public NomeAlunoContext nomeAluno() {
			return getRuleContext(NomeAlunoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public IdadeAlunoContext idadeAluno() {
			return getRuleContext(IdadeAlunoContext.class,0);
		}
		public CaracteristicasContext caracteristicas() {
			return getRuleContext(CaracteristicasContext.class,0);
		}
		public ALContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitAL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ALContext aL() throws RecognitionException {
		ALContext _localctx = new ALContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((ALContext)_localctx).nomeAluno = nomeAluno();
			setState(96);
			((ALContext)_localctx).numero = numero();
			setState(97);
			((ALContext)_localctx).idadeAluno = idadeAluno();
			setState(98);
			caracteristicas();

			     System.out.println("Aluno: " + (((ALContext)_localctx).nomeAluno!=null?_input.getText(((ALContext)_localctx).nomeAluno.start,((ALContext)_localctx).nomeAluno.stop):null));
			     System.out.println("numero: " + (((ALContext)_localctx).numero!=null?_input.getText(((ALContext)_localctx).numero.start,((ALContext)_localctx).numero.stop):null));
			     System.out.println("Idade: " + (((ALContext)_localctx).idadeAluno!=null?_input.getText(((ALContext)_localctx).idadeAluno.start,((ALContext)_localctx).idadeAluno.stop):null));
			     System.out.println("------------");
			    
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

	public static class ConceitoContext extends ParserRuleContext {
		public IdConceitoContext idConceito;
		public NomeConceitoContext nomeConceito;
		public CursoContext curso;
		public IdConceitoContext idConceito() {
			return getRuleContext(IdConceitoContext.class,0);
		}
		public NomeConceitoContext nomeConceito() {
			return getRuleContext(NomeConceitoContext.class,0);
		}
		public CursoContext curso() {
			return getRuleContext(CursoContext.class,0);
		}
		public ConceitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterConceito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitConceito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitConceito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceitoContext conceito() throws RecognitionException {
		ConceitoContext _localctx = new ConceitoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conceito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((ConceitoContext)_localctx).idConceito = idConceito();
			setState(102);
			((ConceitoContext)_localctx).nomeConceito = nomeConceito();
			setState(103);
			((ConceitoContext)_localctx).curso = curso();

			    System.out.println("ID: " + (((ConceitoContext)_localctx).idConceito!=null?_input.getText(((ConceitoContext)_localctx).idConceito.start,((ConceitoContext)_localctx).idConceito.stop):null));
			    System.out.println("Conceito: " + (((ConceitoContext)_localctx).nomeConceito!=null?_input.getText(((ConceitoContext)_localctx).nomeConceito.start,((ConceitoContext)_localctx).nomeConceito.stop):null));
			    System.out.println("Curso: " + (((ConceitoContext)_localctx).curso!=null?_input.getText(((ConceitoContext)_localctx).curso.start,((ConceitoContext)_localctx).curso.stop):null));
			    System.out.println("------------");
			    
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

	public static class CaracteristicasContext extends ParserRuleContext {
		public ArrayList<String> listaCarateristicasAluno = new ArrayList<String>();;
		public CaracteristicaContext caracteristica;
		public TerminalNode LPAREN() { return getToken(aprendizagemParser.LPAREN, 0); }
		public List<CaracteristicaContext> caracteristica() {
			return getRuleContexts(CaracteristicaContext.class);
		}
		public CaracteristicaContext caracteristica(int i) {
			return getRuleContext(CaracteristicaContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(aprendizagemParser.RPAREN, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(aprendizagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(aprendizagemParser.VIRGULA, i);
		}
		public CaracteristicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteristicas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterCaracteristicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitCaracteristicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitCaracteristicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracteristicasContext caracteristicas() throws RecognitionException {
		CaracteristicasContext _localctx = new CaracteristicasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caracteristicas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LPAREN);
			setState(107);
			((CaracteristicasContext)_localctx).caracteristica = caracteristica();
			System.out.println("Caracteristica: " + (((CaracteristicasContext)_localctx).caracteristica!=null?_input.getText(((CaracteristicasContext)_localctx).caracteristica.start,((CaracteristicasContext)_localctx).caracteristica.stop):null));
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(109);
				match(VIRGULA);
				setState(110);
				((CaracteristicasContext)_localctx).caracteristica = caracteristica();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if(_localctx.listaCarateristicasAluno.contains((((CaracteristicasContext)_localctx).caracteristica!=null?_input.getText(((CaracteristicasContext)_localctx).caracteristica.start,((CaracteristicasContext)_localctx).caracteristica.stop):null))) System.out.println("Característica já existente.");
			                                else System.out.println("Caracteristica: " + (((CaracteristicasContext)_localctx).caracteristica!=null?_input.getText(((CaracteristicasContext)_localctx).caracteristica.start,((CaracteristicasContext)_localctx).caracteristica.stop):null));
			setState(117);
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

	public static class TemRecursoContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public IdRecursoContext idRecurso() {
			return getRuleContext(IdRecursoContext.class,0);
		}
		public TemRecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temRecurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterTemRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitTemRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitTemRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemRecursoContext temRecurso() throws RecognitionException {
		TemRecursoContext _localctx = new TemRecursoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_temRecurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			numero();
			setState(120);
			idRecurso();
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

	public static class TemConceitoContext extends ParserRuleContext {
		public IdRecursoContext idRecurso() {
			return getRuleContext(IdRecursoContext.class,0);
		}
		public IdConceitoContext idConceito() {
			return getRuleContext(IdConceitoContext.class,0);
		}
		public TemConceitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temConceito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterTemConceito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitTemConceito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitTemConceito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemConceitoContext temConceito() throws RecognitionException {
		TemConceitoContext _localctx = new TemConceitoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_temConceito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			idRecurso();
			setState(123);
			idConceito();
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

	public static class IdadeAlunoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(aprendizagemParser.NUM, 0); }
		public IdadeAlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idadeAluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterIdadeAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitIdadeAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitIdadeAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdadeAlunoContext idadeAluno() throws RecognitionException {
		IdadeAlunoContext _localctx = new IdadeAlunoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_idadeAluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NUM);
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

	public static class IdadeIdealContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(aprendizagemParser.NUM, 0); }
		public IdadeIdealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idadeIdeal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterIdadeIdeal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitIdadeIdeal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitIdadeIdeal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdadeIdealContext idadeIdeal() throws RecognitionException {
		IdadeIdealContext _localctx = new IdadeIdealContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idadeIdeal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NUM);
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

	public static class CaracteristicaContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(aprendizagemParser.PALAVRA, 0); }
		public CaracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteristica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterCaracteristica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitCaracteristica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitCaracteristica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracteristicaContext caracteristica() throws RecognitionException {
		CaracteristicaContext _localctx = new CaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PALAVRA);
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

	public static class NomeAlunoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(aprendizagemParser.PALAVRA, 0); }
		public NomeAlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeAluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterNomeAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitNomeAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitNomeAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeAlunoContext nomeAluno() throws RecognitionException {
		NomeAlunoContext _localctx = new NomeAlunoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nomeAluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(PALAVRA);
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

	public static class IdConceitoContext extends ParserRuleContext {
		public TerminalNode IDCONCEITO() { return getToken(aprendizagemParser.IDCONCEITO, 0); }
		public IdConceitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idConceito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterIdConceito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitIdConceito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitIdConceito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdConceitoContext idConceito() throws RecognitionException {
		IdConceitoContext _localctx = new IdConceitoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idConceito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDCONCEITO);
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

	public static class NomeConceitoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(aprendizagemParser.PALAVRA, 0); }
		public NomeConceitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeConceito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterNomeConceito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitNomeConceito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitNomeConceito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeConceitoContext nomeConceito() throws RecognitionException {
		NomeConceitoContext _localctx = new NomeConceitoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nomeConceito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PALAVRA);
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

	public static class DescrContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(aprendizagemParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(aprendizagemParser.PALAVRA, i);
		}
		public DescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterDescr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitDescr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitDescr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescrContext descr() throws RecognitionException {
		DescrContext _localctx = new DescrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_descr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(PALAVRA);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PALAVRA );
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

	public static class IdRecursoContext extends ParserRuleContext {
		public TerminalNode IDRECURSO() { return getToken(aprendizagemParser.IDRECURSO, 0); }
		public IdRecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idRecurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterIdRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitIdRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitIdRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdRecursoContext idRecurso() throws RecognitionException {
		IdRecursoContext _localctx = new IdRecursoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idRecurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDRECURSO);
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

	public static class NomeRecursoContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(aprendizagemParser.PALAVRA, 0); }
		public NomeRecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeRecurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterNomeRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitNomeRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitNomeRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeRecursoContext nomeRecurso() throws RecognitionException {
		NomeRecursoContext _localctx = new NomeRecursoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nomeRecurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PALAVRA);
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

	public static class CursoContext extends ParserRuleContext {
		public List<TerminalNode> PALAVRA() { return getTokens(aprendizagemParser.PALAVRA); }
		public TerminalNode PALAVRA(int i) {
			return getToken(aprendizagemParser.PALAVRA, i);
		}
		public CursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterCurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitCurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitCurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursoContext curso() throws RecognitionException {
		CursoContext _localctx = new CursoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_curso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(PALAVRA);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PALAVRA );
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMEROALUNO() { return getToken(aprendizagemParser.NUMEROALUNO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NUMEROALUNO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\b"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fr\n\f\f"+
		"\f\16\fu\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\u008d\n\25\r\25"+
		"\16\25\u008e\3\26\3\26\3\27\3\27\3\30\6\30\u0096\n\30\r\30\16\30\u0097"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\2\2\u0089\2\62\3\2\2\2\4\66\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\nB\3"+
		"\2\2\2\fJ\3\2\2\2\16R\3\2\2\2\20Z\3\2\2\2\22a\3\2\2\2\24g\3\2\2\2\26l"+
		"\3\2\2\2\30y\3\2\2\2\32|\3\2\2\2\34\177\3\2\2\2\36\u0081\3\2\2\2 \u0083"+
		"\3\2\2\2\"\u0085\3\2\2\2$\u0087\3\2\2\2&\u0089\3\2\2\2(\u008c\3\2\2\2"+
		"*\u0090\3\2\2\2,\u0092\3\2\2\2.\u0095\3\2\2\2\60\u0099\3\2\2\2\62\63\5"+
		"\4\3\2\63\64\5\6\4\2\64\65\5\b\5\2\65\3\3\2\2\2\66\67\7\3\2\2\678\5\f"+
		"\7\289\7\b\2\29\5\3\2\2\2:;\7\4\2\2;<\5\n\6\2<=\7\b\2\2=\7\3\2\2\2>?\7"+
		"\5\2\2?@\5\16\b\2@A\7\b\2\2A\t\3\2\2\2BG\5\20\t\2CD\7\7\2\2DF\5\20\t\2"+
		"EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IG\3\2\2\2JO\5\22"+
		"\n\2KL\7\7\2\2LN\5\22\n\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\r\3"+
		"\2\2\2QO\3\2\2\2RW\5\24\13\2ST\7\7\2\2TV\5\24\13\2US\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X\17\3\2\2\2YW\3\2\2\2Z[\5*\26\2[\\\5,\27\2\\]\5("+
		"\25\2]^\5\36\20\2^_\5\26\f\2_`\b\t\1\2`\21\3\2\2\2ab\5\"\22\2bc\5\60\31"+
		"\2cd\5\34\17\2de\5\26\f\2ef\b\n\1\2f\23\3\2\2\2gh\5$\23\2hi\5&\24\2ij"+
		"\5.\30\2jk\b\13\1\2k\25\3\2\2\2lm\7\t\2\2mn\5 \21\2ns\b\f\1\2op\7\6\2"+
		"\2pr\5 \21\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\b\f\1\2wx\7\n\2\2x\27\3\2\2\2yz\5\60\31\2z{\5*\26\2{\31\3\2\2\2|"+
		"}\5*\26\2}~\5$\23\2~\33\3\2\2\2\177\u0080\7\13\2\2\u0080\35\3\2\2\2\u0081"+
		"\u0082\7\13\2\2\u0082\37\3\2\2\2\u0083\u0084\7\20\2\2\u0084!\3\2\2\2\u0085"+
		"\u0086\7\20\2\2\u0086#\3\2\2\2\u0087\u0088\7\17\2\2\u0088%\3\2\2\2\u0089"+
		"\u008a\7\20\2\2\u008a\'\3\2\2\2\u008b\u008d\7\20\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f)"+
		"\3\2\2\2\u0090\u0091\7\16\2\2\u0091+\3\2\2\2\u0092\u0093\7\20\2\2\u0093"+
		"-\3\2\2\2\u0094\u0096\7\20\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098/\3\2\2\2\u0099\u009a\7"+
		"\f\2\2\u009a\61\3\2\2\2\bGOWs\u008e\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}