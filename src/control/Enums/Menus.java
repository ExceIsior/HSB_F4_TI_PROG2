package control.Enums;

import java.util.Map;
import java.util.function.Supplier;
import model.Menu;

public enum Menus {
    MAIN_MENU(new Menu(
            MenuEntries.MAIN_MENU_START_NEW_GAME.getMenuEntry(),
            MenuEntries.MAIN_MENU_LOAD_GAME.getMenuEntry(),
            MenuEntries.MAIN_MENU_QUIT.getMenuEntry())),
    GAME_MENU(new Menu(
            MenuEntries.GAME_MENU_SELECT_DUNGEON.getMenuEntry(),
            MenuEntries.GAME_MENU_SAVE_GAME.getMenuEntry(),
            MenuEntries.GAME_MENU_CHANGE_EQUIPMENT.getMenuEntry(),
            MenuEntries.RETURN_TO_MAIN_MENU.getMenuEntry())),
    DUNGEON_MENU(new Menu()),
    CRAFTING_MENU(new Menu());

    private Menu menu;

    private Menus(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return this.menu;
    }
}
