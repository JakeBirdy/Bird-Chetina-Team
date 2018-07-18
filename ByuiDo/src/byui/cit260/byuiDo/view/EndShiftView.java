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
        this.console.println("****************************************************");
        this.console.println("* Enter hours worked and how much we pay you       *");
        this.console.println("****************************************************");
        String hours = this.getInput("\nEnter hours");
        inputs[0] = hours;
        String pay = this.getInput("\nEnter pay");
        inputs[1] = pay;
       return inputs;

    }

    public boolean doAction(String[] inputs) {
        double hours = 0;
        double pay = 0;
        try{
        hours = Double.parseDouble(inputs[0]);
        } catch (NumberFormatException nfe) {
            this.console.println("Enter a number");
       return false;
        }
         try{   
        pay = Double.parseDouble(inputs[1]);
         } catch (NumberFormatException nfe) {
             this.console.println("Enter a number");
             return false;
         }
        double wage = 0;
        try {
            wage = JobControl.calculateWage(hours, pay);
        } catch (JobControlException ex) {
             ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }

       
        this.console.println("your wage is: " + wage);
//double hours = jobControl.calculateWage(0, 0)
        return true;
    }
}
