package control;

import model.item.HeroItem;

public enum HeroItems {
    HealPotion(new HeroItem(0, "Heal Potion")),
    AgilityPotion(new HeroItem(0, "Agility Potion")),
    DamagePotion(new HeroItem(0, "Damage Potion")),
    ArmorPotion(new HeroItem(0, "Armor Potion"));
    
    private final HeroItem heroItem;
    
    private HeroItems(HeroItem heroItem){
        this.heroItem = heroItem;
    }
    
    public HeroItem getHeroItem(){
        return this.heroItem;
    }
}
