/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author asleao
 */
public class Operacoes {
    private Operador op;
    private Id id;

    public Operacoes(Operador op, Id id) {
        this.op = op;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Operacoes{" + "op=" + op + ", id=" + id + '}';
    }
    
}
