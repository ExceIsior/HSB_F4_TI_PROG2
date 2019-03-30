package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import model.Position;
import model.item.Inventory;
import model.item.Item;

public class Hero extends Character {
    private int surgeValue = 0;
    private Item equipment = null;
    private Inventory inventory = null;

    public Hero(Position position, 
            int damage,
            int armor, 
            Item loot,
            String name, 
            int HealthPoints, 
            int agility, 
            ArrayList<Status> status, 
            ArrayList<Skill> skills, 
            Inventory inventory) {
        super(Constants.HERO_PATH,position,  damage, armor, loot, name, HealthPoints, agility, status, skills);
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    
    
    @Override
    public String toString() {
        return String.format("Name: %s\n"
                + "Position: %s\n"
                + "Damage: %d\n"
                + "Armor: %d\n"
                + "HealthPoints: %d\n"
                + "Agility: %d", 
                this.getName(),
                this.getPosition(),
                this.getDamage(),
                this.getArmor(),
                this.getHealthPoints(),
                this.getAgility());
    }
    
    
}
