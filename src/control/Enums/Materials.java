package control.Enums;

import model.item.Material;
import control.Constants.MaterialConst;

public enum Materials 
{
    IRON(new Material(MaterialConst.IRON_RARITY, MaterialConst.IRON_NAME)),
    SILVER(new Material(MaterialConst.SILVER_RARITY, MaterialConst.SILVER_NAME)),
    GOLD(new Material(MaterialConst.GOLD_RARITY, MaterialConst.GOLD_NAME)),
    PLATIN(new Material(MaterialConst.PLATINUM_RARITY, MaterialConst.PLATINUM_NAME)),
    CLOTH(new Material(MaterialConst.CLOTH_RARITY, MaterialConst.CLOTH_NAME)),
    LEATHER(new Material(MaterialConst.LEATHER_RARITY, MaterialConst.LEATHER_NAME)),
    AMETHYST(new Material(MaterialConst.AMETHYST_RARITY, MaterialConst.AMETHYST_NAME)),
    DIAMOND(new Material(MaterialConst.DIAMOND_RARITY, MaterialConst.DIAMOND_NAME));

    private final Material material;

    private Materials(Material material) 
    {
        this.material = material;
    }

    public Material getMaterial() 
    {
        return this.material;
    }
}
