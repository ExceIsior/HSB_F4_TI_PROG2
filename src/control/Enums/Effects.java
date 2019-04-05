package control.Enums;

import model.Effect;
import control.Constants.EffectConst;

public enum Effects {
    POISION(new Effect(EffectConst.POISION_NAME,
            EffectConst.POISION_DESCRIPTION,
            EffectConst.POISON_HEALTH_POINTS,
            EffectConst.POISON_MAX_HEALTH_POINTS,
            EffectConst.POISON_AGILITY,
            EffectConst.POISON_ARMOR,
            EffectConst.POISON_BASE_DAMAGE,
            EffectConst.POISON_PROBABILITY)),
    PARALYSE(new Effect(EffectConst.PARALYSE_NAME,
            EffectConst.PARALYSE_DESCRIPTION,
            EffectConst.PARALYSE_HEALTH_POINTS,
            EffectConst.PARALYSE_MAX_HEALTH_POINTS,
            EffectConst.PARALYSE_AGILITY,
            EffectConst.PARALYSE_ARMOR,
            EffectConst.PARALYSE_BASE_DAMAGE,
            EffectConst.PARALYSE_PROBABILITY)),
    PETRIFY(new Effect(EffectConst.PETRIFY_NAME,
            EffectConst.PETRIFY_DESCRIPTION,
            EffectConst.PETRIFY_HEALTH_POINTS,
            EffectConst.PETRIFY_MAX_HEALTH_POINTS,
            EffectConst.PETRIFY_AGILITY,
            EffectConst.PETRIFY_ARMOR,
            EffectConst.PETRIFY_BASE_DAMAGE,
            EffectConst.PETRIFY_PROBABILITY)),
    INTIMIDATE(new Effect(EffectConst.INTIMIDATED_NAME,
            EffectConst.INTIMIDATED_DESCRIPTION,
            EffectConst.INTIMIDATED_HEALTH_POINTS,
            EffectConst.INTIMIDATED_MAX_HEALTH_POINTS,
            EffectConst.INTIMIDATED_AGILITY,
            EffectConst.INTIMIDATED_ARMOR,
            EffectConst.INTIMIDATED_BASE_DAMAGE,
            EffectConst.INTIMIDATED_PROBABILITY)),
    WOUNDED(new Effect(EffectConst.WOUNDED_NAME,
            EffectConst.WOUNDED_DESCRIPTION,
            EffectConst.WOUNDED_HEALTH_POINTS,
            EffectConst.WOUNDED_MAX_HEALTH_POINTS,
            EffectConst.WOUNDED_AGILITY,
            EffectConst.WOUNDED_ARMOR,
            EffectConst.WOUNDED_BASE_DAMAGE,
            EffectConst.WOUNDED_PROBABILITY));

    private final Effect effect;

    private Effects(Effect effect) {
        this.effect = effect;
    }

    public Effect getEffect() {
        return this.effect;
    }
}
