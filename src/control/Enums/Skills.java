package control.Enums;

import model.gameObject.Skill;
import control.Constants.SkillConst;

public enum Skills 
{
    SWORD_THRUST(new Skill(
            SkillConst.SWORD_THRUST_NAME,
            SkillConst.SWORD_THRUST_DAMAGE,
            SkillConst.SWORD_THRUST_DIE_BONUS,
            SkillConst.SWORD_THRUST_RANGE,
            SkillConst.SWORD_THRUST_DAMAGE_RADIUS,
            SkillConst.SWORD_THRUST_AVAILABILITY,
            null)),
    BOW_SHOT(new Skill(
            SkillConst.BOW_SHOT_NAME,
            SkillConst.BOW_SHOT_DAMAGE,
            SkillConst.BOW_SHOT_DIE_BONUS,
            SkillConst.BOW_SHOT_RANGE,
            SkillConst.BOW_SHOT_DAMAGE_RADIUS,
            SkillConst.BOW_SHOT_AVAILABILITY,
            null)),
    DAGGER_STAB(new Skill(
            SkillConst.DAGGER_STAB_NAME,
            SkillConst.DAGGER_STAB_DAMAGE,
            SkillConst.DAGGER_STAB_DIE_BONUS,
            SkillConst.DAGGER_STAB_RANGE,
            SkillConst.DAGGER_STAB_DAMAGE_RADIUS,
            SkillConst.DAGGER_STAB_AVAILABILITY,
            null)),
    THUNDER_STRIKE(new Skill(
            SkillConst.THUNDER_STRIKE_NAME,
            SkillConst.THUNDER_STRIKE_DAMAGE,
            SkillConst.THUNDER_STRIKE_DIE_BONUS,
            SkillConst.THUNDER_STRIKE_RANGE,
            SkillConst.THUNDER_STRIKE_DAMAGE_RADIUS,
            SkillConst.THUNDER_STRIKE_AVAILABILITY,
            Effects.PARALYSE.getEffect())),
    CONTAGIOUS_BITE(new Skill(
            SkillConst.CONTAGIOUS_BITE_NAME,
            SkillConst.CONTAGIOUS_BITE_DAMAGE,
            SkillConst.CONTAGIOUS_BITE_DIE_BONUS,
            SkillConst.CONTAGIOUS_BITE_RANGE,
            SkillConst.CONTAGIOUS_BITE_DAMAGE_RADIUS,
            SkillConst.CONTAGIOUS_BITE_AVAILABILITY,
            Effects.POISION.getEffect())),
    DEVOUR(new Skill(
            SkillConst.DEVOUR_NAME,
            SkillConst.DEVOUR_DAMAGE,
            SkillConst.DEVOUR_DIE_BONUS,
            SkillConst.DEVOUR_RANGE,
            SkillConst.DEVOUR_DAMAGE_RADIUS,
            SkillConst.DEVOUR_AVAILABILITY,
            null
    ));

    private final Skill skill;

    private Skills(Skill skill) 
    {
        this.skill = skill;
    }

    public Skill getSkill() 
    {
        return this.skill;
    }
}
