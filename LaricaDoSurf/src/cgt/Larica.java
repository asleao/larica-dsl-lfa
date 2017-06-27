/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgt;

import java.io.IOException;
import antlr.LaricaDoSurfLexer;
import antlr.LaricaDoSurfParser;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author asleao
 */
public class Larica {
    public static void main(String[] args) throws IOException {  
        File file = new File("./src/testfiles/teste_id.txt");
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);
        LaricaDoSurfLexer lexer = new LaricaDoSurfLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaricaDoSurfParser parser = new LaricaDoSurfParser(tokens);
        
        /*LaricaDoSurfParser.TipagemContext ans = parser.tipagem();         
        LaricaDoSurfParser.ValorContext ans1 = parser.valor();*/
        
        LaricaDoSurfParser.IdContext ans = parser.id();
        System.out.printf(">>> %s\n", ans.result);   
        
                
        fis.close();        
        
    }
}
