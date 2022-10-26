package FactoryPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pushg
 */
public class ColaFactory implements Factory {

    @Override
    public Product getProduct() {
        return new Cola();
    }

    public Product getProduct(String flavor) {
        return new Cola(flavor);
    }
}
