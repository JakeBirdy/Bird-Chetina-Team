
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

import byui.cit260.byuiDo.exceptions.MapControlException;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.model.Map;
import byui.cit260.byuiDo.model.QuestionLocation;
import byuido.ByuiDo;
import java.awt.Point;

/**
 *
 * @author Jake
 */
public class MapControl {

    public static Map createMap(Game game, int noOfRows, int noOfColumns) throws MapControlException {
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
        if (locations == null) {
            return null;
        }
        map.setLocation(locations);

        assignActorsToLocations(locations);

        return map;
    }

    private static Location[][] createLocations(int row, int column) {

        Location[][] locations = new Location[row][column];

        locations[0][0] = new Location("NorthPoint Apartments, no one's around", 0, 0, false, '_', false);
        locations[0][1] = new Location("Street with students, no one looks interested in you", 0, 1, false, '_', false);
        locations[0][2] = new Location("An empty building where burgers and music used to be", 0, 2, false, '_', false);
        locations[0][3] = new Location("Cottonwood Apartments and other buildings", 0, 3, false, '_', false);
        locations[0][4] = new QuestionLocation(false, "park", "A park where people might be interested in playing games!", 0, 4, true, 'P', false);
        locations[1][0] = new Location("Little Caesars, closed do to the pizza riots", 1, 0, false, '_', false);
        locations[1][1] = new Location("Brolim's, but I prefer Walmart.", 1, 1, false, '_', false);
        locations[1][2] = new Location("Empty street", 1, 2, false, '_', false);
        locations[1][3] = new Location("McDonalds", 1, 3, false, '_', false);
        locations[1][4] = new Location("Buildings, no interest to you", 1, 4, false, '_', false);
        locations[2][0] = new QuestionLocation(true, "gym", "Where we work out our buns and theighs", 2, 0, true, 'G', false);
        locations[2][1] = new Location("Swimming pool", 2, 1, false, '_', false);
        locations[2][2] = new Location("Temple, where you can propose to your beloved one!", 2, 2, false, '_', false);
        locations[2][3] = new Location("AppleBees, restaurant", 2, 3, false, '_', false);
        locations[2][4] = new QuestionLocation(true, "math Lab", "Maybe we should give up hope of finding someone and do our homework...!", 2, 4, true, 'T', false);
        locations[3][0] = new Location("David O. McKay Library | BYU-Idaho", 3, 0, false, '_', false);
        locations[3][1] = new Location("Street with students, no one looks interested in you", 3, 1, false, '_', false);
        locations[3][2] = new Location("Mountain Lofts luxury  apartment complex", 3, 2, false, '_', false);
        locations[3][3] = new Location("Stadium, outdoor activities", 3, 3, false, '_', false);
        locations[3][4] = new Location("BYU-I Crossroads Food Court", 3, 4, false, '_', false);
        locations[4][0] = new Location("Church building, church gatherings each Sunday at 9am", 4, 0, false, '_', false);
        locations[4][1] = new Location("Centre Square Apartments", 4, 1, false, '_', false);
        locations[4][2] = new Location("Jake and Tatiana doing their homework on a bench, man those guys are cool!", 4, 2, false, '_', false);
        locations[4][3] = new Location("Highway 33, a lot of cars, do not cross the road", 4, 3, false, '_', false);
        locations[4][4] = new Location("Walmart", 4, 4, false, '_', false);

        return locations;
    }

    private static void assignActorsToLocations(Location[][] locations)
            throws MapControlException {

        if (locations == null) {
            throw new MapControlException("location is invalid");
        }

        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            Location location = locations[coordinates.x][coordinates.y];
            location.setActor(actor);
        }
    }

    public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControlException {
        if (actor == null) {
            throw new MapControlException("Actor is invalid");
        }
        Game game = ByuiDo.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocation();

        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("That is outside the map boundries");
        }
        int currentRow = actor.getCoordinates().y;
        int currentColumn = actor.getCoordinates().x;
        Location oldLocation = locations[currentRow][currentColumn];
        Location newLocation = locations[newRow][newColumn];
        oldLocation.setActor(null);
        newLocation.setActor(actor);
        newLocation.setVisited(true);
        actor.setRow(newRow);
        actor.setColumn(newColumn);
        return newLocation;
    }
}
