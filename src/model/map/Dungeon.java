package model.map;

import control.Constants.Const;
import model.Position;
import model.Quest;

import java.util.Arrays;

public class Dungeon
{
    private String name = "";
    private Tile[][] map = null;
    private Quest quest = null;

    public Dungeon(String name, Quest quest, Tile[][] board)
    {
        this.name = name;
        this.quest = quest;
        this.map = board;
    }

    public Tile[][] getMap()
    {
        return this.map;
    }

    public Tile getTile(Position position)
    {
        return this.map[position.getX()][position.getY()];
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Tile[] tiles : this.map)
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
