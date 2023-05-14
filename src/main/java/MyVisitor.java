import java.util.HashMap;
public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {
    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitMientras(MyLanguageParser.MientrasContext ctx) {
        //expr =  visitLogico1(ctx.logico1());

        //int times = expr.intValue();

       //for(int i=0 ; i<times ; i++){
       //     visitComandos(ctx.comandos());
        //}
        return null;
    }


}