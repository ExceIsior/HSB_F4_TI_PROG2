package control;

import control.Constants.Const;
import control.Constants.HeroConst;
import control.Enums.Skills;
import java.util.Arrays;
import model.gameObject.Hero;
import model.gameObject.Skill;
import model.item.Equipment.EquipmentSet;
import model.item.HeroItem;
import model.item.Inventory;

public class HeroManager {

    private Hero[] heroes = null;

    private HeroManager() {
        this.heroes = initHeroes();
    }

    private Hero[] initHeroes() {
        Hero[] heroes = new Hero[Const.HERO_AMOUNT];

        heroes[0] = new Hero(HeroConst.PALADIN_RES_PATH,
                HeroConst.PALADIN_DEFAULT_ARMOR,
                null,
                HeroConst.PALADIN_NAME,
                HeroConst.PALADIN_DEFAULT_HEALTH_POINTS,
                HeroConst.PALADIN_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.PALADIN_DEFAULT_AGILITY,
                null,
                Arrays.asList(Skills.SWORD_THRUST.getSkill()),
                new Inventory<HeroItem>(HeroConst.PALADIN_DEFAULT_INVENTORY_CAPACITY),
                new EquipmentSet(null, null, null));

        heroes[1] = new Hero(HeroConst.MAGE_RES_PATH,
                HeroConst.MAGE_DEFAULT_ARMOR,
                null,
                HeroConst.MAGE_NAME,
                HeroConst.MAGE_DEFAULT_HEALTH_POINTS,
                HeroConst.MAGE_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.MAGE_DEFAULT_AGILITY,
                null,
                Arrays.asList(Skills.THUNDER_STRIKE.getSkill()),
                new Inventory<HeroItem>(HeroConst.MAGE_DEFAULT_INVENTORY_CAPACITY),
                new EquipmentSet(null, null, null));

        heroes[2] = new Hero(HeroConst.ASSASSIN_RES_PATH,
                HeroConst.ASSASSIN_DEFAULT_ARMOR,
                null,
                HeroConst.ASSASSIN_NAME,
                HeroConst.ASSASSIN_DEFAULT_HEALTH_POINTS,
                HeroConst.ASSASSIN_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.ASSASSIN_DEFAULT_AGILITY,
                null,
                Arrays.asList(Skills.DAGGER_STAB.getSkill()),
                new Inventory<HeroItem>(HeroConst.ASSASSIN_DEFAULT_INVENTORY_CAPACITY),
                new EquipmentSet(null, null, null));

        heroes[3] = new Hero(HeroConst.RANGER_RES_PATH,
                HeroConst.RANGER_DEFAULT_ARMOR,
                null,
                HeroConst.RANGER_NAME,
                HeroConst.RANGER_DEFAULT_HEALTH_POINTS,
                HeroConst.RANGER_DEFAULT_MAX_HEALTH_POINTS,
                HeroConst.RANGER_DEFAULT_AGILITY,
                null,
                Arrays.asList(Skills.BOW_SHOT.getSkill()),
                new Inventory<HeroItem>(HeroConst.RANGER_DEFAULT_INVENTORY_CAPACITY),
                new EquipmentSet(null, null, null));

        return heroes;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero[] heroes) {
        this.heroes = heroes;
    }

    public static HeroManager getInstance() {
        return HeroManager_Holder.INSTANCE;
    }

    private static class HeroManager_Holder {

        private static final HeroManager INSTANCE = new HeroManager();
    }
}
