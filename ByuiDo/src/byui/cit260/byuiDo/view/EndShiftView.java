/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.JobControl;
import byui.cit260.byuiDo.exceptions.JobControlException;
import byui.cit260.byuiDo.view.View;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try{
        double hours = Double.parseDouble(inputs[0]);
        } catch (NumberFormatException nfe) {
            System.err.println("Enter a number");
        }
         try{   
        double pay = Double.parseDouble(inputs[1]);
         } catch (NumberFormatException nfe) {
             System.out.println("Enter a number");
         }
        double wage = 0;
        try {
            wage = JobControl.calculateWage(hours, pay);
        } catch (JobControlException ex) {
            Logger.getLogger(EndShiftView.class.getName()).log(Level.SEVERE, null, ex);
        }

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
