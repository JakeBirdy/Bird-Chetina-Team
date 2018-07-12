/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.exceptions.StoreControlException;

/**
 *
 * @author tanya
 */
public class StoreControl {

    public static double calcTotalPrice(double itemPrice, double itemAmount)
    throws StoreControlException{
        if (itemPrice <= 0) {
            throw new StoreControlException("Needs the correct price");
        }

        if (itemAmount <= 0 || itemAmount > 20) {
            throw new StoreControlException("Please check the correct number of items");
        }

        double price = itemPrice * itemAmount;
        double totalTax = 0.06 * price;
        double totalPrice = price + totalTax;

        return totalPrice;

    }
}
