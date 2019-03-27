package model.gameObject;

import java.util.ArrayList;
import model.item.Item;

public class Character extends Interactive {
    private String name = "";
    private int HealthPoints = 0;
    private int agility = 0;
    private ArrayList<Status> status = null;
    private ArrayList<Skill> skills = null;

    public Character(int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(damage, armor, loot);
        this.name = name;
        this.HealthPoints = HealthPoints;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }

}
