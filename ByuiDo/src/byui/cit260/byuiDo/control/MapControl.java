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
        map.setDescription("description");
        map.setRowCount(10);
        map.setColumnCount(10);
        game.setMap(map);
        
       Location[][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null){
            return null;
        }
      
        // assign actors and items to locations
        
        return map;
}

    
    
    public static Location[][] createLocations(int noOfRows, int noOfColumns) {
        System.out.println("createLocations()");
        Location[][] locations = new Location[noOfRows][noOfColumns];
        return locations;
 }
}
