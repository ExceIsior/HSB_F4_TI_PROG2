package model.Factories;

import control.Constants.VillainConst;
import control.Enums.Villains;
import model.Position;
import model.gameObject.Villain;

public class VillainFactory {

    public Villain getVillain(String name) {
        switch (name) {
            case "ork":
                return new Villain(VillainConst.ORK_RES_PATH, new Position(0, 0),
                        VillainConst.ORK_DEFAULT_ARMOR,
                        null,
                        VillainConst.ORK_NAME,
                        VillainConst.ORK_DEFAULT_HEALTHPOINTS,
                        VillainConst.ORK_DEFAULT_AGILITY,
                        null,
                        null);

            case "zombie":
                return new Villain(VillainConst.GHUL_RES_PATH, new Position(0, 0),
                        VillainConst.GHUL_DEFAULT_ARMOR,
                        null,
                        VillainConst.GHUL_NAME,
                        VillainConst.GHUL_DEFAULT_HEALTHPOINTS,
                        VillainConst.GHUL_DEFAULT_AGILITY,
                        null,
                        null);

            case "Werewolf":
                return new Villain(VillainConst.WEREWOLF_RES_PATH,
                        new Position(0, 0),
                        VillainConst.WEREWOLF_DEFAULT_ARMOR,
                        null,
                        VillainConst.WEREWOLF_NAME,
                        VillainConst.WEREWOLF_DEFAULT_HEALTHPOINTS,
                        VillainConst.WEREWOLF_DEFAULT_AGILITY,
                        null,
                        null);

            case "Vampire":
                return new Villain(VillainConst.VAMPIRE_RES_PATH,
                        new Position(0, 0),
                        VillainConst.VAMPIRE_DEFAULT_ARMOR,
                        null,
                        VillainConst.VAMPIRE_NAME,
                        VillainConst.VAMPIRE_DEFAULT_HEALTHPOINTS,
                        VillainConst.VAMPIRE_DEFAULT_AGILITY,
                        null,
                        null);

            case "Succubus":
                return new Villain(VillainConst.SUCCUBUS_RES_PATH,
                        new Position(0, 0),
                        VillainConst.SUCCUBUS_DEFAULT_ARMOR,
                        null,
                        VillainConst.SUCCUBUS_NAME,
                        VillainConst.SUCCUBUS_DEFAULT_HEALTHPOINTS,
                        VillainConst.SUCCUBUS_DEFAULT_AGILITY,
                        null,
                        null);

            case "Zombie":
                return new Villain(VillainConst.ZOMBIE_RES_PATH,
                        new Position(0, 0),
                        VillainConst.ZOMBIE_DEFAULT_ARMOR,
                        null,
                        VillainConst.ZOMBIE_NAME,
                        VillainConst.ZOMBIE_DEFAULT_HEALTHPOINTS,
                        VillainConst.ZOMBIE_DEFAULT_AGILITY,
                        null,
                        null);

        }
        return null;
    }
}