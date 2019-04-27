package control;

import control.Constants.DungeonConst;
import control.Constants.ErrorConst;
import control.Constants.MenuConst;
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
import view.ConsoleMenu.CraftingMenu;
import view.ConsoleMenu.DungeonMenu;
import view.ConsoleMenu.GameMenu;
import view.ConsoleMenu.MainMenu;

/**
 * This singleton class holds and generates the game's menus.
 *
 * @author Ismail
 */
public class MenuManager {

    private MainMenu mainMenu = null;
    private GameMenu gameMenu = null;
    private DungeonMenu dungeonMenu = null;
    private CraftingMenu craftMenu = null;
//    private Menu craftingMenuHeroSelection = null;
//    private Menu craftingMenuEquipmentTypeSelection = null;

    /**
     * Instantiates the constant Menus.
     */
    public MenuManager() {
        this.mainMenu = new MainMenu();
        this.gameMenu = new GameMenu();
        this.dungeonMenu = new DungeonMenu();
        this.craftMenu = new CraftingMenu();
//        this.mainMenu = this.initMainMenu();
//        this.gameMenu = this.initGameMenu();
//        this.dungeonMenu = this.initDungeonMenu();
//        this.craftingMenuHeroSelection = this.initCraftingMenuHeroSelect();
//        this.craftingMenuEquipmentTypeSelection = this.initCraftingMenuEquipmentTypeSelection();
    }

    /**
     * Prints the main menu and prompts user to navigate through the menus.
     */
    public void promptMainMenu() {
        switch (this.mainMenu.getMainMenu().promptMenu()) {
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

    /**
     * Prints the game menu and prompts user to further navigate through the
     * menus.
     */
    private void promptGameMenu() {
        switch (this.gameMenu.getGameMenu().promptMenu()) {
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

    /**
     * Prints all available dungeons and prompts user to select a dungeon to
     * play.
     */
    private void promptDungeonMenu() {
        new GameController(this.dungeonMenu.getMainMenu().promptMenu()).start();
    }

    /**
     * Prints the first layer of the crafting menu and prompts user to select a
     * hero.
     */
    private void promptCraftingMenuHeroSelection() {
        this.promptCraftingMenuEquipmentSelection(this.craftMenu.getHeroSelect().promptMenu());
    }

    /**
     * Prints the second layer of the crafting menu and prompts user to select a
     * equipment type.
     *
     * @param heroID Selected hero id to craft equipment for
     */
    private void promptCraftingMenuEquipmentSelection(int heroID) {
        switch (this.craftMenu.getEquipmentTypeSelect().promptMenu()) {
            case 0:
                this.promptCraftingMenuWeapon(heroID);
                break;
            case 1:
                this.promptCraftingMenuArmor(heroID);
                break;
            case 2:
                this.promptCraftingMenuAccessory(heroID);
                break;
        }
    }
    
    /**
     * Prints crafting menu to craft weapons for specified hero.
     *
     * @param hero Selected hero id to craft a weapon
     */
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

    /**
     * Prints crafting menu to craft armor for specified hero.
     *
     * @param hero Selected hero id to craft an armor
     */
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

    /**
     * Prints crafting menu to craft accessory for specified hero.
     *
     * @param hero Selected hero id to craft an accessory
     */
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

    /**
     * Returns the singleton instance.
     *
     * @return PlayerManager object.
     */
    public static MenuManager getInstance() {
        return MenuManagerHolder.INSTANCE;
    }

    /**
     * Inner class holding the singleton object
     */
    private static class MenuManagerHolder {

        private static final MenuManager INSTANCE = new MenuManager();
    }
}































//
//    /**
//     * Initialises the main menu
//     *
//     * @return Main menu
//     */
//    private Menu initMainMenu() {
//        return new Menu(
//                MenuConst.MAIN_MENU_TITLE,
//                MenuConst.MAIN_MENU_NEW_GAME,
//                MenuConst.MAIN_MENU_LOAD_GAME,
//                MenuConst.MAIN_MENU_QUIT);
//    }
//
//    /**
//     * Initialises the game menu
//     *
//     * @return Game menu
//     */
//    private Menu initGameMenu() {
//        return new Menu(
//                MenuConst.GAME_MENU_TITLE,
//                MenuConst.GAME_MENU_SELECT_DUNGEON,
//                MenuConst.GAME_MENU_CRAFTING,
//                MenuConst.GAME_MENU_SAVE_GAME,
//                MenuConst.RETURN_TO_MAIN_MENU);
//    }
//
//    /**
//     * Initialises the dungeon selection menu
//     *
//     * @return Dungeon menu
//     */
//    private Menu initDungeonMenu() {
//        String[] dungeons = new String[DungeonConst.class.getDeclaredFields().length];
//        for (int i = 0; i < dungeons.length; i++) {
//            try {
//                dungeons[i] = (String) DungeonConst.class.getDeclaredFields()[i].get(null);
//            } catch (IllegalArgumentException | IllegalAccessException e) {
//                System.err.println(ErrorConst.DUNGEON_NAME_COULD_NOT_BE_ACCESSED);
//                dungeons[i] = "Dungeon " + i;
//            }
//        }
//        return new Menu(MenuConst.DUNGEON_MENU_TITLE, dungeons);
//    }
//
//    /**
//     * Initialises the first layer of the crafting menu where the hero has to be
//     * selected for which a new equipment part should be crafted.
//     *
//     * @return First layer of crafting menu (Hero Select)
//     */
//    private Menu initCraftingMenuHeroSelect() {
//        String[] heroes = new String[HeroManager.getInstance().getHeroes().length];
//        for (int i = 0; i < heroes.length; i++) {
//            heroes[i] = HeroManager.getInstance().getHeroes()[i].getName();
//        }
//        return new Menu(MenuConst.CRAFTING_MENU_TITLE, heroes);
//    }
//
//    /**
//     * Initialises the second layer of the crafting menu where the equipment
//     * type has to be selected.
//     *
//     * @return Second layer of crafting menu (Equipment Type Select)
//     */
//    private Menu initCraftingMenuEquipmentTypeSelection() {
//        return new Menu(MenuConst.CRAFTING_MENU_TITLE,
//                MenuConst.CRAFTING_MENU_WEAPON,
//                MenuConst.CRAFTING_MENU_ARMOR,
//                MenuConst.CRAFTING_MENU_ACCESSORY);
//    }











