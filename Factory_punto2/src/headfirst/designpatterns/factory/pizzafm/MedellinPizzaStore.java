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
public class MedellinPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new MedellinStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
    
}
