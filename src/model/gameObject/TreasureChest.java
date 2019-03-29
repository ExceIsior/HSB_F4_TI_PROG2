package model.gameObject;

import control.Constants;
import model.item.Item;

public class TreasureChest extends Interactive {

    public TreasureChest(int armor, Item loot) {
        super(Constants.TREASURE_PATH , 0, armor, loot);
    }
    
}
