package model.gameObject;

class Skill
{
    String name = "";
    int damage = 0;
    int dieBonus = 0;
    int range = 0;
    
    public Skill(String name, int damage, int dieBonus, int range){
        this.name = name;
        this.damage = damage;
        this.dieBonus = dieBonus;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getDieBonus() {
        return dieBonus;
    }
    
    public int getRange() {
        return range;
    }
    
    
}
