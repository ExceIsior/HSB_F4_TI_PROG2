package model;

import model.item.Material;

/**
 * Reward for the player after quest completion. Consists of gold,
 * Experience Points and an array of craft materials.
 *
 * @author Ismail
 */
public class Reward {

    private int gold = 0;
    private int xp = 0;
    private Material[] material = null;

    /**
     * Initialises a reward object
     *
     * @param gold Amount of gold.
     * @param xp Amount of experience points.
     * @param material Array of craft materials.
     */
    public Reward(int gold, int xp, Material... material) {
        this.gold = gold;
        this.xp = xp;
        this.material = material;
    }

    /**
     * Retrieves the amount of gold.
     *
     * @return Amount of gold.
     */
    public int getGold() {
        return gold;
    }

    /**
     * Retrieves amount of experience points.
     *
     * @return AMount of experience points.
     */
    public int getXp() {
        return xp;
    }

    /**
     * Retrieves array of craft materials.
     *
     * @return array of craft materials.
     */
    public Material[] getMaterial() {
        return material;
    }

}
