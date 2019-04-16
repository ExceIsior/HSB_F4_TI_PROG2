package model.item.Equipment;

import java.util.HashMap;
import model.Effect;
import model.item.EffectItem;
import model.item.Item;
import model.item.Material;

public class Equipment extends Item {

    private int cost = 0;
    private HashMap<Material, Integer> materials = null;

    public Equipment(int rarity, String name, int cost, HashMap<Material, Integer> materials) {
        super(rarity, name);
        this.cost = cost;
        this.materials = materials;
    }

    public int getCost() {
        return cost;
    }

    public HashMap<Material, Integer> getMaterials() {
        return materials;
    }
}
