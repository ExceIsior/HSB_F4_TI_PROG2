package model.item;

import java.util.HashMap;
import java.util.Set;

public class Inventory {

    private HashMap<Item, Integer> inventory = null;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public void addItem(Item newItem) {
        inventory.put(newItem, inventory.containsKey(newItem) ? inventory.get(newItem) + 1 : 1);
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
