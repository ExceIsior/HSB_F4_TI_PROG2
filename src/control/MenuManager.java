package control;

import control.Constants.MenuConst;
import model.Factories.DungeonFactory;
import control.Enums.Weapons;
import java.util.ArrayList;
import java.util.List;
import model.Menu;
import model.item.Equipment.Accessory;
import model.item.Equipment.Armor;
import model.item.Equipment.Weapon;
import utilities.IOHelper;
import control.Enums.Accessories;
import control.Enums.Armors;

public class MenuManager {

    private Menu mainMenu = null;
    private Menu gameMenu = null;
    private Menu dungeonMenu = null;
    private Menu craftingMenuHeroSelection = null;
    private Menu craftingMenuEquipmentTypeSelection = null;

    public MenuManager() {
        this.mainMenu = this.initMainMenu();
        this.gameMenu = this.initGameMenu();
        this.dungeonMenu = this.initDungeonMenu();
        this.craftingMenuHeroSelection = this.initCraftingMenuHeroSelect();
        this.craftingMenuEquipmentTypeSelection = this.initCraftingMenuEquipmentTypeSelection();
    }

    private Menu initMainMenu() {
        return new Menu(
                MenuConst.MAIN_MENU_TITLE,
                MenuConst.MAIN_MENU_NEW_GAME,
                MenuConst.MAIN_MENU_LOAD_GAME,
                MenuConst.MAIN_MENU_QUIT);
    }

    private Menu initGameMenu() {
        return new Menu(
                MenuConst.GAME_MENU_TITLE,
                MenuConst.GAME_MENU_SELECT_DUNGEON,
                MenuConst.GAME_MENU_CRAFTING,
                MenuConst.GAME_MENU_SAVE_GAME,
                MenuConst.RETURN_TO_MAIN_MENU);
    }

    private Menu initDungeonMenu() {
        String[] dungeons = new String[DungeonFactory.values().length];
        for (int i = 0; i < dungeons.length; i++) {
            dungeons[i] = DungeonFactory.values()[i].getDungeon().getTitle();
        }
        return new Menu(MenuConst.DUNGEON_MENU_TITLE, dungeons);
    }

    private Menu initCraftingMenuHeroSelect() {
        String[] heroes = new String[HeroManager.getInstance().getHeroes().length];
        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = HeroManager.getInstance().getHeroes()[i].getName();
        }
        return new Menu(MenuConst.CRAFTING_MENU_TITLE, heroes);
    }

    private Menu initCraftingMenuEquipmentTypeSelection() {
        return new Menu(MenuConst.CRAFTING_MENU_TITLE,
                MenuConst.CRAFTING_MENU_WEAPON,
                MenuConst.CRAFTING_MENU_ARMOR,
                MenuConst.CRAFTING_MENU_ACCESSORY);
    }

    public void promptMainMenu() {
        switch (this.mainMenu.promptMenu()) {
            case 0:
                this.promptGameMenu();
                break;
            case 1:
                IOHelper.loadGame();
                this.promptGameMenu();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    private void promptGameMenu() {
        switch (this.gameMenu.promptMenu()) {
            case 0:
                this.promptDungeonMenu();
                break;
            case 1:
                this.promptCraftingMenuHeroSelection();
                break;
            case 2:
                IOHelper.saveGame();
                this.promptGameMenu();
                break;
        }
    }

    private void promptDungeonMenu() {
        System.out.println(DungeonFactory.values()[this.dungeonMenu.promptMenu()].getDungeon().getTitle());
    }

    private void promptCraftingMenuHeroSelection() {
        this.promptCraftingMenuEquipmentSelection(this.craftingMenuHeroSelection.promptMenu());
    }

    private void promptCraftingMenuEquipmentSelection(int hero) {
        switch (this.craftingMenuEquipmentTypeSelection.promptMenu()) {
            case 0:
                this.promptCraftingMenuWeapon(hero);
                break;
            case 1:
                this.promptCraftingMenuArmor(hero);
                break;
            case 2:
                this.promptCraftingMenuAccessory(hero);
                break;
        }
    }

    private void promptCraftingMenuWeapon(int hero) {
        List<Weapon> compatibleWeapons = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Weapons weapon : Weapons.values()) {
            if (weapon.getWeapon().getCompatibleHeroID() == hero) {
                compatibleWeapons.add(weapon.getWeapon());
                menuEntries.add(weapon.getWeapon().toString());
            }
        }
        CraftingController.craftEquipment(
                HeroManager.getInstance().getHeroes()[hero],
                compatibleWeapons.get(new Menu(MenuConst.CRAFTING_MENU_TITLE, menuEntries.toArray(String[]::new)).promptMenu()));
    }

    private void promptCraftingMenuArmor(int hero) {
        List<Armor> compatibleArmors = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Armors armor : Armors.values()) {
            if (armor.getArmor().getCompatibleHeroID() == hero) {
                compatibleArmors.add(armor.getArmor());
                menuEntries.add(armor.getArmor().toString());
            }
        }
        CraftingController.craftEquipment(
                HeroManager.getInstance().getHeroes()[hero],
                compatibleArmors.get(new Menu(MenuConst.CRAFTING_MENU_TITLE, menuEntries.toArray(String[]::new)).promptMenu()));
    }

    private void promptCraftingMenuAccessory(int hero) {
        List<Accessory> compatibleAccessories = new ArrayList<>();
        List<String> menuEntries = new ArrayList<>();
        for (Accessories accessory : Accessories.values()) {
            if (accessory.getAccessory().getCompatibleHeroID() == hero) {
                compatibleAccessories.add(accessory.getAccessory());
                menuEntries.add(accessory.getAccessory().toString());
            }
        }
        CraftingController.craftEquipment(
                HeroManager.getInstance().getHeroes()[hero],
                compatibleAccessories.get(new Menu(MenuConst.CRAFTING_MENU_TITLE, menuEntries.toArray(String[]::new)).promptMenu()));
    }

    public static MenuManager getInstance() {
        return MenuManagerHolder.INSTANCE;
    }

    private static class MenuManagerHolder {

        private static final MenuManager INSTANCE = new MenuManager();
    }
}
