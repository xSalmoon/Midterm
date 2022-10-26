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
public class Cola implements Product{
    String flavor = "無糖的";
    
    protected Cola(){}
    
    protected Cola(String flavor){
        this.flavor = flavor;
    }

    @Override
    public void describe() {
        System.out.println("我是"+ flavor +"可樂");
    }
}
