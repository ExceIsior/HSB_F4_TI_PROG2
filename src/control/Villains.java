package control;

import model.Position;
import model.gameObject.Villain;

public enum Villains {
    ZOMBIE(new Villain(Constants.ZOMBIE_RES_PATH,
            new Position(0, 0),
            Constants.ZOMBIE_DEFAULT_DAMAGE,
            Constants.ZOMBIE_DEFAULT_ARMOR,
            null,
            Constants.ZOMBIE_NAME,
            Constants.ZOMBIE_DEFAULT_HEALTHPOINTS,
            Constants.ZOMBIE_DEFAULT_AGILITY,
            null,
            null)),
    CYCLOPS(new Villain(Constants.CYCLOPS_RES_PATH,
            new Position(0, 0),
            Constants.CYCLOPS_DEFAULT_DAMAGE,
            Constants.CYCLOPS_DEFAULT_ARMOR,
            null,
            Constants.CYCLOPS_NAME,
            Constants.CYCLOPS_DEFAULT_HEALTHPOINTS,
            Constants.CYCLOPS_DEFAULT_AGILITY,
            null,
            null)),
    SUCCUBUS(new Villain(Constants.SUCCUBUS_RES_PATH,
            new Position(0, 0),
            Constants.SUCCUBUS_DEFAULT_DAMAGE,
            Constants.SUCCUBUS_DEFAULT_ARMOR,
            null,
            Constants.SUCCUBUS_NAME,
            Constants.SUCCUBUS_DEFAULT_HEALTHPOINTS,
            Constants.SUCCUBUS_DEFAULT_AGILITY,
            null,
            null)),
    VAMPIRE(new Villain(Constants.VAMPIRE_RES_PATH,
            new Position(0, 0),
            Constants.VAMPIRE_DEFAULT_DAMAGE,
            Constants.VAMPIRE_DEFAULT_ARMOR,
            null,
            Constants.VAMPIRE_NAME,
            Constants.VAMPIRE_DEFAULT_HEALTHPOINTS,
            Constants.VAMPIRE_DEFAULT_AGILITY,
            null,
            null)),
    WEREWOLF(new Villain(Constants.WEREWOLF_RES_PATH,
        new Position(0,0),
            Constants.WEREWOLF_DEFAULT_DAMAGE,
            Constants.WEREWOLF_DEFAULT_ARMOR,
            null,
            Constants.WEREWOLF_NAME,
            Constants.WEREWOLF_DEFAULT_HEALTHPOINTS,
            Constants.WEREWOLF_DEFAULT_AGILITY,
            null,
            null)),
    GHUL(new Villain(Constants.GHUL_RES_PATH,
        new Position(0,0),
            Constants.GHUL_DEFAULT_DAMAGE,
            Constants.GHUL_DEFAULT_ARMOR,
            null,
            Constants.GHUL_NAME,
            Constants.GHUL_DEFAULT_HEALTHPOINTS,
            Constants.GHUL_DEFAULT_AGILITY,
            null,
            null)),
    
    ORK(new Villain(Constants.ORK_RES_PATH,
        new Position(0,0),
            Constants.ORK_DEFAULT_DAMAGE,
            Constants.ORK_DEFAULT_ARMOR,
            null,
            Constants.ORK_NAME,
            Constants.ORK_DEFAULT_HEALTHPOINTS,
            Constants.ORK_DEFAULT_AGILITY,
            null,
            null)),
    BASILISK(new Villain(Constants.BASILISK_RES_PATH,
        new Position(0,0),
            Constants.BASILISK_DEFAULT_DAMAGE,
            Constants.BASILISK_DEFAULT_ARMOR,
            null,
            Constants.BASILISK_NAME,
            Constants.BASILISK_DEFAULT_HEALTHPOINTS,
            Constants.BASILISK_DEFAULT_AGILITY,
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
