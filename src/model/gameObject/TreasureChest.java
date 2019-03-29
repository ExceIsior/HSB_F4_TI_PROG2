package model.gameObject;

import model.item.Item;

public class TreasureChest extends Interactive {

    public TreasureChest(String graphicsPath, int armor, Item loot) {
        super(graphicsPath, 0, armor, loot);
    }
    
}
