package model.gameObject;

import java.util.ArrayList;
import model.item.Item;

public class Villain extends Character {

    public Villain(String graphicsPath, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
