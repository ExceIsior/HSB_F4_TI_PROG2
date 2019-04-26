package model.gameObject;

import model.Position;
import control.Constants.Const;

/**
 * Trap on a field that may be disarmed or traversed in exchange
 * for damage.
 *
 * @author Ismail
 */
public class Trap extends Interactive {

    /**
     * Initialises a trap
     *
     * @param position Position of the trap on the map
     * @param damage Damage that may be applied to a hero
     */
    public Trap(Position position, int damage) {
        super(Const.TRAP_PATH, 0, null, 0, 0);
    }

}
