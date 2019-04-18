package control.Enums;

import control.Constants.ItemConst;
import control.Constants.WeaponConst;
import model.item.Equipment.Weapon;

public enum Weapons {
    RUSTY_LONG_SWORD(new Weapon(
            ItemConst.COMMON,
            WeaponConst.RUSTY_SWORD_NAME,
            CraftBluePrints.COMMON_WEAPON.getCraftBluePrint()));

    private Weapon weapon;

    private Weapons(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
