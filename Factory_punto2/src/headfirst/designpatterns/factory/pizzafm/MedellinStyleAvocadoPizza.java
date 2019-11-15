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
public class MedellinStyleAvocadoPizza extends Pizza {
        public MedellinStyleAvocadoPizza() { 
		name = "Medellin Style Avocado-Chicken Pizza";
		dough = "Thin Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("avocado");
                toppings.add("bean");
                toppings.add("corn");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into slices");
	}

}
