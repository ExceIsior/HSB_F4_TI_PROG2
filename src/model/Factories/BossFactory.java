package model.Factories;

import control.Constants.BossConst;
import model.gameObject.Boss;

/**
 * This class supplies instances of the Field class.
 *
 * @author reenawichmann
 */
public class BossFactory {

    /**
     * Instantiates an object of Boss
     *
     * @param bossID ID of the Boss type that is to be instantiated.
     * @return Object of Boss.
     */
    public static Boss getBoss(int bossID) {
        switch (bossID) {
            case BossConst.BASILISK_ID:
                return new Boss(
                        BossConst.BASILISK_RES_PATH,
                        BossConst.BASILISK_DEFAULT_ARMOR,
                        null,
                        BossConst.BASILISK_NAME,
                        BossConst.BASILISK_DEFAULT_HEALTH_POINTS,
                        BossConst.BASILISK_DEFAULT_MAX_HEALTH_POINTS,
                        BossConst.BASILISK_DEFAULT_AGILITY,
                        null,
                        null);

            case BossConst.CYCLOPS_ID:
                return new Boss(
                        BossConst.CYCLOPS_RES_PATH,
                        BossConst.CYCLOPS_DEFAULT_ARMOR,
                        null,
                        BossConst.CYCLOPS_NAME,
                        BossConst.CYCLOPS_DEFAULT_HEALTH_POINTS,
                        BossConst.CYCLOPS_DEFAULT_MAX_HEALTH_POINTS,
                        BossConst.CYCLOPS_DEFAULT_AGILITY,
                        null,
                        null);
            default:
                return null;
        }
    }
}
