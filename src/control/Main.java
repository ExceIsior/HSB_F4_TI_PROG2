package control;

import model.Factories.QuestFactory;
import model.Factories.QuestItemFactory;
import model.Factories.VillainFactory;
import model.Position;
import model.Quest;
import model.gameObject.Villain;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Quest q = QuestFactory.getQuest(1);
        System.out.println(q.checkAllObjectives());
        q.addToProgress(VillainFactory.getVillain(0));
        System.out.println(q.checkAllObjectives());
        q.addToProgress(VillainFactory.getVillain(1));
        System.out.println(q.checkAllObjectives());
        q.addToProgress(QuestItemFactory.getQuestItem(0));
        System.out.println(q.checkAllObjectives());
        System.out.println(q.checkAllObjectives());
        q.addToProgress(QuestItemFactory.getQuestItem(0));
        System.out.println(q.checkAllObjectives());
//        MenuManager.getInstance().promptMainMenu();
//
//         System.out.print("Range: " + MovementController.getRangeFelder(5, new Position(3,3)) + "\n");
//         System.out.print("Attack: " + MovementController.getAttackFelder(5, new Position(3,3)));
        //GameController game = new GameController(Const.LEVEL1);
        //game.start();
    }
}
