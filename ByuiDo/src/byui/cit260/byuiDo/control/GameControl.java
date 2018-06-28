/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.InventoryItem;
import byui.cit260.byuiDo.model.InventoryItemType;
import byuido.ByuiDo;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.model.Question;

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
    //call setter to save items list in the game object
    //// Create all other list (e.g., questions, weapons, spells) and save in the game
    Question[] questionList = createQuestions();
    

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
        int length = InventoryItemType.values().length;
        InventoryItem[] items = new InventoryItem[length];
        
        InventoryItem guitar = new InventoryItem();
        guitar.setQuantityInStock(0);
        guitar.setRequiredAmount(0);
        guitar.setCost(100);
        items[InventoryItemType.guitar.ordinal()] = guitar;
        
        InventoryItem frizbee = new InventoryItem();
        frizbee.setQuantityInStock(0);
        frizbee.setRequiredAmount(0);
        frizbee.setCost(100);
        items[InventoryItemType.frizbee.ordinal()] = frizbee;
        
        InventoryItem calculator = new InventoryItem();
        calculator.setQuantityInStock(0);
        calculator.setRequiredAmount(0);
        calculator.setCost(100);
        items[InventoryItemType.guitar.ordinal()] = calculator;
        
        InventoryItem gymClothes = new InventoryItem();
        gymClothes.setQuantityInStock(0);
        gymClothes.setRequiredAmount(0);
        gymClothes.setCost(100);
        items[InventoryItemType.guitar.ordinal()] = gymClothes;
        
//        
//        frizbee,
//    calculator,
//    gymClothes;
        return items;
    }

    private static Question[] createQuestions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
// length = ItemType.value().length() length would be put in 
//private double quantityInStock;
//    private double requiredAmount;
//   private double cost;