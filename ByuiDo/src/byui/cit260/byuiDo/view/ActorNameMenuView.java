/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.control.GameControl;

/**
 *
 * @author tanya
 */
public class ActorNameMenuView extends View {

    public ActorNameMenuView() {
    }

    //get players name
    @Override
    public String[] getInputs() {

        //inputs = new String array one element long 
        String[] inputs = new String[1];

        //Display a description of the view 
        System.out.println("****************************************************\n"
                + "* Here the List of your potential choice           *\n"
                + "* Type the name you choose                         *\n"
                + "* J - John                                         *\n"
                + "* D - David                                        *\n"
                + "* A - Anna                                         *\n"
                + "* G - Gabby                                        *\n"
                + "* Q - Exit                                         *\n"
                + "****************************************************");

        String storeMenu = this.getInput("\nPlease enter your option");
        inputs[0] = storeMenu;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        int engaged = 0;
        switch (menuItem) {
            case "J":
                engaged = this.propose(Actor.John);
                break;
            case "D":
                engaged = this.propose(Actor.John);
                break;
            case "A":
                engaged = this.propose(Actor.John);
                break;
            case "G":
                engaged = this.propose(Actor.John);
                break;
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item");
                return false;
        }
        if (engaged < 0) {
            System.out.println("Invalid person");
            return false;
        }
        if (engaged > 0 ){
            System.out.println("Congratulations! You're engaged!");
            return true;
        }
        System.out.println("Sorry! I don't wanna merry you!");
        return true;
    }

    private int propose(Actor person) {
        int engaged = GameControl.checkScore(person, 75);
        
        // if engaged < 0 then
            // print error message - no person was selected
        // else if engaged == 0
            // print Sorry, I don't want to marry you at this time
        // else 
            // Yes, You are my only true love for all eternity
        // endif 
        
        if (engaged < 0)
            System.out.println("No person was selected");
        else if (engaged == 0)
            System.out.println("Sorry, I don't want to marry you at this time");
        else
            System.out.println("Yes, You are my only true love for all eternity");
            
        return engaged;

    }
}

