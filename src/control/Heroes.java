package control;

import model.Position;
import model.gameObject.Hero;
import model.item.Inventory;

public enum Heroes {
    PALADIN(new Hero(Constants.PALADIN_RES_PATH,
            new Position(0, 0),
            Constants.PALADIN_DEFAULT_DAMAGE,
            Constants.PALADIN_DEFAULT_ARMOR,
            null,
            Constants.PALADIN_NAME,
            Constants.PALADIN_DEFAULT_HEALTPOINTS,
            Constants.PALADIN_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    MAGE(new Hero(Constants.MAGE_RES_PATH,
            new Position(0, 0),
            Constants.MAGE_DEFAULT_DAMAGE,
            Constants.MAGE_DEFAULT_ARMOR,
            null,
            Constants.MAGE_NAME,
            Constants.MAGE_DEFAULT_HEALTPOINTS,
            Constants.MAGE_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    ROGUE(new Hero(Constants.ROGUE_RES_PATH,
            new Position(0, 0),
            Constants.ROGUE_DEFAULT_DAMAGE,
            Constants.ROGUE_DEFAULT_ARMOR,
            null,
            Constants.ROGUE_NAME,
            Constants.ROGUE_DEFAULT_HEALTPOINTS,
            Constants.ROGUE_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    RANGER(new Hero(Constants.RANGER_RES_PATH,
            new Position(0, 0),
            Constants.RANGER_DEFAULT_DAMAGE,
            Constants.RANGER_DEFAULT_ARMOR,
            null,
            Constants.RANGER_NAME,
            Constants.RANGER_DEFAULT_HEALTPOINTS,
            Constants.RANGER_DEFAULT_AGILITY,
            null,
            null,
            new Inventory()));

    private final Hero hero;

    private Heroes(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return this.hero;
    }
}
