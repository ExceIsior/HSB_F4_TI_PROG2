package model.map;

import model.Quest;

public class Dungeon
{
    String name = "";
    Tile[][] map = null;
    Quest quest = null;

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
}
