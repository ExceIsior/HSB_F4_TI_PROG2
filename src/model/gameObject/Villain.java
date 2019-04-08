package model.gameObject;

import model.Position;
import model.Status;
import model.item.Item;

import java.util.ArrayList;

public class Villain extends Character {

    public Villain(String graphicsPath,
            Position position, 
            int armor, 
            Item loot,
            String name, 
            int healthPoints,
            int maxHealthPoints,
            int agility, 
            ArrayList<Status> status, 
            ArrayList<Skill> skills, 
            int initiative) {
        super(graphicsPath, 
                position, 
                armor, 
                loot, 
                name, 
                healthPoints, 
                maxHealthPoints, 
                agility, 
                status, 
                skills, 
                initiative);
    }
    
}
