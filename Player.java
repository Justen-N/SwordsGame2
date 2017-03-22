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
public class Player implements Serializable {
    private String name;
    private int progress;
    public String getName;


    public Player(){
    }
    /**
     *
     * @return
     */
    

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getProgress() {
        return progress;
    }

    /**
     *
     * @param progress
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.progress;
        return hash;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ( "Player Name=" + name + ", progress=" + progress);
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
        final Player other = (Player) obj;
        if (this.progress != other.progress) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
   
    
}
