/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_punto5;

/**
 *
 * @author Lenovo
 */
public class Advanced implements Beverage {
    Figure_in_the_cover figure;
    
    public Advanced() {
        Simple simple = new Simple();
        Milk milk = new Milk(simple);
        Mocha mocha= new Mocha(milk);
        this.figure = new Figure_in_the_cover( mocha);
    }
    
    @Override
    public double cost() {
       return figure.cost();
    }

    @Override
    public String getDescription() {
        return figure.getDescription();
    }
    
}
