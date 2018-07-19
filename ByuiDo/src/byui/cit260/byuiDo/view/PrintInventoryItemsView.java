/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.view;


import byui.cit260.byuiDo.model.InventoryItem;
import byuido.ByuiDo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class PrintInventoryItemsView extends View {

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        this.console.println("To print a list of the inventory items you need to create a name\n"
                + "for the file you will be saving to");
        String fileName = this.getInput("Please enter the file name below");
        inputs[0] = fileName;
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];

        try (PrintWriter out = new PrintWriter(filePath)){
            this.console.println("The list of Items were printed  out successfully to: " + filePath);
            ArrayList<InventoryItem> items = ByuiDo.getCurrentGame().getItems();
            out.println("\n\n             Inventory Items Report           ");
            out.printf("%n%-10s%20s%5s%-40s", "Name", "Cost", "    ", "Description");
            
         
            for (InventoryItem item : items) {
                out.printf("%n%-10s%20.2f%5s%-40s", item.getItemType()
                                              , item.getCost()
                                              , "     "
                                              , item.getDescription());
                        
            }

        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), e.getMessage());
            return false;
        } 

        return true;
    }
}
