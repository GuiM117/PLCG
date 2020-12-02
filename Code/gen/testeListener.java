// Generated from C:/Users/Kenny/Desktop/PLCG\teste.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testeParser}.
 */
public interface testeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testeParser#turma}.
	 * @param ctx the parse tree
	 */
	void enterTurma(testeParser.TurmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link testeParser#turma}.
	 * @param ctx the parse tree
	 */
	void exitTurma(testeParser.TurmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link testeParser#alunos}.
	 * @param ctx the parse tree
	 */
	void enterAlunos(testeParser.AlunosContext ctx);
	/**
	 * Exit a parse tree produced by {@link testeParser#alunos}.
	 * @param ctx the parse tree
	 */
	void exitAlunos(testeParser.AlunosContext ctx);
	/**
	 * Enter a parse tree produced by {@link testeParser#aluno}.
	 * @param ctx the parse tree
	 */
	void enterAluno(testeParser.AlunoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testeParser#aluno}.
	 * @param ctx the parse tree
	 */
	void exitAluno(testeParser.AlunoContext ctx);
	/**
	 * Enter a parse tree produced by {@link testeParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(testeParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testeParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(testeParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testeParser#notas}.
	 * @param ctx the parse tree
	 */
	void enterNotas(testeParser.NotasContext ctx);
	/**
	 * Exit a parse tree produced by {@link testeParser#notas}.
	 * @param ctx the parse tree
	 */
	void exitNotas(testeParser.NotasContext ctx);
}