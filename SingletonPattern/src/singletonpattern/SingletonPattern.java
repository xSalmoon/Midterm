/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

import SingletonPattern.Cola;
import SingletonPattern.Humberger;
import SingletonPattern.SingletonFactory;

/**
 *
 * @author pushg
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Humberger humberger =(Humberger) SingletonFactory.getHumbergerFactory().getProduct();
        
        System.out.println(cola.getName());
        System.out.println(humberger.getName());
    }
    
}
