package model.item;

import model.Effect;

/**
 * Consumable item by heroes.
 *
 * @author Ismail
 */
public class HeroItem extends EffectItem {

    /**
     * Initialises a consumable hero item.
     *
     * @param rarity Rarity of the Item.
     * @param name Name of Item
     * @param effect Effect of the Item.
     */
    public HeroItem(int rarity, String name, Effect effect) {
        super(rarity, name, effect);
    }
}
