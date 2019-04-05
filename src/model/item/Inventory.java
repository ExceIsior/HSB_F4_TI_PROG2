package model.item;

import java.util.HashMap;
import java.util.Set;

public class Inventory {

    private HashMap<Item, Integer> inventory = null;
    private int maxCapacity = 0;

    public Inventory(int maxCapacity) {
        this.inventory = new HashMap<>();
        this.maxCapacity = maxCapacity;
    }

    public void addItem(Item newItem) {
        if(this.inventory.size() < this.maxCapacity){
        inventory.put(newItem, inventory.containsKey(newItem) ? inventory.get(newItem) + 1 : 1);
        }
    }

    public Item removeItem(Item item){
        if(this.inventory.containsKey(item)){
            this.inventory.put(item, this.inventory.get(item)-1);
            this.inventory.remove(item, 0);
        }
        return item;
    }
    
    public Set<Item> getItemList() {
        return this.inventory.keySet();
    }

    public HashMap<Item, Integer> getInventory() {
        return inventory;
    }

}
