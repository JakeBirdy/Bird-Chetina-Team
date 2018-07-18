/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.exceptions.GameControlException;
import byui.cit260.byuiDo.model.Relationship;
import byuido.ByuiDo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        try (PrintWriter out = new PrintWriter(filePath)){
            this.console.println("The list of relationship score was printed successfully to" + filePath);
            ArrayList<Relationship> relationships = ByuiDo.getCurrentGame().getPlayer().getActor().getRelationships();
            out.println("\n\n Relationship Score Report");
            out.printf("%n %-20s %10s", "Name", "Score");
            
            for (Relationship relationship : relationships) {
                out.printf("%n %-22s %10s", relationship.getActorTwo().getName(),
                        relationship.getRelationshipScore());
            }

        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        } 

        return true;
    }
}