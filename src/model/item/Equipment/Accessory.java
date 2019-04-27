package model.item.Equipment;

import model.Effect;

public class Accessory extends Equipment {

    public Accessory(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect, craftBluePrint, compatibleHeroID);
    }

}
