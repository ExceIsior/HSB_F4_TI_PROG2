package model;

import utilities.IOHelper;

/**
 * Represents a menu consisting of menu entries.
 *
 * @author Ismail
 */
public class Menu {

    private String title = "";
    private String[] menuEntries = null;
    private final String SELECT_OPTION = "Select Option: ";

    /**
     * Initialises the menu
     *
     * @param title Title of the menu which is to be printed at the very top.
     * @param menuEntries Array of selectable menu entries.
     */
    public Menu(String title, String... menuEntries) {
        this.title = title;
        this.menuEntries = menuEntries;
    }

    /**
     * Prints menu.
     */
    private void printMenu() {
        System.out.println(title);
        for (int i = 0; i < menuEntries.length; i++) {
            System.out.printf("%d) %s\n", i, this.menuEntries[i]);
        }
    }

    /**
     * Prints the menu and prompts the user to select one of the defined menu
     * entries.
     *
     * @return Index of the selected menu entry.
     */
    public int promptMenu() {
        this.printMenu();
        return IOHelper.promptUserInt(this.SELECT_OPTION, this.menuEntries.length);
    }
}
