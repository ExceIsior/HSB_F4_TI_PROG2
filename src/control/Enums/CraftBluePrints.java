package control.Enums;

import control.Constants.CraftBluePrintConst;
import java.util.HashMap;
import model.item.Equipment.CraftBluePrint;
import model.item.Material;

public enum CraftBluePrints {

    COMMON_WEAPON(new CraftBluePrint(
            new HashMap<Material, Integer>() {
        {
            put(Materials.IRON.getMaterial(), 10);
            put(Materials.SILVER.getMaterial(), 2);
        }
    },
            CraftBluePrintConst.COMMON_WEAPON_COST));

    private CraftBluePrint craftBluePrint;

    private CraftBluePrints(CraftBluePrint craftBluePrint) {
        this.craftBluePrint = craftBluePrint;
    }

    public CraftBluePrint getCraftBluePrint() {
        return this.craftBluePrint;
    }
}
