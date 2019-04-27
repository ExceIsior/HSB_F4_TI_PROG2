package model.Factories;

import control.Enums.Objectives;
import control.Enums.Rewards;
import model.Quest;

/**
 * This class supplies instances of the Quest class.
 *
 * @author reenawichmann
 */
public class QuestFactory {
    /**
     * Instantiates an object of Quest.
     * @param questID ID of the quest type that is to be instantiated.
     * @return Object of Quest.
     */
    public static Quest getQuest(int questID) 
    {
        switch(questID) 
        {
            case 0:
                return new Quest(Rewards.REWARD_1.getReward(), ObjectiveFactory.getObjective(0));
            case 1:
                return new Quest(Rewards.REWARD_2.getReward(), ObjectiveFactory.getObjective(1));
            case 2:
                return new Quest(Rewards.REWARD_3.getReward(), ObjectiveFactory.getObjective(2));
            default:
                return null;
        }
    }
}
