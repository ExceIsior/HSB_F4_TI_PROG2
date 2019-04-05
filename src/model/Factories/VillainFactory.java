package model.Factories;

import control.Constants.VillainConst;
import model.Position;
import model.gameObject.Villain;

public class VillainFactory {

    public static Villain getVillain(String name) {
        switch (name) {
            case "ork":
                return new Villain(VillainConst.ORK_RES_PATH, new Position(0, 0),
                        VillainConst.ORK_DEFAULT_ARMOR,
                        null,
                        VillainConst.ORK_NAME,
                        VillainConst.ORK_DEFAULT_HEALTH_POINTS,
                        VillainConst.ORK_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.ORK_DEFAULT_AGILITY,
                        null,
                        null);

            case "zombie":
                return new Villain(VillainConst.GHUL_RES_PATH, new Position(0, 0),
                        VillainConst.GHUL_DEFAULT_ARMOR,
                        null,
                        VillainConst.GHUL_NAME,
                        VillainConst.GHUL_DEFAULT_HEALTH_POINTS,
                        VillainConst.GHUL_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.GHUL_DEFAULT_AGILITY,
                        null,
                        null);

            case "Werewolf":
                return new Villain(VillainConst.WEREWOLF_RES_PATH,
                        new Position(0, 0),
                        VillainConst.WEREWOLF_DEFAULT_ARMOR,
                        null,
                        VillainConst.WEREWOLF_NAME,
                        VillainConst.WEREWOLF_DEFAULT_HEALTH_POINTS,
                        VillainConst.WEREWOLF_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.WEREWOLF_DEFAULT_AGILITY,
                        null,
                        null);

            case "Vampire":
                return new Villain(VillainConst.VAMPIRE_RES_PATH,
                        new Position(0, 0),
                        VillainConst.VAMPIRE_DEFAULT_ARMOR,
                        null,
                        VillainConst.VAMPIRE_NAME,
                        VillainConst.VAMPIRE_DEFAULT_HEALTH_POINTS,
                        VillainConst.VAMPIRE_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.VAMPIRE_DEFAULT_AGILITY,
                        null,
                        null);

            case "Succubus":
                return new Villain(VillainConst.SUCCUBUS_RES_PATH,
                        new Position(0, 0),
                        VillainConst.SUCCUBUS_DEFAULT_ARMOR,
                        null,
                        VillainConst.SUCCUBUS_NAME,
                        VillainConst.SUCCUBUS_DEFAULT_HEALTH_POINTS,
                        VillainConst.SUCCUBUS_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.SUCCUBUS_DEFAULT_AGILITY,
                        null,
                        null);

            case "Zombie":
                return new Villain(VillainConst.ZOMBIE_RES_PATH,
                        new Position(0, 0),
                        VillainConst.ZOMBIE_DEFAULT_ARMOR,
                        null,
                        VillainConst.ZOMBIE_NAME,
                        VillainConst.ZOMBIE_DEFAULT_HEALTH_POINTS,
                        VillainConst.ZOMBIE_DEFAULT_MAX_HEALTH_POINTS,
                        VillainConst.ZOMBIE_DEFAULT_AGILITY,
                        null,
                        null);

        }
        return null;
    }
}