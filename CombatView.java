/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;
import byui.cit260.swordsAndHorses.control.CombatFunc;
/**
 *
 * @author Justen
 */
public class CombatView extends View {
// this will be called in other views, and the message will be passed from them ( each individual view will have a different intro, same options. )
    public CombatView(String message) {
        super(message);
    }

  
    
    @Override
  public boolean doAction(String choice){ 
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "P":
                this.magicAttack();
                break;
            case "R":
                this.rangedAttack();
                break;
            case "M":
                this.meleeAttack();
                break;
            case "F":
                this.flee();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        
        return false;
        
        
    }

    private void magicAttack() {
        
        CombatFunc attack =new CombatFunc();
        boolean CombatFunc = attack.CombatFunc(0, 0, 0);
    }

    private void rangedAttack() {
        CombatFunc attack =new CombatFunc();
        boolean CombatFunc = attack.CombatFunc(0, 0, 0);
    }

    private void meleeAttack() {
        CombatFunc attack =new CombatFunc();
        boolean CombatFunc = attack.CombatFunc(0, 0, 0);
    }

    private void flee() {
       System.out.println( "\n I haven't made this toy./");
    }
    private void displayHelpMenu() {
  //System.out.println("* displayHelpMenu function called ***");
  HelpMenuView helpMenuView = new HelpMenuView();
  helpMenuView.display();
}
    
}
   
    
