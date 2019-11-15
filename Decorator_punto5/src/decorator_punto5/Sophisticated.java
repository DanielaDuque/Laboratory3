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
public class Sophisticated implements Beverage {
    CookTime cookTime;
    
    public Sophisticated() {
        Simple simple = new Simple();
        Milk milk = new Milk(simple);
        this.cookTime = new CookTime(3, milk);
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
