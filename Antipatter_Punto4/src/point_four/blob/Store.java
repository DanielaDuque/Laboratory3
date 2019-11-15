/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_four.blob;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Store {
    private ArrayList<Shirt> shirts;
    private ArrayList<Customer> customers;
    private ArrayList<Jean> jeans;
    private ArrayList<Shoes> shoes;

    public Store(ArrayList<Shirt> shirts, ArrayList<Customer> customers, ArrayList<Jean> jeans, ArrayList<Shoes> shoes) {
        this.shirts = shirts;
        this.customers = customers;
        this.jeans = jeans;
        this.shoes = shoes;
    }
    
    public ArrayList<Shirt> getShirts() {
        return shirts;
    }

    public void setShirts(ArrayList<Shirt> shirts) {
        this.shirts = shirts;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Jean> getJeans() {
        return jeans;
    }

    public void setJeans(ArrayList<Jean> jeans) {
        this.jeans = jeans;
    }

    public ArrayList<Shoes> getShoes() {
        return shoes;
    }

    public void setShoes(ArrayList<Shoes> shoes) {
        this.shoes = shoes;
    }
    
    /*
     * Implementar metodos que deberian de estar en sus propias clases
     */
    
    public void AddShoes(Shoes newPair){
        shoes.add(newPair);
    }
    
    public void AddCustomer(Customer customer){
        customers.add(customer);
    }
    
    public void AddShirt(Shirt newShirt){
        shirts.add(newShirt);
    }
    
    public void AddJeans (Jean newJean){
        jeans.add(newJean);
    }
    
}
