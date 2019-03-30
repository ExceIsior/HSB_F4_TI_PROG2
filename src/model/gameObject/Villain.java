package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import model.Position;
import model.item.Item;

public class Villain extends Character {

    public Villain(String graphicsPath, Position position, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
