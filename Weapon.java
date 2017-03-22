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
public class Weapon implements Serializable{
    
    //class instance variables
    private double damage;
    private double attackBonus;
    
    public Weapon() {
    }
    
    

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.attackBonus) ^ (Double.doubleToLongBits(this.attackBonus) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Weapon{" + "damage=" + damage + ", attackBonus=" + attackBonus + '}';
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
        final Weapon other = (Weapon) obj;
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attackBonus) != Double.doubleToLongBits(other.attackBonus)) {
            return false;
        }
        return true;
    }
}