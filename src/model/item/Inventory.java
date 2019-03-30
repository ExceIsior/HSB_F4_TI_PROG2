package model.item;

import com.sun.tools.javac.tree.TreeMaker;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Inventory {

    private HashMap<Item, Integer> inventory = null;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public void addItem(Item newItem) {
        inventory.put(newItem, inventory.containsKey(newItem) ? inventory.get(newItem) + 1 : 1);
    }

    public Set<Item> getItemList() {
        return this.inventory.keySet();
    }

    public HashMap<Item, Integer> getInventory() {
        return inventory;
    }

}
