package model.Factories;

import control.Constants.DungeonConst;
import model.map.Dungeon;
import utilities.IOHelper;

public class DungeonFactory {
    
    public static Dungeon getDungeon(int dungeonID) {
        switch(dungeonID) {
            case 0:
                return new Dungeon(DungeonConst.DUNGEON_0_TITLE, QuestFactory.getQuest(0), IOHelper.loadMap(0));
            case 1:
                return new Dungeon(DungeonConst.DUNGEON_1_TITLE, QuestFactory.getQuest(1), IOHelper.loadMap(1));
            case 2:
                return new Dungeon(DungeonConst.DUNGEON_2_TITLE, QuestFactory.getQuest(2), IOHelper.loadMap(2));
        }      
        return null;
    }
}
