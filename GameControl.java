/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.control;

import byui.cit260.swordsAndHorses.exceptions.GameControlExceptions;
import byui.cit260.swordsAndHorses.model.Inventory;
import byui.cit260.swordsAndHorses.model.Map;
import byui.cit260.swordsAndHorses.model.Player;
import byui.cit260.swordsAndHorses.model.SwordsAndHorses;
import byui.cit260.swordsAndHorses.model.Game;
import byui.cit260.swordsAndHorses.model.Location;
import byui.cit260.swordsAndHorses.model.Scene;
import byui.cit260.swordsAndHorses.enums.SceneType;


/**
 *
 * @author andre_000
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlExceptions {
       
        if (name == null) {
           throw new GameControlExceptions("name cannot be blank");
        }
         
        Player player = new Player();
        
        
        SwordsAndHorses.setPlayer(player);
        
        return player;
        
        }

    public static void createNewGame(Player player) {
      Game game= new Game();
      SwordsAndHorses.setCurrentGame(game);
      game.setPlayer(player);
     Inventory inventory= new Inventory();
     game.setInventory(inventory);
     Map map=MapControl.createMap();
     game.setMap(map);
     MapControl.moveActorsToStart(map);
     
     
     
     
       
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.throneRoom.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.starterZone.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.misteryTower.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.ogreIsland.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.magiciansHut.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.dragonCave.ordinal()]);
        
        
    }
}
    

