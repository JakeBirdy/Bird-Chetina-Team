/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import java.util.Scanner;

/**
 *
 * @author Jake
 */
class HelpMenuView extends View{

    public HelpMenuView() {
    }

    public String[] getInputs() {
       
        String[] inputs = new String[1];
        this.console.println("****************************************************");
        this.console.println("* G - What is the Goal of the game                 *");
        this.console.println("* M - How to move                                  *");
        this.console.println("* C - How to initiate conversation                 *");
        this.console.println("* D - How to go on a date                          *");
        this.console.println("* E - How to earn money                            *");
        this.console.println("* R - How to look representable                    *");
        this.console.println("* Q - Go back                                      *");
        this.console.println("****************************************************");
       String input = this.getInput("\nEnter letter below:");
        inputs[0] = input;
       return inputs;
    }

    public boolean doAction(String[] inputs) {
     String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "G":
                this.getGoalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "C":
                this.startConversation();                
                break;
            case "D":
                this.howToStartDate();
                break;
            case "E":
                this.howToEarnMoney();
                break;
            case "R":
                this.howToLookGood();
                break;
            case "Q":
                return true;    

            default:
                 ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        return false;
    }

    private void getGoalOfGame() {
        this.console.println("Goal of the Game");
    }
    private void howToMove() {
    this.console.println("How to move around");    }

    private void startConversation() {
    this.console.println("How to initiate conversation with someone");   }

    private void howToStartDate() {
    this.console.println("How to go on a date");    }

    private void howToEarnMoney() {
    this.console.println("How to earn money");    }

    private void howToLookGood() {
    this.console.println("How to be representable for certain places");    }
    
}
