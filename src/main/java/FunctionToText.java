import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Arrays;
import java.util.Stack;

public class FunctionToText extends MyLanguageBaseListener{
    String nomFuncion;
    String main = "";
    String definicionFuncion = "def ";
    String asignacion = "";
    int numTabs = 1;


    Stack<String> listasCreadas = new Stack<String>();
    Stack<String> objetosCreados = new Stack<String>();

    Stack<String> paranetrosCreados = new Stack<String>();
    public FunctionToText(String nombreFuncion) {
        super();
        this.nomFuncion = nombreFuncion;
    }

    private void tab(int numTabs){
        while(numTabs>0){
            main = main.concat("    ");
            numTabs --;
        }
    }

    @Override
    public void enterFuncion(MyLanguageParser.FuncionContext ctx) {

        if(ctx.ID() != null){

            if(ctx.ID().getText().equals(nomFuncion)){
                definicionFuncion = definicionFuncion.concat(nomFuncion);
                definicionFuncion = definicionFuncion.concat("():");
                main = main.concat("\n");

                tab(numTabs);

            }
            if(ctx.comandos() != null){
                main = main.concat("\n");
                visitComandos(ctx.comandos(), numTabs);
            }

        }

        if(ctx.ENDSUB() != null) {
            System.out.println(definicionFuncion);
            System.out.println(asignacion);
            System.out.println(main);
        }


    }

    public void visitLogico1(MyLanguageParser.Logico1Context ctx){
        if(ctx.logico2() != null){
            visitLogico2(ctx.logico2());
        }

        if(ctx.logico1p() != null){
            visitLogico1p(ctx.logico1p());
        }
    };

    public void visitLogico2(MyLanguageParser.Logico2Context ctx){
        if(ctx.logico3() != null){
            visitLogico3(ctx.logico3());
        }

        if(ctx.logico2p() != null){
            visitLogico2p(ctx.logico2p());
        }
    };


    public void visitLogico1p(MyLanguageParser.Logico1pContext ctx){
        if(ctx.OR() != null){
            main = main.concat("  or  ");
        }

        if(ctx.logico2() != null){
            visitLogico2(ctx.logico2());
        }

        if(ctx.logico1p() != null){
            visitLogico1p(ctx.logico1p());
        }
    };

    public void visitLogico2p(MyLanguageParser.Logico2pContext ctx){
        if(ctx.AND() != null){
            main = main.concat("  and  ");
        }

        if(ctx.logico3() != null){
            visitLogico3(ctx.logico3());
        }

        if(ctx.logico2p() != null){
            visitLogico2p(ctx.logico2p());
        }
    };

    public void visitLogico3(MyLanguageParser.Logico3Context ctx){
        if(ctx.aritmetica1() != null){
            visitAritmetica1(ctx.aritmetica1());
        }

        if(ctx.logico3p() != null){
            visitLogico3p(ctx.logico3p());
        }
    };

    public void visitLogico3p(MyLanguageParser.Logico3pContext ctx){
        if(ctx.operrel() != null){
            visitOperrel(ctx.operrel());
        }

        if(ctx.aritmetica1() != null){
            visitAritmetica1(ctx.aritmetica1());
        }
    };


    public void visitOperrel(MyLanguageParser.OperrelContext ctx){
        if(ctx.TKN_EQUALS() != null){
            main = main.concat("==");
        }

        if(ctx.TKN_DIFF() != null){
            main = main.concat("<>");
        }

        if(ctx.TKN_GREATER() != null){
            main = main.concat(">");
        }

        if(ctx.TKN_LESS() != null){
            main = main.concat("<");
        }

        if(ctx.TKN_GEQ() != null){
            main = main.concat(">=");
        }

        if(ctx.TKN_LEQ() != null){
            main = main.concat("<=");
        }


    };


    public void visitAritmetica1(MyLanguageParser.Aritmetica1Context ctx){
        if(ctx.aritmetica2() != null){
            visitAritmetica2(ctx.aritmetica2());
        }

        if(ctx.aritmetica1p() != null){
            visitAritmetica1p(ctx.aritmetica1p());
        }

    }

    public void visitAritmetica1p(MyLanguageParser.Aritmetica1pContext ctx){
        if(ctx.opsuma() != null){
            visitOpsuma(ctx.opsuma());
        }

        if(ctx.aritmetica2() != null){
            visitAritmetica2(ctx.aritmetica2());
        }

        if(ctx.aritmetica1p() != null){
            visitAritmetica1p(ctx.aritmetica1p());
        }
    };

    public void visitOpsuma(MyLanguageParser.OpsumaContext ctx){
        if(ctx.TKN_PLUS() != null){
            main = main.concat("+");
        }

        if(ctx.TKN_MINUS() != null){
            main = main.concat("-");
        }

    };

    public void visitOpsumaFormateado(MyLanguageParser.OpsumaContext ctx){
        if(ctx.TKN_PLUS() != null){
            main = main.concat("");
        }

        if(ctx.TKN_MINUS() != null){
            main = main.concat("-");
        }

    };

    public void visitLogico1Formateado(MyLanguageParser.Logico1Context ctx){
        if(ctx.logico2() != null){
            visitLogico2Formateado(ctx.logico2());
        }

        if(ctx.logico1p() != null){
            visitLogico1pFormateado(ctx.logico1p());
        }
    };

    public void visitLogico2Formateado(MyLanguageParser.Logico2Context ctx){
        if(ctx.logico3() != null){
            visitLogico3Formateado(ctx.logico3());
        }

        if(ctx.logico2p() != null){
            visitLogico2pFormateado(ctx.logico2p());
        }
    };


    public void visitLogico1pFormateado(MyLanguageParser.Logico1pContext ctx){
        if(ctx.OR() != null){
            main = main.concat("  or  ");
        }

        if(ctx.logico2() != null){
            visitLogico2(ctx.logico2());
        }

        if(ctx.logico1p() != null){
            visitLogico1p(ctx.logico1p());
        }
    };

    public void visitLogico2pFormateado(MyLanguageParser.Logico2pContext ctx){
        if(ctx.AND() != null){
            main = main.concat("  and  ");
        }

        if(ctx.logico3() != null){
            visitLogico3Formateado(ctx.logico3());
        }

        if(ctx.logico2p() != null){
            visitLogico2pFormateado(ctx.logico2p());
        }
    };

    public void visitLogico3Formateado(MyLanguageParser.Logico3Context ctx){
        if(ctx.aritmetica1() != null){
            visitAritmetica1Formateado(ctx.aritmetica1());
        }

        if(ctx.logico3p() != null){
            visitLogico3pFormateado(ctx.logico3p());
        }
    };

    public void visitLogico3pFormateado(MyLanguageParser.Logico3pContext ctx){
        if(ctx.operrel() != null){
            visitOperrel(ctx.operrel());
        }

        if(ctx.aritmetica1() != null){
            visitAritmetica1Formateado(ctx.aritmetica1());
        }
    };


    public void visitAritmetica1Formateado(MyLanguageParser.Aritmetica1Context ctx){


        if(ctx.aritmetica2() != null){
            MyLanguageParser.Aritmetica2Context childCtx = ctx.aritmetica2();
            if(childCtx.getChild(0).getText().contains("\"")) {
                visitAritmetica2Formateado(ctx.aritmetica2());
            }
            else {
                visitAritmetica2(ctx.aritmetica2());
            }
        }

        if(ctx.aritmetica1p() != null){
            if(ctx.getText().contains("\"")) {
                visitAritmetica1pFormateado(ctx.aritmetica1p());
            }
            else {
                visitAritmetica1p(ctx.aritmetica1p());
            }

        }

    }

    public void visitAritmetica1pFormateado(MyLanguageParser.Aritmetica1pContext ctx){
        if(ctx.opsuma() != null){

            visitOpsumaFormateado(ctx.opsuma());
        }

        if(ctx.aritmetica2() != null){

            //main = main.concat("{");
            visitAritmetica2Formateado(ctx.aritmetica2());
            //main = main.concat("}");

        }

        if(ctx.aritmetica1p() != null){
            //main = main.concat("{");
            visitAritmetica1pFormateado(ctx.aritmetica1p());
            //main = main.concat("}");
        }
    };



    public void visitAritmetica2Formateado(MyLanguageParser.Aritmetica2Context ctx){
        if(ctx.aritmetica3() != null){
            visitAritmetica3Formateado(ctx.aritmetica3());
        }

        if(ctx.aritmetica2p() != null){
            visitAritmetica2pFormateado(ctx.aritmetica2p());
        }

    };

    public void visitAritmetica2pFormateado(MyLanguageParser.Aritmetica2pContext ctx){
        if(ctx.opmultiplicar() != null){
            visitOpmultiplicar(ctx.opmultiplicar());
        }

        if(ctx.aritmetica3() != null){
            visitAritmetica3Formateado(ctx.aritmetica3());
        }

        if(ctx.aritmetica2p() != null){
            visitAritmetica2pFormateado(ctx.aritmetica2p());
        }
    };

    public void visitAritmetica3Formateado(MyLanguageParser.Aritmetica3Context ctx){
        if(ctx.TKN_MINUS() != null){
            main = main.concat(" menos ");
        }

        if(ctx.aritmetica4() != null){
            visitAritmetica4Formateado(ctx.aritmetica4());
        }

    };


    public void visitAritmetica4Formateado(MyLanguageParser.Aritmetica4Context ctx){
        if(ctx.valor() != null){
            visitValorFormateado(ctx.valor());
        }

        if(ctx.integrada() != null){
            visitIntegrada(ctx.integrada());
        }

        if(ctx.identificador() != null){

            //main = main.concat("{");
            visitIdentificadorFormateado(ctx.identificador());
            //main = main.concat("}");
        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("(");
        }

        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat(")");
        }

    };


    public void visitAritmetica2(MyLanguageParser.Aritmetica2Context ctx){
        if(ctx.aritmetica3() != null){
            visitAritmetica3(ctx.aritmetica3());
        }

        if(ctx.aritmetica2p() != null){
            visitAritmetica2p(ctx.aritmetica2p());
        }

    };

    public void visitAritmetica2p(MyLanguageParser.Aritmetica2pContext ctx){
        if(ctx.opmultiplicar() != null){
            visitOpmultiplicar(ctx.opmultiplicar());
        }

        if(ctx.aritmetica3() != null){
            visitAritmetica3(ctx.aritmetica3());
        }

        if(ctx.aritmetica2p() != null){
            visitAritmetica2p(ctx.aritmetica2p());
        }
    };

    public void visitOpmultiplicar(MyLanguageParser.OpmultiplicarContext ctx){
        if(ctx.TKN_TIMES() != null){
            main = main.concat("*");
        }

        if(ctx.TKN_DIV() != null){
            main = main.concat("/");
        }

    };

    public void visitAritmetica3(MyLanguageParser.Aritmetica3Context ctx){
        if(ctx.TKN_MINUS() != null){
            main = main.concat(" menos ");
        }

        if(ctx.aritmetica4() != null){
            visitAritmetica4(ctx.aritmetica4());
        }

    };


    public void visitAritmetica4(MyLanguageParser.Aritmetica4Context ctx){
        if(ctx.valor() != null){
            visitValor(ctx.valor());
        }

        if(ctx.integrada() != null){
            visitIntegrada(ctx.integrada());
        }

        if(ctx.identificador() != null){
            main = main.concat("");
            visitIdentificador(ctx.identificador());
        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("(");
        }

        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat(")");
        }

    };


    public void visitValor(MyLanguageParser.ValorContext ctx){
        if(ctx.TRUE() != null){
            main = main.concat("True ");
        }

        if(ctx.FALSE() != null){
            main = main.concat("False ");
        }

        if(ctx.TKN_NUMBER() != null){
            main = main.concat( ctx.TKN_NUMBER().getText());
        }

        if(ctx.TKN_TEXT() != null){
            main = main.concat(  " "+ ctx.TKN_TEXT().getText() + " ");
        }

    };

    public void visitValorFormateado(MyLanguageParser.ValorContext ctx){
        if(ctx.TRUE() != null){
            main = main.concat("True ");
        }

        if(ctx.FALSE() != null){
            main = main.concat("False ");
        }

        if(ctx.TKN_NUMBER() != null){
            main = main.concat( ctx.TKN_NUMBER().getText());
        }

        if(ctx.TKN_TEXT() != null){
            String texto = ctx.TKN_TEXT().getText();
            main = main.concat(  " "+ texto.substring(1, texto.length()-1 ) + " ");
        }

    };


    public void visitIntegrada(MyLanguageParser.IntegradaContext ctx){
        main = main.concat("");

        if(ctx.palabrasfuncionales() != null){
            if(ctx.palabrasfuncionales().getChild(0).getText().equals("TextWindow")){
                if(ctx.ID() != null){
                    if(ctx.ID().getText().equals("WriteLine")){
                        main = main.concat("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            main = main.concat("(");
                        }

                        if(ctx.parametros() != null){
                            //MyLanguageParser.ParametrosContext paramCtx = ctx.parametros();
                            visitParametros(ctx.parametros());
                            //TODO que cuando haya texto debe irse a parametrso formateados
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            main = main.concat(")");
                        }
                    }
                    if(ctx.ID().getText().equals("Write")){
                        main = main.concat("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            main = main.concat("(");
                        }

                        if(ctx.parametros() != null){
                            visitParametros(ctx.parametros());
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            main = main.concat(", end='')");
                        }
                    }

                }
            }
            else if(ctx.palabrasfuncionales().getChild(0).getText().equals("Array")){
                if(ctx.ID() != null){
                    if(ctx.ID().getText().equals("WriteLine")){
                        System.out.print("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            System.out.print("(");
                        }

                        if(ctx.parametros() != null){
                            visitParametros(ctx.parametros());
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            System.out.print(")");
                        }
                    }
                    if(ctx.ID().getText().equals("Write")){
                        System.out.print("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            System.out.print("(");
                        }

                        if(ctx.parametros() != null){
                            visitParametros(ctx.parametros());
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            System.out.print(", end='')");
                        }
                    }

                }
            }
            else if(ctx.palabrasfuncionales().getChild(0).getText().equals("Stack")){
                if(ctx.ID() != null){
                    if(ctx.ID().getText().equals("PushValue")){


                        if(ctx.parametros() != null){
                            MyLanguageParser.ParametrosContext childCtx = ctx.parametros();
                            if(listasCreadas.search(childCtx.logico1().getPayload().getText()) == -1) {
                                System.out.println(childCtx.logico1().getPayload().getText() + "= []");
                                listasCreadas.push(childCtx.logico1().getPayload().getText());
                            }
                            main = main.concat(childCtx.logico1().getPayload().getText()+".append");
                            main = main.concat("(");
                            main = main.concat(childCtx.getChild(1).getChild(1).getText());
                            main = main.concat(")");
                        }


                    }
                    if(ctx.ID().getText().equals("PopValue")){
                        if(ctx.parametros() != null){
                            MyLanguageParser.ParametrosContext childCtx = ctx.parametros();
                            main = main.concat(childCtx.logico1().getPayload().getText()+".pop()");
                        }
                    }

                }
            }
            else if(ctx.palabrasfuncionales().getChild(0).getText().equals("Program")){
                if(ctx.ID() != null){
                    if(ctx.ID().getText().equals("WriteLine")){
                        main = main.concat("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            main = main.concat("(");
                        }

                        if(ctx.parametros() != null){
                            visitParametros(ctx.parametros());
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            main = main.concat(")");
                        }
                    }
                    if(ctx.ID().getText().equals("Write")){
                        main = main.concat("print");
                        if(ctx.TKN_LEFT_PAREN() != null){
                            main = main.concat("(");
                        }

                        if(ctx.parametros() != null){
                            visitParametros(ctx.parametros());
                        }

                        if(ctx.TKN_RIGHT_PAREN() != null){
                            main = main.concat(", end='')");
                        }
                    }

                }
            }

        }


    };




    public void visitParametros(MyLanguageParser.ParametrosContext ctx){
        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.parametrosp() != null){
            visitParametrosp(ctx.parametrosp());
        }

    };

    public void visitParametrosFormateados(MyLanguageParser.ParametrosContext ctx){
        main = main.concat("f'");

        if(ctx.logico1() != null){
            main = main.concat("{");
            visitLogico1Formateado(ctx.logico1());
            main = main.concat("}");
        }

        if(ctx.parametrosp() != null){
            visitParametrospFormateado(ctx.parametrosp());
        }
        main = main.concat("'");
    };


    public void visitParametrosp(MyLanguageParser.ParametrospContext ctx){
        if(ctx.TKN_COMMA() != null){
            main = main.concat(" , ");
        }

        if(ctx.parametros() != null){
            visitParametros(ctx.parametros());
        }

    };

    public void visitParametrospFormateado(MyLanguageParser.ParametrospContext ctx){
        if(ctx.TKN_COMMA() != null){
            main = main.concat(" , ");
        }

        if(ctx.parametros() != null){
            visitParametrosFormateados(ctx.parametros());
        }

    };


    public void visitComandos(MyLanguageParser.ComandosContext ctx, int numTabs){
        tab(numTabs);
        if(ctx.comando() != null){
            visitComando(ctx.comando());
        }

        if(ctx.comandos() != null){
            visitComandos(ctx.comandos(), numTabs);
        }

    };


    public void visitComando(MyLanguageParser.ComandoContext ctx){
        if(ctx.declarar() != null){
            visitDeclarar(ctx.declarar());
        }

        if(ctx.si() != null){
            visitSi(ctx.si());
        }

        if(ctx.mientras() != null){
            visitMientras(ctx.mientras());
        }

        if(ctx.para() != null){
            visitPara(ctx.para());
        }

        if(ctx.integrada() != null){
            visitIntegrada(ctx.integrada());
            main = main.concat("\n");
        }

        if(ctx.ir() != null){
            visitIr(ctx.ir());
        }

    };


    public void visitDeclarar(MyLanguageParser.DeclararContext ctx){

        if(ctx.ID() != null){
            if(ctx.tipo() != null){
                MyLanguageParser.TipoContext newCtx = ctx.tipo();
                if(newCtx.TKN_COLON() != null){
                    main = main.concat("\n");
                    main = main.concat("# ");
                }
            }
            if(ctx.ID().getText().equals("return")){
                main = main.concat("return4");
            }
            else{
                main = main.concat(ctx.ID().getText());
            }
        }

        if(ctx.tipo() != null){
            visitTipo(ctx.tipo());
            MyLanguageParser.TipoContext newCtx = ctx.tipo();
            if(newCtx.TKN_COLON() != null){
                main = main.concat("\n");
            }
        }

        main = main.concat("\n");
    };



    public void visitTipo(MyLanguageParser.TipoContext ctx){
        if(ctx.matriz() != null){
            for (MyLanguageParser.MatrizContext i : ctx.matriz()) {
                visitMatriz(i);
                if(objetosCreados.search(ctx.getParent().getChild(0).getText())==-1){
                    System.out.println(ctx.getParent().getChild(0).getText() + "={}");
                    objetosCreados.push(ctx.getParent().getChild(0).getText() );
                }

            }
        }

        if(ctx.TKN_EQUALS() != null){
            if(paranetrosCreados.search(ctx.getParent().getChild(0).getText())== -1){
                if(ctx.getParent().getChild(0).getText().equals("return")){
                    asignacion = asignacion.concat("    global return4"+"\n");
                    paranetrosCreados.push(ctx.getParent().getChild(0).getText() );
                }
                else{
                    asignacion = asignacion.concat("    global "+ctx.getParent().getChild(0).getText()+"\n");
                    paranetrosCreados.push(ctx.getParent().getChild(0).getText() );
                }

            }
            main = main.concat("=");
        }

        if(ctx.aritmetica1() != null){
            visitAritmetica1(ctx.aritmetica1());
        }

        if(ctx.TKN_COLON() != null){
            main = main.concat(": en este punto");

        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("(");
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat(") ");
        }

    };


    public void visitMatriz(MyLanguageParser.MatrizContext ctx){
        if(ctx.TKN_LEFT_BRAC() != null){
            main = main.concat("[");
        }

        if(ctx.logico1() != null){
            MyLanguageParser.Logico1Context logicCtx = ctx.logico1();
            if(logicCtx.logico2().logico3().aritmetica1().getText().contains("\"")){
                main = main.concat("f'");
                visitLogico1Formateado(ctx.logico1());
                main = main.concat("'");
            }
            else{
                visitLogico1(ctx.logico1( ));
            }



        }

        if(ctx.TKN_RIGHT_BRAC() != null){
            main = main.concat("]");
        }

    };


    public void visitIdentificador(MyLanguageParser.IdentificadorContext ctx){
        if(ctx.ID() != null){
            if(ctx.ID().getText().equals("return")){
                main = main.concat("return4");
            }
            else{
                main = main.concat(ctx.ID().getText());
            }

        }

        if(ctx.matriz() != null){
            for (MyLanguageParser.MatrizContext i : ctx.matriz())
                visitMatriz(i);
        }
    };


    public void visitIdentificadorFormateado(MyLanguageParser.IdentificadorContext ctx){


        if(ctx.matriz() != null){
            main = main.concat("{");
            if(ctx.ID() != null){
                main = main.concat(ctx.ID().getText());
            }
            for (MyLanguageParser.MatrizContext i : ctx.matriz())
                visitMatriz(i);

            main = main.concat("}");
        }

        else{
            main = main.concat("{");
            if(ctx.ID() != null){
                main = main.concat(ctx.ID().getText());
            }
            main = main.concat("}");

        }
    };


    public void visitSi(MyLanguageParser.SiContext ctx){
        if(ctx.IF() != null){
            main = main.concat("if ");
        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("");
        }

        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat("");
        }

        if(ctx.THEN() != null){
            main = main.concat(": \n");
        }

        if(ctx.comandos() != null){
            numTabs++;
            visitComandos(ctx.comandos(), numTabs);
        }

        if(ctx.sinosis() != null){
            main = main.concat("\n");
            visitSinosis(ctx.sinosis(), numTabs-1);
        }

        if(ctx.sino() != null){
            main = main.concat("\n");
            visitSino(ctx.sino(), numTabs-1);
        }

        if(ctx.ENDIF() != null){
            main = main.concat("\n");
        }

    };


    public void visitSinosis(MyLanguageParser.SinosisContext ctx, int  numTabs){
        tab(numTabs);
        if(ctx.ELSEIF() != null){
            main = main.concat("\n");
            main = main.concat("elif");
        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("\n");
        }

        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat("");
        }

        if(ctx.THEN() != null){
            main = main.concat(": ");
            main = main.concat("\n");
        }

        if(ctx.comandos() != null){
            numTabs++;
            visitComandos(ctx.comandos(), numTabs);
        }

        if(ctx.sinosis() != null){
            main = main.concat("\n");
            visitSinosis(ctx.sinosis(), numTabs);
        }

    };


    public void visitSino(MyLanguageParser.SinoContext ctx, int numTabs){
        tab(numTabs);
        if(ctx.ELSE() != null){
            main = main.concat("else:");
            main = main.concat("\n");
        }

        if(ctx.comandos() != null){
            numTabs++;
            visitComandos(ctx.comandos(), numTabs);
        }

    };


    public void visitMientras(MyLanguageParser.MientrasContext ctx){
        if(ctx.WHILE() != null){
            main = main.concat("while ");
        }

        if(ctx.TKN_LEFT_PAREN() != null){
            main = main.concat("(");
        }

        if(ctx.logico1() != null){
            visitLogico1(ctx.logico1());
        }

        if(ctx.TKN_RIGHT_PAREN() != null){
            main = main.concat("):\n");
        }


        if(ctx.comandos() != null){
            visitComandos(ctx.comandos(), numTabs);
        }

        if(ctx.ENDWHILE() != null){
            main = main.concat(" \n");
        }

    };


    public void visitPara(MyLanguageParser.ParaContext ctx){
        if(ctx.FOR() != null){
            main = main.concat("for ");
        }

        if(ctx.identificador() != null){
            visitIdentificador(ctx.identificador());
            main = main.concat(" in range");

        }

        main = main.concat("(");

        if(ctx.logico1() != null) {
            MyLanguageParser.Logico1Context i = ctx.logico1(0);
            visitLogico1(i);
        }

        main = main.concat(", ");

        if(ctx.logico1() != null) {
            MyLanguageParser.Logico1Context i = ctx.logico1(1);
            visitLogico1(i);
            main = main.concat("+1");

        }

        if(ctx.paso() != null){

            visitPaso(ctx.paso());
        }

        main = main.concat(")");

        if(ctx.comandos() != null){
            main = main.concat(":");
            main = main.concat("\n");
            numTabs ++;
            visitComandos(ctx.comandos(), numTabs);
        }

        if(ctx.ENDFOR() != null){
            main = main.concat("\n");
            numTabs--;
        }

    };


    public void visitPaso(MyLanguageParser.PasoContext ctx){
        if(ctx.STEP() != null){
            main = main.concat(", ");
        }

        if(ctx.aritmetica1() != null){
            visitAritmetica1(ctx.aritmetica1());
        }

    };


    public void visitIr(MyLanguageParser.IrContext ctx){
        if(ctx.GOTO() != null){
            main = main.concat("#go to ");
        }

        if(ctx.ID() != null){
            main = main.concat( ctx.ID().getText() );
        }

    };





};






