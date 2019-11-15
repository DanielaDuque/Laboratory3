/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_punto5;

/**
 *
 * @author Lenovo
 */
public class Decorator_punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Beverage e = new Advanced();
        System.out.println(e.cost());
        System.out.println(e.getDescription());
    }
    
}
