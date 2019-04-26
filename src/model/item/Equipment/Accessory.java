package model.item.Equipment;

import model.Effect;

/**
 * Accessory equipment part for a hero.
 *
 * @author Ismail
 */
public class Accessory extends Equipment {

    /**
     * Initialises an accessory.
     *
     * @param rarity Rarity of the accessory
     * @param name Name of the accessory
     * @param effect Effect that applies to the equipped hero
     * @param craftBluePrint Crafting materials and costs needed to craft the
     * accessory
     * @param compatibleHeroID Hero's id who can equip the accessory.
     */
    public Accessory(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect, craftBluePrint, compatibleHeroID);
    }
}