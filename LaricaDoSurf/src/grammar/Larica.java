/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammar;

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author asleao
 */
public class Larica {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        LaricaDoSurfLexer lexer = new LaricaDoSurfLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaricaDoSurfParser parser = new LaricaDoSurfParser(tokens);
        LaricaDoSurfParser.ProgContext ans = parser.prog();
        System.out.printf(">>> %f\n", ans);
    }
}
