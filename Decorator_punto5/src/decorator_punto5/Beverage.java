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
public interface Beverage  {
    String descripcion = "";
    Double Costo = 0.0;
    
    double cost();
    String getDescription();
   
}
