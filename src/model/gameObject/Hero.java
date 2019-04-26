package model.gameObject;

import model.Status;
import model.Skill;
import model.Status;
import model.item.Inventory;
import model.item.Item;
import java.util.List;
import model.item.Equipment.EquipmentSet;
import model.item.HeroItem;

/**
 * Character played and progressed by the player.
 *
 * @author Ismail
 */
public class Hero extends Character {
    private EquipmentSet equipmentSet = null;
    private Inventory<HeroItem> inventory = null;

    /**
     * Initialises a character object.
     *
     * @param graphicsPath Path to the image file that is to be drawn on the
     * screen for the instance
     * @param armor Armor value of the character
     * @param name Name of the hero
     * @param healthPoints Current Health points of the hero
     * @param maxHealthPoints Maximum health points that the hero can have
     * @param agility Maximum distance that the hero can travel per phase
     * @param status List of statuses that are applied on the hero
     * @param skills List of skills that the hero can use
     * @param inventory Inventory of the hero
     * @param equipmentSet Equipment set of the hero
     */
    public Hero(String graphicsPath,
            int armor,
            String name,
            int healthPoints,
            int maxHealthPoints,
            int agility,
            List<Status> status,
            List<Skill> skills,
            Inventory<HeroItem> inventory,
            EquipmentSet equipmentSet) {
        super(graphicsPath,
                armor,
                null,
                name,
                healthPoints,
                maxHealthPoints,
                agility,
                status,
                skills);
        this.inventory = inventory;
        this.equipmentSet = equipmentSet;
    }

    /**
     * Returns the hero's equipment set.
     * @return Hero's equipment set
     */
    public EquipmentSet getEquipmentSet() 
    {
        return equipmentSet;
    }
    
    /**
     * Returns the hero's inventory
     * @return Hero's inventory
     */
    public Inventory<HeroItem> getInventory() {
        return this.inventory;
    }

    @Override
    public String toString() {
        return this.getGraphicsPath();
    }
}
