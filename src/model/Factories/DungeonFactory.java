package model.Factories;

import control.Constants.DungeonConst;
import model.map.Dungeon;
import utilities.IOHelper;

/**
 * This class supplies instances of the Field class.
 *
 * @author reenawichmann
 */
public class DungeonFactory {
    /**
     * Instantiates an object of Dungeon.
     * @param dungeonId ID of the dungeon type that is to be instantiated.
     * @return Object of Dungeon.
     */
    public static Dungeon getDungeon(int dungeonID) 
    {
        switch(dungeonID) 
        {
            case 0:
                return new Dungeon(DungeonConst.DUNGEON_0_TITLE, QuestFactory.getQuest(0), IOHelper.loadMap(0));
            case 1:
                return new Dungeon(DungeonConst.DUNGEON_1_TITLE, QuestFactory.getQuest(1), IOHelper.loadMap(1));
            case 2:
                return new Dungeon(DungeonConst.DUNGEON_2_TITLE, QuestFactory.getQuest(2), IOHelper.loadMap(2));
            default:
                return null;
        }
    }
}
