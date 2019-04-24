package control;

import control.Constants.BossConst;
import control.Constants.Const;
import control.Constants.VillainConst;
import java.io.IOException;
import model.Factories.BossFactory;
import model.Factories.QuestItemFactory;
import model.Factories.VillainFactory;
import model.Position;
import model.gameObject.QuestItem;
import model.gameObject.Villain;
import model.map.Dungeon;
import model.map.Tile;
import utilities.JsonParser;

public class Main {

    public static void main(String[] args) throws IOException {
//        JsonParser.toJsonFile(MapController.generateDefaultMap(), "./maps/map3/map.json");
//        Tile[][] map = (Tile[][]) JsonParser.fromJsonFile(Tile[][].class, "./maps/map3/map.json");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                map[i][j].setVisible(true);
//            }
//        }
//        System.out.println(new Dungeon(null, map));

         Villain[] villains = new Villain[3];
         villains[0] = VillainFactory.getVillain(VillainConst.ZOMBIE_ID);
         villains[0].setPosition(new Position(2,2));
         villains[1] = VillainFactory.getVillain(VillainConst.ZOMBIE_ID);
         villains[1].setPosition(new Position(17,11));
         villains[2] = VillainFactory.getVillain(VillainConst.ZOMBIE_ID);
         villains[2].setPosition(new Position(9,18));
         JsonParser.toJsonFile(villains, "./maps/map1/zombie.json");
         
         QuestItem[] questItems = new QuestItem[4];
         questItems[0] = QuestItemFactory.getQuestItem(Const.MUSHROOM_ID);
         questItems[0].setPosition(new Position(4, 2));
         questItems[1] = QuestItemFactory.getQuestItem(Const.MUSHROOM_ID);
         questItems[1].setPosition(new Position(18, 5));
         questItems[2] = QuestItemFactory.getQuestItem(Const.MUSHROOM_ID);
         questItems[2].setPosition(new Position(15, 18));
         questItems[3] = QuestItemFactory.getQuestItem(Const.MUSHROOM_ID);
         questItems[3].setPosition(new Position(1, 13));
         JsonParser.toJsonFile(questItems, "./maps/map2/mushroom.json");
         
         Villain[] villainsBoss = new Villain[4];
         villainsBoss[0] = VillainFactory.getVillain(VillainConst.GHUL_ID);
         villainsBoss[0].setPosition(new Position(4, 8));
         villainsBoss[1] = VillainFactory.getVillain(VillainConst.GHUL_ID);
         villainsBoss[1].setPosition(new Position(14, 14));
         villainsBoss[2] = VillainFactory.getVillain(VillainConst.GHUL_ID);
         villainsBoss[2].setPosition(new Position(5, 13));
         villainsBoss[3] = BossFactory.getBoss(BossConst.BASILISK_ID);
         villainsBoss[3].setPosition(new Position(18, 18));
         JsonParser.toJsonFile(villainsBoss, "./maps/map3/villainsBoss.json");
         
         GameController game = new GameController();
         game.start();
    }
}
