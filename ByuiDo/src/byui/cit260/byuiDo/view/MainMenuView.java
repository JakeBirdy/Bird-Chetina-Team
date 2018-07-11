
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;


import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.exceptions.MapControlException;
import byui.cit260.byuiDo.view.GameMenuView;
import byuido.ByuiDo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jake
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }

    @Override
     public String[] getInputs() {
         String[] inputs = new String[1];
         String menu = this.getInput
         ("****************************************************\n" 
        + "* N - Start New Game                               *\n"
        + "* R - Restart Existing Game                        *\n"
        + "* H - Get help on how to play the game             *\n"
        + "* Q - Quit Game                                    *\n"
        + "****************************************************");
         inputs[0] = menu;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "N":
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(ByuiDo.getPlayer());
        //gameMenuView = create a new GameMenuView object
        GameMenuView gameMenu = new GameMenuView();
        //gameMenuView.displayGameMenuView();
        gameMenu.display();

    }

    private void restartGame() {
//        startExistingGameView = Create a new StartExistingGameView
        StartExistingGameView startExistingGame = new StartExistingGameView();
//        startExistingGameView.displayStartExistingGameView(); 
        startExistingGame.displayStartExistingGame();
    }

    private void getHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
