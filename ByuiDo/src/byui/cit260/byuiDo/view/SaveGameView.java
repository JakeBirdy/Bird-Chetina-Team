/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.model.Game;
import byuido.ByuiDo;

/**
 *
 * @author Jake
 */
public class SaveGameView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("To save the game, enter a valid file name");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    String filePath = inputs[0];
    
    Game game = ByuiDo.getCurrentGame();
    
    try {
        GameControl.saveGame(game, filePath);
        this.console.println("The game was saved successfully to" + filePath);
        
    }
    catch (GameControlException e){
        ErrorView.display(this.getClass().getName(), e.getMessage());
        return false;
    }
    
    return true;
    }

    
    
}
