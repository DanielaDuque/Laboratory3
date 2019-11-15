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
public class CookTime implements CondimentDecorator{
    double time;
    Beverage beverage;
    
    public CookTime(double time, Beverage beverage) {
        this.time = time;
        this.beverage=beverage;
    }
    
    public double cost(){
    return 0.05*time +beverage.cost();
    };

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with time for preparation is "+ this.time  ;
    }
   
}
