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
public class MedellinStyleClamPizza extends Pizza {
    public MedellinStyleClamPizza() {
		name = "Medelln Style Clam Pizza";
		dough = "Thin Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Costeno Cheese");
		toppings.add("Frozen Clams");
                toppings.add("Beans");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into slices");
	}
}

