package control;

import model.gameObject.Mountain;
import model.map.Dungeon;
import model.map.Field;
import model.map.Tile;

import java.util.Arrays;

public class MapController
{

    public Tile[][] generateMap()
    {
        Tile[][] map = new Tile[Constants.MAP_SIZE_X][Constants.MAP_SIZE_Y];
        for (int i = 0; i < Constants.MAP_SIZE_X; i++)
        {
            for (int j = 0; j < Constants.MAP_SIZE_Y; j++)
            {
                map[i][j] = this.generateTile();
            }
        }
        return map;
    }

    private Tile generateTile()
    {
        // GameObject[] objects = {new}
        Field[][] tile = new Field[Constants.TILE_SIZE_X][Constants.TILE_SIZE_Y];
        for (int i = 0; i < Constants.TILE_SIZE_X; i++)
        {
            for (int j = 0; j < Constants.TILE_SIZE_Y; j++)
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
            for (int tileLooper = 0; tileLooper < Constants.TILE_SIZE_Y; tileLooper++)
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
