package model.gameObject;

import model.item.Item;

/**
 * Quest item on a map that has to be collected for quest completion.
 *
 * @author Ismail
 */
public class QuestItem extends Interactive {

    /**
     * Initialises a quest item.
     *
     * @param graphicsPath Path to the image file representing the quest item.
     * @param armor Quest item's armor value
     * @param loot Loot that is carried by the quest item item
     * @param healthPoints Quest item's current health points
     * @param maxHealthPoints Quest item's maximum health
     */
    public QuestItem(String graphicsPath, int armor, Item loot, int healthPoints, int maxHealthPoints) {
        super(graphicsPath, armor, loot, healthPoints, maxHealthPoints);
    }
}
