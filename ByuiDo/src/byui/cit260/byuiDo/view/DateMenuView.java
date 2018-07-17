/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.model.Relationship;
import byuido.ByuiDo;

/**
 *
 * @author Jake
 */
class DateMenuView extends View {

    public DateMenuView() {
    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[2];
        //Display a description of the view 
        System.out.println("*******************************************\n"
                + "* Choose who you want to go with on your date      *\n"
                + " A - Anna                                          *\n"
                + " G - Gabby                                         *\n"
                + " D - David                                         *\n"
                + " J - John                                          *\n"
                + " Q - Exit                                          *\n"
                + "****************************************************");

        String storeMenu = this.getInput("\nPlease enter your option");
        inputs[0] = storeMenu.toUpperCase();

        //Display a description of the view 
        System.out.println("*******************************************\n"
                + "* Choose where you want to go on your date         *\n"
                + "* L - Little Caesars      $6                       *\n"
                + "* M - McDonalds	     $10                      *\n"
                + "* A - AppleBees           $16                      *\n"
                + "* Q - Exit                                         *\n"
                + "****************************************************");

        storeMenu = this.getInput("\nPlease enter your option");
        inputs[1] = storeMenu.toUpperCase();
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        Actor date = null;
        switch (inputs[0]) {
            //cases for people
            case "A":
                date = Actor.Anna;
                break;
            case "J":
                date = Actor.John;
                break;
            case "D":
                date = Actor.David;
                break;
            case "G":
                date = Actor.Gabby;
                break;

            default:
                this.console.println("That is not a vaild person to date");
        }

        String menuItem = inputs[1];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "L":
                this.date(date, 6);
                break;
            case "M":
                this.date(date, 10);
                break;
            case "A":
                this.date(date, 16);
                break;
            case "Q":
                return true;

            default:
                this.console.println("Invalid menu item");
        }
        return false;
    }

    private void date(Actor person, double price) {
        int loveInterest = GameControl.checkScore(person, 30);

        if (loveInterest < 0) {
             ErrorView.display(this.getClass().getName(), "No person was selected");
        } else if (loveInterest == 0) {
            System.out.println("Sorry, I don't want to go on a date with you");
        } else {

            try {
                //pay for date
                Player player = ByuiDo.getCurrentGame().getPlayer();
                player.setMoney(player.getMoney() - price);

                //increase relationship score
                Relationship relationship = GameControl.findRelationship(person);
                relationship.setRelationshipScore(relationship.getRelationshipScore() + 10);
                System.out.println("I would like to go on a date with you!");
            } catch (GameControlException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

}
