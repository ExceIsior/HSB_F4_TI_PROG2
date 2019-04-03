package model.gameObject;

class Skill
{
    private String name = "";
    private int damageBonus = 0;
    private int dieBonus = 0;
    private int range = 0;
    
    public Skill(String name, int damage, int dieBonus, int range){
        this.name = name;
        this.damageBonus = damageBonus;
        this.dieBonus = dieBonus;
        this.range = range;
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
    
    
}
