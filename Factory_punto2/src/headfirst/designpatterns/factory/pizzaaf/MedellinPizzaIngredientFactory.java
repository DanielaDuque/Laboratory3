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
public class MedellinPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new CostenoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Avocado(), 
		                      new Corn(), 
		                      new Bean() };
		return veggies;
    }

    @Override
    public Chicken createChicken() {
        return new ShreddedChicken();
    }

    public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

    @Override
	public Clams createClam() {
		return new FrozenClams();
	}
    
}
