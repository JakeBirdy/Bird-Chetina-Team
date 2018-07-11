/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tanya
 */
public class Location implements Serializable {

    private String description;
    private int row;
    private int column;
    private boolean visited;
    private char displaySymbol;
    private boolean blocked;

    public Location() {
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //------------------------------Associations------------------------------//
    //this is the association between the Location class and the Actor class
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public boolean isVisited() {
        return visited;
    }

    public char getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(char displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Objects.hashCode(this.visited);
        hash = 79 * hash + this.displaySymbol;
        hash = 79 * hash + Objects.hashCode(this.blocked);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.displaySymbol != other.displaySymbol) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", row=" + row + ", column=" + column + ", visited=" + visited + ", displaySymbol=" + displaySymbol + ", blocked=" + blocked + '}';
    }

    public Location(String description, int row, int column, boolean visited, char displaySymbol, boolean blocked) {
        this.description = description;
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.displaySymbol = displaySymbol;
        this.blocked = blocked;
    }
    
    

}
