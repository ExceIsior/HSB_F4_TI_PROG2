package control;

import control.Constants.Const;
import java.io.IOException;
import model.map.Dungeon;
import model.map.Tile;
import utilities.JsonParser;

public class Main {

    public static void main(String[] args) throws IOException {
//        JsonParser.toJsonFile(MapController.generateDefaultMap(), "./maps/map1/map.json");
//        Tile[][] map = (Tile[][]) JsonParser.fromJsonFile(Tile[][].class, "./maps/map1/map.json");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                map[i][j].setVisible(true);
//            }
//        }
//        System.out.println(new Dungeon(null, map));

         GameController game = new GameController();
         game.start();
    }
}
