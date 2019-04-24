package control.Constants;

import static control.Constants.Const.CHARACTERS_PATH;
import model.Position;

public interface HeroConst {

    public static final int PALADIN_ID = 0;
    public static final String PALADIN_NAME = "Paladin";
    public static final String PALADIN_RES_PATH = "Pa"; //CHARACTERS_PATH + "paladin.";
    public static final int PALADIN_DEFAULT_DAMAGE = 5;
    public static final int PALADIN_DEFAULT_ARMOR = 10;
    public static final int PALADIN_DEFAULT_HEALTH_POINTS = 20;
    public static final int PALADIN_DEFAULT_MAX_HEALTH_POINTS = 20;
    public static final int PALADIN_DEFAULT_AGILITY = 3;
    public static final int PALADIN_DEFAULT_INVENTORY_CAPACITY = 1;
    public static final int PALADIN_DEFAULT_INITIATIVE = 1;

    public static final int MAGE_ID = 1;
    public static final String MAGE_NAME = "Mage";
    public static final String MAGE_RES_PATH = "Ma";//CHARACTERS_PATH + "mage.";
    public static final int MAGE_DEFAULT_DAMAGE = 8;
    public static final int MAGE_DEFAULT_ARMOR = 3;
    public static final int MAGE_DEFAULT_HEALTH_POINTS = 5;
    public static final int MAGE_DEFAULT_MAX_HEALTH_POINTS = 5;
    public static final int MAGE_DEFAULT_AGILITY = 5;
    public static final int MAGE_DEFAULT_INVENTORY_CAPACITY = 1;
    public static final int MAGE_DEFAULT_INITIATIVE = 2;

    public static final int ASSASSIN_ID = 2;
    public static final String ASSASSIN_NAME = "Assassin";
    public static final String ASSASSIN_RES_PATH = "As"; //CHARACTERS_PATH + "assassin.";
    public static final int ASSASSIN_DEFAULT_DAMAGE = 3;
    public static final int ASSASSIN_DEFAULT_ARMOR = 10;
    public static final int ASSASSIN_DEFAULT_HEALTH_POINTS = 5;
    public static final int ASSASSIN_DEFAULT_MAX_HEALTH_POINTS = 5;
    public static final int ASSASSIN_DEFAULT_AGILITY = 8;
    public static final int ASSASSIN_DEFAULT_INVENTORY_CAPACITY = 2;
    public static final int ASSASSIN_DEFAULT_INITIATIVE = 3;

    public static final int RANGER_ID = 3;
    public static final String RANGER_NAME = "Ranger";
    public static final String RANGER_RES_PATH = "Ra"; //CHARACTERS_PATH + "ranger.";
    public static final int RANGER_DEFAULT_DAMAGE = 8;
    public static final int RANGER_DEFAULT_ARMOR = 5;
    public static final int RANGER_DEFAULT_HEALTH_POINTS = 5;
    public static final int RANGER_DEFAULT_MAX_HEALTH_POINTS = 5;
    public static final int RANGER_DEFAULT_AGILITY = 5;
    public static final int RANGER_DEFAULT_INVENTORY_CAPACITY = 1;
    public static final int RANGER_DEFAULT_INITIATIVE = 4;
    
    public static final Position PALADIN_STARTING_POSITION = new Position(9, 9);
    public static final Position MAGE_STARTING_POSITION = new Position(10, 9);
    public static final Position ASSASSIN_STARTING_POSITION = new Position(9, 10);
    public static final Position RANGER_STARTING_POSITION = new Position(10, 10);
}
