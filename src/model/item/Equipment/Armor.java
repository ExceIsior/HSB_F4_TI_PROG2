package model.item.Equipment;

import model.Effect;

/**
 * Armor equipment part for a hero.
 *
 * @author Ismail
 */
public class Armor extends Equipment {

    /**
     * Initialises an armor.
     *
     * @param rarity Rarity of the armor
     * @param name Name of the armor
     * @param effect Effect that applies to the equipped hero
     * @param craftBluePrint Crafting materials and costs needed to craft the
     * armor
     * @param compatibleHeroID Hero's id who can equip the armor.
     */
    public Armor(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect, craftBluePrint, compatibleHeroID);
    }

}
