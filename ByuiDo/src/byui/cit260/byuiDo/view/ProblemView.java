/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Actor;

/**
 *
 * @author tanya
 */
class ProblemView extends View{

    public ProblemView() {
    }

    @Override
    public String[] getInputs() {
        // TODO: get the actor in this location
        Actor problemActor = Actor.Anna;
        String[] inputs = new String[1];
        System.out.println(problemActor.getProblem());
        String solution = this.getInput("\nPlease enter your option");
        inputs[0] = solution;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        // TODO: get the actor in this location
        Actor problemActor = Actor.Anna;
        if(inputs[0].equals(problemActor.getSolution())){
            
            //TODO: set problemSolved to true
            ConversationView conversationView = new ConversationView();
            conversationView.display();
            return true;
        }
        return false;
        
    }
    
    
}
