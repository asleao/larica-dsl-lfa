/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Psicologia Judo
 */
public class ChamadaFuncao {
    
    private String nomeFunc;
    private List<Id> list;
    
    
    public ChamadaFuncao(String nomeFunc, List list){
        this.nomeFunc = nomeFunc;
        this.list = list;
    }

    @Override
    public String toString() {
        return "ChamadaFuncao{" + "nomeFunc=" + nomeFunc + ", list=" + list + '}';
    }
    
}
