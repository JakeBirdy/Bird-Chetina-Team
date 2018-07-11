package byuido;

import byui.cit260.byuiDo.view.StartProgramView;
import byui.cit260.byuiDo.model.StoreLocation;
import byui.cit260.byuiDo.model.Actor;
import byui.cit260.byuiDo.model.ChallengeScene;
import byui.cit260.byuiDo.model.Game;
import byui.cit260.byuiDo.model.InventoryItem;
import byui.cit260.byuiDo.model.Location;
import byui.cit260.byuiDo.model.Map;
import byui.cit260.byuiDo.model.Player;
import byui.cit260.byuiDo.model.Question;
import byui.cit260.byuiDo.model.Relationship;

/**
 *
 * @author tanya
 */
public class ByuiDo {

    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        try {
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable ie) {
            System.out.println(ie.fillInStackTrace());
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ByuiDo.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ByuiDo.player = player;
    }

}
