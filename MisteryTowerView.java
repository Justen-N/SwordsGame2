/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;


import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class MisteryTowerView extends View{

    /*public void MisteryTowerView(){*/
    public MisteryTowerView(String message) {
        super("Welcome to the Mistery Tower. Would you like to enter the tower and see what is inside?"
     +"\n*** Y = Yes, N = No");
    }
    

     @Override
    public void display() {
        boolean done = false;
        do{
            String menuOption = this.getInput();
            
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

@Override
public boolean doAction(String menuOption) {
        String choice = menuOption.toUpperCase();
    switch (choice) {
        case "Y": 
            
        break;
        case "N":
            System.out.println("\n Not implemented yet");
        default:
            System.out.println("\n***Invalid selection*** Try again");
        break;
}
    return false;
}

@Override
public String getInput() {

Scanner keyboard = new Scanner(System.in);
boolean valid = false;
String selection = null;

//While a valid name has not been retrieved

while (!valid) {
    //get the value entered from keyboard
    selection = keyboard.nextLine();
    selection = selection.trim();

    if (selection.length()<1 ){
    System.out.println("\n*** Invalid selection ***Try again");
    continue;
    }
    break;
    }

return selection;// return the name
}

   

}
