package model.gameObject;

import model.Position;
import model.item.Item;
import control.Constants.Const;

public class Trap extends Interactive 
{
    private int damage = 0;
    public Trap(Position position, int damage) 
    {
        super(Const.TRAP_PATH, 0, null, 0, 0);
        this.damage = damage;
    }
    public int getDamage() {
        return this.damage;
    }
    
}
