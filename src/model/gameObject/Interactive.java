package model.gameObject;

import model.gameObject.GameObject;
import model.item.Item;

public class Interactive extends GameObject {

    private int damage = 0;
    private int armor = 0;
    private Item loot = null;
    
    public Interactive(int damage, int armor, int loot) {
        this.damage = damage;
        this.armor = armor;
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
