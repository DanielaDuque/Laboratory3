/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirst.designpatterns.factory.pizzas;

/**
 *
 * @author Lenovo
 */
public class AvocadoPizza extends Pizza{
    public AvocadoPizza() {
		name = "Avocado Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Costeno pizza");
		toppings.add("Avocado");
	}
}
