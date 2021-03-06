package control.Constants;

public interface Const 
{
    public static final int MAP_SIZE_X = 5;
    public static final int MAP_SIZE_Y = 5;
    public static final int TILE_SIZE_X = 4;
    public static final int TILE_SIZE_Y = 4;

    public static final int NUMBER_CUBE_FACES = 20;

    public static final int HERO_AMOUNT = 4;
    
    public static final int LEVEL1 = 0;
    public static final int LEVEL2 = 1;
    public static final int LEVEL3 = 2;

    public static final String DEFAULT_PLAYER_NAME = "Player1";
    public static final int DEFAULT_PLAYER_GOLD = 0;
    public static final int DEFAULT_PLAYER_EXPERIENCE_POINTS = 0;
    public static final int DEFAULT_PLAYER_INVENTORY_CAPACITY = 99999;

    public static final String SAVE_GAME_PATH = "./savegame/";
    public static final String SAVE_GAME_HERO_PATH = SAVE_GAME_PATH + "hero.json";
    public static final String SAVE_GAME_PLAYER_PATH = SAVE_GAME_PATH + "player.json";
    
    public static final String MAPS_PATH = "./maps/map{0,number,integer}/map.json";
    public static final String VILLAIN_PATH = "./maps/map{0,number,integer}/villains.json";
    public static final String JSON_QUESTITEM_PATH = "./maps/map{0,number,integer}/questitems.json";
    public static final String RESSOURCE_PATH = "./res/";
    public static final String CHARACTERS_PATH = RESSOURCE_PATH + "characters/";
    public static final String HERO_PATH = CHARACTERS_PATH + "hero/";
    public static final String OBJECTS_PATH = RESSOURCE_PATH + "objects/";
    public static final String ITEMS_PATH = RESSOURCE_PATH + "items/";
    public static final String TRAP_PATH = OBJECTS_PATH + "t";
    public static final String TREASURE_PATH = OBJECTS_PATH + "C";
    public static final String QUESTITEM_PATH = OBJECTS_PATH + "Q";

    public static final int HEIGHT_OBSTACLE = 20;
    public static final int HEIGHT_TERRAIN= 0;
    
    public static final int MUSHROOM_ID = 0;
   
}
