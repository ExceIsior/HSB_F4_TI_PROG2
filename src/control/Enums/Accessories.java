package control.Enums;

import control.Constants.AccessoryConst;
import control.Constants.HeroConst;
import control.Constants.ItemConst;
import model.item.Equipment.Weapon;
import control.Constants.WeaponConst;
import model.item.Equipment.Accessory;

public enum Accessories {
    RUSTY_TALISMAN(new Accessory(
            ItemConst.COMMON,
            AccessoryConst.RUSTY_TALISMAN_NAME,
            Effects.RUSTY_SWORD.getEffect(),
            CraftBluePrints.COMMON_ACCESSORY.getCraftBluePrint(),
            HeroConst.PALADIN_ID)),
    IRON_TALISMAN(new Accessory(
            ItemConst.RARE,
            AccessoryConst.IRON_TALISMAN_NAME,
            Effects.IRON_SWORD.getEffect(),
            CraftBluePrints.RARE_WEAPON.getCraftBluePrint(),
            HeroConst.PALADIN_ID));

    private Accessory accessory;

    private Accessories(Accessory accessory) {
        this.accessory = accessory;
    }

    public Accessory getAccessory() {
        return this.accessory;
    }
}
