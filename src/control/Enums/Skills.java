package control.Enums;

import model.gameObject.Skill;
import control.Constants.SkillConst;

public enum Skills {
    SWORD_THRUST(new Skill(SkillConst.SWORD_THRUST_NAME,
            SkillConst.SWORD_THRUST_DAMAGE,
            SkillConst.SWORD_THRUST_DIE_BONUS,
            SkillConst.SWORD_THRUST_RANGE, 
            SkillConst.SWORD_THRUST_DAMAGE_RADIUS,
            SkillConst.SWORD_THRUST_DAMAGE_AVAILABILITY)),
    BOW_SHOT(new Skill(SkillConst.BOW_SHOT_NAME,
            SkillConst.BOW_SHOT_DAMAGE,
            SkillConst.BOW_SHOT_DIE_BONUS,
            SkillConst.BOW_SHOT_RANGE, 
            SkillConst.BOW_SHOT_DAMAGE_RADIUS,
            SkillConst.BOW_SHOT_DAMAGE_AVAILABILITY)),
    DAGGER_STAB(new Skill(SkillConst.DAGGER_STAB_NAME,
            SkillConst.DAGGER_STAB_DAMAGE,
            SkillConst.DAGGER_STAB_DIE_BONUS,
            SkillConst.DAGGER_STAB_RANGE, 
            SkillConst.DAGGER_STAB_DAMAGE_RADIUS,
            SkillConst.DAGGER_STAB_DAMAGE_AVAILABILITY)),
    THUNDER_STRIKE(new Skill(SkillConst.THUNDER_STRIKE_NAME,
            SkillConst.THUNDER_STRIKE_DAMAGE,
            SkillConst.THUNDER_STRIKE_DIE_BONUS,
            SkillConst.THUNDER_STRIKE_RANGE, 
            SkillConst.THUNDER_STRIKE_DAMAGE_RADIUS,
            SkillConst.THUNDER_STRIKE_DAMAGE_AVAILABILITY));

    private final Skill skill;

    private Skills(Skill skill){
        this.skill = skill;
    }
    
    public Skill getSkill(){
        return this.skill;
    }
}
