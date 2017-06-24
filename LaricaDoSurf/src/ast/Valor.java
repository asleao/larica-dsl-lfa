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
public class Valor {

    private Object valor;

    public Valor(Object valor) {
        this.valor = valor;
    }
        
    public Integer mkInteger(String text){
        return Integer.parseInt(text);
    }
    
    public Float mkFloat(String text){
        return Float.parseFloat(text);
    }
    
    public Boolean mkBoolean(String text){
        return Boolean.parseBoolean(text);
    }
    
    public String mkString(String text){
        return text;
    }

    @Override
    public String toString() {
        return "Valor{" + "valor=" + valor + '}';
    }
    
}
