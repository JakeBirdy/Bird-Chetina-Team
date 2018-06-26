/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Game implements Serializable {

    private long totalDays;
    private double currentScore;
    private InventoryItem[] items;
    private Player player;
    private Map map;
    

    public Game() {
    }

    public long getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(long totalDays) {
        this.totalDays = totalDays;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    public InventoryItem[] getItems() {
        return items;
    }

    public void setItems(InventoryItem[] items) {
        this.items = items;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.totalDays ^ (this.totalDays >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        hash = 59 * hash + Arrays.deepHashCode(this.items);
        hash = 59 * hash + Objects.hashCode(this.player);
        hash = 59 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (this.totalDays != other.totalDays) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalDays=" + totalDays + ", currentScore=" + currentScore + ", items=" + items + ", player=" + player + ", map=" + map + '}';
    }

}
