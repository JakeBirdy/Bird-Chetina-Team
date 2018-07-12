/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;

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
        System.out.println("****************************************************\n"
        + "*                                          *\n"
        + "* T - Get total price of all items                                  *\n"        
        + "* P - Print list                                                    *\n"
        + "* Q - Go back                                                       *\n"
        + "*********************************************************************");
        String menuOption = this.getInput("\nPlease enter the Menu Option");
        inputs[0] = menuOption;
        return inputs;   }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
