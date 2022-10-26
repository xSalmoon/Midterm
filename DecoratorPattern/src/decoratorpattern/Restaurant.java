/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author pushg
 */
public class Restaurant {
    
    private void minimumOrder(){
        System.out.println("一杯飲料");
    }

    public void order(){
        minimumOrder();
    }
}
