/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_3;

/**
 *
 * @author ASUS
 */
public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
   
   public Meal prepareCheMeal (){
      Meal meal = new Meal();
      meal.addItem(new CheeseBurger());
      meal.addItem(new Colombiana());
      return meal;
   }
}
