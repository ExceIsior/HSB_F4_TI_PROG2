package model.gameObject;

import model.Position;
import model.Status;
import model.item.Item;

import java.util.ArrayList;

public class Villain extends Character {

    public Villain(String graphicsPath,
            int armor, 
            Item loot,
            String name, 
            int healthPoints,
            int maxHealthPoints,
            int agility, 
            ArrayList<Status> status, 
            ArrayList<Skill> skills) {
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
