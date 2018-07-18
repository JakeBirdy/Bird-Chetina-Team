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
public class JobMenuView extends View{

    public JobMenuView() {
    }

   
    public String[] getInputs() {
String[] inputs = new String[1];
        this.console.println("****************************************************");
        this.console.println("* P - Perform good deeds                           *");
        this.console.println("* E - End shift, get paid!                         *");
        this.console.println("* Q - Go back to main menue                        *");
        this.console.println("****************************************************");
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
                this.console.println("Invalid menu item");
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
