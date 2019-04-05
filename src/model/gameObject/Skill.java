package model.gameObject;

import java.util.HashMap;
import model.Effect;

public class Skill {

    private String name = "";
    private int damageBonus = 0;
    private int dieBonus = 0;
    private int range = 0;
    private int radius = 0;
    private int availability = 0;
    private Effect statusEffect = null;
    
    public Skill(String name, int damageBonus, int dieBonus, int range, int damageRadius, int availability, Effect statusEffect) {
        this.name = name;
        this.damageBonus = damageBonus;
        this.dieBonus = dieBonus;
        this.range = range;
        this.availability = availability;
        this.statusEffect = statusEffect;
    }

    public String getName() {
        return name;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public int getDieBonus() {
        return dieBonus;
    }

    public int getRange() {
        return range;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

}
