/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author edson
 */
public class FuncaoPrint extends Expr {
    private Object id;

    public FuncaoPrint(Object id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FuncaoPrint{" + "id=" + id + '}';
    }
    
    
}
