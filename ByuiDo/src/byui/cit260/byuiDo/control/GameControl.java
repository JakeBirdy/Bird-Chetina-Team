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
import byui.cit260.byuiDo.model.Map;
import byuido.ByuiDo;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.model.Question;
import byui.cit260.byuiDo.model.QuestionType;

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
    public static int createNewGame(Player player) {

        // Check for invalid inputs
        if (player == null) {
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
//    Question[] questionList = createQuestions();
        Map map = MapControl.createMap(game, 5, 5);
        if (map == null) {
            return -2;
        }
        game.setMap(map);

        return 1;
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

        return items;
    }

    private static Question[] createQuestions() {
        Question[] questions = new Question[7];

 Question date = new Question();
        date.setQuestion("Where should we go?");
        date.setAnswer("");
        date.setRequired(true);
        date.setAmount(10);
        questions[QuestionType.date.ordinal()] = date;

        Question work = new Question();
        work.setQuestion("How much do you do you earned?");
        work.setAnswer("");
        work.setRequired(true);
        work.setAmount(10);
        questions[QuestionType.work.ordinal()] = work;
        
        Question gym = new Question();
        gym.setQuestion("Will you spot me?");
        gym.setAnswer("");
        gym.setRequired(false);
        gym.setAmount(10);
        questions[QuestionType.gym.ordinal()] = gym;
        
        Question propose = new Question();
        propose.setQuestion("Marry me?");
        propose.setAnswer("");
        propose.setRequired(true);
        propose.setAmount(10);
        questions[QuestionType.propose.ordinal()] = propose;       
       
        Question park = new Question();
        park.setQuestion("Want to play me...Ultimate frizbee that is?");
        park.setAnswer("");
        park.setRequired(true);
        park.setAmount(10);
        questions[QuestionType.park.ordinal()] = park;       
        
        return questions;
    }

}
// length = ItemType.value().length() length would be put in 
//private double quantityInStock;
//    private double requiredAmount;
//   private double cost;
