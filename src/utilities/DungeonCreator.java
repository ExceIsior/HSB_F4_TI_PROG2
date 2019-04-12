package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import control.Constants.Const;
import control.Constants.VillainConst;
import control.HeroManager;
import control.PositionManager;
import model.Factories.VillainFactory;
import model.GameObjectContainer;
import model.Position;
import model.map.Field;
import model.map.Tile;

public class DungeonCreator {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public static Tile[][] generateMap() {
        Tile[][] map = new Tile[Const.MAP_SIZE_X][Const.MAP_SIZE_Y];
        for (int i = 0; i < Const.MAP_SIZE_X; i++) {
            for (int j = 0; j < Const.MAP_SIZE_Y; j++) {
                map[i][j] = new Tile(generateTile());
            }
        }
        return map;
    }

    public static Field[][] generateTile() {
        Field[][] tile = new Field[Const.TILE_SIZE_X][Const.TILE_SIZE_Y];
        for (int i = 0; i < Const.TILE_SIZE_X; i++) {
            for (int j = 0; j < Const.TILE_SIZE_Y; j++) {
                tile[i][j] = new Field(ANSI_GREEN + " " + ANSI_RESET);
            }
        }
        return tile;
    }
    
    public static PositionManager json_ToPositionManager(String json){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
       return  gson.fromJson(json, PositionManager.class);
    }
    
    public static PositionManager generatePositions(){
        PositionManager positions = new PositionManager();
        positions.putInteractive(HeroManager.getInstance().getHeroes()[0], new Position(5, 4));
        positions.putInteractive(HeroManager.getInstance().getHeroes()[1], new Position(4, 4));
        positions.putInteractive(HeroManager.getInstance().getHeroes()[2], new Position(6, 4));
        positions.putInteractive(HeroManager.getInstance().getHeroes()[3], new Position(7, 4));
        positions.putInteractive(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), new Position(0, 0));
        positions.putInteractive(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), new Position(1, 0));
        positions.putInteractive(VillainFactory.getVillain(VillainConst.ZOMBIE_ID), new Position(2, 0));
        return positions;
    }
    
}
