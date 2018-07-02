/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;
import byui.cit260.byuiDo.view.View;
import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class TempleMenuView extends View {
    
    public TempleMenuView(){
    }

    //get players name
    public String[] getInputs() {

        //inputs = new String array one element long 
        String[] inputs = new String[1];

        //Display a description of the view 
        System.out.println("****************************************************\n"
                         + "* Welcome to the temple!                            *\n"
                         + "* Here you can propose to your loved one!          *\n"
                         + "* Choose -Propose- if you are ready to propose     *\n"
                         + "* and get married in the Temple                    *\n"
                         + "* Choose the option below:                         *\n"
                         + "* P - Prpose                                       *\n"
                         + "* Q - Exit                                         *\n"
                         + "****************************************************");

        String storeMenu = this.getInput("\nPlease enter your option");
        inputs[0] = storeMenu;
        return inputs;
    }
    
        public boolean doAction(String[] inputs) {
                String menuItem = inputs[0];
                menuItem = menuItem.toUpperCase();
                switch (menuItem) {
                    case "P":
                        this.getPropose();
                        break;
                    case "Q":
                        return true;

                    default:
                        System.out.println("Invalid menu item");
                        return false;
                }
                return true;
            }
    private void getPropose() {
        ActorNameMenuView actorNameMenu = new ActorNameMenuView();
        actorNameMenu.display();
        
        
    }  
}
    
 