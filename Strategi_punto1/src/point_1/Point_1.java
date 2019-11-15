/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Point_1 {

    public static void planTransportationStrategy (){
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        String opcion; //Guardaremos la opcion del usuario

        while (!exit) {
            System.out.println("Sophisticated planning transportation system ! ");
            System.out.println("Pick a choice you prefer");
            System.out.println("1. When you have lots of money and few time ");
            System.out.println("2. When you are short of money and have a lot time");
            System.out.println("3. When you have few money and a some time");
            

            System.out.println("Please give me your choice : ");
            opcion = sn.next();

            switch (opcion) {
                case "1":
                    Context context = new Context(new Taxi());
                    System.out.println("You should use a " + context.getStrategyName());
                    exit = true;
                    break;
                case "2":
                    context = new Context(new Bici());
                    System.out.println("You should use a " + context.getStrategyName());
                    exit = true;
                    break;
                case "3":
                    context = new Context(new Bus());
                    System.out.println("You should use a " + context.getStrategyName());
                    exit = true;
                    break;
                
                default:
                    System.out.println("Just number between 1 and 3");
            }
        }
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        planTransportationStrategy ();
                
    }
    
}
