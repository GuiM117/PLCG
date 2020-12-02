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
		ALUNOS=1, RECURSOS=2, VIRGULA=3, PONTOVIRGULA=4, PONTO=5, LPAREN=6, RPAREN=7, 
		NUM=8, NUMEROALUNO=9, PALAVRA=10, WS=11;
	public static final int
		RULE_main = 0, RULE_alunos = 1, RULE_recursos = 2, RULE_conceitos = 3, 
		RULE_listaRecursos = 4, RULE_recurso = 5, RULE_listaAlunos = 6, RULE_aluno = 7, 
		RULE_caracteristicas = 8, RULE_conceito = 9, RULE_idade = 10, RULE_caracteristica = 11, 
		RULE_nome = 12, RULE_descr = 13, RULE_id = 14, RULE_curso = 15, RULE_numero = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "alunos", "recursos", "conceitos", "listaRecursos", "recurso", 
			"listaAlunos", "aluno", "caracteristicas", "conceito", "idade", "caracteristica", 
			"nome", "descr", "id", "curso", "numero"
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

	@Override
	public String getGrammarFileName() { return "aprendizagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public aprendizagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public ConceitosContext conceitos() {
			return getRuleContext(ConceitosContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			recursos();
			setState(35);
			alunos();
			setState(36);
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
			setState(38);
			match(ALUNOS);
			setState(39);
			listaAlunos();
			setState(40);
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
			setState(42);
			match(RECURSOS);
			setState(43);
			listaRecursos();
			setState(44);
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
		public List<ConceitoContext> conceito() {
			return getRuleContexts(ConceitoContext.class);
		}
		public ConceitoContext conceito(int i) {
			return getRuleContext(ConceitoContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				conceito();
				}
				}
				setState(49); 
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

	public static class ListaRecursosContext extends ParserRuleContext {
		public List<RecursoContext> recurso() {
			return getRuleContexts(RecursoContext.class);
		}
		public RecursoContext recurso(int i) {
			return getRuleContext(RecursoContext.class,i);
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
			setState(51);
			recurso();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(52);
				match(PONTOVIRGULA);
				setState(53);
				recurso();
				}
				}
				setState(58);
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

	public static class RecursoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DescrContext descr() {
			return getRuleContext(DescrContext.class,0);
		}
		public IdadeContext idade() {
			return getRuleContext(IdadeContext.class,0);
		}
		public CaracteristicasContext caracteristicas() {
			return getRuleContext(CaracteristicasContext.class,0);
		}
		public RecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursoContext recurso() throws RecognitionException {
		RecursoContext _localctx = new RecursoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			id();
			setState(60);
			descr();
			setState(61);
			idade();
			setState(62);
			caracteristicas();
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
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
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
		enterRule(_localctx, 12, RULE_listaAlunos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			aluno();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTOVIRGULA) {
				{
				{
				setState(65);
				match(PONTOVIRGULA);
				setState(66);
				aluno();
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

	public static class AlunoContext extends ParserRuleContext {
		public NomeContext nome;
		public NumeroContext numero;
		public IdadeContext idade;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public IdadeContext idade() {
			return getRuleContext(IdadeContext.class,0);
		}
		public CaracteristicasContext caracteristicas() {
			return getRuleContext(CaracteristicasContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((AlunoContext)_localctx).nome = nome();
			setState(73);
			((AlunoContext)_localctx).numero = numero();
			setState(74);
			((AlunoContext)_localctx).idade = idade();
			setState(75);
			caracteristicas();

			     System.out.println("Aluno: " + (((AlunoContext)_localctx).nome!=null?_input.getText(((AlunoContext)_localctx).nome.start,((AlunoContext)_localctx).nome.stop):null));
			     System.out.println("numero: " + (((AlunoContext)_localctx).numero!=null?_input.getText(((AlunoContext)_localctx).numero.start,((AlunoContext)_localctx).numero.stop):null));
			     System.out.println("Idade: " + (((AlunoContext)_localctx).idade!=null?_input.getText(((AlunoContext)_localctx).idade.start,((AlunoContext)_localctx).idade.stop):null));
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
		enterRule(_localctx, 16, RULE_caracteristicas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LPAREN);
			setState(79);
			((CaracteristicasContext)_localctx).caracteristica = caracteristica();
			System.out.println("Caracteristica: " + (((CaracteristicasContext)_localctx).caracteristica!=null?_input.getText(((CaracteristicasContext)_localctx).caracteristica.start,((CaracteristicasContext)_localctx).caracteristica.stop):null));
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(81);
				match(VIRGULA);
				setState(82);
				((CaracteristicasContext)_localctx).caracteristica = caracteristica();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("Caracteristica: " + (((CaracteristicasContext)_localctx).caracteristica!=null?_input.getText(((CaracteristicasContext)_localctx).caracteristica.start,((CaracteristicasContext)_localctx).caracteristica.stop):null));
			setState(89);
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

	public static class ConceitoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
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
			setState(91);
			nome();
			setState(92);
			curso();
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

	public static class IdadeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(aprendizagemParser.NUM, 0); }
		public IdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterIdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitIdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitIdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdadeContext idade() throws RecognitionException {
		IdadeContext _localctx = new IdadeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_idade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 22, RULE_caracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode PALAVRA() { return getToken(aprendizagemParser.PALAVRA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 26, RULE_descr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(PALAVRA);
				}
				}
				setState(103); 
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(aprendizagemParser.NUM, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aprendizagemListener ) ((aprendizagemListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof aprendizagemVisitor ) return ((aprendizagemVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 30, RULE_curso);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					match(PALAVRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 32, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\ru\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5\62\n\5\r\5\16\5\63"+
		"\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7"+
		"\bF\n\b\f\b\16\bI\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n"+
		"V\n\n\f\n\16\nY\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\6\17h\n\17\r\17\16\17i\3\20\3\20\3\21\6\21o\n\21\r\21\16\21p"+
		"\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2"+
		"i\2$\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\65\3\2\2\2\f=\3\2\2"+
		"\2\16B\3\2\2\2\20J\3\2\2\2\22P\3\2\2\2\24]\3\2\2\2\26`\3\2\2\2\30b\3\2"+
		"\2\2\32d\3\2\2\2\34g\3\2\2\2\36k\3\2\2\2 n\3\2\2\2\"r\3\2\2\2$%\5\6\4"+
		"\2%&\5\4\3\2&\'\5\b\5\2\'\3\3\2\2\2()\7\3\2\2)*\5\16\b\2*+\7\7\2\2+\5"+
		"\3\2\2\2,-\7\4\2\2-.\5\n\6\2./\7\7\2\2/\7\3\2\2\2\60\62\5\24\13\2\61\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65:\5"+
		"\f\7\2\66\67\7\6\2\2\679\5\f\7\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;\13\3\2\2\2<:\3\2\2\2=>\5\36\20\2>?\5\34\17\2?@\5\26\f\2@A\5\22\n"+
		"\2A\r\3\2\2\2BG\5\20\t\2CD\7\6\2\2DF\5\20\t\2EC\3\2\2\2FI\3\2\2\2GE\3"+
		"\2\2\2GH\3\2\2\2H\17\3\2\2\2IG\3\2\2\2JK\5\32\16\2KL\5\"\22\2LM\5\26\f"+
		"\2MN\5\22\n\2NO\b\t\1\2O\21\3\2\2\2PQ\7\b\2\2QR\5\30\r\2RW\b\n\1\2ST\7"+
		"\5\2\2TV\5\30\r\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW"+
		"\3\2\2\2Z[\b\n\1\2[\\\7\t\2\2\\\23\3\2\2\2]^\5\32\16\2^_\5 \21\2_\25\3"+
		"\2\2\2`a\7\n\2\2a\27\3\2\2\2bc\7\f\2\2c\31\3\2\2\2de\7\f\2\2e\33\3\2\2"+
		"\2fh\7\f\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\35\3\2\2\2kl\7\n"+
		"\2\2l\37\3\2\2\2mo\7\f\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q!\3"+
		"\2\2\2rs\7\13\2\2s#\3\2\2\2\b\63:GWip";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}