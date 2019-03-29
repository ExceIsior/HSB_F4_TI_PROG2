package model.gameObject;

import control.Constants;
import model.item.Item;

public class Trap extends Interactive {

    public Trap(int damage) {
        super(Constants.TRAP_PATH, damage, 0, null);
    }
    
}
