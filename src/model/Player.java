package model;

import java.util.List;
import java.util.ArrayList;
import model.item.Inventory;
import model.item.Item;

public class Player {
    
    private String name = "";
    private int experiencePoints = 0;
    private int gold = 0;
    private Inventory inventory = null;
    
    public Player(String name, int experiencePoints, int gold, Inventory inventory) {
        this.name = name;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.inventory = inventory;
    }
    
    //GETTER & SETTER
    
    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
}
