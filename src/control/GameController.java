package control;

import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;

public class GameController {
    
    public final boolean isRunning = true;
    private int gamePhase = 1;
    
    
    private static Dungeon dungeon = new Dungeon(null, MapController.generateMap());
    
    
    //PHASEN
    //0 = Menue
    //1 = Hero Phase
    //2 = Exploration Phase
    //3 = Encounter Phase
    //4 = Villain Phase    

    public static Dungeon getDungeon() {
        return dungeon;
    }

    public int getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(int gamePhase) {
        this.gamePhase = gamePhase;
    }
    
    
}
