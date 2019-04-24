package model.map;

import java.util.Arrays;
import model.Position;

/**
 * Represents a single tile of a map consisting of arrays of fields.
 *
 * @author Ismail
 */
public class Tile {

    private boolean visible = false;
    private Field[][] tile = null;

    /**
     * Initialises a tile.
     * @param tile Two-dimensional array of fields.
     */
    public Tile(Field[][] tile) {
        this.tile = tile;
    }

    /**
     * Returns the two-dimensional field array.
     * @return Two-dimensional field array.
     */
    public Field[][] getTile() {
        return this.tile;
    }

    /**
     * Returns a single field with given coordinates
     * @param position Coordinates of desired field
     * @return Desired field matching the position.
     */
    public Field getField(Position position) {
        return this.tile[position.getY()][position.getX()];
    }

    /**
     * Retrieves the visibility status of the tile and its fields.
     * @return Visibility of the tile and its fields.
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the visibility of the tile and of its fields.
     * @param visible Desired visibility status of the tile and its fields.
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
        for (int row = 0; row < this.tile.length; row++) {
            Arrays.stream(this.tile[row]).forEach((column) -> column.setVisible(visible));
        }
    }
}
