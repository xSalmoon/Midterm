/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author pushg
 */
public class FactroyMethod {
    
    public static void main(String[] args) {
        
        Factory colaFac = new ColaFactory();
        Product cola = colaFac.getProduct();
        Product mycola = ((ColaFactory)colaFac).getProduct("有糖的");

        cola.describe();
        mycola.describe();
        
    }
}
