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

    PlayerGuy("PlayerGuy", new Double(10), "He is Awesome", new Point(1,1), "Male", "1 + 1", "2" ),
    PlayerGirl("PlayerGirl", new Double(10),"She is Awesome", new Point(1,1), "Female", "1 + 1", "2"),
    John("John", new Double(0), "He likes sports", new Point(2,2), "Male", "1 + 1", "2" ),
    David("David", new Double(0),"He likes math", new Point(2,4), "Male", "1 + 1", "2"),
    Anna("Anna", new Double(0),"She likes music", new Point(1,1), "Female", "1 + 1", "2"),
    Gabby("Gabby", new Double(0),"She likes sports", new Point(1,2), "Female", "1 + 1", "2");
    
    
    private final String name;
    private final double money;
    private final String description;
    private final Point coordinates;
    private final String type;
    private final String problem;
    private final String solution;
    private final ArrayList <Relationship> relationships = new ArrayList<>();
    private ArrayList<InventoryItem> inventory = new ArrayList<>();
    
    private Actor(String name, Double money, String description, Point coordinates, String type, String problem, String solution) {
        this.name = name;
        this.money = money;
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

    public Double setMoney() {
        return money;
    }
    
    public Double getMoney() {
        return money;
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
