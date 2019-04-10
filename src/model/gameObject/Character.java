package model.gameObject;

import control.Constants.Const;
import java.util.ArrayList;
import model.Position;
import model.Status;
import model.item.Item;

public class Character extends Interactive {

    private String name = "";
    private int agility = 0;
    private ArrayList<Status> status = null;
    private ArrayList<Skill> skills = null;
    private int baseDamage = 0;

    public Character(String graphicsPath,
            int armor,
            Item loot,
            String name,
            int healthPoints,
            int maxHealthPoints,
            int agility,
            ArrayList<Status> status,
            ArrayList<Skill> skills) {
        super(graphicsPath, armor, loot, healthPoints, maxHealthPoints, Const.HEIGHT_CHARACTER);
        this.name = name;
        this.agility = agility;
        this.status = status;
        this.skills = skills;
    }

//    public void attack(Skill skill, Interactive enemy) {
//        int armorEnemy = enemy.getArmor();
//        int number = DiceController.castDie();
//        int damage = 0;
//        if (number == 20) {
//            damage = skill.getDamageBonus() + 2;
//        } else if ((skill.getDieBonus() + number) >= armorEnemy) {
//            damage = skill.getDamageBonus();
//        }
//        enemy.setHealthPoints(enemy.getHealthPoints() - damage);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        if(baseDamage >= 0){
        this.baseDamage = baseDamage;
        }else{
            this.baseDamage = 0;
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
                if(agility >= 0){
        this.agility = agility;
        }else{
            this.agility = 0;
        }
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
