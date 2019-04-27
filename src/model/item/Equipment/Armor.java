package model.item.Equipment;

import model.Effect;

public class Armor extends Equipment {

    public Armor(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect, craftBluePrint, compatibleHeroID);
    }

}
