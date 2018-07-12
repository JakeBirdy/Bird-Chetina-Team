/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.exceptions.InventoryControlException;
import byui.cit260.byuiDo.model.InventoryItem;
import java.util.ArrayList;

/**
 *
 * @author Jake
 */
public class InventoryControl {

    public static double calculateTotalCost(InventoryItem[] items)
    throws InventoryControlException {
        if (items == null){
            throw new InventoryControlException("Number of items should be greater than zero");
            
        }
    double totalCost = 0;
    
    for (InventoryItem item : items){
        totalCost += item.getCost();
      } 
    
    return totalCost;
}
     public static ArrayList<InventoryItem> sortInventory(ArrayList<InventoryItem> inventoryItems) {
        ArrayList<InventoryItem> items = (ArrayList<InventoryItem>) inventoryItems.clone();
        int n = items.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                String one = items.get(i).getItemType();
                String two = items.get(k).getItemType();
                if (one.compareTo(two) > 0) {
                    InventoryControl.swapNumbers(i, k, items);
                }
            }
        }
        return items;
    }

    private static void swapNumbers(int i, int j, ArrayList<InventoryItem> inventoryItems) {

        InventoryItem temp = inventoryItems.get(i);
        InventoryItem tempTwo = inventoryItems.get(j);
        inventoryItems.set(j, temp);
        inventoryItems.set(i, tempTwo);
    }   
}
