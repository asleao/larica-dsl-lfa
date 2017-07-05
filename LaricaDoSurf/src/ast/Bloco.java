/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.List;

/**
 *
 * @author Psicologia Judo
 */
public class Bloco {
    
    private List<Definicao> def;
    private List<Expr> expr;
    
    public Bloco(List<Definicao> def, List<Expr> expr){
        this.def = def;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Bloco{" + "def=" + def + ", expr=" + expr + '}';
    }

   
}
