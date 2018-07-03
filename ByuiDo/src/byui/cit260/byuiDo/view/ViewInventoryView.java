/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

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
        + "* M - Map                                          *\n"
        + "* W - Where am I                                   *\n"
        + "* C - Initiate Conversation                        *\n"
        + "* A - Ask out on date                              *\n"
        + "* R - View relationship status                     *\n"
        + "* I - View inventory                               *\n"
        + "* P - Shop                                         *\n"
        + "* J - Go to Work                                   *\n"
        + "* T - Go to Temple                                 *\n"
        + "* S - Save Game                                    *\n"
        + "* Q - Go back to main menue                        *\n"
        + "****************************************************");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
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
        }
        return false;
    }
    
}
