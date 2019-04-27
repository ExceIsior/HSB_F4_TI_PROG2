package model.Factories;

import control.Constants.QuestItemConst;
import model.Objective;
import control.Constants.VillainConst;

/**
 * This class supplies instances of the Objective class.
 *
 * @author ismail
 */
public class ObjectiveFactory {

    /**
     * Instantiates an object of Quest.
     *
     * @param objectiveID ID of the quest type that is to be instantiated.
     * @return Object of Quest.
     */
    public static Objective[] getObjective(int objectiveID) {
        switch (objectiveID) {
            case 0:
                return new Objective[]{new Objective(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), 3)};
            case 1:
                return new Objective[]{new Objective(QuestItemFactory.getQuestItem(QuestItemConst.MUSHROOM_ID), 3)};
            case 2:
                return new Objective[]{
                    new Objective(VillainFactory.getVillain(VillainConst.GHUL_ID), 1),
                    new Objective(QuestItemFactory.getQuestItem(QuestItemConst.MUSHROOM_ID), 2)};
            default:
                return null;
        }
    }
}
