package model.gameObject;

import model.Position;
import model.gameObject.GameObject;
import model.item.Item;

public class Interactive extends GameObject {

    private int damage = 0;
    private int armor = 0;
    private Item loot = null;
    private int healthPoints = 0;

    public Interactive(String graphicsPath, Position position, int damage, int armor, Item loot, int healthPoints) {
        super(graphicsPath, position);
        this.damage = damage;
        this.armor = armor;
        this.loot = loot;
        this.healthPoints = healthPoints;
    }
 
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Item getLoot() {
        return loot;
    }

    
}
