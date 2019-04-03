package model.gameObject;

import control.DiceController;
import java.util.ArrayList;
import model.Position;
import model.item.Item;

public class Character extends Interactive {
    private String name = "";
    private int healthPoints = 0;
    private int agility = 0;
    private ArrayList<Status> status = null;
    private ArrayList<Skill> skills = null;
    

    public Character(String graphicsPath, Position position, int damage, int armor, Item loot, String name, int healthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, damage, armor, loot, healthPoints);
        this.name = name;
        this.healthPoints = healthPoints;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }
    
    public void attack(Skill skill, Interactive enemy) {
        int armorEnemy = enemy.getArmor();
        int number = DiceController.castDie();
        int damage = 0;
        if (number == 20) {
            damage = skill.getDamage() + 2;
        }
        else if ( (skill.getDieBonus() + number) >= armorEnemy) {
           damage = skill.getDamage();
        }
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int HealthPoints) {
        this.healthPoints = HealthPoints;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public ArrayList<Status> getStatus() {
        return status;
    }

    public void setStatus(ArrayList<Status> status) {
        this.status = status;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    
    
}
