package model.gameObject;

import model.Position;
import model.item.Item;
import control.Constants.Const;

public class TreasureChest extends Interactive {

    public TreasureChest(int armor, Item loot) {
        super(Const.TREASURE_PATH, armor, loot, 0, 0, Const.HEIGHT_INTERACTIVE);
    }
    
}
