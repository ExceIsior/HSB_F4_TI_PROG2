package control.Enums;

import control.Constants.HeroConst;
import control.Constants.ItemConst;
import model.item.Equipment.Weapon;
import control.Constants.WeaponConst;

/**
 * This enumeration holds weapons for all heroes.
 * @author Ismail
 */
public enum Weapons {
    RUSTY_LONG_SWORD(new Weapon(
            ItemConst.COMMON,
            WeaponConst.RUSTY_SWORD_NAME,
            Effects.RUSTY_SWORD.getEffect(),
            CraftBluePrints.COMMON_WEAPON.getCraftBluePrint(),
            HeroConst.PALADIN_ID)),
    IRON_SWORD(new Weapon(
            ItemConst.RARE,
            WeaponConst.IRON_SWORD_NAME,
            Effects.IRON_SWORD.getEffect(),
            CraftBluePrints.RARE_WEAPON.getCraftBluePrint(),
            HeroConst.PALADIN_ID));

    private Weapon weapon;

    private Weapons(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Returns the weapon instance
     * @return Instance of selected weapon
     */
    public Weapon getWeapon() {
        return this.weapon;
    }
}
