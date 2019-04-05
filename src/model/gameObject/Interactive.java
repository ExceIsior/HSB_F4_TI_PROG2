package model.gameObject;

import control.Constants.Const;
import model.Position;
import model.gameObject.GameObject;
import model.item.Item;

public class Interactive extends GameObject {

    private int armor = 0;
    private Item loot = null;
    private int healthPoints = 0;


    public Interactive(String graphicsPath, Position position, int armor, Item loot, int healthPoints, int height) {
        super(graphicsPath, position, height);
        this.armor = armor;
        this.loot = loot;
        this.healthPoints = healthPoints;
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
    
    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    
}
