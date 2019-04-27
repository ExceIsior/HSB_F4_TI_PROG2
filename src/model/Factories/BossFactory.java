
package model.Factories;

import control.Constants.BossConst;
import model.gameObject.Boss;

/**
 *
 * @author reenawichmann
 */
public class BossFactory {
    public static Boss getBoss(int bossId) {
        switch (bossId) {
            case  BossConst.BASILISK_ID:
                return new Boss(BossConst.BASILISK_RES_PATH,
                    BossConst.BASILISK_DEFAULT_ARMOR,
                    null,
                    BossConst.BASILISK_NAME,
                    BossConst.BASILISK_DEFAULT_HEALTH_POINTS,
                    BossConst.BASILISK_DEFAULT_MAX_HEALTH_POINTS,
                    BossConst.BASILISK_DEFAULT_AGILITY,
                    null,
                    null);
                
            case  BossConst.CYCLOPS_ID:
                return new Boss(BossConst.CYCLOPS_RES_PATH,
                    BossConst.CYCLOPS_DEFAULT_ARMOR,
                    null,
                    BossConst.CYCLOPS_NAME,
                    BossConst.CYCLOPS_DEFAULT_HEALTH_POINTS,
                    BossConst.CYCLOPS_DEFAULT_MAX_HEALTH_POINTS,
                    BossConst.CYCLOPS_DEFAULT_AGILITY,
                    null,
                    null);

        }
        return null;
    }
}
