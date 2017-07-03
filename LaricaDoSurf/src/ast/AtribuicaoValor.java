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
public class AtribuicaoValor {
    private String variavel;
    private Id valor;
    private ExprSmp expr;

    public AtribuicaoValor(String variavel, Id valor) {
        this.variavel = variavel;
        this.valor = valor;        
    }

    public AtribuicaoValor(String variavel, ExprSmp expr) {
        this.variavel = variavel;
        this.expr = expr;
    }
    
    @Override
    public String toString() {
        return "AtribuicaoValor{" + "variavel=" + variavel + ", valor=" + valor + ", expr=" + expr + '}';
    }
        
}
