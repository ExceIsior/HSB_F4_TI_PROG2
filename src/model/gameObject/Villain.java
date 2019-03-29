package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import model.item.Item;

public class Villain extends Character {

    public Villain(int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(Constants.VILLAIN_PATH, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
