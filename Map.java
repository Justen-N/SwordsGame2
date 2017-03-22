/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import byui.cit260.swordsAndHorses.enums.CharacterTrait;
import byui.cit260.swordsAndHorses.enums.SceneType;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Justen
 */
public class Map implements Serializable{
    private int hexRow;
    private int hexColumn;
    private Location[][] locations;
    private SceneType scene;
    private ArrayList<CharacterTrait> characters;
   
    
    public Map(int hexRow,int hexColumn) {
        if (hexRow<1||hexColumn <1){System.out.println("the number of rows and Columns mustbe > zero");
    }
        this.hexRow=hexRow;
        this.hexColumn=hexColumn;
            
            this.locations = new Location[hexRow][hexColumn];
            for (int row=0;row<hexRow;row++){
                for(int column=0; column<hexColumn; column++){
                    Location location=new Location();
                    location.setColumn(column);
                    location.setRow(row);
                    location.setHasItem(false);
                    locations[row][column]= location;
                }
            }

    }

    public int getHexRow() {
        return hexRow;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public SceneType getScene() {
        return scene;
    }

    public void setScene(SceneType scene) {
        this.scene = scene;
    }

    public ArrayList<CharacterTrait> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<CharacterTrait> characters) {
        this.characters = characters;
    }
    


    public void setHexRow(int hexRow) {
        this.hexRow = hexRow;
    }

    public int getHexColumn() {
        return hexColumn;
    }

    public void setHexColumn(int hexColumn) {
        this.hexColumn = hexColumn;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.hexRow;
        hash = 41 * hash + this.hexColumn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.hexRow != other.hexRow) {
            return false;
        }
        if (this.hexColumn != other.hexColumn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "hexRow=" + hexRow + ", hexColumn=" + hexColumn + '}';
    }
    
    
}
