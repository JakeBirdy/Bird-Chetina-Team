/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.model.Map;

/**
 *
 * @author Jake
 */
public class MapControl {

  
    
    public static Map createMap( Game game, int noOfRows, int noOfColumns) { 
        if (game == null || noOfRows < 0 || noOfColumns < 0) {
            return null;
        }
        Map map = new Map();
        map.setDescription("description, a map");
        map.setRowCount(5);
        map.setColumnCount(5);
        
        
        
        game.setMap(map);
        
       Location[][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null){
            return null;
        }
      map.setLocation(locations);
        
        // assign actors and items to locations
        int success = assignActorsToLocations(locations);
        if (success < 0) {
            return null;
        }
        success = assignItemsToLocations(locations);
        
        return map;
}

    
    
    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        System.out.println("createLocations()");
        if (noOfRows < 1 || noOfColumns < 1) {
            return null;
        }
        Location[][] locations = new Location[noOfRows][noOfColumns];
        
        
        return locations;
 }

    private static int assignActorsToLocations(Location[][] locations) {
 System.out.println("assignActorsToLocations");
        // Check for invalid input
        if (locations == null) {
            return -1;    }
   
    return 1;
    }

    private static int assignItemsToLocations(Location[][] locations) {
        System.out.println("assignItemsToLocations()"); 
    return 1;}
}
