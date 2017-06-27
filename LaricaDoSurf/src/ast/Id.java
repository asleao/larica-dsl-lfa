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
public class Id {

    private Object id;
    
    public Id(Object o) {
        this.id = o;
    }

    @Override
    public String toString() {
        return "Id{" + "id=" + id + '}';
    }
    
    
}
