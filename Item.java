/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import java.io.Serializable;

/**
 *
 * @author andre_000
 */
public enum Item implements Serializable{
    ;
    private double cost;
    private double inventorySpace;

    Item(double cost,double inventorySpace) {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getInventorySpace() {
        return inventorySpace;
    }

    public void setInventorySpace(double inventorySpace) {
        this.inventorySpace = inventorySpace;
    }

    @Override
    public String toString() {
        return "Item{" + "cost=" + cost + ", inventorySpace=" + inventorySpace + '}';
    }
  
}
