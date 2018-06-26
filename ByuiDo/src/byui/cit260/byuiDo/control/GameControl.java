/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.InventoryItem;
import byuido.ByuiDo;
import byui.cit260.byuiDo.model.Player;

/**
 *
 * @author Jake
 */
public class GameControl {

    //savePlayer(name): Player 
    public static Player savePlayer(String playersName) {
        if (playersName == null || playersName.length() < 1) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        ByuiDo.setPlayer(player);

        return new Player();
    }
    //public static int createNewGame(Player player) {
    public static int createNewGame(Player player){
        
    // Check for invalid inputs
    if (player == null){
    // indicates invalid input
    
     return -1;
    }
    //endif
    //game = new Game object
   Game game = new Game();
   //call setter to save Player object in the game object
   game.setPlayer(player);
   //call setter to save the game in the main class of program
   ByuiDo.setCurrentGame(game);
   // call setter to assign an actor to the player
   player.setActor(Actor.Anna);
   // Create the lists used in the game
   //items = createItems()
    InventoryItem[] inventoryList = createInventoryList();

call setter to save items list in the game object
// Create all other list (e.g., questions, weapons, spells) and save in the game
…
map = createMap(game, noOfRows, noOfColumns)
if map == null
 return -2 // indicates create map failed
endif
call setter to save the map in the game object
RETURN 1 // indicates success
    }

    private static InventoryItem[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static void createItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
