/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.view.ConversationView;
import byui.cit260.byuiDo.view.DateMenuView;
import byui.cit260.byuiDo.view.JobMenuView;
import byui.cit260.byuiDo.view.StoreMenuView;
import byuido.ByuiDo;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
class GameMenuView extends View{

    public GameMenuView() {
    }

    

    public String[] getInputs() {
String[] inputs = new String[1];
        this.console.println("****************************************************\n"
        + "* M - Map                                          *\n"
        + "* G - Go somewhere else                            *\n"
        + "* W - Where am I                                   *\n"
        + "* C - Initiate Conversation                        *\n"
        + "* A - Ask out on date                              *\n"
        + "* R - View relationship status                     *\n"
        + "* I - View inventory                               *\n"
        + "* P - Shop                                         *\n"
        + "* J - Go to Work                                   *\n"
        + "* T - Go to Temple                                 *\n"
        + "* S - Save Game                                    *\n"
        + "* Q - Go back to main menue                        *\n"
        + "****************************************************");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "M":
                this.getMap();
                break;
            case "G":
                this.goSomewhere();
                break;
            case "W":
                this.getWhereAmI();
                break;
            case "C":
                this.startConversation();                
                break;
            case "A":
                this.askToStartDate();
                break;
            case "R":
                this.getRelationshipStatus();
                break;
            case "I":
                this.viewInventory();
                break;
            case "P":
                this.goToShop();
            case "J":
                this.goToWork();
                break;
            case "T":
                this.goToTemple();
                break;                
            case "S":
                this.saveGame();
                break;
            case "Q":
                return true;    

            default:
                 ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        return false;
    }

    private void getMap() {
  
        Game game = ByuiDo.getCurrentGame();
        Location[][] locations = game.getMap().getLocation();
        this.console.println("    Map of Rexburg");
        this.console.println("   1   2   3   4   5");

        for (int row = 0; row < locations.length; row++) {
            this.console.print("----------------------\n");
            this.console.print(row+1 + "|");
            for (int column = 0; column < locations.length; column++) {
                Location location = locations[row][column];
               if(game.getPlayer().getActor().getCoordinates().x  == column && game.getPlayer().getActor().getCoordinates().y  == row){
                   
                   this.console.print(" & ");
                   
               }
                
               else if (location.isVisited()) {
                    this.console.print(" " + location.getDisplaySymbol() + " ");
                }
                else{
                    this.console.print(" ? ");
                }
                this.console.print("|");
            }
            this.console.print("\n");
            
        }
        this.console.print("----------------------\n");
    
    }

    private void getWhereAmI() {

    }

    private void startConversation() {
     ConversationView conversationMenu = new ConversationView();
     conversationMenu.display();
    }

    private void askToStartDate() {
    DateMenuView dateMenu = new DateMenuView();
     dateMenu.display();
    }

    private void getRelationshipStatus() {
        RelationshipView relationshipMenu = new RelationshipView();
        relationshipMenu.display();

    }

    private void viewInventory() {
    ViewInventoryView viewInventory = new ViewInventoryView();
     viewInventory.display();
    }

    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();
    }

    private void goToShop() {
        StoreMenuView storeMenu = new StoreMenuView();
        storeMenu.display();
        
    }

    private void goToWork() {
        JobMenuView jobMenu = new JobMenuView();
        jobMenu.display();
    }

    private void goToTemple() {
        TempleMenuView templeMenu = new TempleMenuView();
        templeMenu.display();
    }

    private void goSomewhere() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();        
    }

}
