//package control.Enums;
//
//import model.Position;
//import model.gameObject.Boss;
//import control.Constants.BossConst;
//
//public enum Bosses {
//    BASILISK(new Boss(BossConst.BASILISK_RES_PATH,
//            new Position(0, 0),
//            BossConst.BASILISK_DEFAULT_ARMOR,
//            null,
//            BossConst.BASILISK_NAME,
//            BossConst.BASILISK_DEFAULT_HEALTH_POINTS,
//            BossConst.BASILISK_DEFAULT_MAX_HEALTH_POINTS,
//            BossConst.BASILISK_DEFAULT_AGILITY,
//            null,
//            null)),
//    CYCLOPS(new Boss(BossConst.CYCLOPS_RES_PATH,
//            new Position(0, 0),
//            BossConst.CYCLOPS_DEFAULT_ARMOR,
//            null,
//            BossConst.CYCLOPS_NAME,
//            BossConst.CYCLOPS_DEFAULT_HEALTH_POINTS,
//            BossConst.CYCLOPS_DEFAULT_MAX_HEALTH_POINTS,
//            BossConst.CYCLOPS_DEFAULT_AGILITY,
//            null,
//            null)),;
//
//    private final Boss boss;
//
//    private Bosses(Boss boss) {
//        this.boss = boss;
//    }
//
//    public Boss getBoss() {
//        return this.boss;
//    }
//}
