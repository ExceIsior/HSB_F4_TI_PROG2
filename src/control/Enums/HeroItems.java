package control.Enums;

import model.item.HeroItem;

public enum HeroItems {
    HEAL_POTION(new HeroItem(0, "Heal Potion")),
    AGILITY_POTION(new HeroItem(0, "Agility Potion")),
    DAMAGE_POTION(new HeroItem(0, "Damage Potion")),
    ARMOR_POTION(new HeroItem(0, "Armor Potion"));
    
    private final HeroItem heroItem;
    
    private HeroItems(HeroItem heroItem){
        this.heroItem = heroItem;
    }
    
    public HeroItem getHeroItem(){
        return this.heroItem;
    }
}
