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
public class OperadorComparacao {
    
    
    private String opc;

    public OperadorComparacao(String opc) {
        this.opc = opc;
    }

    @Override
    public String toString() {
        return "OperadorComparacao{" + "opc=" + opc + '}';
    }
    
    
    
}
