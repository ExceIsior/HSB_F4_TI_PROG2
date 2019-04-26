package model.Factories;

import control.Enums.Objectives;
import control.Enums.Rewards;
import model.Quest;

/**
 * This class supplies instances of the Quest class.
 *
 * @author Ismail
 */
public class QuestFactory {

    /**
     * Instantiates an object of Quest
     *
     * @param questID  ID of Quest that is to be instantiated.
     * @return Object of Quest.
     */
    public static Quest getQuest(int questID) {
        switch (questID) {
            case 0:
                return new Quest(Rewards.REWARD_1.getReward(), Objectives.OBJECTIVE_1.getObjective());
            case 1:
                return new Quest(Rewards.REWARD_2.getReward(), Objectives.OBJECTIVE_2.getObjective());
            case 2:
                return new Quest(Rewards.REWARD_3.getReward(), Objectives.OBJECTIVE_3.getObjective());
        }
        return null;
    }
}
