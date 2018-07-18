/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.control.InventoryControl;
import byui.cit260.byuiDo.exceptions.InventoryControlException;
import byui.cit260.byuiDo.model.InventoryItem;
import byuido.ByuiDo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jake
 */
class ViewInventoryView extends View{

    public ViewInventoryView() {
    }

   public String[] getInputs() {
String[] inputs = new String[1];
        this.console.println("****************************************************\n"
        + "* What do you want to do?                                           *\n"
        + "* T - Get total price of all items                                  *\n"        
        + "* P - Print list                                                    *\n"
        + "* Q - Go back                                                       *\n"
        + "*********************************************************************");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
           case "P":
                this.listItems();
                break;
           case "T":
{ //!!!!!!!!!!!!!!!!!check this later!!!!!!!!!!!!!!!!!!!!!!
    try {
        this.getTotalCost();
    } catch (InventoryControlException ex) {
        this.console.println(ex.getMessage());
    }
}
                break;
           case "Q":
                return true;    

            default:
                this.console.println("Invalid menu item");
        }
        return false;
    }

    private void listItems() {
        ArrayList<InventoryItem> inventory = ByuiDo.getCurrentGame().getPlayer().getActor().getInventory();
        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getItemType());
        }
    }
   
     private void getTotalCost() throws InventoryControlException {
     double totalCost = InventoryControl.calculateTotalCost(ByuiDo.getCurrentGame().getItems()); 
         this.console.println(totalCost);
    }
}
