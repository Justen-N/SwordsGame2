/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.enums;


public enum CharacterTrait  {
    ranger(1,3,5,50,10,1,1,15),
    warrior(5,3,1,75,10,1,1,17),
    wizard(1,5,3,35,30,1,1,14),
    ogre(5,1,1,80,0,1,1,18),
    goblin(2,2,2,10,5,1,1,10),
    dragon(5,5,5,100,50,15,15,30),
    ;
    private final double strength;
    private final double wisdom;
    private final double dex;
    private final double health;
    private final double mana;
    private final double coordX;
    private final double coordY;
    private final double defenseValue;
   

CharacterTrait(double strength, double wisdom, double dex, double health, double mana, double coordX, double coordY,double defenseValue) {
    this.strength=strength;
    this.wisdom= wisdom;
    this.dex= dex;
    this.health=health;
    this.coordX=coordX;
    this.coordY=mana;
    this.mana=mana;
    this.defenseValue=defenseValue;
}

    public double getDefenseValue() {
        return defenseValue;
    }
    public double getStrength() {
        return strength;
    }

    public double getWisdom() {
        return wisdom;
    }
    
    public double getDex() {
        return dex;
    }

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public double getCoordinateX() {
        return coordX;
    }
    
    public double getCoordY() {
        return coordY;
    }
 }
