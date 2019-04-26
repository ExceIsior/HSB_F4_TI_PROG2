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

/**
 * Controls and starts the game.
 * @author reenawichmann
 */
public class GameController 
{
    private PhaseController phaseController = null;
    private HeroManager heroManager = HeroManager.getInstance();
    private Villain[] villains = null;
    private Dungeon dungeon = null;
    public final boolean isRunning = true;
    private int dungeonID = 0;
    
    /**
     * Initilizes game controller.
     * @param dungeonID Dungeon id determines which dungeon is played
     */
    public GameController(int dungeonID) 
    {
        this.dungeon = DungeonFactory.getDungeon(dungeonID);
        this.dungeonID = dungeonID;
    }  
    
    /**
     * Starts the game by placing all GameObjects and starting the PhaseController.
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
     * Places all Villains on their position which is saved in the json file.
     * @param dungeonID Dungeon id determines which file is read.
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
     * Places all QuestItem on their position which is saved in the json file.
     * @param dungeonID Dungeon id determines which file is read.
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
     * Places all heroes on their starting position.
     * Changes the position of the heroes and places the hero on the field of their starting position.
     */
    private void placeHeroes () 
    {
        Position tilePosition = null;
        Position fieldPosition = null;
        
        heroManager.getHeroes()[0].setPosition(HeroConst.PALADIN_STARTING_POSITION);
        tilePosition = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[0].getPosition());
        fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[0].getPosition());
        dungeon.getTile(tilePosition).getField(fieldPosition).setGameObject(heroManager.getHeroes()[0]);
        
        heroManager.getHeroes()[1].setPosition(HeroConst.MAGE_STARTING_POSITION);
        tilePosition= Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[1].getPosition());
        fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[1].getPosition());
        dungeon.getTile(tilePosition).getField(fieldPosition).setGameObject(heroManager.getHeroes()[1]);
        
        heroManager.getHeroes()[2].setPosition(HeroConst.ASSASSIN_STARTING_POSITION);
        tilePosition = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[2].getPosition());
        fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[2].getPosition());
        dungeon.getTile(tilePosition).getField(fieldPosition).setGameObject(heroManager.getHeroes()[2]);
          
        heroManager.getHeroes()[3].setPosition(HeroConst.RANGER_STARTING_POSITION);
        tilePosition = Converter.convertMapCoordinatesInTileCoordinates(heroManager.getHeroes()[3].getPosition());
        fieldPosition = Converter.convertMapCoordinatesInFieldCoordinates(heroManager.getHeroes()[3].getPosition());
        dungeon.getTile(tilePosition).getField(fieldPosition).setGameObject(heroManager.getHeroes()[3]);
        
        dungeon.getTile(Converter.convertMapCoordinatesInTileCoordinates(HeroConst.PALADIN_STARTING_POSITION)).setVisible(true);
    }
    
    /**
     * Makes all tiles visible to try out the game.
     */
    private void allTilesVisible()
    {
        for (int i = 0; i < Const.MAP_SIZE_X; i++) 
        {
            for (int j = 0; j < Const.MAP_SIZE_X; j++) 
            {
                dungeon.getTile(new Position(i, j)).setVisible(true);
            }
        }
    }
}
