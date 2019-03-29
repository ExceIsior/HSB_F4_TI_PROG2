
package model.gameObject;

import java.util.ArrayList;
import model.item.Item;


public class Boss extends Villain {

    public Boss(String graphicsPath, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
