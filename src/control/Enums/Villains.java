package control.Enums;

import model.Position;
import model.gameObject.Villain;
import control.Constants.VillainConst;

public enum Villains {
    ZOMBIE(new Villain(VillainConst.ZOMBIE_RES_PATH,
            new Position(0, 0),
            VillainConst.ZOMBIE_DEFAULT_DAMAGE,
            VillainConst.ZOMBIE_DEFAULT_ARMOR,
            null,
            VillainConst.ZOMBIE_NAME,
            VillainConst.ZOMBIE_DEFAULT_HEALTHPOINTS,
            VillainConst.ZOMBIE_DEFAULT_AGILITY,
            null,
            null)),
    SUCCUBUS(new Villain(VillainConst.SUCCUBUS_RES_PATH,
            new Position(0, 0),
            VillainConst.SUCCUBUS_DEFAULT_DAMAGE,
            VillainConst.SUCCUBUS_DEFAULT_ARMOR,
            null,
            VillainConst.SUCCUBUS_NAME,
            VillainConst.SUCCUBUS_DEFAULT_HEALTHPOINTS,
            VillainConst.SUCCUBUS_DEFAULT_AGILITY,
            null,
            null)),
    VAMPIRE(new Villain(VillainConst.VAMPIRE_RES_PATH,
            new Position(0, 0),
            VillainConst.VAMPIRE_DEFAULT_DAMAGE,
            VillainConst.VAMPIRE_DEFAULT_ARMOR,
            null,
            VillainConst.VAMPIRE_NAME,
            VillainConst.VAMPIRE_DEFAULT_HEALTHPOINTS,
            VillainConst.VAMPIRE_DEFAULT_AGILITY,
            null,
            null)),
    WEREWOLF(new Villain(VillainConst.WEREWOLF_RES_PATH,
        new Position(0,0),
            VillainConst.WEREWOLF_DEFAULT_DAMAGE,
            VillainConst.WEREWOLF_DEFAULT_ARMOR,
            null,
            VillainConst.WEREWOLF_NAME,
            VillainConst.WEREWOLF_DEFAULT_HEALTHPOINTS,
            VillainConst.WEREWOLF_DEFAULT_AGILITY,
            null,
            null)),
    GHUL(new Villain(VillainConst.GHUL_RES_PATH,
        new Position(0,0),
            VillainConst.GHUL_DEFAULT_DAMAGE,
            VillainConst.GHUL_DEFAULT_ARMOR,
            null,
            VillainConst.GHUL_NAME,
            VillainConst.GHUL_DEFAULT_HEALTHPOINTS,
            VillainConst.GHUL_DEFAULT_AGILITY,
            null,
            null)),
    
    ORK(new Villain(VillainConst.ORK_RES_PATH,
        new Position(0,0),
            VillainConst.ORK_DEFAULT_DAMAGE,
            VillainConst.ORK_DEFAULT_ARMOR,
            null,
            VillainConst.ORK_NAME,
            VillainConst.ORK_DEFAULT_HEALTHPOINTS,
            VillainConst.ORK_DEFAULT_AGILITY,
            null,
            null)),;

    private Villain villain;

    private Villains(Villain villain) {
        this.villain = villain;
    }

    public Villain getVillain() {
        return this.villain;
    }

}
