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
public class Figure_in_the_cover implements CondimentDecorator{
    Beverage beverage;

    public Figure_in_the_cover(Beverage beverage) {
        this.beverage = beverage;
    }
    
    
    public double cost(){
    return 0.3 + beverage.cost();
    };

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " with figure in the cover " ;
    }
    
}
