// Generated from C:/Users/Kenny/Desktop/PLCG\aprendizagem.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link aprendizagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface aprendizagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#cNe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCNe(aprendizagemParser.CNeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#alunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlunos(aprendizagemParser.AlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursos(aprendizagemParser.RecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#conceitos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceitos(aprendizagemParser.ConceitosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#listaRecursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaRecursos(aprendizagemParser.ListaRecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#listaAlunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaAlunos(aprendizagemParser.ListaAlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#listaConceitos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaConceitos(aprendizagemParser.ListaConceitosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#rA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRA(aprendizagemParser.RAContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#aL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAL(aprendizagemParser.ALContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#conceito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceito(aprendizagemParser.ConceitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#caracteristicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracteristicas(aprendizagemParser.CaracteristicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#temRecurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemRecurso(aprendizagemParser.TemRecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#temConceito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemConceito(aprendizagemParser.TemConceitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#idadeAluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdadeAluno(aprendizagemParser.IdadeAlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#idadeIdeal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdadeIdeal(aprendizagemParser.IdadeIdealContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#caracteristica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracteristica(aprendizagemParser.CaracteristicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#nomeAluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeAluno(aprendizagemParser.NomeAlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#idConceito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdConceito(aprendizagemParser.IdConceitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#nomeConceito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeConceito(aprendizagemParser.NomeConceitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#descr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescr(aprendizagemParser.DescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#idRecurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRecurso(aprendizagemParser.IdRecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#nomeRecurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeRecurso(aprendizagemParser.NomeRecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#curso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurso(aprendizagemParser.CursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(aprendizagemParser.NumeroContext ctx);
}