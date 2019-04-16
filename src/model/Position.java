package model;

/**
 * Represents two dimensional coordinates.
 *
 * @author Ismail
 */
public class Position {

    private int x = 0;
    private int y = 0;

    /**
     * Initialises a new position.
     *
     * @param x X-Coordinate
     * @param y Y-Coordinate
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retrieves the X-Coordinate
     *
     * @return X-Coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets a new X-Coordinate
     *
     * @param x New X-Coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retrieves the Y-Coordinate
     *
     * @return Y-Coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets a new Y-Coordinate
     *
     * @param Y New Y-Coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

}
