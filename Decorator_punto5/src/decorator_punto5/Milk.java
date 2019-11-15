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
public class Milk implements CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    
    
    public double cost(){
    return .2 + beverage.cost();
    };

    @Override
    public String getDescription() {
      return beverage.getDescription() + " with milk ";
    }
}
