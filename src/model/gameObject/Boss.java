
package model.gameObject;

import java.util.ArrayList;
import model.Position;
import model.Status;
import model.item.Item;


public class Boss extends Villain {

    public Boss(String graphicsPath, 
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
