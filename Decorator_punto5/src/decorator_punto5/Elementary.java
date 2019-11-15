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
public class Elementary implements Beverage {
    Milk milk;
    
    public Elementary() {
        Simple simple = new Simple();
        this.milk = new Milk(simple);
    }
    
    @Override
    public double cost() {
       return milk.cost();
    }

    @Override
    public String getDescription() {
        return milk.getDescription();
    }
    
}
