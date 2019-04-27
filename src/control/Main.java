package control;

import model.Factories.QuestFactory;
import model.Factories.QuestItemFactory;
import model.Factories.VillainFactory;
import model.Position;
import model.Quest;
import model.gameObject.Villain;
import view.ConsoleMenu.CraftingMenu;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        MenuManager.getInstance().promptMainMenu();
//
//         System.out.print("Range: " + MovementController.getRangeFelder(5, new Position(3,3)) + "\n");
//         System.out.print("Attack: " + MovementController.getAttackFelder(5, new Position(3,3)));
        //GameController game = new GameController(Const.LEVEL1);
        //game.start();
    }
}
