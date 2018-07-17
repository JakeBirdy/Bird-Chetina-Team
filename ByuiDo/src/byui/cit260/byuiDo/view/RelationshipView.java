/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.Relationship;
import byuido.ByuiDo;
import java.util.ArrayList;

/**
 *
 * @author tanya
 */
public class RelationshipView extends View {

    public RelationshipView() {
    }
        //get players name
    @Override
    public String[] getInputs() {

        //inputs = new String array one element long 
        String[] inputs = new String[1];

        //Display a description of the view 
       ArrayList<Relationship> relationshipList = ByuiDo.getCurrentGame().getPlayer().getActor().getRelationships();
       for (int i = 0; i < relationshipList.size(); i++){
           System.out.println("Relationship: " + relationshipList.get(i).getActorOne().getName() + " and " + relationshipList.get(i).getActorTwo().getName());
           System.out.println("Relationship score: " + relationshipList.get(i).getRelationshipScore() + "\n");
       }
           
        
        System.out.println("****************************************************\n"
                + "* Here you can see the  compatibility/level                 *\n"
                + "  the relationship with all actors!                         *\n"
                + "* Q - Exit                                                  *\n"
                + "*************************************************************");
       
        String relationshipMenu = this.getInput("\nPlease enter your option");
        inputs[0] = relationshipMenu;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item");
                return false;
        }
        
    }

    
}
