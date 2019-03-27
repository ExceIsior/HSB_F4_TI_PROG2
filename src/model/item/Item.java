package model.item;

import java.util.Objects;

public class Item {
    private int rarity = 0;
    private String name = "";

    public Item(int rarity, String name) {
        this.name = name;
        this.rarity = rarity;
    }

    public int getRarity() {
        return rarity;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

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
    
    
    
}
