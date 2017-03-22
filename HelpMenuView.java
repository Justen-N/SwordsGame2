/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import java.util.Scanner;

/**
 *
 * @author andre_000
 */
public class HelpMenuView extends View {
    
    
    public HelpMenuView() {
        
        super(  "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n| Help Menu                              |"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nD - How to make a decision"
                  + "\nC - How combat works"
                  + "\nQ - Quit"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
    
    

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "G":
                this.goalOfTheGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "D":
                this.howToDecide();
                break;
            case "C":
                this.howCombatWorks();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                        
        return false;
        
        
    }

    private void goalOfTheGame() {
        System.out.println("\n*** goalOfTheGame function called ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove function called ***");
    }

    private void howToDecide() {
        System.out.println("\n*** howToDecide function called ***");
    }

    private void howCombatWorks() {
        System.out.println("\n*** howCombatWorks function called ***");
    }

    


    
    
}
