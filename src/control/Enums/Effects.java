package control.Enums;

import model.Effect;
import control.Constants.EffectConst;

public enum Effects 
{
    RUSTY_SWORD(new Effect(
            EffectConst.RUSTY_SWORD_NAME,
            EffectConst.RUSTY_SWORD_DESCRIPTION,
            EffectConst.RUSTY_SWORD_HEALTH_POINTS,
            EffectConst.RUSTY_SWORD_MAX_HEALTH_POINTS,
            EffectConst.RUSTY_SWORD_AGILITY,
            EffectConst.RUSTY_SWORD_ARMOR,
            EffectConst.RUSTY_SWORD_BASE_DAMAGE,
            EffectConst.RUSTY_SWORD_PROBABILITY
    )),
    IRON_SWORD(new Effect(
            EffectConst.IRON_SWORD_NAME,
            EffectConst.IRON_SWORD_DESCRIPTION,
            EffectConst.IRON_SWORD_HEALTH_POINTS,
            EffectConst.IRON_SWORD_MAX_HEALTH_POINTS,
            EffectConst.IRON_SWORD_AGILITY,
            EffectConst.IRON_SWORD_ARMOR,
            EffectConst.IRON_SWORD_BASE_DAMAGE,
            EffectConst.IRON_SWORD_PROBABILITY
    )),
    RUSTY_PLATE_ARMOR(new Effect(
            EffectConst.RUSTY_PLATE_ARMOR_NAME,
            EffectConst.RUSTY_PLATE_ARMOR_DESCRIPTION,
            EffectConst.RUSTY_PLATE_ARMOR_HEALTH_POINTS,
            EffectConst.RUSTY_PLATE_ARMOR_MAX_HEALTH_POINTS,
            EffectConst.RUSTY_PLATE_ARMOR_AGILITY,
            EffectConst.RUSTY_PLATE_ARMOR_ARMOR,
            EffectConst.RUSTY_PLATE_ARMOR_BASE_DAMAGE,
            EffectConst.RUSTY_PLATE_ARMOR_PROBABILITY
    )),
    IRON_PLATE_ARMOR(new Effect(
            EffectConst.IRON_PLATE_ARMOR_NAME,
            EffectConst.IRON_PLATE_ARMOR_DESCRIPTION,
            EffectConst.IRON_PLATE_ARMOR_HEALTH_POINTS,
            EffectConst.IRON_PLATE_ARMOR_MAX_HEALTH_POINTS,
            EffectConst.IRON_PLATE_ARMOR_AGILITY,
            EffectConst.IRON_PLATE_ARMOR_ARMOR,
            EffectConst.IRON_PLATE_ARMOR_BASE_DAMAGE,
            EffectConst.IRON_PLATE_ARMOR_PROBABILITY
    )),
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

    private Effects(Effect effect) 
    {
        this.effect = effect;
    }

    public Effect getEffect() 
    {
        return this.effect;
    }
}
