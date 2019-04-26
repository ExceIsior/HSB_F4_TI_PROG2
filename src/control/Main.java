package control;

import control.Constants.Const;
import control.Constants.DungeonConst;
import java.io.IOException;
import model.Position;
import model.map.Dungeon;


public class Main {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException    {
        MenuManager.getInstance().promptMainMenu();
//        JsonParser.toJsonFile(MapController.generateDefaultMap(), "./maps/map3/map.json");
//        Tile[][] map = (Tile[][]) JsonParser.fromJsonFile(Tile[][].class, "./maps/map3/map.json");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                map[i][j].setVisible(true);
//            }
//        }
//        System.out.println(new Dungeon(null, map));


         System.out.print("Range: " + MovementController.getRangeFelder(5, new Position(3,3)) + "\n");
         System.out.print("Attack: " + MovementController.getAttackFelder(5, new Position(3,3)));
         //GameController game = new GameController(Const.LEVEL1);
         //game.start();
    }
}