package model.gameObject;

import model.Position;
import model.item.Item;
import control.Constants.Const;

public class TreasureChest extends Interactive {

    public TreasureChest(Position position, int armor, Item loot) {
        super(Const.TREASURE_PATH, position, armor, loot, 0);
    }
    
}
