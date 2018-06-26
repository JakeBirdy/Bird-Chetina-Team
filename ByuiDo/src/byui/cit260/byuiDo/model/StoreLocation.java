package byui.cit260.byuiDo.model;


import byui.cit260.byuiDo.model.InventoryItem;
import byui.cit260.byuiDo.model.Location;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tanya
 */
public class StoreLocation extends Location {

    private InventoryItem inventoryItem;

    public StoreLocation() {
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.inventoryItem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoreLocation other = (StoreLocation) obj;
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StoreLocation{" + "inventoryItem=" + inventoryItem + '}';
    }

}
