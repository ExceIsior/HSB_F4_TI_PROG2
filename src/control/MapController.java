package control;

import control.Constants.Const;
import model.gameObject.Mountain;
import model.gameObject.Tree;
import model.map.Dungeon;
import model.map.Field;
import model.map.Tile;

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
                if(j % 2 == 0){
                    tile[i][j] = new Field('M', new Mountain(null));
                } else{
                    tile[i][j] = new Field('T',new Tree(null));
                }

            }
        }
        return new Tile(tile);
    }

    public void ausgeben(Dungeon dungeon)
    {
        System.out.println(dungeon);
    }
}
