/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import byui.cit260.swordsAndHorses.enums.CharacterTrait;
import byui.cit260.swordsAndHorses.view.StartProgramView;




/**
 *
 * @author Justen
 */
public class SwordsAndHorses {
    private static Game currentGame;
    private static Player player; 
    private static CharacterTrait playerClass;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView Start= new StartProgramView();
        Start.display();
        
        
    }   

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SwordsAndHorses.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SwordsAndHorses.player = player;
    }

    public static CharacterTrait getPlayerClass() {
        return playerClass;
    }

    public static void setPlayerClass(CharacterTrait playerClass) {
        SwordsAndHorses.playerClass = playerClass;
    }

    

    
    }
    

