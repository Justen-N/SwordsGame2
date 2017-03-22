/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.view;

/**
 *
 * @author Eduardo y Sandra
 */
class MisteryTower extends View{
    


    
 public MisteryTower() {
    
     super("Welcome to the Mistery Tower. Would you like to enter the tower and see what is inside?"
     +"\n*** Y = Yes, N = No");
 } 
    
 @Override
 public void display(){
 boolean done = false;
        do{
            String menuOption = this.getInput();
            
            
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

 @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean doAction(String menuOption) {
        if (menuOption == "Y"){
            
        }
        return true;
    }

}
