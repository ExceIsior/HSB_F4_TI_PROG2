package model.gameObject;

import model.Skill;
import model.Status;
import model.item.Item;
import java.util.List;

/**
 * Abstract super class of all game objects that can actively interact and move.
 * @author Ismail
 */
public abstract class Character extends Interactive 
{
    private String name = "";
    private int agility = 0;
    private List<Status> status = null;
    private List<Skill> skills = null;
    private int baseDamage = 0;

    /**
     * Initialises a character object
     * @param graphicsPath  Path to the image file that is to be drawn on the screen for the instance.
     * @param armor Armor value of the character.
     * @param loot  Item that this character can hold which can be retrieved by a Hero upon its death.
     * @param name  Name of the character.
     * @param healthPoints  Current Health points of the character.
     * @param maxHealthPoints   Maximum health points that the character can have.
     * @param agility Maximum distance that the character can travel per phase.
     * @param status List of statuses that are applied on the character.
     * @param skills List of skills that the character can use.
     */
    public Character(String graphicsPath,
            int armor,
            Item loot,
            String name,
            int healthPoints,
            int maxHealthPoints,
            int agility,
            List<Status> status,
            List<Skill> skills) 
    {
        super(graphicsPath, armor, loot, healthPoints, maxHealthPoints);
        this.name = name;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }

//    public void attack(Skill skill, Interactive enemy) {
//        int armorEnemy = enemy.getArmor();
//        int number = DiceController.castDie();
//        int damage = 0;
//        if (number == 20) {
//            damage = skill.getDamageBonus() + 2;
//        } else if ((skill.getDieBonus() + number) >= armorEnemy) {
//            damage = skill.getDamageBonus();
//        }
//        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
//    }

    /**
     * Retrieves the character's Name
     * @return Character' name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Sets the character's name.
     * @param name New name for the character.
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * Retrieves the character's base damage value.
     * @return Character's base damage value.
     */
    public int getBaseDamage() 
    {
        return baseDamage;
    }

    /**
     * Sets the character's base damage value
     * @param baseDamage New base damage value.
     */
    public void setBaseDamage(int baseDamage) 
    {
        if(baseDamage >= 0){
        this.baseDamage = baseDamage;
        }else{
            this.baseDamage = 0;
        }
    }

    /**
     * Retrieves the character's agility.
     * @return Character's agility value.
     */
    public int getAgility() 
    {
        return agility;
    }

    /**
     * Sets character's agility value.
     * @param agility New agility value.
     */
    public void setAgility(int agility) 
    {
                if(agility >= 0){
        this.agility = agility;
        }else{
            this.agility = 0;
        }
    }

    /**
     * Retrieves a List of the statuses the character carries.
     * @return List of character's statuses.
     */
    public List<Status> getStatus() 
    {
        return status;
    }

    /**
     * Sets the character's statuses.
     * @param status New List of statuses.
     */
    public void setStatus(List<Status> status) 
    {
        this.status = status;
    }

    /**
     * Retrieves the List of character's skills.
     * @return List of character's skills.
     */
    public List<Skill> getSkills() 
    {
        return skills;
    }

    /**
     * Sets the character's skills
     * @param skills New List of skills.
     */
    public void setSkills(List<Skill> skills) 
    {
        this.skills = skills;
    }

    
}
