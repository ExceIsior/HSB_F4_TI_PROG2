package control.Enums;

import model.Effect;
import control.Constants.EffectConst;

public enum Effects {
    HEAL(new Effect(
            EffectConst.HEAL_NAME,
            EffectConst.HEAL_DESCRIPTION,
            EffectConst.HEAL_HEALTH_POINTS,
            EffectConst.HEAL_MAX_HEALTH_POINTS,
            EffectConst.HEAL_AGILITY,
            EffectConst.HEAL_ARMOR,
            EffectConst.HEAL_BASE_DAMAGE,
            EffectConst.HEAL_PROBABILITY)),
    DAMAGE_BOOST(new Effect(
            EffectConst.DAMAGE_BOOST_NAME,
            EffectConst.DAMAGE_BOOST_DESCRIPTION,
            EffectConst.DAMAGE_BOOST_HEALTH_POINTS,
            EffectConst.DAMAGE_BOOST_MAX_HEALTH_POINTS,
            EffectConst.DAMAGE_BOOST_AGILITY,
            EffectConst.DAMAGE_BOOST_ARMOR,
            EffectConst.DAMAGE_BOOST_BASE_DAMAGE,
            EffectConst.DAMAGE_BOOST_PROBABILITY)),
    ARMOR_BOOST(new Effect(
            EffectConst.ARMOR_BOOST_NAME,
            EffectConst.ARMOR_BOOST_DESCRIPTION,
            EffectConst.ARMOR_BOOST_HEALTH_POINTS,
            EffectConst.ARMOR_BOOST_MAX_HEALTH_POINTS,
            EffectConst.ARMOR_BOOST_AGILITY,
            EffectConst.ARMOR_BOOST_ARMOR,
            EffectConst.ARMOR_BOOST_BASE_DAMAGE,
            EffectConst.ARMOR_BOOST_PROBABILITY)),
    AGILITY_BOOST(new Effect(
            EffectConst.AGILITY_BOOST_NAME,
            EffectConst.AGILITY_BOOST_DESCRIPTION,
            EffectConst.AGILITY_BOOST_HEALTH_POINTS,
            EffectConst.AGILITY_BOOST_MAX_HEALTH_POINTS,
            EffectConst.AGILITY_BOOST_AGILITY,
            EffectConst.AGILITY_BOOST_ARMOR,
            EffectConst.AGILITY_BOOST_BASE_DAMAGE,
            EffectConst.AGILITY_BOOST_PROBABILITY)),
    POISION(new Effect(
            EffectConst.POISION_NAME,
            EffectConst.POISION_DESCRIPTION,
            EffectConst.POISON_HEALTH_POINTS,
            EffectConst.POISON_MAX_HEALTH_POINTS,
            EffectConst.POISON_AGILITY,
            EffectConst.POISON_ARMOR,
            EffectConst.POISON_BASE_DAMAGE,
            EffectConst.POISON_PROBABILITY)),
    PARALYSE(new Effect(
            EffectConst.PARALYSE_NAME,
            EffectConst.PARALYSE_DESCRIPTION,
            EffectConst.PARALYSE_HEALTH_POINTS,
            EffectConst.PARALYSE_MAX_HEALTH_POINTS,
            EffectConst.PARALYSE_AGILITY,
            EffectConst.PARALYSE_ARMOR,
            EffectConst.PARALYSE_BASE_DAMAGE,
            EffectConst.PARALYSE_PROBABILITY)),
    PETRIFY(new Effect(
            EffectConst.PETRIFY_NAME,
            EffectConst.PETRIFY_DESCRIPTION,
            EffectConst.PETRIFY_HEALTH_POINTS,
            EffectConst.PETRIFY_MAX_HEALTH_POINTS,
            EffectConst.PETRIFY_AGILITY,
            EffectConst.PETRIFY_ARMOR,
            EffectConst.PETRIFY_BASE_DAMAGE,
            EffectConst.PETRIFY_PROBABILITY)),
    INTIMIDATE(new Effect(
            EffectConst.INTIMIDATED_NAME,
            EffectConst.INTIMIDATED_DESCRIPTION,
            EffectConst.INTIMIDATED_HEALTH_POINTS,
            EffectConst.INTIMIDATED_MAX_HEALTH_POINTS,
            EffectConst.INTIMIDATED_AGILITY,
            EffectConst.INTIMIDATED_ARMOR,
            EffectConst.INTIMIDATED_BASE_DAMAGE,
            EffectConst.INTIMIDATED_PROBABILITY)),
    WOUNDED(new Effect(
            EffectConst.WOUNDED_NAME,
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
