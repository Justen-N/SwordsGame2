/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

/**
 *
 * @author Justen
 */
public enum Armor {
    leatherHelm(1,2),
    leatherChest(1,2),
    leatherLegs(1,2),
    leatherBoots(1,2),
    leatherGloves(1,2),
    ironHelm(2,5),
    ironChest(2,5),
    ironLegs(2,5),
    ironBoots(2,5),
    ironGloves(2,5),
    steelHelm(3,10),
    steelChest(3,10),
    steelLegs(3,10),
    steelBoots(3,10),
    steelGloves(3,10),
    mithrilHelm(4,20),
    mithrilChest(4,20),
    mithrilLegs(4,20),
    mithrilBoots(4,20),
    mithrilGloves(4,20),
    adamantHelm(5,40),
    adamantChest(5,40),
    adamantLegs(5,40),
    adamantBoots(5,40),
    adamantGloves(5,40),
    
    ;
    private final int defenseValue;
    private final int price;
    
     Armor(int defenseValue,int price) {
        this.defenseValue = defenseValue;
        this.price=price;
    }

   

    public int getDefenseValue() {
        return defenseValue;
    }

   
    @Override
    public String toString() {
        return "Armor{" + "defenseValue=" + defenseValue + '}';
    }
    

    
        
    }
    

