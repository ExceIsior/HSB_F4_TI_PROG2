package model.map;

public class Tile
{

    private Field[][] tile = null;

    public Tile(Field[][] tile)
    {
        this.tile = tile;
    }

    public Field[][] getTile()
    {
        return this.tile;
    }
}
