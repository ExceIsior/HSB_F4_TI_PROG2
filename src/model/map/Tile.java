package model.map;

import model.Position;

public class Tile
{
    private boolean visible = false;

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
        return this.tile[position.getY()][position.getX()];
    }

    public boolean isVisibility() {
        return visible;
    }

    public void setVisibility(boolean visibility) {
        this.visible = visibility;
    }


    
    
}
