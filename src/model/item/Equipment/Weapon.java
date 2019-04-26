package model.item.Equipment;

import model.Effect;

/**
 * Weapon equipment part for a hero.
 *
 * @author Ismail
 */
public class Weapon extends Equipment {

    /**
     * Initialises a weapon
     *
     * @param rarity Rarity of the weapon
     * @param name Name of the weapon
     * @param effect Effect that applies to the equipped hero
     * @param craftBluePrint Crafting materials and costs needed to craft the
     * weapon
     * @param compatibleHeroID Hero's id who can equip the weapon.
     */
    public Weapon(int rarity, String name, Effect effect, CraftBluePrint craftBluePrint, int compatibleHeroID) {
        super(rarity, name, effect, craftBluePrint, compatibleHeroID);
    }

}
