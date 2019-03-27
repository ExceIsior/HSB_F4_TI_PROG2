package model.item;

import java.util.HashMap;

public class Inventory {
    
    static HashMap<Item, Integer> inventory = new HashMap<>();
    public static void main (String[] args)
    {
        addItem(new Item());
    }
    public static void addItem(Item i)
    {
        inventory.put(i, inventory.containsKey(i) ? inventory.get(i)+1 : 1);
        System.out.println(inventory.get(i));
    }
}
