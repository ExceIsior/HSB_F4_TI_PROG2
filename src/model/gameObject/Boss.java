
package model.gameObject;

import java.util.ArrayList;
import model.Position;
import model.item.Item;
import control.Constants.Const;


public class Boss extends Villain {

    public Boss(String graphicsPath, Position position, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
    
}
