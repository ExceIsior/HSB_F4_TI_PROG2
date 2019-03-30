package model.gameObject;

import control.Constants;
import model.Position;
import model.item.Item;

public class TreasureChest extends Interactive {

    public TreasureChest(Position position, int armor, Item loot) {
        super(Constants.TREASURE_PATH, position, 0, armor, loot);
    }
    
}
