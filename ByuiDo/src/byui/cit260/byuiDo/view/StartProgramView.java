/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;


import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.model.Player;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class StartProgramView extends View{
    

    public StartProgramView() {
    }

    //get players name
    public String[] getInputs() {
        String[] inputs = new String[1]; 
        this.console.println("****************************************************");
        this.console.println("* The game is a text-based dating simulator game.  *");
        this.console.println("* You are a student at BYU-I, and you haven't been *");
        this.console.println("* able to go on many dates in the past and the     *");
        this.console.println("* the semester is coming to a close in ten days!   *");
        this.console.println("* Your goal is to break the cycle and meet the     *");
        this.console.println("* person of your dreams                            *");
        this.console.println("* Good luck!                                       *");
        this.console.println("****************************************************");
        String playersName = this.getInput("\nPlease enter name.");
        inputs[0] = playersName;
       return inputs;
    }

    public boolean doAction(String[] inputs) {
        //playersName = get the first value in the inputs array
        String playersName = inputs[0];
        //player = savePlayer(playersName);
        Player player = GameControl.savePlayer(playersName);
        //IF player == null
        //display “Could not create the player. “ +
        //“Enter a different name.”
        if (player == null) {
            this.console.println("Could not create the player.");
            this.console.println("Enter a different name.");
            //RETURN false
            return false;
            //ENDIF
        }
        //Display
        this.console.println("================================================= ");
        this.console.println("Welcome to the game " + playersName + "!");
        this.console.println("We hope you have a lot of fun!");
        this.console.println("================================================= ");
        
        //mainMenuView = Create a new MainMenuView object 
        MainMenuView mainMenuView = new MainMenuView();
        //mainMenuView.displayMainMenuView()
        mainMenuView.display();
        return true;
    }
}
