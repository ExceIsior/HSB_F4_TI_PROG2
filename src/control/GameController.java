package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import java.text.MessageFormat;
import model.Factories.DungeonFactory;
import model.Factories.QuestFactory;
import model.Position;
import model.Quest;
import model.gameObject.GameObject;
import model.gameObject.QuestItem;
import model.gameObject.Villain;
import model.map.Dungeon;
import model.map.Tile;
import utilities.JsonParser;

public class GameController {

    public final boolean isRunning = true;
    private int gamePhase = 1;
    
    private Dungeon dungeon = null;
    private PhaseController phaseController = null;
    private HeroManager heroManager = null;
    private int dungeonID = 0;
    private Villain[] villains = null;
    
    public GameController(int dungeonID) {
        this.dungeon = DungeonFactory.getDungeon(dungeonID);
        
        this.heroManager = HeroManager.getInstance();
        this.dungeonID = dungeonID;
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
        System.out.println("START Game");
        
        this.setHeroes();
        this.setVillains(dungeonID);
        this.setQuestItems(dungeonID);
        
        this.phaseController = new PhaseController(this.dungeon, this.villains);
        phaseController.startGame();
    }
    
    private void setVillains(int dungeonID) {
       
        this.villains = (Villain[]) JsonParser.fromJsonFile(Villain[].class, MessageFormat.format(Const.VILLAIN_PATH, dungeonID));
        
        for (int i = 0; i < villains.length; i++) {
            Position tilePositionVillain = Converter.convertMapCoordinatesInTileCoordinates(villains[i].getPosition());
            Position fieldPositionVillain = Converter.convertMapCoordinatesInFieldCoordinates(villains[i].getPosition());
            dungeon.getTile(tilePositionVillain).getField(fieldPositionVillain).setGameObject(villains[i]);
        }
    }
    
    private void setQuestItems(int dungeonID) {
        QuestItem questItems[];
        
        questItems = (QuestItem[]) JsonParser.fromJsonFile(QuestItem[].class, MessageFormat.format(Const.JSON_QUESTITEM_PATH, dungeonID));
        
        for (int i = 0; i < questItems.length; i++) {
            Position tilePositionQuestItem = Converter.convertMapCoordinatesInTileCoordinates(questItems[i].getPosition());
            Position fieldPositionQuestItem= Converter.convertMapCoordinatesInFieldCoordinates(questItems[i].getPosition());
            dungeon.getTile(tilePositionQuestItem).getField(fieldPositionQuestItem).setGameObject(questItems[i]);
        }
    }
    
    private void setHeroes () {
        heroManager.getHeroes()[0].setPosition(HeroConst.PALADIN_STARTING_POSITION);
        Position tilePositionHero1 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[0].getPosition());
        Position fieldPositionHero1 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[0].getPosition());
        dungeon.getTile(tilePositionHero1).getField(fieldPositionHero1).setGameObject(heroManager.getHeroes()[0]);
        
        heroManager.getHeroes()[1].setPosition(HeroConst.MAGE_STARTING_POSITION);
        Position tilePositionHero2 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[1].getPosition());
        Position fieldPositionHero2 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[1].getPosition());
        dungeon.getTile(tilePositionHero2).getField(fieldPositionHero2).setGameObject(heroManager.getHeroes()[1]);
        
        heroManager.getHeroes()[2].setPosition(HeroConst.ASSASSIN_STARTING_POSITION);
        Position tilePositionHero3 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[2].getPosition());
        Position fieldPositionHero3 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[2].getPosition());
        dungeon.getTile(tilePositionHero3).getField(fieldPositionHero3).setGameObject(heroManager.getHeroes()[2]);
          
        heroManager.getHeroes()[3].setPosition(HeroConst.RANGER_STARTING_POSITION);
        Position tilePositionHero4 = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[3].getPosition());
        Position fieldPositionHero4 = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[3].getPosition());
        dungeon.getTile(tilePositionHero4).getField(fieldPositionHero4).setGameObject(heroManager.getHeroes()[3]);
        
        dungeon.getTile(Converter.convertMapCoordinatesInTileCoordinates(HeroConst.PALADIN_STARTING_POSITION)).setVisible(true);
        //zum Testen alle Felder sichtbar machen
        //alleFeldersichtbar();
       
    }
    
    private void alleFeldersichtbar()
    {
        dungeon.getTile(new Position(0,0)).setVisible(true);
        dungeon.getTile(new Position(0,1)).setVisible(true);
        dungeon.getTile(new Position(0,2)).setVisible(true);
        dungeon.getTile(new Position(0,3)).setVisible(true);
        dungeon.getTile(new Position(0,4)).setVisible(true);
        dungeon.getTile(new Position(1,0)).setVisible(true);
        dungeon.getTile(new Position(1,1)).setVisible(true);
        dungeon.getTile(new Position(1,2)).setVisible(true);
        dungeon.getTile(new Position(1,3)).setVisible(true);
        dungeon.getTile(new Position(1,4)).setVisible(true);
        dungeon.getTile(new Position(2,0)).setVisible(true);
        dungeon.getTile(new Position(2,1)).setVisible(true);
        dungeon.getTile(new Position(2,2)).setVisible(true);
        dungeon.getTile(new Position(2,3)).setVisible(true);
        dungeon.getTile(new Position(2,4)).setVisible(true);
        dungeon.getTile(new Position(3,0)).setVisible(true);
        dungeon.getTile(new Position(3,1)).setVisible(true);
        dungeon.getTile(new Position(3,2)).setVisible(true);
        dungeon.getTile(new Position(3,3)).setVisible(true);
        dungeon.getTile(new Position(3,4)).setVisible(true);
        dungeon.getTile(new Position(4,0)).setVisible(true);
        dungeon.getTile(new Position(4,1)).setVisible(true);
        dungeon.getTile(new Position(4,2)).setVisible(true);
        dungeon.getTile(new Position(4,3)).setVisible(true);
        dungeon.getTile(new Position(4,4)).setVisible(true);
    }
}
