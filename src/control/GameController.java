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
    private PhaseController phaseController = null;
    private HeroManager heroManager = null;
    
    public GameController() {
        this.dungeon = new Dungeon(Quests.QUEST_1.getQuest(), MapController.generateMap());
        this.phaseController = new PhaseController(this.dungeon);
        this.heroManager = HeroManager.getInstance();
        MapController.setHeroes();
    }

    //PHASEN
    //0 = Menue
    //1 = Hero Phase
    //2 = Exploration Phase
    //3 = Encounter Phase
    //4 = Villain Phase    

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
        System.out.println("start");
        
        this.setHeroes();
        
        phaseController.startGame();
    }
    
    private void setHeroes () {
        heroManager.getHeroes()[0].setPosition(new Position(0,0));
        Position tilePositionHero1 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[0].getPosition());
        Position fieldPositionHero1 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[0].getPosition());
        
        System.out.println("position" + fieldPositionHero1.getX() + " " + fieldPositionHero1.getY());
        dungeon.getTile(tilePositionHero1).getField(fieldPositionHero1).setGameObject(heroManager.getHeroes()[0]);
        //MapController.updateMap();
        
        heroManager.getHeroes()[1].setPosition(new Position(1,0));
        Position tilePositionHero2 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[1].getPosition());
        Position fieldPositionHero2 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[1].getPosition());
        System.out.println("position" + fieldPositionHero2.getX() + " " + fieldPositionHero2.getY());
        dungeon.getTile(tilePositionHero2).getField(fieldPositionHero2).setGameObject(heroManager.getHeroes()[1]);
        MapController.updateMap();
  
    }
    
    
}
