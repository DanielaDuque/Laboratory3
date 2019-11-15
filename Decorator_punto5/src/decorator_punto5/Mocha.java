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
public class Mocha implements CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public double cost(){
    return .5 + beverage.cost();
    };

    @Override
    public String getDescription() {
      return beverage.getDescription()+ " with mocha cream ";
    }
}
