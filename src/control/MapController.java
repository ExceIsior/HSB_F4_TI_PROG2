package control;

import model.gameObject.GameObject;
import model.gameObject.Mountain;
import model.gameObject.Tree;
import model.map.Field;
import model.map.Tile;

public class MapController {

    public Tile[][] generateMap() {
        Tile[][] map = new Tile[Constants.MAP_SIZE_X][Constants.MAP_SIZE_Y];
        for (int i = 0; i < Constants.MAP_SIZE_X; i++) {
            for (int j = 0; j < Constants.MAP_SIZE_Y; j++) {
                map[i][j] = this.generateTile();
            }
        }
        return map;
    }

    private Tile generateTile() {
        GameObject[] objects = {new }
        Field[][] tile = new Field[Constants.TILE_SIZE_X][Constants.TILE_SIZE_Y];
        for (int i = 0; i < Constants.TILE_SIZE_X; i++) {
            for (int j = 0; j < Constants.TILE_SIZE_Y; j++) {
                tile[i][j] = new Field(new Mountain("M"));
            }
        }
        return new Tile(tile);
    }

}
