// Generated from C:/Users/Lenovo/code/lp/anaSemantico/src/grammar\MyLanguage.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MyLanguageParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(MyLanguageParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#declarar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar(MyLanguageParser.DeclararContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MyLanguageParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatriz(MyLanguageParser.MatrizContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(MyLanguageParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico1(MyLanguageParser.Logico1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico1p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico1p(MyLanguageParser.Logico1pContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico2(MyLanguageParser.Logico2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico2p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico2p(MyLanguageParser.Logico2pContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico3(MyLanguageParser.Logico3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#logico3p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico3p(MyLanguageParser.Logico3pContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#operrel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperrel(MyLanguageParser.OperrelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica1(MyLanguageParser.Aritmetica1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica1p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica1p(MyLanguageParser.Aritmetica1pContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#opsuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpsuma(MyLanguageParser.OpsumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica2(MyLanguageParser.Aritmetica2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica2p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica2p(MyLanguageParser.Aritmetica2pContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#opmultiplicar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpmultiplicar(MyLanguageParser.OpmultiplicarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica3(MyLanguageParser.Aritmetica3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#aritmetica4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica4(MyLanguageParser.Aritmetica4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(MyLanguageParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#integrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegrada(MyLanguageParser.IntegradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#palabrasfuncionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalabrasfuncionales(MyLanguageParser.PalabrasfuncionalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#parametrosp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosp(MyLanguageParser.ParametrospContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(MyLanguageParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(MyLanguageParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#sinosis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinosis(MyLanguageParser.SinosisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(MyLanguageParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(MyLanguageParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(MyLanguageParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(MyLanguageParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MyLanguageParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIr(MyLanguageParser.IrContext ctx);
}