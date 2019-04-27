package model.gameObject;

import model.Skill;
import model.Status;
import model.item.Item;
import java.util.List;

/**
 * Villain/enemy that the heroes may fight against.
 *
 * @author Ismail
 */
public class Villain extends Character {

    /**
     * Initialises a Villain object
     *
     * @param graphicsPath Path to the image file that is to be drawn on the
     * screen for the instance.
     * @param armor Armor value of the villain.
     * @param loot Item that this villain can hold which can be retrieved by a
     * Hero upon its death.
     * @param name Name of the villain.
     * @param healthPoints Current Health points of the villain.
     * @param maxHealthPoints Maximum health points that the villain can have.
     * @param agility Maximum distance that the villain can travel per phase.
     * @param status List of statuses that are applied on the villain.
     * @param skills List of skills that the villain can use.
*/
 
    public Villain(String graphicsPath, int armor, Item loot, String name, int healthPoints, int maxHealthPoints, int agility, Status status, List<Skill> skills) {
        super(graphicsPath, armor, loot, name, healthPoints, maxHealthPoints, agility, status, skills);
    }
}
