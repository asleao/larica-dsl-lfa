/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.List;

/**
 *
 * @author ana
 */
public class While extends Expr{
    
    private Condicao cond;
    private List<Expr> expr;

    public While(Condicao cond, List<Expr> expr) {
        this.cond = cond;
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "While{" + "cond=" + cond + ", expr=" + expr + '}';
    }
    
    
    
}
