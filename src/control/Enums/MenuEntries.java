package control.Enums;

import control.HeroManager;
import model.MenuEntry;
import utilities.IOHelper;

public enum MenuEntries {
    MAIN_MENU_START_NEW_GAME(new MenuEntry("Start New Game", () -> Menus.GAME_MENU.getMenu().promptMenu())),
    MAIN_MENU_LOAD_GAME(new MenuEntry("Load Game", () -> {
        IOHelper.loadGame();
        Menus.GAME_MENU.getMenu().promptMenu();
    })),
    MAIN_MENU_QUIT(new MenuEntry("Quit", () -> System.exit(0))),
    GAME_MENU_SELECT_DUNGEON(new MenuEntry("Select Dungeon", () -> Menus.DUNGEON_MENU.getMenu().promptMenu())),
    GAME_MENU_SAVE_GAME(new MenuEntry("Save Game", () -> {
        IOHelper.saveGame();
        Menus.GAME_MENU.getMenu().promptMenu();
    })),
    GAME_MENU_CHANGE_EQUIPMENT(new MenuEntry("Crafting", () -> Menus.CRAFTING_MENU.getMenu().promptMenu())),
    DUNGEON_MENU_DUNGEON_1(new MenuEntry("Dungeon 1", () -> System.out.println("Starting Dungeon 1"))),
    DUNGEON_MENU_DUNGEON_2(new MenuEntry("Dungeon 2", () -> System.out.println("Starting Dungeon 2"))),
    DUNGEON_MENU_DUNGEON_3(new MenuEntry("Dungeon 3", () -> System.out.println("Starting Dungeon 3"))),
    RETURN_TO_MAIN_MENU(new MenuEntry("Return To Main Menu", () -> Menus.MAIN_MENU.getMenu().promptMenu())),
    RETURN_TO_GAME_MENU(new MenuEntry("Return To Game Menu", () -> Menus.GAME_MENU.getMenu().promptMenu()));

    private MenuEntry menuEntry;

    private MenuEntries(MenuEntry menuEntry) {
        this.menuEntry = menuEntry;
    }

    public MenuEntry getMenuEntry() {
        return this.menuEntry;
    }
}
