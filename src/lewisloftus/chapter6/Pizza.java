/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus.chapter6;

import java.util.ArrayList;

/**
 *
 * @author dfreer
 */
public class Pizza {
    ArrayList<String> toppings = new ArrayList<>();
    final double COST_MUSHROOMS = .99;
    final double COST_PEPPERONI = 1.99;
    final double COST_ONIONS = .33;
    String size = "";
    double totalCost = 0.0;
    public Pizza(int num){
        if(num == 0){
            size = "Small";
            totalCost += 10;
        }
        else if(num == 1){
            size = "Medium";
            totalCost += 12;
        }
        else if(num == 2){
            size = "Large";
            totalCost += 14;
        }
        else if(num == 3){
            size = "Extra large";
            totalCost += 15;
        }
    }
    
    public double getCost(){
        return totalCost;
    }
    
    public void addTopping(String topping){
        if(topping.equals("Mushrooms")){
            toppings.add(topping);
            totalCost += COST_MUSHROOMS;
        }
        if(topping.equals("Pepperoni")){
            toppings.add("Pepperoni");
            totalCost += COST_PEPPERONI;
        }
        if(topping.equals("Onion")){
            toppings.add("Onion");
            totalCost += COST_ONIONS;
        }
    }
}
