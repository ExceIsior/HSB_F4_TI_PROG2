package model.gameObject;

import control.Constants.Const;
import model.Position;
import model.gameObject.GameObject;
import model.item.Item;

public class Interactive extends GameObject {

    private int armor = 0;
    private Item loot = null;
    private int healthPoints = 0;
    private int maxHealthPoints = 0;

    public Interactive(String graphicsPath, 
            int armor, 
            Item loot,
            int healthPoints, 
            int maxHealthPoints, 
            int height) {
        super(graphicsPath, height);
        this.armor = armor;
        this.loot = loot;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
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
        if (healthPoints < this.maxHealthPoints) {
            this.healthPoints = healthPoints;
        } else {
            this.healthPoints = this.maxHealthPoints;
        }
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        if (maxHealthPoints >= 0) {
            this.maxHealthPoints = maxHealthPoints;
        } else {
            this.maxHealthPoints = 0;
        }
        if (this.healthPoints > this.maxHealthPoints) {
            this.healthPoints = this.maxHealthPoints;
        }
    }

}
