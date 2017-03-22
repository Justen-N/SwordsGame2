/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import java.util.ArrayList;

/**
 *
 * @author Justen
 */
public class Inventory {
   private int spaces;
   private int gold;
   ArrayList<Item> items= new ArrayList<>();
   private Weapon weapon;
   ArrayList<Armor> armorPieces;

    public Inventory() {
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Armor> getArmorPieces() {
        return armorPieces;
    }

    public void setArmorPieces(ArrayList<Armor> armorPieces) {
        this.armorPieces = armorPieces;
    }

   
   
    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.spaces;
        hash = 47 * hash + this.gold;
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "spaces=" + spaces + ", gold=" + gold + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (this.spaces != other.spaces) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        return true;
    }
   
   
    
}
