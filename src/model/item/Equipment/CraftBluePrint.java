package model.item.Equipment;

import java.util.HashMap;
import model.item.Material;

public class CraftBluePrint {

    private HashMap<Material, Integer> craftMaterials = null;
    private int cost = 0;

    public CraftBluePrint(HashMap<Material, Integer> craftMaterials, int cost) {
        this.craftMaterials = craftMaterials;
        this.cost = cost;
    }

    public HashMap<Material, Integer> getCraftMaterials() {
        return craftMaterials;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "CraftBluePrint{" + "craftMaterials=" + craftMaterials + ", cost=" + cost + '}';
    }
    
    
    

}
