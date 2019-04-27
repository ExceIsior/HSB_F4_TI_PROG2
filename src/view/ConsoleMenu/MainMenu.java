package view.ConsoleMenu;

import control.Constants.MenuConst;
import model.Menu;

public class MainMenu {

    private Menu mainMenu = null;

    public MainMenu() {
        this.mainMenu = this.initMainMenu();
    }

    /**
     * Initialises the main menu
     *
     * @return Main menu
     */
    private Menu initMainMenu() {
        return new Menu(
                MenuConst.MAIN_MENU_TITLE,
                MenuConst.MAIN_MENU_NEW_GAME,
                MenuConst.MAIN_MENU_LOAD_GAME,
                MenuConst.MAIN_MENU_QUIT);
    }

    public Menu getMainMenu() {
        return this.mainMenu;
    }

}
