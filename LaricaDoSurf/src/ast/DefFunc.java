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
public class DefFunc extends Expr{
    
    private String nomeFunc;
    private List<Definicao> list;
    private Bloco bloco;
    
    public DefFunc(String nomeFunc, List paramFormal, Bloco bloco){
        this.bloco = bloco;
        this.list = paramFormal;
        this.nomeFunc = nomeFunc;
    }

    @Override
    public String toString() {
        return "DefFunc{" + "nomeFunc=" + nomeFunc + ", list=" + list + ", bloco=" + bloco + '}';
    }
    
    
    
}
