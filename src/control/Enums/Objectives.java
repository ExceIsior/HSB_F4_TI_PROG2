package control.Enums;

import model.Factories.VillainFactory;
import control.Constants.VillainConst;
import model.Objective;

public enum Objectives 
{
    OBJECTIVE_1(new Objective(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), 3)),
    OBJECTIVE_2(new Objective(VillainFactory.getVillain(VillainConst.SUCCUBUS_ID), 5)),
    OBJECTIVE_3(new Objective(VillainFactory.getVillain(VillainConst.ORK_ID), 5));
    
    private final Objective objective;
    
    private Objectives(Objective objective)
    {
        this.objective = objective;
    }
    
    public Objective getObjective(){
        return this.objective;
    }
}