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
 * @author Jake
 */
class JobMenuView extends View{

   
    public String[] getInputs() {
String[] inputs = new String[1];
        System.out.println("****************************************************");
        System.out.println("* P - Perform good deeds                           *");
        System.out.println("* E - End shift, get paid!                         *");
        System.out.println("* Q - Go back to main menue                        *");
        System.out.println("****************************************************");
        String input = this.getInput("\nEnter letter below:");
        inputs[0] = input;
       return inputs;
    }

    public boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "P":
                this.doGoodDeeds();
                break;
            case "E":
                this.endShift();
                break;
            case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void doGoodDeeds() {
        
    }

    private void endShift() {
    EndShiftView endShift = new EndShiftView();
    endShift.display();
    }
    
}
