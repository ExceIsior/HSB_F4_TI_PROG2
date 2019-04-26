package model.gameObject;

import model.item.Item;

/**
 * Abstract super class of all game objects that can interact
 * @author reenawichmann
 */
public class Interactive extends GameObject 
{

    private int armor = 0;
    private Item loot = null;
    private int healthPoints = 0;
    private int maxHealthPoints = 0;

    /**
     * Initialises a interactive object.
     */
    
    public Interactive(String graphicsPath, 
            int armor, 
            Item loot,
            int healthPoints, 
            int maxHealthPoints)
    {
        super(graphicsPath);
        this.armor = armor;
        this.loot = loot;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
    }
    
    /**
     * Returns the interactives armor value.
     * @return armor value
     */
    public int getArmor() 
    {
        return armor;
    }
    /**
     * Sets the armor value of the interactive.
     * @param armor new armor value for the interactive
     */
    public void setArmor(int armor) 
    {
        this.armor = armor;
    }
    /**
     * Returns the loot of the interactive.
     * @return loot
     */
    public Item getLoot() 
    {
        return loot;
    }
    /**
     * Returns the health points of the interactive.
     * @return health points
     */
    public int getHealthPoints() 
    {
        return healthPoints;
    }
    
    /**
     * Sets the health points of the interactive.
     * @param healthPoints new health points for the interactive
     */
    public void setHealthPoints(int healthPoints) 
    {
        if (healthPoints < this.maxHealthPoints) {
            this.healthPoints = healthPoints;
        } else {
            this.healthPoints = this.maxHealthPoints;
        }
    }
    /**
     * Returns the maximum health points of the interactive.
     * @return maxHealthPoints
     */
    public int getMaxHealthPoints() 
    {
        return maxHealthPoints;
    }
    
    /**
     * Sets the maximum health points of the interactive if possible
     * @param maxHealthPoints new maximum health points
     */
    public void setMaxHealthPoints(int maxHealthPoints) 
    {
        if (maxHealthPoints >= 0) {
            this.maxHealthPoints = maxHealthPoints;
        } else {
            this.maxHealthPoints = 0;
        }
        if (this.healthPoints > this.maxHealthPoints) {
            this.healthPoints = this.maxHealthPoints;
        }
    }

}
