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
public class Add implements Strategy{
    
    @Override
    public int caculate(int a, int b) {
        return a + b;
    }   
}