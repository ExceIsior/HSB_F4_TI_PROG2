package model.item;

import java.util.HashMap;

public class Inventory {
    
    private HashMap<Item, Integer> inventory = new HashMap<>();

    public void addItem(Item newItem)
    {
        inventory.put(newItem, inventory.containsKey(newItem) ? inventory.get(newItem)+1 : 1);
    }
}
