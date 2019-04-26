package model.gameObject;

import model.item.Item;

/**
 * Abstract super class of all game objects that can interact
 *
 * @author reenawichmann
 */
public abstract class Interactive extends GameObject {

    private int armor = 0;
    private Item loot = null;
    private int healthPoints = 0;
    private int maxHealthPoints = 0;

    /**
     * Initialises an interactive game object.
     *
     * @param graphicsPath Path to the image file of the interactive
     * @param armor Interactive's armor value
     * @param loot Loot carried by the interactive
     * @param healthPoints Interactive's current health points
     * @param maxHealthPoints Interactive's maximum health points
     */
    public Interactive(String graphicsPath,
            int armor,
            Item loot,
            int healthPoints,
            int maxHealthPoints) {
        super(graphicsPath);
        this.armor = armor;
        this.loot = loot;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
    }

    /**
     * Returns the interactive's armor value
     *
     * @return Interactive's armor value
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Sets the interactive's armor value
     *
     * @param armor New Armor value
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * Returns the interactive's loot
     *
     * @return Interactive's loot
     */
    public Item getLoot() {
        return loot;
    }

    /**
     * Returns interactive's current healt points
     *
     * @return Interactive's current health points
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Sets the interactive's current health points.
     *
     * @param healthPoints New health points value
     */
    public void setHealthPoints(int healthPoints) {
        if (healthPoints < this.maxHealthPoints) {
            this.healthPoints = healthPoints;
        }
    }

    /**
     * Returns the interactive's maximum health points value
     *
     * @return Interactive's maximum health points value
     */
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    /**
     * Sets the interactive's maximum health points value.
     *
     * @param maxHealthPoints New maximum health points value
     */
    public void setMaxHealthPoints(int maxHealthPoints) {
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
