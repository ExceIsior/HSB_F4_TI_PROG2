package model.gameObject;

import model.Position;
import model.item.Item;
import control.Constants.Const;

public class Trap extends Interactive {
    
    public Trap(Position position, int damage) {
        super(Const.TRAP_PATH, position, 0, null, 0, 0, Const.HEIGHT_INTERACTIVE);
    }
    
}
