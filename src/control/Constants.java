package control;

public interface Constants {

    public static final int MAP_SIZE_X = 3;
    public static final int MAP_SIZE_Y = 4;
    public static final int TILE_SIZE_X = 4;
    public static final int TILE_SIZE_Y = 4;

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

    public static final String HERO_PATH = CHARACTERS_PATH + "H";
    public static final String BOSS_PATH = CHARACTERS_PATH + "B";
    public static final String VILLAIN_PATH = CHARACTERS_PATH + "V";

    public static final String PALADIN_NAME = "Paladin";
    public static final String MAGE_NAME = "Mage";
    public static final String ROGUE_NAME = "Rogue";
    public static final String RANGER_NAME = "Ranger";

    public static final int PALADIN_DEFAULT_DAMAGE = 5;
    public static final int PALADIN_DEFAULT_ARMOR = 10;
    public static final int PALADIN_DEFAULT_HEALTPOINTS = 20;
    public static final int PALADIN_DEFAULT_AGILITY = 3;

    public static final int MAGE_DEFAULT_DAMAGE = 8;
    public static final int MAGE_DEFAULT_ARMOR = 3;
    public static final int MAGE_DEFAULT_HEALTPOINTS = 5;
    public static final int MAGE_DEFAULT_AGILITY = 5;

    public static final int ROGUE_DEFAULT_DAMAGE = 3;
    public static final int ROGUE_DEFAULT_ARMOR = 10;
    public static final int ROGUE_DEFAULT_HEALTPOINTS = 5;
    public static final int ROGUE_DEFAULT_AGILITY = 8;

    public static final int RANGER_DEFAULT_DAMAGE = 8;
    public static final int RANGER_DEFAULT_ARMOR = 5;
    public static final int RANGER_DEFAULT_HEALTPOINTS = 5;
    public static final int RANGER_DEFAULT_AGILITY = 5;
}
