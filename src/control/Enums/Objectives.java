package control.Enums;

import model.Factories.VillainFactory;
import control.Constants.VillainConst;
import model.Objective;

public enum Objectives {
       //    QUEST1(new Quest(new Reward(5, 5, Materials.BRONZE.getMaterial(), Materials.AMETHYST.getMaterial()), new Objective(Villains.ZOMBIE.getVillain() , 3))),
//    QUEST2(new Quest(new Reward(10, 10, Materials.CLOTH.getMaterial(), Materials.LEATHER.getMaterial()), new Objective(Villains.SUCCUBUS.getVillain(), 4))),
//    QUEST3(new Quest(new Reward(10, 10, Materials.GOLD.getMaterial(), Materials.BRONZE.getMaterial()), new Objective(Villains.ORK.getVillain(), 5)));
    OBJECTIVE_1(new Objective(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), 5)),
    OBJECTIVE_2(new Objective(VillainFactory.getVillain(VillainConst.SUCCUBUS_ID), 4)),
    OBJECTIVE_3(new Objective(VillainFactory.getVillain(VillainConst.ORK_ID), 5));
    
    private final Objective objective;
    private Objectives(Objective objective){
        this.objective = objective;
    }
    
    public Objective getObjective(){
        return this.objective;
    }
}
