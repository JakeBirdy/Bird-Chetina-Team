/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.model.Map;
import byui.cit260.byuiDo.model.QuestionLocation;

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
        map.setColumnCount(5);
        map.setRowCount(5);
        map.setCurrentColumn(0);
        map.setCurrentRow(0);
        
        game.setMap(map);
        
       Location[][] locations = createLocations(noOfRows, noOfColumns);
        if (locations == null){
            return null;
        }
      map.setLocation(locations);
        
       
        int success = assignActorsToLocations(locations);
        if (success < 0) {
            return null;
        }
        
        
        return map;
}

    
    
        private static Location[][] createLocations(int row, int column) {
        
            Location[][] locations = new Location[row][column];
//    private String description;
//    private int row;
//    private int column;
//    private boolean visited;
//    private char displaySymbol;
//    private boolean blocked;
        locations[0][0] = new Location("apartment complex, no one's around", 0, 0, false, '-', false);
        locations[0][1] = new Location("street with students, no one looks interested in you", 0, 1, false, '-', false);
        locations[0][2] = new Location("an empty building where burgers and music used to be", 0, 2, false, '-', false);
        locations[0][3] = new Location("apartments and other buildings", 0, 3, false, '-', false);
        locations[0][4] = new QuestionLocation(true, "park", "A park where people might be interested in playing games!", 0, 4, false, 'P', false);
        locations[1][0] = new Location("Little Caesars, closed do to the pizza riots", 1, 0, false, '-', false);
        locations[1][1] = new Location("Brolim's, but I prefer Walmart.", 1, 1, false, '-', false);
        locations[1][2] = new Location("empty street", 1, 2, false, '-', false);
        locations[1][3] = new Location("McDonalds", 1, 3, false, '-', false);
        locations[1][4] = new Location("buildings, no interest to you", 1, 4, false, '-', false);
        locations[2][0] = new QuestionLocation(true, "gym", "Where we work out our buns and theighs", 2, 0, false, 'G', false);
        locations[2][1] = new Location("Apartment", 2, 1, false, '-', false);
        locations[2][2] = new Location("Apartment", 2, 2, false, '-', false);
        locations[2][3] = new Location("Apartment", 2, 3, false, '-', false);
        locations[2][4] = new QuestionLocation(true, "Math Lab", "Maybe we should give up hope of finding someone and do our homework...!", 2, 4, false, 'T', false);
        locations[3][0] = new Location("Apartment", 3, 0, false, '-', false);
        locations[3][1] = new Location("Apartment", 3, 1, false, '-', false);
        locations[3][2] = new Location("Apartment", 3, 2, false, '-', false);
        locations[3][3] = new Location("Apartment", 3, 3, false, '-', false);
        locations[3][4] = new Location("Apartment", 3, 4, false, '-', false);
        locations[4][0] = new Location("Apartment", 4, 0, false, '-', false);
        locations[4][1] = new Location("Apartment", 4, 1, false, '-', false);
        locations[4][2] = new Location("Jake and Tatiana doing their homework on a bench, man those guys are cool!", 4, 2, false, '-', false);
        locations[4][3] = new Location("Apartment", 4, 3, false, '-', false);
        locations[4][4] = new Location("Walmart", 4, 4, false, '-', false);
        
            
        return locations; 
 }

    private static int assignActorsToLocations(Location[][] locations) {

        if (locations == null) {
            return -1;
        }

        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            if (actor.getName().equals("playerM") || actor.getName().equals("playerF")) {
                continue;
            }
        }
        return 1;
    }

 }
