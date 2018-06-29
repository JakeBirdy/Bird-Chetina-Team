/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.view.ConversationMenuView;
import byui.cit260.byuiDo.view.DateMenuView;
import byui.cit260.byuiDo.view.JobMenuView;
import byui.cit260.byuiDo.view.StoreMenuView;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
class GameMenuView extends View{

    public GameMenuView() {
    }

    void displayGameMenuView() {
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
    }

    private String[] getInputs() {
String[] inputs = new String[1];
        System.out.println("****************************************************");
        System.out.println("* M - Map                                          *");
        System.out.println("* W - Where am I                                   *");
        System.out.println("* C - Initiate Conversation                        *");
        System.out.println("* A - Ask out on date                              *");
        System.out.println("* R - View relationship status                     *");
        System.out.println("* I - View inventory                               *");
        System.out.println("* P - Shop                                         *");
        System.out.println("* J - Go to Work                                   *");
        System.out.println("* T - Go to Temple                                 *");
        System.out.println("* S - Save Game                                    *");
        System.out.println("* Q - Go back to main menue                        *");
        System.out.println("****************************************************");
        boolean valid = false;
        while (valid == false) {
            System.out.println("You must enter a value");
            Scanner inFile;
            inFile = new Scanner(System.in);

            //Trim off leading and trailing blanks from the value 
            inputs[0] = inFile.nextLine().trim();
            if (inputs[0].length() < 1) {
                System.out.println("Enter letter below:");
                continue;
            }
            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "M":
                this.getMap();
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
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getMap() {
  
    }

    private void getWhereAmI() {

    }

    private void startConversation() {
     ConversationMenuView conversationMenu = new ConversationMenuView();
     conversationMenu.displayConversationMenu();
    }

    private void askToStartDate() {
    DateMenuView dateMenu = new DateMenuView();
     dateMenu.displayDateMenu();
    }

    private void getRelationshipStatus() {

    }

    private void viewInventory() {

    }

    private void saveGame() {

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

}
