package model.gameObject;

import java.util.ArrayList;
import model.Position;
import model.item.Item;

public class Character extends Interactive {
    private String name = "";
    private int HealthPoints = 0;
    private int agility = 0;
    private ArrayList<Status> status = null;
    private ArrayList<Skill> skills = null;
    

    public Character(String graphicsPath, Position position, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, damage, armor, loot);
        this.name = name;
        this.HealthPoints = HealthPoints;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }

}
