/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Game;
import byuido.ByuiDo;

/**
 *
 * @author Jake
 */
class SaveGameView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("****************************************************");
        System.out.println("* Save the game by pressing S                      *\n"
                         + "* or return by pressing Q                          *");
        System.out.println("****************************************************");
         String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
    String filePath = inputs[0];
    Game game = ByuiDo.getCurrentGame();
    
    try {
        
    }
    }

    
    
}
