package model.gameObject;

import model.item.Item;

/**
 * Game object that represents a quest item.
 */
public class QuestItem extends Interactive 
{
    /**
     * Initializes a quest item object
     * @param graphicsPath
     * @param armor
     * @param loot
     * @param healthPoints
     * @param maxHealthPoints 
     */
    public QuestItem(String graphicsPath, int armor, Item loot, int healthPoints, int maxHealthPoints) 
    {
        super(graphicsPath, armor, loot, healthPoints, maxHealthPoints);
    }
    
}
