
package model.gameObject;

import java.util.ArrayList;
import java.util.List;
import model.Status;
import model.item.Item;

/**
 * Game object that represents a boss.
 * @author Ismail
 */
public class Boss extends Villain {

    /**
     * Initialises a Boss object
     * @param graphicsPath  Path to the image file that is to be drawn on the screen for the instance.
     * @param armor Armor value of the boss.
     * @param loot  Item that this boss can hold which can be retrieved by a Hero upon its death.
     * @param name  Name of the boss.
     * @param healthPoints  Current Health points of the boss.
     * @param maxHealthPoints   Maximum health points that the boss can have.
     * @param agility Maximum distance that the boss can travel per phase.
     * @param status List of statuses that are applied on the boss.
     * @param skills List of skills that the boss can use.
     */
    public Boss(String graphicsPath,  
            int armor, 
            Item loot, 
            String name,
            int healthPoints, 
            int maxHealthPoints,
            int agility, 
            List<Status> status,
            List<Skill> skills) {
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
