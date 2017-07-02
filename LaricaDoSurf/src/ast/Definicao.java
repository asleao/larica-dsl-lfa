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
public class Definicao {
    private Tipagem tipo;
    private String variavel;
    private Id valor;

    public Definicao(Tipagem tipo, String variavel) {
        this.tipo = tipo;
        this.variavel = variavel;
    }

    public Definicao(Tipagem tipo, String variavel, Id valor) {
        this.tipo = tipo;
        this.variavel = variavel;
        this.valor = valor;
    }    

    @Override
    public String toString() {
        return "Definicao{" + "tipo=" + tipo + ", variavel=" + variavel + ", valor=" + valor + '}';
    }
    
}
