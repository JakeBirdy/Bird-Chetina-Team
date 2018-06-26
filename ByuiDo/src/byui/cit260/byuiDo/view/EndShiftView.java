/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.JobControl;
import byui.cit260.byuiDo.view.View;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
class EndShiftView extends View{

    public EndShiftView() {
    }

    
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("****************************************************");
        System.out.println("* Enter hours worked and how much we pay you       *");
        System.out.println("****************************************************");
        String hours = this.getInput("\nEnter hours");
        inputs[0] = hours;
        String pay = this.getInput("\nEnter pay");
        inputs[1] = pay;
       return inputs;

    }

    public boolean doAction(String[] inputs) {
        double hours = Double.parseDouble(inputs[0]);
        double pay = Double.parseDouble(inputs[1]);
        double wage = JobControl.calculateWage(hours, pay);

        if (wage == -1) {
            System.out.println("Your hours are wrong!!!");
            return false;
        }
        if (wage == -2) {
            System.out.println("WAIT, WE NEED TO PAY YOU!!!");
            return false;
        }

        if (wage < 5) {
            System.out.println("You need more money!!!");
            return false;
        }

        System.out.println("your wage is: " + wage);
//double hours = jobControl.calculateWage(0, 0)
        return true;
    }
}
