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
public class MedellinStyleCheesePizza extends Pizza {
    public MedellinStyleCheesePizza() { 
		name = "Medellin Style Costeno Cheese Pizza";
		dough = " Thin Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Beans");
                toppings.add("Costeno Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into slices");
	}
}
