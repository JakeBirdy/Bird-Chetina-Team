/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.model.Relationship;
import byuido.ByuiDo;
import java.util.ArrayList;

/**
 *
 * @author tanya
 */
public class PrintRelationshipScoreView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("To print the list of relationship score you need to prompt a file name.");
        String fileName = this.getInput("Please enter the file name");
        inputs[0] = fileName;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];

        try {
            this.console.println("The list of relationship score was printed successfully to" + filePath);
            ArrayList<Relationship> relationships = ByuiDo.getCurrentGame().getPlayer().getActor().getRelationships();
         for (Relationship relationship : relationships){
             out.println();
         }
             
        
        } catch (GameControlException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        }

        return true;
    }
