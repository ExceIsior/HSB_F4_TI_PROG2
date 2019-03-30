package control;

import model.Position;
import model.gameObject.Boss;
import model.gameObject.Villain;

public enum Bosses {
    BASILISK(new Boss(Constants.BASILISK_RES_PATH,
            new Position(0, 0),
            Constants.BASILISK_DEFAULT_DAMAGE,
            Constants.BASILISK_DEFAULT_ARMOR,
            null,
            Constants.BASILISK_NAME,
            Constants.BASILISK_DEFAULT_HEALTHPOINTS,
            Constants.BASILISK_DEFAULT_AGILITY,
            null,
            null)),
    CYCLOPS(new Boss(Constants.CYCLOPS_RES_PATH,
            new Position(0, 0),
            Constants.CYCLOPS_DEFAULT_DAMAGE,
            Constants.CYCLOPS_DEFAULT_ARMOR,
            null,
            Constants.CYCLOPS_NAME,
            Constants.CYCLOPS_DEFAULT_HEALTHPOINTS,
            Constants.CYCLOPS_DEFAULT_AGILITY,
            null,
            null)),;

    private final Boss boss;

    private Bosses(Boss boss) {
        this.boss = boss;
    }

    public Boss getBoss() {
        return this.boss;
    }
}
