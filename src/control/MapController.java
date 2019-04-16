package control;

import control.Constants.Const;
import control.Constants.TerrainConst;
import model.Factories.FieldFactory;
import model.Position;
import model.gameObject.GameObject;
import model.gameObject.Hero;
import model.map.Dungeon;
import model.map.Field;
import model.map.Tile;

public class MapController {

    private static Tile[][] map;

    public static Tile[][] generateMap() {
        map = new Tile[Const.MAP_SIZE_X][Const.MAP_SIZE_Y];
        for (int i = 0; i < Const.MAP_SIZE_X; i++) {
            for (int j = 0; j < Const.MAP_SIZE_Y; j++) {
                map[i][j] = generateTile();
            }
        }
        //map[0][0].getField(new Position(0,1)).setGameObject();
        //map[0][0].getField(new Position(PhaseController.getHero2().getPosition().getX(), PhaseController.getHero2().getPosition().getY())).setGameObject(PhaseController.getHero2());

        return map;
    }

    private static Tile generateTile() {
        Field[][] tile = new Field[Const.TILE_SIZE_X][Const.TILE_SIZE_Y];
        for (int i = 0; i < Const.TILE_SIZE_X; i++) {
            for (int j = 0; j < Const.TILE_SIZE_Y; j++) {
                tile[i][j] = FieldFactory.getField(TerrainConst.GRASS_ID);
                if (j % 3 == 0 && i != 0) {
                    tile[i][j] = FieldFactory.getField(TerrainConst.MOUNTAIN_ID);
                }
                if (j == 2 && i == 2 || j == 3 && i == 3 || j == 2 && i == 3) {
                    tile[i][j] = FieldFactory.getField(TerrainConst.FOREST_ID);
                }
            }
        }
        return new Tile(tile);
    }

    /**
     * Generates a default map. The left and right borders are filled with
     * rivers, the top border witch mountains and the bottom border with
     * forests. The centre is left out with grasses.
     *
     * @return Default Map
     */
    public static Tile[][] generateDefaultMap() {
        map = new Tile[Const.MAP_SIZE_X][Const.MAP_SIZE_Y];
        for (int i = 0; i < Const.MAP_SIZE_X; i++) {
            for (int j = 0; j < Const.MAP_SIZE_Y; j++) {
                Field[][] tile = new Field[Const.TILE_SIZE_X][Const.TILE_SIZE_Y];
                for (int k = 0; k < Const.TILE_SIZE_X; k++) {
                    for (int l = 0; l < Const.TILE_SIZE_Y; l++) {
                        if (l == 0 && j == 0) {
                            tile[k][l] = FieldFactory.getField(TerrainConst.RIVER_ID);
                        } else if (k == 0 && i == 0) {
                            tile[k][l] = FieldFactory.getField(TerrainConst.MOUNTAIN_ID);
                        } else if (k == Const.TILE_SIZE_X - 1
                                && i == Const.MAP_SIZE_X - 1) {
                            tile[k][l] = FieldFactory.getField(TerrainConst.FOREST_ID);
                        } else if (l == Const.TILE_SIZE_X - 1
                                && j == Const.MAP_SIZE_X - 1) {
                            tile[k][l] = FieldFactory.getField(TerrainConst.RIVER_ID);
                        } else {
                            tile[k][l] = FieldFactory.getField(TerrainConst.GRASS_ID);
                        }
                    }
                }
                map[i][j] = new Tile(tile);
            }
        }
        return map;
    }

    public static void ausgeben(Dungeon dungeon) {
        System.out.println(dungeon);
    }

}
