package model;

import java.util.List;
import java.util.ArrayList;
import model.item.Item;

public class Player {
    
    private String name = "";
    private int experiencePoints = 0;
    private int gold = 0;
    private ArrayList<Item> inventory = null;

    
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

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
    
    
}
