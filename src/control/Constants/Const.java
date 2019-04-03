package control.Constants;

public interface Const {

    public static final int MAP_SIZE_X = 3;
    public static final int MAP_SIZE_Y = 4;
    public static final int TILE_SIZE_X = 4;
    public static final int TILE_SIZE_Y = 4;

    public static final int NUMBER_CUBE_FACES = 20;

    public static final String MAPS_PATH = "./maps/";
    public static final String RESSOURCE_PATH = "./res/";
    public static final String CHARACTERS_PATH = RESSOURCE_PATH + "characters/";
    public static final String OBJECTS_PATH = RESSOURCE_PATH + "objects/";
    public static final String ITEMS_PATH = RESSOURCE_PATH + "items/";

    public static final String MOUNTAIN_PATH = OBJECTS_PATH + "M";
    public static final String TREE_PATH = OBJECTS_PATH + "T";
    public static final String TRAP_PATH = OBJECTS_PATH + "t";
    public static final String TREASURE_PATH = OBJECTS_PATH + "C";
    public static final String QUESTITEM_PATH = OBJECTS_PATH + "Q";
}
