/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author pushg
 */
public class Caculator {
    private int now = 0 ;

    private Strategy strategy ;

    public int execute(int a , int b){
        return strategy.caculate(a,b);
    }

    public void reset(){
        this.now = 0 ;
    }

    public void setStrategy(DoType doType) {
        switch (doType){
            case ADD:
                this.strategy = new Add();
                break;
            case MINUS:
               this.strategy = new Minus();
                break;
            case DIVIDE:
                this.strategy = new Divide();
                break;
            case MULTYPLY:
               this.strategy = new Multiply();
                break;
        }
    }

    enum DoType{
        ADD , MINUS , DIVIDE , MULTYPLY
    }
}
