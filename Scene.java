/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Justen
 */
public class Scene implements Serializable{
   
    private String description;
    private boolean passable;
    private boolean hasPuzzle;
    private boolean hasEnemy;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public boolean isHasPuzzle() {
        return hasPuzzle;
    }

    public void setHasPuzzle(boolean hasPuzzle) {
        this.hasPuzzle = hasPuzzle;
    }

    public boolean isHasEnemy() {
        return hasEnemy;
    }

    public void setHasEnemy(boolean hasEnemy) {
        this.hasEnemy = hasEnemy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + (this.passable ? 1 : 0);
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
        final Scene other = (Scene) obj;
        if (this.passable != other.passable) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", passable=" + passable + '}';
    }
    
}
