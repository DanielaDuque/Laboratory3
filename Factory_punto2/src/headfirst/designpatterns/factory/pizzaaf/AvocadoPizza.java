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
public class AvocadoPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
 
	public AvocadoPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
                veggies = ingredientFactory.createVeggies();
                chicken = ingredientFactory.createChicken();
                pepperoni = ingredientFactory.createPepperoni();
                clam = ingredientFactory.createClam();
	}
}
