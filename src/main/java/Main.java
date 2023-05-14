import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String [] args) throws Exception{
        try{
            MyLanguageLexer lexer = new MyLanguageLexer(CharStreams.fromFileName("src/input/caso6.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyLanguageParser parser = new MyLanguageParser(tokens);
            ParseTree tree = parser.inicio();

            //MyVisitor loader = new MyVisitor();
            //loader.visit(tree);
            ParseTreeWalker walker = new ParseTreeWalker();
            GrammarToText listener = new GrammarToText();
            walker.walk( listener, tree);
        }
        catch (Exception e){
            System.err.println("Error (Test): " + e);
        }

    }
}