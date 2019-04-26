package model.gameObject;

import model.Position;
import model.Status;
import model.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Villain extends Character {

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
