package model.item;

import model.Effect;

/**
 * Abstract Item which can hold effects therefore may modify attributes of characters.
 * @author Ismail
 */
public abstract class EffectItem extends Item {

    private Effect effect = null;

    /**
     * Initialises an EffectItem
     * @param rarity Rarity of the item.
     * @param name Name of the item.
     * @param effect Effect that the item applies.
     */
    public EffectItem(int rarity, String name, Effect effect) {
        super(rarity, name);
        this.effect = effect;
    }

    /**
     * Returns the effect of the item.
     * @return Effect of the item.
     */
    public Effect getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return "EffectItem{" + "effect=" + effect + '}';
    }

    
    
}
