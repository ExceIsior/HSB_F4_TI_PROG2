package model.map;

public class Dungeon
{

    Tile[][] map = null;

    public Dungeon(Tile[][] board)
    {
        this.map = board;
    }

    public Tile[][] getMap()
    {
        return this.map;
    }
}
