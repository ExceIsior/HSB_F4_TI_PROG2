package control.Enums;

import model.Quest;

public enum Quests {
    QUEST_1(new Quest(Rewards.REWARD_1.getReward(), Objectives.OBJECTIVE_1.getObjective())),
    QUEST_2(new Quest(Rewards.REWARD_2.getReward(), Objectives.OBJECTIVE_2.getObjective())),
    QUEST_3(new Quest(Rewards.REWARD_3.getReward(), Objectives.OBJECTIVE_3.getObjective()));
    
    private final Quest quest;
    private Quests(Quest quest){
        this.quest = quest;
    }
    
    public Quest getQuest(){
        return this.quest;
    }
}
