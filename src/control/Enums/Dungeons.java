package control.Enums;

import control.Constants.DungeonConst;
import model.map.Dungeon;
import utilities.IOHelper;

public enum Dungeons {
    DUNGEON_0(new Dungeon(DungeonConst.DUNGEON_0_TITLE, Quests.QUEST_0.getQuest(), IOHelper.loadMap(0))),
    DUNGEON_1(new Dungeon(DungeonConst.DUNGEON_1_TITLE, Quests.QUEST_1.getQuest(), IOHelper.loadMap(1))),
    DUNGEON_2(new Dungeon(DungeonConst.DUNGEON_2_TITLE, Quests.QUEST_2.getQuest(), IOHelper.loadMap(2)));

    private Dungeon dungeon;

    private Dungeons(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public Dungeon getDungeon() {
        return this.dungeon;
    }
}
