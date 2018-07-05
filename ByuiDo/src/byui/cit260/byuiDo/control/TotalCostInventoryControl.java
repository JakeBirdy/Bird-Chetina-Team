/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.model.InventoryItem;

/**
 *
 * @author tanya
 */
public class TotalCostInventoryControl {

    public static double TotalCostInventoryControl(InventoryItem[] items) {
        if (items == null){
            return -1;
        }
    double totalCost = 0;
    
    for (InventoryItem item : items){
        totalCost += item.getCost();
      } 
    
    return totalCost;
}
}
    
