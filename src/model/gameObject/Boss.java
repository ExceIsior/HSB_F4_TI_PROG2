
package model.gameObject;

import java.util.ArrayList;
import model.Position;
import model.Status;
import model.item.Item;


public class Boss extends Villain {

    public Boss(String graphicsPath,  
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
