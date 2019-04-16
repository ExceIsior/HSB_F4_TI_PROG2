package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import control.Enums.Quests;
import model.Position;
import model.gameObject.Hero;
import model.map.Dungeon;
import model.map.Tile;
import utilities.JsonParser;

public class GameController {

    public final boolean isRunning = true;
    private int gamePhase = 1;
    
    private Dungeon dungeon = null;
    private PhaseController phaseController = null;
    private HeroManager heroManager = null;
    
    public GameController() {
        this.dungeon = new Dungeon(Quests.QUEST_1.getQuest(), (Tile[][])JsonParser.fromJsonFile(Tile[][].class, "./maps/map1/map.json"));
        this.phaseController = new PhaseController(this.dungeon);
        this.heroManager = HeroManager.getInstance();
        setHeroes();
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
        dungeon.getTile(new Position(2,2)).setVisible(true);
        heroManager.getHeroes()[0].setPosition(new Position(9,9));
        Position tilePositionHero1 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[0].getPosition());
        Position fieldPositionHero1 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[0].getPosition());
        dungeon.getTile(tilePositionHero1).getField(fieldPositionHero1).setGameObject(heroManager.getHeroes()[0]);
        
        heroManager.getHeroes()[1].setPosition(new Position(10,9));
        Position tilePositionHero2 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[1].getPosition());
        Position fieldPositionHero2 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[1].getPosition());
        dungeon.getTile(tilePositionHero2).getField(fieldPositionHero2).setGameObject(heroManager.getHeroes()[1]);
        
        heroManager.getHeroes()[2].setPosition(new Position(9,10));
        Position tilePositionHero3 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[2].getPosition());
        Position fieldPositionHero3 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[2].getPosition());
        dungeon.getTile(tilePositionHero3).getField(fieldPositionHero3).setGameObject(heroManager.getHeroes()[2]);
          
        heroManager.getHeroes()[3].setPosition(new Position(10,10));
        Position tilePositionHero4 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[3].getPosition());
        Position fieldPositionHero4 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[3].getPosition());
        dungeon.getTile(tilePositionHero4).getField(fieldPositionHero4).setGameObject(heroManager.getHeroes()[3]);
    }
    
    
}
