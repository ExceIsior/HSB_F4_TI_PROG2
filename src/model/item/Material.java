package model.item;

import model.item.Item;

/**
 * Item for crafting equipment parts.
 *
 * @author Ismail
 */
public class Material extends Item {

    /**
     * Initialises a material.
     *
     * @param rarity Rarity of the material.
     * @param name Name of the material.
     */
    public Material(int rarity, String name) {
        super(rarity, name);
    }
    
}
