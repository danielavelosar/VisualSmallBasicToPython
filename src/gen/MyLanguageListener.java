// Generated from C:/Users/Lenovo/code/lp/anaSemantico/src/grammar\MyLanguage.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MyLanguageParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MyLanguageParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MyLanguageParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MyLanguageParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#declarar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar(MyLanguageParser.DeclararContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#declarar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar(MyLanguageParser.DeclararContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MyLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MyLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatriz(MyLanguageParser.MatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatriz(MyLanguageParser.MatrizContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(MyLanguageParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(MyLanguageParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico1}.
	 * @param ctx the parse tree
	 */
	void enterLogico1(MyLanguageParser.Logico1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico1}.
	 * @param ctx the parse tree
	 */
	void exitLogico1(MyLanguageParser.Logico1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico1p}.
	 * @param ctx the parse tree
	 */
	void enterLogico1p(MyLanguageParser.Logico1pContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico1p}.
	 * @param ctx the parse tree
	 */
	void exitLogico1p(MyLanguageParser.Logico1pContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico2}.
	 * @param ctx the parse tree
	 */
	void enterLogico2(MyLanguageParser.Logico2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico2}.
	 * @param ctx the parse tree
	 */
	void exitLogico2(MyLanguageParser.Logico2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico2p}.
	 * @param ctx the parse tree
	 */
	void enterLogico2p(MyLanguageParser.Logico2pContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico2p}.
	 * @param ctx the parse tree
	 */
	void exitLogico2p(MyLanguageParser.Logico2pContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico3}.
	 * @param ctx the parse tree
	 */
	void enterLogico3(MyLanguageParser.Logico3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico3}.
	 * @param ctx the parse tree
	 */
	void exitLogico3(MyLanguageParser.Logico3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logico3p}.
	 * @param ctx the parse tree
	 */
	void enterLogico3p(MyLanguageParser.Logico3pContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logico3p}.
	 * @param ctx the parse tree
	 */
	void exitLogico3p(MyLanguageParser.Logico3pContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#operrel}.
	 * @param ctx the parse tree
	 */
	void enterOperrel(MyLanguageParser.OperrelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#operrel}.
	 * @param ctx the parse tree
	 */
	void exitOperrel(MyLanguageParser.OperrelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica1}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica1(MyLanguageParser.Aritmetica1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica1}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica1(MyLanguageParser.Aritmetica1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica1p}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica1p(MyLanguageParser.Aritmetica1pContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica1p}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica1p(MyLanguageParser.Aritmetica1pContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void enterOpsuma(MyLanguageParser.OpsumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#opsuma}.
	 * @param ctx the parse tree
	 */
	void exitOpsuma(MyLanguageParser.OpsumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica2}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica2(MyLanguageParser.Aritmetica2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica2}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica2(MyLanguageParser.Aritmetica2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica2p}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica2p(MyLanguageParser.Aritmetica2pContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica2p}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica2p(MyLanguageParser.Aritmetica2pContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#opmultiplicar}.
	 * @param ctx the parse tree
	 */
	void enterOpmultiplicar(MyLanguageParser.OpmultiplicarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#opmultiplicar}.
	 * @param ctx the parse tree
	 */
	void exitOpmultiplicar(MyLanguageParser.OpmultiplicarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica3}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica3(MyLanguageParser.Aritmetica3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica3}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica3(MyLanguageParser.Aritmetica3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#aritmetica4}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica4(MyLanguageParser.Aritmetica4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#aritmetica4}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica4(MyLanguageParser.Aritmetica4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(MyLanguageParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(MyLanguageParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#integrada}.
	 * @param ctx the parse tree
	 */
	void enterIntegrada(MyLanguageParser.IntegradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#integrada}.
	 * @param ctx the parse tree
	 */
	void exitIntegrada(MyLanguageParser.IntegradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#palabrasfuncionales}.
	 * @param ctx the parse tree
	 */
	void enterPalabrasfuncionales(MyLanguageParser.PalabrasfuncionalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#palabrasfuncionales}.
	 * @param ctx the parse tree
	 */
	void exitPalabrasfuncionales(MyLanguageParser.PalabrasfuncionalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#parametrosp}.
	 * @param ctx the parse tree
	 */
	void enterParametrosp(MyLanguageParser.ParametrospContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#parametrosp}.
	 * @param ctx the parse tree
	 */
	void exitParametrosp(MyLanguageParser.ParametrospContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(MyLanguageParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(MyLanguageParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(MyLanguageParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(MyLanguageParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#sinosis}.
	 * @param ctx the parse tree
	 */
	void enterSinosis(MyLanguageParser.SinosisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#sinosis}.
	 * @param ctx the parse tree
	 */
	void exitSinosis(MyLanguageParser.SinosisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(MyLanguageParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(MyLanguageParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(MyLanguageParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(MyLanguageParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MyLanguageParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MyLanguageParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(MyLanguageParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(MyLanguageParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MyLanguageParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MyLanguageParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#ir}.
	 * @param ctx the parse tree
	 */
	void enterIr(MyLanguageParser.IrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#ir}.
	 * @param ctx the parse tree
	 */
	void exitIr(MyLanguageParser.IrContext ctx);
}