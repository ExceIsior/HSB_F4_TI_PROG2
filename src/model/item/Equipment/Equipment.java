package model.item.Equipment;

import java.util.HashMap;
import model.Effect;
import model.item.EffectItem;
import model.item.Item;
import model.item.Material;

public class Equipment extends Item {

    private CraftBluePrint craftBluePrint = null;

    public Equipment(int rarity, String name, CraftBluePrint craftBluePrint) {
        super(rarity, name);
        this.craftBluePrint = craftBluePrint;
    }

    public CraftBluePrint getCraftBluePrint() {
        return craftBluePrint;
    }

}
