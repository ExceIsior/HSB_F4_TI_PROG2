package model.gameObject;

import model.Effect;

/**
 * Skill that characters can use.
 *
 * @author Ismail
 */
public class Skill 
{

    private String name = "";
    private int damageBonus = 0;
    private int dieBonus = 0;
    private int range = 0;
    private int radius = 0;
    private int availability = 0;
    private Effect statusEffect = null;

    /**
     * Initialises a skill object.
     *
     * @param name Name of the skill.
     * @param damageBonus Skill's damage bonus.
     * @param dieBonus Skill's die bonus.
     * @param range Skill's maximum range.
     * @param damageRadius Skill's damage radius.
     * @param availability Skill's availability.
     * @param statusEffect Skill's status effect that can be applied to targets.
     */
    public Skill(String name,
            int damageBonus,
            int dieBonus,
            int range,
            int damageRadius,
            int availability,
            Effect statusEffect) 
    {
        this.name = name;
        this.damageBonus = damageBonus;
        this.dieBonus = dieBonus;
        this.range = range;
        this.availability = availability;
        this.statusEffect = statusEffect;
    }

    /**
     * Retrieves the skill's name.
     *
     * @return Skill's name.
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Retrieves skill's damage bonus.
     *
     * @return skill's damage bonus.
     */
    public int getDamageBonus() 
    {
        return damageBonus;
    }

    /**
     * Retrieves skill's die bonus.
     *
     * @return Skill's die bonus.
     */
    public int getDieBonus() 
    {
        return dieBonus;
    }

    /**
     * Retrieves skill's maximum target range.
     *
     * @return Skill's maximum target range.
     */
    public int getRange() 
    {
        return range;
    }

    /**
     * Retrieves skill's radius.
     *
     * @return Skill's radius.
     */
    public int getRadius() 
    {
        return radius;
    }

    /**
     * Retrieves Skill's availability
     *
     * @return Skill's availability
     */
    public int getAvailability() 
    {
        return availability;
    }

    /**
     * Sets a new value for skill's availability
     *
     * @param availability New value for skill's availability
     */
    public void setAvailability(int availability) 
    {
        this.availability = availability;
    }

}
