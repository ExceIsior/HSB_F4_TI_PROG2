package model.gameObject;

import java.util.ArrayList;
import model.Position;
import model.item.Item;
import control.Constants.Const;

public class Villain extends Character {

    public Villain(String graphicsPath, Position position, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
