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
   player.setActor(Actor.Player);
   // Create the lists used in the game
   //items = createItems()
    InventoryItem[] inventoryList = createItems();

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

    private static InventoryItem[] createItems() {
        System.out.println("createItems() Called");
        InventoryItem[] inventory = new InventoryItem[3];
        
        
        InventoryItem guitar = new InventoryItem();
        guitar.setDescription("Guitar");
        guitar.setQuantityInStock(0);
        guitar.setRequiredAmount(0);
        guitar.setCost(100);
        
        InventoryItem calculator = new InventoryItem();
        calculator.setDescription("Calculator");
        calculator.setQuantityInStock(0);
        calculator.setRequiredAmount(0);
        calculator.setCost(35);
        
        InventoryItem gymClothes = new InventoryItem();
        gymClothes.setDescription("Gym Clothes");
        gymClothes.setQuantityInStock(0);
        gymClothes.setRequiredAmount(0);
        gymClothes.setCost(25);
        
        InventoryItem flowers = new InventoryItem();
        flowers.setDescription("Flowers");
        flowers.setQuantityInStock(0);
        flowers.setRequiredAmount(0);
        flowers.setCost(5);
        return inventory;
    }


   
}
