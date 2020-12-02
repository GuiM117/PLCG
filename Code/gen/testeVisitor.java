// Generated from C:/Users/Kenny/Desktop/PLCG\teste.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testeParser#turma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurma(testeParser.TurmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link testeParser#alunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlunos(testeParser.AlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link testeParser#aluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAluno(testeParser.AlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link testeParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(testeParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testeParser#notas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotas(testeParser.NotasContext ctx);
}