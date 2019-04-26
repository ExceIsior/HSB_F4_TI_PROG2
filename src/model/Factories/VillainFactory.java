package model.Factories;

import control.Constants.VillainConst;
import control.Enums.Skills;
import java.util.Arrays;
import model.gameObject.Villain;

/**
 * This class supplies instances of Villain class.
 * @author Ismail
 */
public class VillainFactory {

    /**
     * Instantiates an object of Villain
     * @param villainId ID of the Villain type that is to be instantiated.
     * @return Object of Villain.
     */
    public static Villain getVillain(int villainId) {
        switch (villainId) {
            case  VillainConst.ORK_ID:
                return new Villain(VillainConst.ORK_RES_PATH,
                        VillainConst.ORK_DEFAULT_ARMOR,
                        null,
                        VillainConst.ORK_NAME,
                        VillainConst.ORK_DEFAULT_HEALTH_POINTS,
                        VillainConst.ORK_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.ORK_DEFAULT_AGILITY,
                        null,
                        null);

            case VillainConst.GHUL_ID:
                return new Villain(VillainConst.GHUL_RES_PATH,
                        VillainConst.GHUL_DEFAULT_ARMOR,
                        null,
                        VillainConst.GHUL_NAME,
                        VillainConst.GHUL_DEFAULT_HEALTH_POINTS,
                        VillainConst.GHUL_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.GHUL_DEFAULT_AGILITY,
                        null,
                        Arrays.asList(Skills.DEVOUR.getSkill()));

            case VillainConst.WEREWOLF_ID:
                return new Villain(VillainConst.WEREWOLF_RES_PATH,
                        VillainConst.WEREWOLF_DEFAULT_ARMOR,
                        null,
                        VillainConst.WEREWOLF_NAME,
                        VillainConst.WEREWOLF_DEFAULT_HEALTH_POINTS,
                        VillainConst.WEREWOLF_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.WEREWOLF_DEFAULT_AGILITY,
                        null,
                        null);

            case VillainConst.VAMPIRE_ID:
                return new Villain(VillainConst.VAMPIRE_RES_PATH,
                        VillainConst.VAMPIRE_DEFAULT_ARMOR,
                        null,
                        VillainConst.VAMPIRE_NAME,
                        VillainConst.VAMPIRE_DEFAULT_HEALTH_POINTS,
                        VillainConst.VAMPIRE_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.VAMPIRE_DEFAULT_AGILITY,
                        null,
                        null);

            case VillainConst.SUCCUBUS_ID:
                return new Villain(VillainConst.SUCCUBUS_RES_PATH,
                        VillainConst.SUCCUBUS_DEFAULT_ARMOR,
                        null,
                        VillainConst.SUCCUBUS_NAME,
                        VillainConst.SUCCUBUS_DEFAULT_HEALTH_POINTS,
                        VillainConst.SUCCUBUS_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.SUCCUBUS_DEFAULT_AGILITY,
                        null,
                        null);

            case VillainConst.ZOMBIE_ID:
                return new Villain(VillainConst.ZOMBIE_RES_PATH,
                        VillainConst.ZOMBIE_DEFAULT_ARMOR,
                        null,
                        VillainConst.ZOMBIE_NAME,
                        VillainConst.ZOMBIE_DEFAULT_HEALTH_POINTS,
                        VillainConst.ZOMBIE_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.ZOMBIE_DEFAULT_AGILITY,
                        null,
                        Arrays.asList(Skills.CONTAGIOUS_BITE.getSkill()));
        }
        return null;
    }
}