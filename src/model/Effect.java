package model;

/**
 * Represents effects that can modify characters' attributes.
 *
 * @author Ismail
 */
public class Effect {

    private String name = "";
    private String description = "";
    private int healthPoints = 0;
    private int maxHealthPoints = 0;
    private int agility = 0;
    private int armor = 0;
    private int baseDamage = 0;
    private int probability = 0;

    /**
     * Initialises effect object.
     *
     * @param name Effect's name
     * @param description Effect's description
     * @param healthPoints Value by which the character's current health points
     * are to be modified.
     * @param maxHealthPoints Value by which the character's max health points
     * are to be modified.
     * @param agility Value by which the character's agility is to be modified.
     * @param armor Value by which the character's armor is to be modified.
     * @param baseDamage Value by which the character's base damage is to be
     * modified.
     * @param probability Probability of the effect to be applied to the target.
     */
    public Effect(String name, String description, int healthPoints, int maxHealthPoints, int agility, int armor, int baseDamage, int probability) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.agility = agility;
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.probability = probability;
    }

    /**
     * Retrieves the effect's name.
     *
     * @return Name of the effect.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the effect's description.
     *
     * @return Description of effect.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the health points modifier.
     *
     * @return health points modifier.
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * Retrieves the max health points modifier.
     *
     * @return Max health points modifier.
     */
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    /**
     * Retrieves the agility modifier.
     *
     * @return Agility modifier.
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Retrieves the armor modifier.
     *
     * @return Armor modifier.
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Retrieves the base damage modifier.
     *
     * @return Base damage modifier.
     */
    public int getBaseDamage() {
        return baseDamage;
    }

    /**
     * Retrieves the probability of the effect to be applied to the target.
     *
     * @return Effect's probability to be applied.
     */
    public int getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return "Effect{" + "name=" + name + ", description=" + description + ", healthPoints=" + healthPoints + ", maxHealthPoints=" + maxHealthPoints + ", agility=" + agility + ", armor=" + armor + ", baseDamage=" + baseDamage + ", probability=" + probability + '}';
    }

}
