package model;

import java.util.Arrays;
import java.util.List;

/**
 * Represents a menu consisting of menu entries.
 *
 * @author Ismail
 */
public class Menu {

    private String information = "";
    private List<MenuEntry> menuEntries = null;
    private final String SELECT_OPTION = "Select Option: ";

    /**
     * Initialises Menu
     *
     * @param menuEntries Array of menu entries
     */
    public Menu(String information, MenuEntry... menuEntries) {
        this.menuEntries = Arrays.asList(menuEntries);
    }

    /**
     * Adds a new menu entry
     *
     * @param menuEntry New menu entry.
     */
    public void addMenuEntry(MenuEntry menuEntry) {
        this.menuEntries.add(menuEntry);
    }

    /**
     * Prints the menu on the console.
     */
    public void printMenu() {
        System.out.println("");
        for (int i = 0; i < this.menuEntries.size(); i++) {
            System.out.printf("%d.) %s\n", i, this.menuEntries.get(i).getMessage());
        }
    }

    /**
     * Runs procedure with given index.
     *
     * @param index index of menu.
     */
    public void runFunction(int index) {
        this.menuEntries.get(index).getFunction().run();
    }

    /**
     * Prints menu and prompts user to select an entry then runs the procedure
     * of selected entry.
     */
    public void promptMenu() {
        int option = -1;
        while (option < 0 || option >= this.menuEntries.size()) {
            printMenu();
            option = utilities.IOHelper.promptUserInt(SELECT_OPTION);
        }
        runFunction(option);
    }
}
