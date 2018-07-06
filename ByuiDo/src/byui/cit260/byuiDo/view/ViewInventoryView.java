/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

import byui.cit260.byuiDo.model.InventoryItem;

/**
 *
 * @author Jake
 */
class ViewInventoryView extends View{

    public ViewInventoryView() {
    }

   public String[] getInputs() {
String[] inputs = new String[1];
        System.out.println("****************************************************\n"
        + "* What do you want to do?                          *\n"
        + "* P - Sort items                                   *\n"
        + "* Q - Go back                                      *\n");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
           case "S":
                this.sortItems();
                break;
                case "Q":
                return true;    

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void sortItems() {
        
    }
    
}
