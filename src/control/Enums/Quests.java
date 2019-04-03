
package control.Enums;

import model.Objective;
import model.Quest;
import model.Reward;
import model.gameObject.GameObject;
import model.gameObject.Villain;
import model.item.Materials;

public enum Quests {
    QUEST1(new Quest(new Reward(5, 5, new Materials(5, "hallo")), new Objective(Villains.ZOMBIE.getVillain() , 3))),
    QUEST2(new Quest(new Reward(10, 10, new Materials(5, "hi")), new Objective(Villains.SUCCUBUS.getVillain(), 4))),
    QUEST3(new Quest(new Reward(10, 10, new Materials(5, "hi")), new Objective(Villains.ORK.getVillain(), 5)));
   
    private final Quest quest;
    private Quests(Quest quest){
        this.quest = quest;
    }
    public Quest getQuest() {
        return this.quest;
    }
}
