
package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import model.Position;
import model.item.Item;


public class Boss extends Villain {

    public Boss(Position position, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(position, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
