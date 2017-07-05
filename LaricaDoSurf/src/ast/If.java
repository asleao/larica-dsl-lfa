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
public class If extends Expr{
    
    private Condicao cond;
    private List<Expr> ifExpr;
    private List<Expr> ElseExpr;

    public If(Condicao cond, List<Expr> ifExpr, List<Expr> ElseExpr) {
        this.cond = cond;
        this.ifExpr = ifExpr;
        this.ElseExpr = ElseExpr;
    }

    @Override
    public String toString() {
        return "If{" + "cond=" + cond + ", ifExpr=" + ifExpr + ", ElseExpr=" + ElseExpr + '}';
    }
    
    
    
    
}
