/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.List;

/**
 *
 * @author asleao
 */
public class ExprSmp {
    private Id termo;
    private List<Operacoes> operacoes;

    public ExprSmp(Id termo, List<Operacoes> operacoes) {
        this.termo = termo;
        this.operacoes = operacoes;
    }

    @Override
    public String toString() {
        return "ExprSmp{" + "termo=" + termo + ", operacoes=" + operacoes + '}';
    }
    
}
