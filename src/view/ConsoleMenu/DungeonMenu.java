package view.ConsoleMenu;

import control.Constants.DungeonConst;
import control.Constants.ErrorConst;
import control.Constants.MenuConst;
import model.Menu;

public class DungeonMenu {

    private Menu dungeonMenu = null;

    public DungeonMenu() {
        this.dungeonMenu = this.initDungeonMenu();
    }

    /**
     * Initialises the dungeon selection menu
     *
     * @return Dungeon menu
     */
    private Menu initDungeonMenu() {
        String[] dungeons = new String[DungeonConst.class.getDeclaredFields().length];
        for (int i = 0; i < dungeons.length; i++) {
            try {
                dungeons[i] = (String) DungeonConst.class.getDeclaredFields()[i].get(null);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                System.err.println(ErrorConst.DUNGEON_NAME_COULD_NOT_BE_ACCESSED);
                dungeons[i] = "Dungeon " + i;
            }
        }
        return new Menu(MenuConst.DUNGEON_MENU_TITLE, dungeons);
    }

    public Menu getMainMenu() {
        return this.dungeonMenu;
    }

}
