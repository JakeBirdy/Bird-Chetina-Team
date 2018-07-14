/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.exceptions.MapControlException;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.InventoryItem;
import byui.cit260.byuiDo.model.InventoryItemType;
import byui.cit260.byuiDo.model.Map;
import byuido.ByuiDo;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.model.Question;
import byui.cit260.byuiDo.model.QuestionType;
import byui.cit260.byuiDo.model.Relationship;
import java.awt.Point;
import java.util.ArrayList;

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
    public static int createNewGame(Player player) throws MapControlException {

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
        player.setActor(Actor.Anna);
        // Create the lists used in the game
        //items = createItems()
        ArrayList<InventoryItem> items = createItems();
        //call setter to save items list in the game object
        //// Create all other list (e.g., questions, weapons, spells) and save in the game
//    Question[] questionList = createQuestions();
        Map map = MapControl.createMap(game, 5, 5);
        if (map == null) {
            return -2;
        }
        game.setMap(map);
        ByuiDo.setCurrentGame(game);
        return 1;
    }
    
    public static Actor getNPCByPoint(Point point) throws GameControlException{
        Actor actor = null;
        
        Actor[] actors = Actor.values();
        for(int i=0; i < actors.length; i++){
            if(actors[i].getCoordinates().equals(point) 
                    && !(actors[i].getName().equals("PlayerGuy") || !actors[i].getName().equals("PlayerGirl"))){
                actor = actors[i];
            }
        }
        if(actor == null){
            throw new GameControlException("There is no actor here");
        }
        return actor;
    }

    public static ArrayList<InventoryItem> createItems() {
      
        InventoryItem guitar = new InventoryItem();
        guitar.setItemType("guitar");
        guitar.setQuantityInStock(0);
        guitar.setRequiredAmount(0);
        guitar.setDescription("A fine crafted Guitar");
        guitar.setCost(300);
      
        InventoryItem frizbee = new InventoryItem();
        frizbee.setItemType("frizbee");
        frizbee.setQuantityInStock(0);
        frizbee.setRequiredAmount(0);
        frizbee.setDescription("A fine crafted frizbee");
        frizbee.setCost(10);
      
        InventoryItem calculator = new InventoryItem();
        calculator.setItemType("calculator");
        calculator.setQuantityInStock(0);
        calculator.setRequiredAmount(0);
        calculator.setDescription("A fine crafted calculator");
        calculator.setCost(50);
      
        InventoryItem gymClothes = new InventoryItem();
        gymClothes.setItemType("gymClothes");
        gymClothes.setQuantityInStock(0);
        gymClothes.setRequiredAmount(0);
        gymClothes.setDescription("Finely crafted clothes");
        gymClothes.setCost(60);

        

 
    


        ArrayList<InventoryItem> items = new ArrayList<>();
        items.add(InventoryItemType.guitar.ordinal(), guitar);
        items.add(InventoryItemType.frizbee.ordinal(), frizbee);
        items.add(InventoryItemType.calculator.ordinal(), calculator);
        items.add(InventoryItemType.gymClothes.ordinal(), gymClothes);
     

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
        work.setQuestion("How much do you earned?");
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
public static Relationship findRelationship(Actor actor) throws GameControlException{
    ArrayList<Relationship> list = ByuiDo.getCurrentGame().getPlayer().getActor().getRelationships();
    for(Relationship relationship : list){
        if(relationship.getActorOne().equals(actor) || relationship.getActorTwo().equals(actor)){
            return relationship;
        }
    }
    throw new GameControlException("No such relationship");
    
}
    public static int propose(Actor person) {
       System.out.println("*** propose to " + person.name());
       
       if (person == null) {
           return -1;
       }
       
       // Get Actor who is the player
       Actor playersActor = ByuiDo.getPlayer().getActor();
      
       // get the player Actor's relationships
       ArrayList<Relationship> playersRelationships = playersActor.getRelationships();
       
       // search for relationship between the players Actor and person
       Relationship relationship = null;
       for(Relationship nextRelationship : playersRelationships) {
           if (nextRelationship.getActorTwo().equals(person)) {
               relationship = nextRelationship;
               break;         
           }
       }
       
       if (relationship == null) { // relationship not found
           return 0; // not engaged
       }
       
       // check to see if the relationship is strong enough
       if (relationship.getRelationshipScore() < 75) { 
           return 0; // not engaged
       }

       
       return 1; // that are engagged
    }

}
// length = ItemType.value().length() length would be put in 
//private double quantityInStock;
//    private double requiredAmount;
//   private double cost;
