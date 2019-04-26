package model.gameObject;

import model.Position;
import control.Constants.Const;

/**
 * Game object that represents a trap.
 */
public class Trap extends Interactive 
{
    /**
     * Initialises a trap object.
     */
    public Trap(Position position, int damage) {
        super(Const.TRAP_PATH, 0, null, 0, 0);
    }
    
}
