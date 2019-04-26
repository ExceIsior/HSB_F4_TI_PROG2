package model.gameObject;

import model.Position;
import control.Constants.Const;

/**
 * Game object that represents a trap.
 */
public class Trap extends Interactive 
{
    private int damage = 0;
    
    /**
     * Initializes a trap object
     * @param position
     * @param damage 
     */
    public Trap(Position position, int damage) 
    {
        super(Const.TRAP_PATH, 0, null, 0, 0);
        this.setPosition(position);
        this.damage = damage;
    }
    
}
