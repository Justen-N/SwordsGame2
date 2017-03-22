/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

import java.util.Scanner;

/**
 *
 * @author Justen
 */
public class MapLocalizationView extends View{

    
    
    
    public MapLocalizationView() {
        
        super( "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n| Movement Menu                          |"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\nE - Move East"
                  + "\nS - Move South"
                  + "\nW - Move West"
                  + "\nN - Move North"
                  + "\nQ - Quit"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    
    
    @Override
    public void display() {
        
        boolean done = false;
        do{
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            
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
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "N":
                this.moveNorth();
                break;
            case "E":
                this.moveEast();
                break;
            case "S":
                this.moveSouth();
                break;
            case "W":
                this.moveWest();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                        
        return false;
        
        
    }
       private void moveNorth() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void moveEast() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void moveSouth() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void moveWest() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    


    
    
}

