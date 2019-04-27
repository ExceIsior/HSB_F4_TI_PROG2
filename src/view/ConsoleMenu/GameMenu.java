package view.ConsoleMenu;

import control.Constants.MenuConst;
import model.Menu;

public class GameMenu {

    private Menu gameMenu = null;

    public GameMenu() {
        this.gameMenu = this.initGameMenu();
    }

    /**
     * Initialises the game menu
     *
     * @return Game menu
     */
    private Menu initGameMenu() {
        return new Menu(
                MenuConst.GAME_MENU_TITLE,
                MenuConst.GAME_MENU_SELECT_DUNGEON,
                MenuConst.GAME_MENU_CRAFTING,
                MenuConst.GAME_MENU_SAVE_GAME,
                MenuConst.RETURN_TO_MAIN_MENU);
    }

    public Menu getGameMenu() {
        return this.gameMenu;
    }

}
