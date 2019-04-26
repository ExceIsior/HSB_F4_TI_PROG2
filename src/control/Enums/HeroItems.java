package control.Enums;

import model.item.HeroItem;

public enum HeroItems 
{
    HEAL_POTION(new HeroItem(0, "Heal Potion", Effects.HEAL.getEffect())),
    AGILITY_POTION(new HeroItem(0, "Agility Potion", Effects.AGILITY_BOOST.getEffect())),
    DAMAGE_POTION(new HeroItem(0, "Damage Potion", Effects.DAMAGE_BOOST.getEffect())),
    ARMOR_POTION(new HeroItem(0, "Armor Potion", Effects.ARMOR_BOOST.getEffect()));
    
    private final HeroItem heroItem;
    
    private HeroItems(HeroItem heroItem)
    {
        this.heroItem = heroItem;
    }
    
    public HeroItem getHeroItem()
    {
        return this.heroItem;
    }
}
