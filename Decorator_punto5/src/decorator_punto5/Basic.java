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
public class Basic implements Beverage {
    CookTime cookTime;
    
    public Basic() {
        Simple simple = new Simple();
        this.cookTime = new CookTime(3, simple);
    }
    
    @Override
    public double cost() {
       return cookTime.cost();
    }

    @Override
    public String getDescription() {
        return cookTime.getDescription();
    }
    
}
