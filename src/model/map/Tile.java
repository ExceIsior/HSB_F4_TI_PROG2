package model.map;

import model.Position;

public class Tile
{
    private boolean isVisible = false;

    private Field[][] tile = null;

    public Tile(Field[][] tile)
    {
        this.tile = tile;
    }

    public Field[][] getTile()
    {
        return this.tile;
    }

    public Field getField(Position position)
    {
        return this.tile[position.getX()][position.getY()];
    }
}
