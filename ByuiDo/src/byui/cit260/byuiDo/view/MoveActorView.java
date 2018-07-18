/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.MapControl;
import byui.cit260.byuiDo.exceptions.MapControlException;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.model.Player;
import byuido.ByuiDo;

/**
 *
 * @author Jake
 */
public class MoveActorView extends View {

    public MoveActorView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
       this.console.println("Enter your x then y coordinate to move character.");

        String input1 = this.getInput("Enter an x value:");
        inputs[0] = input1;

        String input2 = this.getInput("Enter a y value:");
        inputs[1] = input2;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String row = inputs[0];
        String column = inputs[1];
        int intRow;
        int intColumn;
        try {
            intRow = Integer.parseInt(row) - 1;
            intColumn = Integer.parseInt(column) - 1;
        } catch (NumberFormatException e) {
             ErrorView.display(this.getClass().getName(), "The row and column must be a number.");
            return false;
        }
        Player player = ByuiDo.getPlayer();
        Actor actor = player.getActor();
        Location newLocation;
        try {
            newLocation = MapControl.moveActor(actor, intRow, intColumn);
        } catch (MapControlException e) {
             ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        }
        this.console.println(newLocation.getDescription());
        newLocation.setVisited(true);
        return true;    }

}
