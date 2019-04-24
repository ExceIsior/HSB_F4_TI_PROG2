package model.item;

import java.util.HashMap;
import java.util.Set;

public class Inventory<T extends Item> {

    private HashMap<T, Integer> inventory = null;
    private int maxCapacity = 0;

    public Inventory(int maxCapacity) {
        this.inventory = new HashMap<>();
        this.maxCapacity = maxCapacity;
    }

    public void addItem(T newItem) {
        if (this.inventory.size() < this.maxCapacity) {
            inventory.put(newItem, inventory.containsKey(newItem) ? inventory.get(newItem) + 1 : 1);
        }
    }
    
    public void addQuantity(T item, int quantity){
        this.inventory.put(item, this.inventory.containsKey(item) ? this.inventory.get(item) + quantity : quantity);
    }
    
    public Item removeItem(T item) {
        if (this.inventory.containsKey(item)) {
            this.inventory.put(item, this.inventory.get(item) - 1);
            this.inventory.remove(item, 0);
        }
        return item;
    }

    public Set<T> getItemList() {
        return this.inventory.keySet();
    }

    public int getItemCount(T item) {
        return this.inventory.get(item);
    }

    public HashMap<T, Integer> getInventory() {
        return inventory;
    }

}
