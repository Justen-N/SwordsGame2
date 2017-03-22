/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

/**
 *
 * @author andre_000
 */
public class GameMenuView extends View{

    public GameMenuView() {
        super("\n WE're using this a a temporary location"
        +"\n C will call the combatView class"
                + "Q will quit"
                + "nothing else works right now.");
    }

    @Override
    public boolean doAction(String value) {
        
        String choice = value.toUpperCase();
        
        switch (choice) {
            
            case "C":
                this.combat();
                break;
                default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        
                case "M":
                this.movement();
                break;}

        
        return false;
        
        
    }

    private void combat() {
        CombatView combatView= new CombatView("the ogre attacks!"+"\n what do you do?"
                + "\nM = Attack with a melee weapon"
                + "\nP = Attack with magic"
                + "\nR = Attack with a ranged weapon"
                + "\nF = Run Away!!"
                + "\nH= Help Menu");
                
        combatView.display();
        
    }

    private void movement() {
        SceneView sceneView=new SceneView();
        
    }
    }
  
    


   
    
 
