/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

/**
 *
 * @author Eduardo y Sandra
 */

public class Puzzles {

    
    
   /* private int Constant = 2;
    public double calcTowerArea(double diameter, double height){
    
        double radius = diameter / 2;
        
    if (radius != 5){
    return -1;
    }

    
    double towerArea=(2 * Math.PI) * radius * (radius + height);
    return towerArea;

    }*/

    /**
     *
     */
    public void Puzzles() {
        
        string( "\n"     
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~."
                  + "\n| Chicken puzzle."
                  + "A man has to cross a river in his boat and take three items but once at a time, but there is an issue"
                  + "the items are a Chicken a Fox and a Bag of grain. How should he do this avoidong the fox eats the chicken"
                  + "or the chicken eats the grain. Think fast!|"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n A - Carry the Grain  with you"
                  + "\n B - Carry the Fox with you"
                  + "\n C - Carry the Chicken with you"
                  + "\n D - Second Carry the "
                  + "\n"
                  + "\n"
                  + "\n"
                  + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    /*Help
    You have to cross the river with a fox, a chicken and a bag of corn
    You have a boat, and  can take just one thing at a time with you.
    If you leave the fox and the chicken alone, the fox would devore the chicken.
    If you leave the chicken with the corn alone, the chicken would eat the corn.
    How whould you achieve it?
    /**
     *
     * @param choice
     * @return
     */
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "A":
                this.chooseItemA();
                System.out.println("You are going to leave the Chicken and the Fox all alone, I think dinner is served!");
                break;
            case "B":
                this.chooseItemB();
                System.out.println("You are going to leave the Chicken and the corn all alone, I think dinner is served!");
                break;
            case "C":
                this.chooseItemC();
                System.out.println("You are going to leave the Fox and the corn all alone, This makes more sense!");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

    
      
        return false;
    
}        

    private void chooseItemC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseItemA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseItemB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void string(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*Help
You have to cross the river with a fox, a chicken and a bag of corn
You have a boat, and  can take just one thing at a time with you.
If you leave the fox and the chicken alone, the fox would devore the chicken.
If you leave the chicken with the corn alone, the chicken would eat the corn.
How whould you achieve it?*/
