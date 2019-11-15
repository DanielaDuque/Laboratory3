/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirst.designpatterns.factory.pizzaaf;

/**
 *
 * @author Lenovo
 */
public class MedellinPizzaStore {
    protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new MedellinPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Medellin Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Medellin Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Medellin Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Medellin Style Pepperoni Pizza");

		} else if (item.equals("avocado")) {

			pizza = new AvocadoPizza(ingredientFactory);
			pizza.setName("Medellin Style Avocado Pizza");

		}
		return pizza;
	}
}
