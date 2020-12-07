import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args )
    {
        try {
            aprendizagemLexer lexer = new aprendizagemLexer(CharStreams.fromFileName("C:\\Users\\Kenny\\Desktop\\PLCG\\teste.txt"));
            CommonTokenStream stream = new CommonTokenStream(lexer);
            aprendizagemParser parser = new aprendizagemParser(stream);
            parser.cNe();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
