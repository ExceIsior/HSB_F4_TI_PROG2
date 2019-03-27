package model.item;

import java.util.HashMap;
import java.util.Stack;

public class Inventory {
    HashMap<String, Integer> inventory = new HashMap<>();

    public Inventory(HashMap<String, Integer> inventory) {
        this.inventory = inventory;
    }

    public void addItem(Item item){
        inventory.put(item.getName(), this.getAmountOfItem(item)+1);
    }
    
    public int getAmountOfItem(Item item){
        return this.inventory.get(item.getName());
    }
}
