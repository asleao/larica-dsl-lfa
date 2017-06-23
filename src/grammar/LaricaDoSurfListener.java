// Generated from /home/asleao/Google_Drive/IFES/LFA/2017-1/Trabalho Final LFA/LaricaDoSurf.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaricaDoSurfParser}.
 */
public interface LaricaDoSurfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LaricaDoSurfParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LaricaDoSurfParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(@NotNull LaricaDoSurfParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(@NotNull LaricaDoSurfParser.CondicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(@NotNull LaricaDoSurfParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(@NotNull LaricaDoSurfParser.ValorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LaricaDoSurfParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LaricaDoSurfParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(@NotNull LaricaDoSurfParser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(@NotNull LaricaDoSurfParser.DefinicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull LaricaDoSurfParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull LaricaDoSurfParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#expressao_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_condicional(@NotNull LaricaDoSurfParser.Expressao_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#expressao_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_condicional(@NotNull LaricaDoSurfParser.Expressao_condicionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#parametros_real}.
	 * @param ctx the parse tree
	 */
	void enterParametros_real(@NotNull LaricaDoSurfParser.Parametros_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#parametros_real}.
	 * @param ctx the parse tree
	 */
	void exitParametros_real(@NotNull LaricaDoSurfParser.Parametros_realContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#funcao_print}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_print(@NotNull LaricaDoSurfParser.Funcao_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#funcao_print}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_print(@NotNull LaricaDoSurfParser.Funcao_printContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#operadorcomparacao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorcomparacao(@NotNull LaricaDoSurfParser.OperadorcomparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#operadorcomparacao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorcomparacao(@NotNull LaricaDoSurfParser.OperadorcomparacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(@NotNull LaricaDoSurfParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(@NotNull LaricaDoSurfParser.Chamada_funcaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#parametros_formal}.
	 * @param ctx the parse tree
	 */
	void enterParametros_formal(@NotNull LaricaDoSurfParser.Parametros_formalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#parametros_formal}.
	 * @param ctx the parse tree
	 */
	void exitParametros_formal(@NotNull LaricaDoSurfParser.Parametros_formalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull LaricaDoSurfParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull LaricaDoSurfParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#definicao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao_funcao(@NotNull LaricaDoSurfParser.Definicao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#definicao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao_funcao(@NotNull LaricaDoSurfParser.Definicao_funcaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#estrutura_repeticao}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura_repeticao(@NotNull LaricaDoSurfParser.Estrutura_repeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#estrutura_repeticao}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura_repeticao(@NotNull LaricaDoSurfParser.Estrutura_repeticaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(@NotNull LaricaDoSurfParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(@NotNull LaricaDoSurfParser.OperadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LaricaDoSurfParser#tipagem}.
	 * @param ctx the parse tree
	 */
	void enterTipagem(@NotNull LaricaDoSurfParser.TipagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaricaDoSurfParser#tipagem}.
	 * @param ctx the parse tree
	 */
	void exitTipagem(@NotNull LaricaDoSurfParser.TipagemContext ctx);
}