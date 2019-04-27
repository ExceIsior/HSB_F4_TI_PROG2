package model.Factories;

import control.Enums.Objectives;
import control.Enums.Rewards;
import model.Quest;

public class QuestFactory {
    
    public static Quest getQuest(int questID) {
        switch(questID) {
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
