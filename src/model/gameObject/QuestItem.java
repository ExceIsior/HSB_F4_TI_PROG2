package model.gameObject;

import model.item.Item;

public class QuestItem extends Interactive {
    
    public QuestItem(String graphicsPath, int armor, Item loot, int healthPoints, int maxHealthPoints) 
    {
        super(graphicsPath, armor, loot, healthPoints, maxHealthPoints);
    }
    
}
