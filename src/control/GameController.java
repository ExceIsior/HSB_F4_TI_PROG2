package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import java.text.MessageFormat;
import model.Factories.DungeonFactory;
import model.Position;
import model.gameObject.QuestItem;
import model.gameObject.Villain;
import model.map.Dungeon;
import utilities.JsonParser;

public class GameController 
{
    private PhaseController phaseController = null;
    private HeroManager heroManager = null;
    private Villain[] villains = null;
    private Dungeon dungeon = null;
    public final boolean isRunning = true;
    private int gamePhase = 1;
    private int dungeonID = 0;
    
    public GameController(int dungeonID) 
    {
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

    public Dungeon getDungeon() 
    {
        return dungeon;
    }

    public int getGamePhase() 
    {
        return gamePhase;
    }

    public void setGamePhase(int gamePhase) 
    {
        this.gamePhase = gamePhase;
    }
    
    /**
     * Starts the game by placing all GameObjects and starting the PhaseController
     */
    public void start() 
    {
        System.out.println("START Game");
        
        this.placeHeroes();
        this.placeVillains(dungeonID);
        this.placeQuestItems(dungeonID);
        
        this.phaseController = new PhaseController(this.dungeon, this.villains);
        phaseController.startGame();
    }
    /**
     * Places all Villains on their position which is saved in the json file
     * DungeonID determines which files is read
     * @param dungeonID 
     */
    private void placeVillains(int dungeonID) 
    {
        this.villains = (Villain[]) JsonParser.fromJsonFile(Villain[].class, MessageFormat.format(Const.VILLAIN_PATH, dungeonID));
        
        for (int i = 0; i < villains.length; i++) 
        {
            Position tilePositionVillain = Converter.convertMapCoordinatesInTileCoordinates(villains[i].getPosition());
            Position fieldPositionVillain = Converter.convertMapCoordinatesInFieldCoordinates(villains[i].getPosition());
            dungeon.getTile(tilePositionVillain).getField(fieldPositionVillain).setGameObject(villains[i]);
        }
    }
    /**
     * Places all QuestItem on their position which is saved in the json file
     * DungeonID determines which files is read
     * @param dungeonID 
     */
    private void placeQuestItems(int dungeonID) 
    {
        QuestItem questItems[] = (QuestItem[]) JsonParser.fromJsonFile(QuestItem[].class, MessageFormat.format(Const.JSON_QUESTITEM_PATH, dungeonID));
        
        for (int i = 0; i < questItems.length; i++) 
        {
            Position tilePositionQuestItem = Converter.convertMapCoordinatesInTileCoordinates(questItems[i].getPosition());
            Position fieldPositionQuestItem= Converter.convertMapCoordinatesInFieldCoordinates(questItems[i].getPosition());
            dungeon.getTile(tilePositionQuestItem).getField(fieldPositionQuestItem).setGameObject(questItems[i]);
        }
    }
    
    /**
     * Places all heroes on their starting position
     */
    private void placeHeroes () 
    {
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
        
        //allFieldsVisible();
    }
    
    /**
     * Makes all fields visible to try out the game
     */
    private void allFieldsVisible()
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
