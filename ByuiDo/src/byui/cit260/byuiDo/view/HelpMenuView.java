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
        System.out.println("****************************************************");
        System.out.println("* G - What is the Goal of the game                 *");
        System.out.println("* M - How to move                                  *");
        System.out.println("* C - How to initiate conversation                 *");
        System.out.println("* D - How to go on a date                          *");
        System.out.println("* E - How to earn money                            *");
        System.out.println("* R - How to look representable                    *");
        System.out.println("* Q - Go back                                      *");
        System.out.println("****************************************************");
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
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getGoalOfGame() {
        System.out.println("Goal of the Game");
    }
    private void howToMove() {
    System.out.println("How to move around");    }

    private void startConversation() {
    System.out.println("How to initiate conversation with someone");   }

    private void howToStartDate() {
    System.out.println("How to go on a date");    }

    private void howToEarnMoney() {
    System.out.println("How to earn money");    }

    private void howToLookGood() {
    System.out.println("How to be representable for certain places");    }
    
}
