/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

public enum Actor implements Serializable {
    
    Player("Player", "You!", new Point(0,0), "Player"),
    John("John", "He likes sports", new Point(1,1), "M"),
    David("David", "He likes math", new Point(1,2), "M"),
    Jake("Jake", "He is awesome", new Point(1,4), "M"),
    Tatiana("Tatiana", "She is awesome", new Point(1,3), "F"),
    Anna("Anna", "She likes music", new Point(1,5), "F"),
    Gabby("Gabby", "She likes sports", new Point(1,4), "F");
    
    
    private final String name;
    private final String description;
    private final Point coordinates;
    private final String type;
    private final ArrayList <Relationship> relationships = new ArrayList<>();

    private Actor(String name, String description, Point coordinates, String type) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Relationship> getRelationships() {
        return relationships;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", type=" + type + ", relationships=" + relationships + '}';
    }

}
