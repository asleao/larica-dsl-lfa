/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Psicologia Judo
 */
public class Bloco {
    
    private Definicao def;
    private Expr expr;
    
    public Bloco(Definicao def, Expr expr){
        this.def = def;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Bloco{" + "def=" + def + ", expr=" + expr + '}';
    }
    
}
