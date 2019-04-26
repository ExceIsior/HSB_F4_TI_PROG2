package model.item.Equipment;

import model.Effect;
import model.item.EffectItem;

/**
 * Abstract super class for all equipment parts.
 *
 * @author Ismail
 */
public abstract class Equipment extends EffectItem {

    private CraftBluePrint craftBluePrint = null;
    private int compatibleHeroID = 0;

    /**
     * Initialises an equipment.
     *
     * @param rarity Rarity of the equipment
     * @param name Name of the equipment
     * @param effect Effect that applies to the equipped hero
     * @param craftBluePrint Crafting materials and costs needed to craft the
     * equipment
     * @param compatibleHeroID Hero's id who can equip the equipment.
     */
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
