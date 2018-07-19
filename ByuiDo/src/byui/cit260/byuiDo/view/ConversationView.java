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
public class ConversationView extends View {
    
    

    public ConversationView() {
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
        if(actor == null){
            this.console.println("There is no one here");
            inputs[0] = "Q";
            return inputs;
        }
        this.console.println(actor.getConversation()[0].getQuestion());
        this.console.println(" E - End conversation");
        String menuOption = this.getInput(actor.getConversation()[0].getOptions());
        inputs[0] = menuOption;
        
                
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        if (inputs[0].equals("E")){
            return true;
        }
        Point currentLocation = ByuiDo.getCurrentGame().getPlayer().getActor().getCoordinates();
        Actor actor = null;
        try {
            actor = GameControl.updateRelationship(currentLocation);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }

        if (inputs[0].trim().toUpperCase().equals(actor.getConversation()[0].getAnswer())) {
            ConversationViewTwo view = new ConversationViewTwo();
            view.display();
        }
        return true;

    }

}
