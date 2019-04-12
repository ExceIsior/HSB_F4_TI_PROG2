package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import control.Enums.Quests;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;

public class GameController {

    public final boolean isRunning = true;
    private int gamePhase = 1;
    
    private Dungeon dungeon = null;
    private InteractiveMap positions = null;
    private PhaseController phaseController = null;
    
    
    public GameController() {
        this.dungeon = new Dungeon(Quests.QUEST_1.getQuest(), MapController.generateMap());
        this.positions = new InteractiveMap();
        this.phaseController = new PhaseController(this.dungeon, this.positions);
    }

    public InteractiveMap getPositions() {
        return positions;
    }

    //PHASEN
    //0 = Menue
    //1 = Hero Phase
    //2 = Exploration Phase
    //3 = Encounter Phase
    //4 = Villain Phase    
    public void setPositions(InteractiveMap positions) {
        this.positions = positions;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public int getGamePhase() {
        return gamePhase;
    }

    public void setGamePhase(int gamePhase) {
        this.gamePhase = gamePhase;
    }

    public void start() {
        phaseController.startGame();
        System.out.println("start");
    }
    
    
}
