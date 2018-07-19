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

/**
 *
 * @author tanya
 */
public class ConversationViewTwo extends View {

    public ConversationViewTwo() {
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
        this.console.println(actor.getConversation()[1].getQuestion());
        String menuOption = this.getInput(actor.getConversation()[1].getOptions());
        inputs[0] = menuOption;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
           Point currentLocation = ByuiDo.getCurrentGame().getPlayer().getActor().getCoordinates();
        Actor actor = null;
        try {
            actor = GameControl.updateRelationship(currentLocation);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
        }
     
        if (inputs[0].trim().toUpperCase().equals(actor.getConversation()[1].getAnswer())) {
            ConversationViewThree view = new ConversationViewThree();
            view.display();
        }
        return true;
            
    }   
}
