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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author tanya
 */
public class ByuiDo {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {

            ByuiDo.inFile = new BufferedReader(new InputStreamReader(System.in));
            ByuiDo.outFile = new PrintWriter(System.out, true);
            ByuiDo.logFile = new PrintWriter("logfile.txt ");
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + " \nMessage: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ByuiDo.inFile != null) {
                    ByuiDo.inFile.close();
                }
                if (ByuiDo.outFile != null) {
                    ByuiDo.outFile.close();
                }
                if (logFile != null) {
                    logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Input or output file did not close successfully");
            }
        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ByuiDo.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ByuiDo.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ByuiDo.inFile = inFile;
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
