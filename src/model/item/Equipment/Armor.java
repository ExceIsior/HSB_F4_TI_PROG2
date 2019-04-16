package model.item.Equipment;

import java.util.HashMap;
import model.item.Material;

public class Armor extends Equipment {

    public Armor(int rarity, String name, int cost, HashMap<Material, Integer> materials) {
        super(rarity, name, cost, materials);
    }


}
