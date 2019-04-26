package model.item.Equipment;

import java.util.HashMap;
import model.item.Material;

/**
 * Materials and the costs to craft an equipment part.
 *
 * @author Ismail
 */
public class CraftBluePrint {

    private HashMap<Material, Integer> craftMaterials = null;
    private int cost = 0;

    /**
     * Initialises the craft blue print of an equipment
     *
     * @param craftMaterials HashMap of crafting materials and their respective
     * quantity
     * @param cost Costs to craft an equipment
     */
    public CraftBluePrint(HashMap<Material, Integer> craftMaterials, int cost) {
        this.craftMaterials = craftMaterials;
        this.cost = cost;
    }

    /**
     * Returns the HashMap of required crafting materials and their quantity
     *
     * @return HashMap of required crafting materials and their quantity
     */
    public HashMap<Material, Integer> getCraftMaterials() {
        return craftMaterials;
    }

    /**
     * Returns the costs to craft an equipment
     *
     * @return Costs to craft an equipment
     */
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "CraftBluePrint{" + "craftMaterials=" + craftMaterials + ", cost=" + cost + '}';
    }

}
