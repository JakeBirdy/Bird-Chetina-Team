package byui.cit260.byuiDo.view;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tanya
 */
public class StoreMenuView extends View {

    public StoreMenuView() {
    }

    //get players name
    public String[] getInputs() {

        //inputs = new String array one element long 
        String[] inputs = new String[1];

        //Display a description of the view 
        System.out.println("****************************************************\n"
                + "* Welcome to Walmart shop                          *\n"
                + "* Here you can buy all kind of items for  all your *\n"
                + "* dating needs.                                    *\n"
                + "* My name is Rex:) How can I help you?             *\n"
                + "* Choose the option below:                         *\n"
                + "* W - Browse Wares                                 *\n"
                + "* B - Buy Items                                    *\n"
                + "* Q - Exit                                         *\n"
                + "****************************************************");

        String storeMenu = this.getInput("\nPlease enter your option");
        inputs[0] = storeMenu;
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = menuItem.toUpperCase();
        switch (menuItem) {
            case "W":
                this.getWares();
                break;
            case "B":
                this.getShop();
                break;
            case "Q":
                return true;

            default:
                System.out.println("Invalid menu item");
        }
        return false;
    }

    private void getWares() {
   ItemsPriceMenuView itemsPriceMenu = new ItemsPriceMenuView();
   itemsPriceMenu.display();
    }

    private void getShop() {
        ItemsPriceMenuView itemsPriceMenu =  new ItemsPriceMenuView();
        itemsPriceMenu.display();
        
      
    }
}
