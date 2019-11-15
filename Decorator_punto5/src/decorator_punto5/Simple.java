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
public class Simple implements Beverage {

    @Override
    public double cost() {
       return 1;
    }

    @Override
    public String getDescription() {
        return "Just Coffee";
    }
    
}
