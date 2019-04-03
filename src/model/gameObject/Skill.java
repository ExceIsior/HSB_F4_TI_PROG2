package model.gameObject;

import java.util.HashMap;

class Skill {

    private String name = "";
    private int damageBonus = 0;
    private int dieBonus = 0;
    private int range = 0;
    private int radius = 0;
    private int availability = 0;

    public Skill(String name, int damage, int dieBonus, int range, int damageRadius, int availability) {
        this.name = name;
        this.damageBonus = damageBonus;
        this.dieBonus = dieBonus;
        this.range = range;
        this.availability = availability;
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
