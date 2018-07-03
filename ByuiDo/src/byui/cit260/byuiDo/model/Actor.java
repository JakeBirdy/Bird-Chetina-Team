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

    John("John", "He likes sports", new Point(1,1), "Male", "1 + 1", "2" ),
    David("David", "He likes math", new Point(1,2), "Male", "1 + 1", "2"),
    Anna("Anna", "She likes music", new Point(1,1), "Female", "1 + 1", "2"),
    Gabby("Gabby", "She likes sports", new Point(1,2), "Female", "1 + 1", "2");
    
    
    private final String name;
    private final String description;
    private final Point coordinates;
    private final String type;
    private final String problem;
    private final String solution;
    private final ArrayList <Relationship> relationships = new ArrayList<>();

    private Actor(String name, String description, Point coordinates, String type, String problem, String solution) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        this.type = type;
        this.problem = problem;
        this.solution = solution;
    }

    public String getProblem() {
        return problem;
    }

    public String getSolution() {
        return solution;
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
