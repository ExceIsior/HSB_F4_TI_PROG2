package model.gameObject;

import model.Skill;
import model.Status;
import model.item.Item;
import java.util.List;

/**
 * Game object that represents a villain.
 */
public class Villain extends Character 
{
    /**
     * Initialises a villain object.
     */
    public Villain(String graphicsPath,
            int armor, 
            Item loot,
            String name, 
            int healthPoints,
            int maxHealthPoints,
            int agility, 
            List<Status> status, 
            List<Skill> skills) 
    {
        super(graphicsPath, 
                armor, 
                loot, 
                name, 
                healthPoints, 
                maxHealthPoints, 
                agility, 
                status, 
                skills);
    }
    
}
