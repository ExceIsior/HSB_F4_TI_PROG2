package model.item.Equipment;

import java.util.HashMap;
import model.Effect;
import model.item.EffectItem;
import model.item.Item;
import model.item.Material;

public abstract class Equipment extends EffectItem {

    private CraftBluePrint craftBluePrint = null;
    private int compatibleHeroID = 0;
    
    public Equipment(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect);
        this.craftBluePrint = craftBluePrint;
        this.compatibleHeroID = compatibleHeroID;
    }

    public CraftBluePrint getCraftBluePrint() {
        return craftBluePrint;
    }

    public int getCompatibleHeroID() {
        return compatibleHeroID;
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s\n%s", this.getName(), this.getEffect(), this.getCraftBluePrint());
    }

    
    
}
