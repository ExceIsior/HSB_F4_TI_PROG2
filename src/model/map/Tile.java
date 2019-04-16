package model.map;

import java.util.Arrays;
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
            for (int row = 0; row < this.tile.length; row++) {
                Arrays.stream(this.tile[row]).forEach((column) -> column.setVisible(visible));
        }
    }  
}
