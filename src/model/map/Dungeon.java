package model.map;

import control.Constants.Const;
import model.Position;
import model.Quest;
import java.util.Arrays;

/**
 * Represents the dungeon consisting of a title, a map (tile array) and a quest.
 */
public class Dungeon 
{
    private String title = "";
    private Tile[][] map = null;
    private Quest quest = null;
    
    /**
     * Initilizes a dungeon.
     * @param title Title of the dungeon.
     * @param quest Quest of the dungeon.
     * @param map Map of the dungeon.
     */
    public Dungeon(String title, Quest quest, Tile[][] map) 
    {
        this.title = title;
        this.quest = quest;
        this.map = map;
    }

    public Dungeon(Quest quest, Tile[][] map) 
    {
        this("", quest, map);
    }
    /**
     * Returns the title of the dungeon.
     * @return title
     */
    public String getTitle() 
    {
        return title;
    }
    /**
     * Returns the quest of the dungeon.
     * @return quest 
     */
    public Quest getQuest() 
    {
        return quest;
    }
    /**
     * Returns the map of the dungeon as a tile array.
     * @return map
     */
    public Tile[][] getMap() 
    {
        return this.map;
    }
    /**
     * Returns a specific tile on the given position.
     * @param position
     * @return tile
     */
    public Tile getTile(Position position) 
    {
        return this.map[position.getY()][position.getX()];
    }

    @Override
    public String toString() 
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Tile[] tiles : this.map) {
            for (int tileLooper = 0; tileLooper < Const.TILE_SIZE_Y; tileLooper++) {
                for (Tile tile : tiles) {
                    if (tile.isVisible()) {
                        Field[][] fieldArray = tile.getTile();
                        stringBuilder.append(Arrays.toString(fieldArray[tileLooper]));
                    }
                }
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
