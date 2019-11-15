/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_four.spaghetti_code;

/**
 *
 * @author ASUS
 */

public class point_four_spaghetti {
    public static void spaghetti_function(String name, int age){
    if(name.length() >= 10){
        System.out.println("That's a long name"); 
        if(age >= 18){
            System.out.println("You are an adult");
            if(age >= 60){
                System.out.println("You are an old adult");
                if(name.charAt(0) == 'A'){
                    System.out.println("That's a beautiful name");
                    if(name.charAt(0) == 'Z'){
                        System.out.println("That's a weird name");
    } 
    } else{
        System.out.println("That's an OK name");            
    }
    } else{
        System.out.println("You can live a long life");        
    }
    } else{
        System.out.println("You are an child");    
    }
    } else{
        System.out.println("That's a short name");
    }
    };
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String name = "Gabriel Avendaño";
        int age = 45;
        
        spaghetti_function(name,age);
    }
    
}
