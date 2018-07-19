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

    PlayerGuy("PlayerGuy", "He is Awesome", new Point(0,0), "Male", "1 + 1", "2", 
            new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")} ),
   
    PlayerGirl("PlayerGirl", "She is Awesome", new Point(1,1), "Female", "1 + 1", "2", 
     new Question[]{new Question("question", "answer", "Options"), 
            new Question("question", "answer", "options"), 
            new Question("question", "answer", "options")}),
   
    John("John", "He likes sports", new Point(2,2), "Male", "1 + 1", "2" ,
     new Question[]{new Question("He is going to play footbal ", "A", "A - Go with him to see his game \n B - Say you are busy\n C - Start talk to another guy \n"), 
            new Question("His team lost the game", "A", "A - Support him and tell him next win will be his \n B - Say he could play better \n L - You were boring and you left \n"), 
            new Question("He invited you to go with him on a party ", "C", "A - You are already go with other friends \n B - You accept his invitation \n L - You are very happy to go on a date with him \n")}),
   
    David("David","He likes math", new Point(2,4), "Male", "1 + 1", "2",
     new Question[]{new Question("2 + 5=", "B", "\"A - 10 \n B - 7 \n C - 9\n"), 
            new Question("10/5=", "A", "A - 2 \n B - 3\n C - 1\n"), 
            new Question("1*5=", "C", "\"A - 4 \n B - 2\n C - 5\n")}),
   
    Anna("Anna","She likes music", new Point(1,1), "Female", "1 + 1", "2",
     new Question[]{new Question("She is practicing the flute", "A", "A - Compliment her Playing \n B - insult Playing \n C - Leave \n"), 
            new Question("He favorite music is", "A", "\"A - Classic \n B - Rock \n C - Pop \n"), 
            new Question("She knows how tp play", "B", "\"A - Piano \b B - Flute \n C - "
+ "guitar \n")}),
   
    Gabby("Gabby","She likes sports", new Point(1,2), "Female", "1 + 1", "2",
     new Question[]{new Question("Gabby's favorite sport is", "C", "\"A - Soccer \n B - Swimming \n C - Running \n"), 
            new Question("She runs with", "A", "\"A - Team \n B - Friends \n C - Boyfriend \n"), 
            new Question("She participated in Marathon", "B", "\"A - World Cup- 2018 \b B - Teton marathon \n C - "
+ "she doesn't participated at all \n")});
    
    
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
