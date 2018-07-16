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

    PlayerGuy("PlayerGuy", "He is Awesome", new Point(1,1), "Male", "1 + 1", "2", 
            new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")} ),
   
    PlayerGirl("PlayerGirl", "She is Awesome", new Point(1,1), "Female", "1 + 1", "2", 
     new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")}),
   
    John("John", "He likes sports", new Point(2,2), "Male", "1 + 1", "2" ,
     new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")}),
   
    David("David","He likes math", new Point(2,4), "Male", "1 + 1", "2",
     new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")}),
   
    Anna("Anna","She likes music", new Point(1,1), "Female", "1 + 1", "2",
     new Question[]{new Question("She is practicing the flute", "C", "C - Compliment her Playing \n I - insult Playing \n L - Leave"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")}),
   
    Gabby("Gabby","She likes sports", new Point(1,2), "Female", "1 + 1", "2",
     new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")});
    
    
    private final String name;
   
    private final String description;
    private final Point coordinates;
    private final String type;
    private final String problem;
    private final String solution;
    private final Question[] conversation;
    private final ArrayList <Relationship> relationships = new ArrayList<>();
    private ArrayList<InventoryItem> inventory = new ArrayList<>();
    
    private Actor(String name, String description, Point coordinates, String type, String problem, String solution, Question[] conversation) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        this.type = type;
        this.problem = problem;
        this.solution = solution;
        this.conversation = conversation;
    }

    public String getProblem() {
        return problem;
    }

    public String getSolution() {
        return solution;
    }

    public Question[] getConversation() {
        return conversation;
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
    
    public void setRow(int row) {
        this.coordinates.y = row;
    }

    public void setColumn(int column) {
        this.coordinates.x = column;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Relationship> getRelationships() {
        return relationships;
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    
    
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", type=" + type + ", relationships=" + relationships + '}';
    }

}
