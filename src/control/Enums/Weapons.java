package control.Enums;

import model.item.Equipment.Weapon;

public enum Weapons {
    RUSTY_LONG_SWORD(new Weapon(, name, effect, 0, materials));

    private Weapon weapon;

    private Weapons(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
