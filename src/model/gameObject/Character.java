package model.gameObject;

import control.Constants.Const;
import control.DiceController;
import java.util.ArrayList;
import model.Position;
import model.item.Item;

public class Character extends Interactive {
    private String name = "";
    private int agility = 0;
    private ArrayList<Status> status = null;
    private ArrayList<Skill> skills = null;
    private int baseDamage = 0;

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    

    public Character(String graphicsPath, Position position, int armor, Item loot, String name, int healthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(graphicsPath, position, armor, loot, healthPoints, Const.HEIGHT_CHARACTER);
        this.name = name;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }
    
    public void attack(Skill skill, Interactive enemy) {
        int armorEnemy = enemy.getArmor();
        int number = DiceController.castDie();
        int damage = 0;
        if (number == 20) {
            damage = skill.getDamageBonus() + 2;
        }
        else if ( (skill.getDieBonus() + number) >= armorEnemy) {
           damage = skill.getDamageBonus();
        }
        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
