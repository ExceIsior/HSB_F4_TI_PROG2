//package control.Enums;
//
//import model.Position;
//import model.gameObject.Villain;
//import control.Constants.VillainConst;
//
//public enum Villains {
//    ZOMBIE(new Villain(VillainConst.ZOMBIE_RES_PATH,
//            new Position(0, 0),
//            VillainConst.ZOMBIE_DEFAULT_ARMOR,
//            null,
//            VillainConst.ZOMBIE_NAME,
//            VillainConst.ZOMBIE_DEFAULT_HEALTH_POINTS,
//            VillainConst.ZOMBIE_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.ZOMBIE_DEFAULT_AGILITY,
//            null,
//            null)),
//    SUCCUBUS(new Villain(VillainConst.SUCCUBUS_RES_PATH,
//            new Position(0, 0),
//            VillainConst.SUCCUBUS_DEFAULT_ARMOR,
//            null,
//            VillainConst.SUCCUBUS_NAME,
//            VillainConst.SUCCUBUS_DEFAULT_HEALTH_POINTS,
//            VillainConst.SUCCUBUS_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.SUCCUBUS_DEFAULT_AGILITY,
//            null,
//            null)),
//    VAMPIRE(new Villain(VillainConst.VAMPIRE_RES_PATH,
//            new Position(0, 0),
//            VillainConst.VAMPIRE_DEFAULT_ARMOR,
//            null,
//            VillainConst.VAMPIRE_NAME,
//            VillainConst.VAMPIRE_DEFAULT_HEALTH_POINTS,
//            VillainConst.VAMPIRE_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.VAMPIRE_DEFAULT_AGILITY,
//            null,
//            null)),
//    WEREWOLF(new Villain(VillainConst.WEREWOLF_RES_PATH,
//            new Position(0, 0),
//            VillainConst.WEREWOLF_DEFAULT_ARMOR,
//            null,
//            VillainConst.WEREWOLF_NAME,
//            VillainConst.WEREWOLF_DEFAULT_HEALTH_POINTS,
//            VillainConst.WEREWOLF_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.WEREWOLF_DEFAULT_AGILITY,
//            null,
//            null)),
//    GHUL(new Villain(VillainConst.GHUL_RES_PATH,
//            new Position(0, 0),
//            VillainConst.GHUL_DEFAULT_ARMOR,
//            null,
//            VillainConst.GHUL_NAME,
//            VillainConst.GHUL_DEFAULT_HEALTH_POINTS,
//            VillainConst.GHUL_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.GHUL_DEFAULT_AGILITY,
//            null,
//            null)),
//    ORK(new Villain(VillainConst.ORK_RES_PATH,
//            new Position(0, 0),
//            VillainConst.ORK_DEFAULT_ARMOR,
//            null,
//            VillainConst.ORK_NAME,
//            VillainConst.ORK_DEFAULT_HEALTH_POINTS,
//            VillainConst.ORK_DEFAULT_MAX_HEALTH_POINTS,
//            VillainConst.ORK_DEFAULT_AGILITY,
//            null,
//            null)),;
//
//    private Villain villain;
//
//    private Villains(Villain villain) {
//        this.villain = villain;
//    }
//
//    public Villain getVillain() {
//        return this.villain;
//    }
//
//}
