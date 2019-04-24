package control;

import java.util.Map;
import model.gameObject.Hero;
import model.item.Equipment.Accessory;
import model.item.Equipment.Armor;
import model.item.Equipment.CraftBluePrint;
import model.item.Equipment.Weapon;
import model.item.Material;

public class CraftingController {

    public static void craftEquipment(Hero hero, Weapon equipment) {
        if (enoughMoney(equipment.getCraftBluePrint()) && areMaterialsAvailable(equipment.getCraftBluePrint())) {
            pay(equipment.getCraftBluePrint());
            hero.getEquipmentSet().setEquipment(equipment);
        }
    }

    public static void craftEquipment(Hero hero, Armor equipment) {
        if (enoughMoney(equipment.getCraftBluePrint()) && areMaterialsAvailable(equipment.getCraftBluePrint())) {
            pay(equipment.getCraftBluePrint());
            hero.getEquipmentSet().setEquipment(equipment);
        }
    }

    public static void craftEquipment(Hero hero, Accessory equipment) {
        if (enoughMoney(equipment.getCraftBluePrint()) && areMaterialsAvailable(equipment.getCraftBluePrint())) {
            pay(equipment.getCraftBluePrint());
            hero.getEquipmentSet().setEquipment(equipment);
        }
    }

    public static void pay(CraftBluePrint craftBluePrint) {
        craftBluePrint.getCraftMaterials().entrySet().forEach((craftMaterial) -> {
            PlayerManager.getInstance().getPlayer().getInventory().addQuantity(craftMaterial.getKey(), -craftMaterial.getValue());
        });
        PlayerManager.getInstance().getPlayer().addGold(-craftBluePrint.getCost());
    }

    private static boolean areMaterialsAvailable(CraftBluePrint craftBluePrint) {
        boolean materialsAvailable = true;
        for (Map.Entry<Material, Integer> craftMaterial : craftBluePrint.getCraftMaterials().entrySet()) {
            if (PlayerManager.getInstance().getPlayer().getInventory().getItemCount(craftMaterial.getKey()) < craftMaterial.getValue()) {
                return false;
            }
        }
        return true;
    }

    private static boolean enoughMoney(CraftBluePrint craftBluePrint) {
        return PlayerManager.getInstance().getPlayer().getGold() >= craftBluePrint.getCost();
    }

}
