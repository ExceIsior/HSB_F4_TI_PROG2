package model.item;

import java.util.Objects;

/**
 * Abstract super class of all items.
 *
 * @author Ismail
 */
public abstract class Item {

    private int rarity = 0;
    private String name = "";

    /**
     * Initialises an item.
     *
     * @param rarity Rarity of the item.
     * @param name Name of the item.
     */
    public Item(int rarity, String name) {
        this.name = name;
        this.rarity = rarity;
    }

    /**
     * Returns the rarity of the item.
     *
     * @return Rarity of the item.
     */
    public int getRarity() {
        return rarity;
    }

    /**
     * Returns the item's name.
     *
     * @return Item's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Hashes the instance dependant of its name attribute for logical equality
     * checks.
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     *Compares if another given object matches the name and class of its own instance.
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "rarity=" + rarity + ", name=" + name + '}';
    }

}
