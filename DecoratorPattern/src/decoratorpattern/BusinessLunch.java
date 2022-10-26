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
public class BusinessLunch extends Restaurant{
    
    private Restaurant restaurant;

    public BusinessLunch(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    private void salad(){
        System.out.println("一盤沙拉");
    }

    private void mainMeal(){
        System.out.println("一份主餐");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}
