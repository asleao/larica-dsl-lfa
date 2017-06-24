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
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author asleao
 */
public class Larica {
    public static void main(String[] args) throws IOException {  
        File file = new File("./src/testfiles/teste_definicao.txt");
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);
        LaricaDoSurfLexer lexer = new LaricaDoSurfLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaricaDoSurfParser parser = new LaricaDoSurfParser(tokens);
        LaricaDoSurfParser.TipagemContext ans = parser.tipagem();
        System.out.printf(">>> %s\n", ans.result);
    }
}