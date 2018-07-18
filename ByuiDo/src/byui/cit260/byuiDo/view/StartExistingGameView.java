/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.exceptions.GameControlException;

/**
 *
 * @author Jake
 */
class StartExistingGameView extends View{

    public StartExistingGameView() {
    }

   
    @Override
    public String[] getInputs() {
    String[] inputs = new String[1];
    this.console.println("Enter the name of the saved game\n");
    String menuOption = this.getInput("enter below:");
        inputs[0] = menuOption;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    String filePath = inputs[0];
    try {
        GameControl.getGame(filePath);
        this.console.println("The game was saved successfully to" + filePath);
        
    }
    catch (GameControlException e){
        ErrorView.display(this.getClass().getName(), e.getMessage());
        return false;
    }
    GameMenuView gameMenuView = new GameMenuView();
   gameMenuView.display();
   return true;
    }
    
}
