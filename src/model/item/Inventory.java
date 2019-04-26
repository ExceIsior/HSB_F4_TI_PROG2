package model.item;

import java.util.HashMap;
import java.util.Set;

/**
 * Generic Inventory. Stores Instances inherited by Item.
 *
 * @author Ismail
 * @param <T> Subclass of Item
 */
public class Inventory<T extends Item> {

    private HashMap<T, Integer> inventory = null;
    private int maxCapacity = 0;
    
    /**
     * Initialises an inventory.
     *
     * @param maxCapacity Maximum amount of item stacks the inventory is allowed
     * to hold.
     */
    public Inventory(int maxCapacity) {
        this.inventory = new HashMap<>();
        this.maxCapacity = maxCapacity;
    }

    /**
     * Adds a single new item to the inventory. Stack is created if needed.
     * Elsewise increments stack if a stack is already existing. Does nothing if
     * maximum capacity is reached.
     *
     * @param item Item to be added to the inventory.
     */
    public void addItem(T item) {
        if (this.inventory.size() < this.maxCapacity) {
            inventory.put(item, inventory.containsKey(item) ? inventory.get(item) + 1 : 1);
        }
    }

    /**
     * Adds a specified quantity of a new Item to the inventory. Stack is
     * created if needed. Elsewise adds the quantity to the existing stack. Does
     * nothing of maximum capacity is reached.
     *
     * @param item Item to be added to the inventory.
     * @param quantity Quantity of the specified item to be added.
     */
    public void addQuantity(T item, int quantity) {
        this.inventory.put(item, this.inventory.containsKey(item) ? this.inventory.get(item) + quantity : quantity);
    }

    /**
     * Decrements an item's stack by one. The stack is completely removed if the
     * item's stack quantity has reached 0.
     *
     * @param item Item to be decremented.
     * @return Intsance of consumed item.
     */
    public Item popItem(T item) {
        if (this.inventory.containsKey(item)) {
            this.inventory.put(item, this.inventory.get(item) - 1);
            this.inventory.remove(item, 0);
        }
        return item;
    }

    /**
     * Returns all item stacks in the inventory.
     * @return KeySet of the inventory.
     */
    public Set<T> getItemList() {
        return this.inventory.keySet();
    }

    /**
     * Returns the quantity of an item in the inventory.
     * @param item Item which's quantity is sought.
     * @return Quantity of given item.
     */
    public int getItemCount(T item) {
        return this.inventory.get(item);
    }

    /**
     * Returns the whole inventory.
     * @return Inventory as HashMap.
     */
    public HashMap<T, Integer> getInventory() {
        return inventory;
    }

}
