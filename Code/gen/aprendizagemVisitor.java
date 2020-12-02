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
	 * Visit a parse tree produced by {@link aprendizagemParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(aprendizagemParser.MainContext ctx);
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
	 * Visit a parse tree produced by {@link aprendizagemParser#recurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurso(aprendizagemParser.RecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#listaAlunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaAlunos(aprendizagemParser.ListaAlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#aluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAluno(aprendizagemParser.AlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#caracteristicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracteristicas(aprendizagemParser.CaracteristicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#conceito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConceito(aprendizagemParser.ConceitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#idade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdade(aprendizagemParser.IdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#caracteristica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracteristica(aprendizagemParser.CaracteristicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(aprendizagemParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#descr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescr(aprendizagemParser.DescrContext ctx);
	/**
	 * Visit a parse tree produced by {@link aprendizagemParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(aprendizagemParser.IdContext ctx);
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