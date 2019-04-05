package model;
import model.gameObject.Character;
public class Effect {

    private String name = "";
    private String description = "";
    private int healthPoints = 0;
    private int maxHealthPoints = 0;
    private int agility = 0;
    private int armor = 0;
    private int baseDamage = 0;
    private int probability = 0;
    private Character target = null;
    
    public Effect(String name, String description, int healthPoints, int maxHealthPoints, int agility, int armor, int baseDamage, int probability){
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.agility = agility;
        this.armor = armor;
        this.baseDamage = baseDamage;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getAgility() {
        return agility;
    }

    public int getArmor() {
        return armor;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getProbability() {
        return probability;
    }
    
    public Character getTarget() {
        return target;
    }
    
//    public void applyEffect() {
//        this.target.setHealthPoints(this.target.getHealthPoints()+this.healthPoints);
//        this.target.setMaxHealthPoints(this.target.getMaxHealthPoints()+this.maxHealthPoints);
//        this.target.setBaseDamage(this.target.getBaseDamage()+this.baseDamage);
//        this.target.setArmor(this.target.getArmor()+this.armor);
//        this.target.setAgility(this.target.getAgility()+this.agility);
//    }
}
