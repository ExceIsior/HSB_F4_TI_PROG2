package view.ConsoleMenu;

import control.Constants.MenuConst;
import control.Enums.Weapons;
import control.HeroManager;
import java.util.ArrayList;
import java.util.List;
import model.Menu;
import model.item.Equipment.Weapon;

public class CraftingMenu {

    private Menu heroSelect = null;
    private Menu equipmentTypeSelect = null;
    private Menu craftMenu = null;

    public CraftingMenu() {
        this.heroSelect = this.initHeroSelect();
        this.equipmentTypeSelect = this.initEquipmentTypeSelect();
        this.craftMenu = new Menu("", "");
    }

    /**
     * Initialises the first layer of the crafting menu where the hero has to be
     * selected for which a new equipment part should be crafted.
     *
     * @return First layer of crafting menu (Hero Select)
     */
    private Menu initHeroSelect() {
        String[] heroes = new String[HeroManager.getInstance().getHeroes().length];
        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = HeroManager.getInstance().getHeroes()[i].getName();
        }
        return new Menu(MenuConst.CRAFTING_MENU_HERO_SELECT, heroes);
    }

    /**
     * Initialises the second layer of the crafting menu where the equipment
     * type has to be selected.
     *
     * @return Second layer of crafting menu (Equipment Type Select)
     */
    private Menu initEquipmentTypeSelect() {
        return new Menu(MenuConst.CRAFTING_MENU_EQUIPMENT_TYPE_SELECT,
                MenuConst.CRAFTING_MENU_WEAPON,
                MenuConst.CRAFTING_MENU_ARMOR,
                MenuConst.CRAFTING_MENU_ACCESSORY);
    }

    private Menu initWeaponCraftMenu(int heroID) {
        List<Weapon> compatibleWeapons = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Weapons weapon : Weapons.values()) {
            if (weapon.getWeapon().getCompatibleHeroID() == heroID) {
                compatibleWeapons.add(weapon.getWeapon());
                menuEntries.add(weapon.getWeapon().toString());
            }
        }
        return new Menu(
                String.format(
                        MenuConst.CRAFTING_MENU_TITLE,
                        HeroManager.getInstance().getHeroes()[heroID].getName(),
                        MenuConst.CRAFTING_MENU_WEAPON),
                menuEntries.toArray(String[]::new));
    }

    private Menu initArmorCraftMenu(int heroID) {
        List<Weapon> compatibleWeapons = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Weapons weapon : Weapons.values()) {
            if (weapon.getWeapon().getCompatibleHeroID() == heroID) {
                compatibleWeapons.add(weapon.getWeapon());
                menuEntries.add(weapon.getWeapon().toString());
            }
        }
        return new Menu(
                String.format(
                        MenuConst.CRAFTING_MENU_TITLE,
                        HeroManager.getInstance().getHeroes()[heroID].getName(),
                        MenuConst.CRAFTING_MENU_ARMOR),
                menuEntries.toArray(String[]::new));
    }

    private Menu initAccessoryCraftMenu(int heroID) {
        List<Weapon> compatibleWeapons = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Weapons weapon : Weapons.values()) {
            if (weapon.getWeapon().getCompatibleHeroID() == heroID) {
                compatibleWeapons.add(weapon.getWeapon());
                menuEntries.add(weapon.getWeapon().toString());
            }
        }
        return new Menu(
                String.format(
                        MenuConst.CRAFTING_MENU_TITLE,
                        HeroManager.getInstance().getHeroes()[heroID].getName(),
                        MenuConst.CRAFTING_MENU_ACCESSORY),
                menuEntries.toArray(String[]::new));
    }

    public Menu getHeroSelect() {
        return heroSelect;
    }

    public Menu getEquipmentTypeSelect() {
        return equipmentTypeSelect;
    }

    public Menu getCraftMenu(int heroID, int equipmentTypeID) {
        switch (equipmentTypeID) {
            case 0:
                this.craftMenu = initWeaponCraftMenu(heroID);
                break;
            case 1:
                this.craftMenu = initArmorCraftMenu(heroID);
                break;
            case 2:
                this.craftMenu = initAccessoryCraftMenu(heroID);
                break;
        }
        return this.craftMenu;
    }

}
