/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import byui.cit260.swordsAndHorses.control.GameControl;
import byui.cit260.swordsAndHorses.exceptions.GameControlExceptions;
import byui.cit260.swordsAndHorses.model.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre_000
 */
public final class StartProgramView extends View {
    
    private final String promptMessage;
    private String name;
    
    public StartProgramView(){ 
        
    //this.promptMessage = "Please enter your name:";
    
   
          
        super(
                 "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
               + "\n~                                                     ~"
               + "\n~ This is the game of Swords & Horses. You are about  ~"
               + "\n~ to go on a quest to save the King's daughter. The   ~"
               + "\n~ only way to do so, is to go into the Dragon Wilds   ~"
               + "\n~ to slay a dragon and bring back its heart. The      ~"
               + "\n~ heart will break a witches curse placed upon the    ~"
               + "\n~ the King's daughter.                                ~"
               + "\n~                                                     ~"
               + "\n~ You will select a character class: Wizard, Ranger   ~"
               + "\n~ or Warrior.                                         ~"
               + "\n~                                                     ~"
               + "\n~ You will visit several locations on your way        ~"
               + "\n~ to the Dragaon Wilds.                               ~"
               + "\n~                                                     ~"
               + "\n~ You will face many challenges that will test your   ~"
               + "\n~ abilities.                                          ~"
               + "\n~                                                     ~"
               + "\n~ Good luck and have fun on your adventure!           ~"
               + "\n~                                                     ~"
               + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"        
               );
    this.promptMessage = "Please enter your name:";
    }
    
    @Override
      public void display() {
        System.out.println("\n*** displayStartProgram() function called***");
        
        boolean done = false;
        
        do {
            String playersName = this.getInput();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        } while (!done);
        
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }   
            
            break;           
        }
        
        return value;
    }
    @Override
    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
        return false;
        }
        
        Player player = null;
        try {
            player = GameControl.createPlayer(playersName);
        } catch (GameControlExceptions ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true;
        
        
    }

    private void displayNextView(Player player) {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         + "\n Welcome to the game " + name +
                           "\n We hope you have a lot of fun!"
                         + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                         );
        
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.display();
        
        
        
        
        
    }
    
   
    
    
}


