/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;


/**
 *
 * @author Justen
 */
public class CombatFunc{

    
    private double attributeBonus;
    private double attackBonus;
    private double DefenseValue;
    /**
     *
     * @param attributeBonus
     * @param attackBonus
     * @param defenseValue
     * @return
     */
    public boolean CombatFunc(double attributeBonus,double attackBonus,double defenseValue){
        if(attributeBonus<1){return false;}
        else if(attributeBonus>5){return false;}
        else if(attackBonus<0){return false;}
        else if(attackBonus>5){return false;}
        else if(defenseValue<10){return false;}
        else if(defenseValue>30){return false;}
        else{
        
             final double attackRoll=(Math.random()*20+1);
             final double attackTotal=attackRoll+attributeBonus+attackBonus;
                return attackTotal>=defenseValue;
              
        }
    }
}
