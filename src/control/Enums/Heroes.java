package control.Enums;

import control.Constants.HeroConst;
import model.Position;
import model.gameObject.Hero;
import model.item.Inventory;

public enum Heroes {
    PALADIN(new Hero(HeroConst.PALADIN_RES_PATH,
            new Position(0, 0),
            HeroConst.PALADIN_DEFAULT_DAMAGE,
            HeroConst.PALADIN_DEFAULT_ARMOR,
            null,
            HeroConst.PALADIN_NAME,
            HeroConst.PALADIN_DEFAULT_HEALTPOINTS,
            HeroConst.PALADIN_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    MAGE(new Hero(HeroConst.MAGE_RES_PATH,
            new Position(0, 0),
            HeroConst.MAGE_DEFAULT_DAMAGE,
            HeroConst.MAGE_DEFAULT_ARMOR,
            null,
            HeroConst.MAGE_NAME,
            HeroConst.MAGE_DEFAULT_HEALTPOINTS,
            HeroConst.MAGE_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    ROGUE(new Hero(HeroConst.ROGUE_RES_PATH,
            new Position(0, 0),
            HeroConst.ROGUE_DEFAULT_DAMAGE,
            HeroConst.ROGUE_DEFAULT_ARMOR,
            null,
            HeroConst.ROGUE_NAME,
            HeroConst.ROGUE_DEFAULT_HEALTPOINTS,
            HeroConst.ROGUE_DEFAULT_AGILITY,
            null,
            null,
            new Inventory())),
    
    RANGER(new Hero(HeroConst.RANGER_RES_PATH,
            new Position(0, 0),
            HeroConst.RANGER_DEFAULT_DAMAGE,
            HeroConst.RANGER_DEFAULT_ARMOR,
            null,
            HeroConst.RANGER_NAME,
            HeroConst.RANGER_DEFAULT_HEALTPOINTS,
            HeroConst.RANGER_DEFAULT_AGILITY,
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
