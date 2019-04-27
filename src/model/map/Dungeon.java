package model.map;

import control.Constants.Const;
import model.Position;
import model.Quest;
import java.util.Arrays;

public class Dungeon {

    private String title = "";
    private Tile[][] map = null;
    private Quest quest = null;

    public Dungeon(String title, Quest quest, Tile[][] map) {
        this.title = title;
        this.quest = quest;
        this.map = map;
    }

    public Dungeon(Quest quest, Tile[][] map) {
        this("", quest, map);
    }

    public String getTitle() {
        return title;
    }

    public Quest getQuest() {
        return quest;
    }
    
    public Tile[][] getMap() {
        return this.map;
    }

    public Tile getTile(Position position) {
        return this.map[position.getY()][position.getX()];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = new String[Const.TILE_SIZE_X];
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = " ";
        }
        
        for (Tile[] tiles : this.map) {
            for (int tileLooper = 0; tileLooper < Const.TILE_SIZE_Y; tileLooper++) {
                for (Tile tile : tiles) 
                {
                        Field[][] fieldArray = tile.getTile();
                        stringBuilder.append(
                                tile.isVisible() ? Arrays.toString(fieldArray[tileLooper]) : Arrays.toString(array));
                    
                }
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
