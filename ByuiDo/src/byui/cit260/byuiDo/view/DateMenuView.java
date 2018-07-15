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

        //inputs = new String array one element long 
        String[] inputs = new String[2];
        //Display a description of the view 
        System.out.println("*******************************************\n"
                + "* Choose who you want to go with on your date      *\n"
                + " A - Anna                                          *\n"
                + " A - Gabby                                         *\n"
                + " A - David                                         *\n"
                + " A - John                                          *\n"
                + "* Q - Exit                                         *\n"
                + "****************************************************");

        String storeMenu = this.getInput("\nPlease enter your option");
        inputs[1] = storeMenu;

        //Display a description of the view 
        System.out.println("*******************************************\n"
                + "* Choose where you want to go on your date         *\n"
                + "* L - Little Caesars      $6                       *\n"
                + "* M - McDonalds	     $10                      *\n"
                + "* A - AppleBees           $16                      *\n"
                + "* Q - Exit                                         *\n"
                + "****************************************************");

        storeMenu = this.getInput("\nPlease enter your option");
        inputs[1] = storeMenu;
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
                System.out.println("That is not a vaild person to date");
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
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void date(Actor loveIntrest, double price) {
        //check if date will go with you
        if (loveInterest )
        try {
            //pay for date
            Player player = ByuiDo.getCurrentGame().getPlayer();
            player.setMoney(player.getMoney() - price);
            
            //increase relationship score
            Relationship relationship = GameControl.findRelationship(actor);
            relationship.setRelationshipScore(relationship.getRelationshipScore() + 10);

        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
        }

        //pay for date
    }

}
