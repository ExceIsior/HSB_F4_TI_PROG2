package control;

import model.gameObject.Mountain;
import model.map.Dungeon;
import model.map.Field;
import model.map.Tile;

import java.util.Arrays;
import control.Constants.Const;

public class MapController
{

    public Tile[][] generateMap()
    {
        Tile[][] map = new Tile[Const.MAP_SIZE_X][Const.MAP_SIZE_Y];
        for (int i = 0; i < Const.MAP_SIZE_X; i++)
        {
            for (int j = 0; j < Const.MAP_SIZE_Y; j++)
            {
                map[i][j] = this.generateTile();
            }
        }
        return map;
    }

    private Tile generateTile()
    {
        // GameObject[] objects = {new}
        Field[][] tile = new Field[Const.TILE_SIZE_X][Const.TILE_SIZE_Y];
        for (int i = 0; i < Const.TILE_SIZE_X; i++)
        {
            for (int j = 0; j < Const.TILE_SIZE_Y; j++)
            {
                //tile[i][j] = new Field(new Mountain());
            }
        }
        return new Tile(tile);
    }

    public void ausgeben(Dungeon dungeon)
    {
        System.out.println(createStringRepresentationOfDungeon(dungeon));
    }

    public String createStringRepresentationOfDungeon(Dungeon dungeon)
    {
        Tile[][] map = dungeon.getMap();
        StringBuilder stringBuilder = new StringBuilder();

        for (Tile[] tiles : map)
        {
            for (int tileLooper = 0; tileLooper < Const.TILE_SIZE_Y; tileLooper++)
            {
                for (Tile tile : tiles)
                {
                    Field[][] fieldArray = tile.getTile();
                    stringBuilder.append(Arrays.toString(fieldArray[tileLooper]));
                }
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
