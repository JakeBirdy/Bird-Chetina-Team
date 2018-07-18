/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.GameControl;
import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Relationship;
import byuido.ByuiDo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tanya
 */
public class ConversationViewThree extends View{

    public ConversationViewThree() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        Point currentLocation = ByuiDo.getCurrentGame().getPlayer().getActor().getCoordinates();
        Actor actor = null;
        try {
            actor = GameControl.getNPCByPoint(currentLocation);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
        this.console.println(actor.getConversation()[2].getQuestion());
        String menuOption = this.getInput(actor.getConversation()[2].getOptions());
        inputs[2] = menuOption;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
           Point currentLocation = ByuiDo.getCurrentGame().getPlayer().getActor().getCoordinates();
        Actor actor = null;
        try {
            actor = GameControl.getNPCByPoint(currentLocation);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
     
        if(inputs[2].equals(actor.getConversation()[2].getAnswer())){
               try {
                   Relationship relationship = GameControl.findRelationship(actor);
                   relationship.setRelationshipScore(relationship.getRelationshipScore() + 10);
               } catch (GameControlException ex) {
                   this.console.println("No relationship");
               }
        }
        return true;
            
    }
    
}
