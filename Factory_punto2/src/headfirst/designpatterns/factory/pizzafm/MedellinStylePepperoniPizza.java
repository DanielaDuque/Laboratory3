/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirst.designpatterns.factory.pizzafm;

/**
 *
 * @author Lenovo
 */
public class MedellinStylePepperoniPizza extends Pizza {
    public MedellinStylePepperoniPizza() {
		name = "Medellin Style Pepperoni Pizza";
		dough = "Thin Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Costeno Cheese");
		toppings.add("bean");
		toppings.add("corn");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
