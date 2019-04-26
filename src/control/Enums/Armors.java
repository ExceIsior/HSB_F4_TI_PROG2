package control.Enums;

import control.Constants.ArmorConst;
import control.Constants.HeroConst;
import control.Constants.ItemConst;
import model.item.Equipment.Armor;
import control.Constants.WeaponConst;

public enum Armors 
{
    RUSTY_PLATE_ARMOR(new Armor(
            ItemConst.COMMON,
            ArmorConst.RUSTY_PLATE_ARMOR_NAME,
            Effects.RUSTY_SWORD.getEffect(),
            CraftBluePrints.COMMON_WEAPON.getCraftBluePrint(),
            HeroConst.PALADIN_ID)),
    IRON_PLATE_ARMOR(new Armor(
            ItemConst.RARE,
            ArmorConst.IRON_PLATE_ARMOR_NAME,
            Effects.IRON_SWORD.getEffect(),
            CraftBluePrints.RARE_ARMOR.getCraftBluePrint(),
            HeroConst.PALADIN_ID));

    private Armor armor;

    private Armors(Armor armor) 
    {
        this.armor = armor;
    }

    public Armor getArmor() 
    {
        return this.armor;
    }
}
