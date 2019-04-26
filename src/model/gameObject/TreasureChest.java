package model.gameObject;

import model.item.Item;
import control.Constants.Const;

/**
 * Game object that represents a treasure chest.
 */
public class TreasureChest extends Interactive 
{
    /**
     * Initializes a treasure chest object
     * @param armor
     * @param loot 
     */
    public TreasureChest(int armor, Item loot) 
    {
        super(Const.TREASURE_PATH, armor, loot, 0, 0);
    }
}
