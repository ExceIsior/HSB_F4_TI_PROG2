package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import model.Player;
import model.Position;
import model.gameObject.Hero;
import model.item.Inventory;

public class PlayerManager {

    Hero[] heroes = null;
    Player player = null;

    public PlayerManager() {
        this.player = new Player(Const.DEFAULT_PLAYER_NAME, 
                Const.DEFAULT_PLAYER_EXPERIENCE_POINTS,
                Const.DEFAULT_PLAYER_GOLD,
                new Inventory(Const.DEFAULT_PLAYER_INVENTORY_CAPACITY));
        this.initHeroes();
    }

    public PlayerManager(Player player, Hero[] heroes) {
        this.player = player;
        this.heroes = heroes;
    }

    private void initHeroes() {
        this.heroes = new Hero[Const.HERO_AMOUNT];

        heroes[0] = new Hero(HeroConst.PALADIN_RES_PATH,
                new Position(0, 0),
                HeroConst.PALADIN_DEFAULT_ARMOR,
                null,
                HeroConst.PALADIN_NAME,
                HeroConst.PALADIN_DEFAULT_HEALTH_POINTS,
                HeroConst.PALADIN_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.PALADIN_DEFAULT_AGILITY,
                null,
                null,
                new Inventory(HeroConst.PALADIN_DEFAULT_INVENTORY_CAPACITY));

        heroes[1] = new Hero(HeroConst.MAGE_RES_PATH,
                new Position(0, 0),
                HeroConst.MAGE_DEFAULT_ARMOR,
                null,
                HeroConst.MAGE_NAME,
                HeroConst.MAGE_DEFAULT_HEALTH_POINTS,
                HeroConst.MAGE_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.MAGE_DEFAULT_AGILITY,
                null,
                null,
                new Inventory(HeroConst.MAGE_DEFAULT_INVENTORY_CAPACITY));

        heroes[2] = new Hero(HeroConst.ROGUE_RES_PATH,
                new Position(0, 0),
                HeroConst.ROGUE_DEFAULT_ARMOR,
                null,
                HeroConst.ROGUE_NAME,
                HeroConst.ROGUE_DEFAULT_HEALTH_POINTS,
                HeroConst.ROGUE_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.ROGUE_DEFAULT_AGILITY,
                null,
                null,
                new Inventory(HeroConst.ROGUE_DEFAULT_INVENTORY_CAPACITY));

        heroes[3] = new Hero(HeroConst.RANGER_RES_PATH,
                new Position(0, 0),
                HeroConst.RANGER_DEFAULT_ARMOR,
                null,
                HeroConst.RANGER_NAME,
                HeroConst.RANGER_DEFAULT_HEALTH_POINTS,
                HeroConst.RANGER_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.RANGER_DEFAULT_AGILITY,
                null,
                null,
                new Inventory(HeroConst.RANGER_DEFAULT_INVENTORY_CAPACITY));
    }

}
