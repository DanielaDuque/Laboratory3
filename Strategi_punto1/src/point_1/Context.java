/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_1;

/**
 *
 * @author ASUS
 */
public class Context {
    TransportationStrategy strategy;
    
    
    public Context(TransportationStrategy strategy){
        this.strategy = strategy;
    }

    public String getStrategyName(){
        return strategy.getName();
    }
}
