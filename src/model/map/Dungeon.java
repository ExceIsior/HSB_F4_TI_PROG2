package model.map;

import control.Constants.Const;
import model.Position;
import model.Quest;
import java.util.Arrays;

/**
 * A dungeon consists of a map and a quest that has to be accomplished.
 *
 * @author Ismail
 */
public class Dungeon {

    private String title = "";
    private Tile[][] map = null;
    private Quest quest = null;

    /**
     * Initialises a dungeon.
     *
     * @param title Title of the dungeon.
     * @param quest Quest that is to be accomplished
     * @param map Map layout as a two-dimensional tile array.
     */
    public Dungeon(String title, Quest quest, Tile[][] map) {
        this.title = title;
        this.quest = quest;
        this.map = map;
    }

    /**
     * Initialises a dungeon without any title.
     *
     * @param quest Quest that is to be accomplished
     * @param map Map layout as a two-dimensional tile array.
     */
    public Dungeon(Quest quest, Tile[][] map) {
        this("", quest, map);
    }

    /**
     * Returns the title of the dungeon.
     *
     * @return Title of the dungeon.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the Quest object that is to be accomplished.
     *
     * @return Quest object
     */
    public Quest getQuest() {
        return quest;
    }

    /**
     * Returns the map layout
     *
     * @return Map layout
     */
    public Tile[][] getMap() {
        return this.map;
    }

    /**
     * Returns a tile of the map at a specified position.
     *
     * @param position Coordinated of desired tile within map.
     * @return
     */
    public Tile getTile(Position position) {
        return this.map[position.getY()][position.getX()];
    }

    @Override
    public String toString() {
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
