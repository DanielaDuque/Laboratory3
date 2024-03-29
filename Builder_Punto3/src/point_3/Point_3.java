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
public class Point_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
      
      Meal CheMeal = mealBuilder.prepareCheMeal();
      System.out.println("\n\nChese Meal");
      CheMeal.showItems();
      System.out.println("Total Cost: " + CheMeal.getCost());
    }
    
}
