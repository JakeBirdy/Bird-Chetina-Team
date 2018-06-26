/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

/**
 *
 * @author tanya
 */
public class StoreControl {

    public static double calcTotalPrice(double itemPrice, double itemAmount) {
        if (itemPrice <= 0) {
            return -1;
        }

        if (itemAmount <= 0 || itemAmount > 20) {
            return -1;
        }

        double price = itemPrice * itemAmount;
        double totalTax = 0.06 * price;
        double totalPrice = price + totalTax;

        return totalPrice;

    }
}
