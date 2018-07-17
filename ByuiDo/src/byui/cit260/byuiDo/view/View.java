/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byuido.ByuiDo;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public abstract class View implements ViewInterface {
    private String message;
    
    protected final BufferedReader keyboard = ByuiDo.getInFile();
    protected final PrintWriter console = ByuiDo.getOutFile();
    
    
    public View() {
    }
    @Override
    public void display() {
        
        boolean endOfView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q") || inputs.length == 0) {
                return;
            }
            endOfView = doAction(inputs);

        } while (endOfView != true);
        
    }
    
    @Override
        public String getInput(String promptMessage) {
        String input = "";
            boolean valid = false;

        //WHILE valid == false (no input value has been entered) 
        try {
        while (valid == false) {
            //Display the prompt message 
            System.out.println(promptMessage);

            //Get the value entered from the keyboard 
            input = this.keyboard.readLine();
           

            //Trim off leading and trailing blanks from the value 
            input = input.trim();

            //IF length of the value < 1 then
            if (input.length() < 1) //Display "You must enter a non-blank value”
            {
                System.out.println("You must enter a non-blank value.");
                continue;
            }
            valid = true;
        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return input;
        
    }
        
}
