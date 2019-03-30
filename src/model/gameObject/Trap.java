package model.gameObject;

import control.Constants;
import model.Position;
import model.item.Item;

public class Trap extends Interactive {

    public Trap(Position position, int damage) {
        super(Constants.TRAP_PATH, position, damage, 0, null);
    }
    
}
