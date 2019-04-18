package model;

import model.item.Inventory;

/**
 * Represents a player with its progression.
 *
 * @author Ismail
 */
public class Player {

    private String name = "";
    private int experiencePoints = 0;
    private int gold = 0;
    private Inventory inventory = null;

    /**
     * Initialises a new player object
     *
     * @param name Name of the player.
     * @param experiencePoints Player's experience points.
     * @param gold Player's amount of gold.
     * @param inventory Player's inventory.
     */
    public Player(String name, int experiencePoints, int gold, Inventory inventory) {
        this.name = name;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.inventory = inventory;
    }

    /**
     * Retrieves the player's name.
     *
     * @return Player's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the player's experience points.
     *
     * @return Player's experience points.
     */
    public int getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * Sets the player's experience points.
     *
     * @param experiencePoints New experience points value.
     */
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    /**
     * Retrieves the player's amount of gold.
     *
     * @return Player's amount of gold.
     */
    public int getGold() {
        return gold;
    }

    /**
     * Sets player's amount of gold.
     *
     * @param gold New amount of gold.
     */
    public void setGold(int gold) {
        this.gold = gold;
    }

    /**
     * Retrieves the player's inventory.
     *
     * @return Player's inventory.
     */
    public Inventory getInventory() {
        return this.inventory;
    }

    /**
     * Sets the player's inventory
     *
     * @param inventory New inventory object.
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
