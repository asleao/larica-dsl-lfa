/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author ana
 */
public class Operador {
    
    
    private String op;
    
    public Operador(String op){
        this.op = op;
    }

    @Override
    public String toString() {
        return "Operador{" + "op=" + op + '}';
    }
    
    
    
    
}
