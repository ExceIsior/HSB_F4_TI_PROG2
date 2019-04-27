package model.item;

import model.Effect;

public class EffectItem extends Item {

    private Effect effect = null;

    public EffectItem(int rarity, String name, Effect effect) {
        super(rarity, name);
        this.effect = effect;
    }

    public Effect getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return "EffectItem{" + "effect=" + effect + '}';
    }

    
    
}
