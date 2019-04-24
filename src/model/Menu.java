package model;

import java.util.Arrays;
import java.util.List;
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

    public Menu(String title, String... menuEntries) {
        this.title = title;
        this.menuEntries = menuEntries;
    }
    
    private void printMenu(){
        System.out.println(title);
        for (int i = 0; i < menuEntries.length; i++) {
            System.out.printf("%d) %s\n", i, this.menuEntries[i]);
        }
    }
    
    public int promptMenu(){
        this.printMenu();
        return IOHelper.promptUserInt(this.SELECT_OPTION, this.menuEntries.length);
    }

//
//    private String title = "";
//    private String info = "";
//    private List<MenuEntry> menuEntries = null;
//    private final String SELECT_OPTION = "Select Option: ";
//
//    /**
//     * Initialises Menu
//     *
//     * @param title Title of the menu to be shown.
//     * @param info Additional information to be shown.
//     * @param menuEntries Array of menu entries.
//     */
//    public Menu(String title, String info, MenuEntry... menuEntries) {
//        this.menuEntries = Arrays.asList(menuEntries);
//        this.title = title;
//        this.info = info;
//    }
//
//    /**
//     * Initialises Menu
//     *
//     * @param title Title of the menu to be shown.
//     * @param menuEntries Array of menu entries.
//     */
//    public Menu(String title, MenuEntry... menuEntries) {
//        this(title, "", menuEntries);
//    }
//
//    /**
//     * Adds a new menu entry
//     *
//     * @param menuEntry New menu entry.
//     */
//    public void addMenuEntry(MenuEntry menuEntry) {
//        this.menuEntries.add(menuEntry);
//    }
//
//    /**
//     * Prints the menu on the console.
//     */
//    public void printMenu() {
//        System.out.println("");
//        for (int i = 0; i < this.menuEntries.size(); i++) {
//            System.out.printf("%d.) %s\n", i, this.menuEntries.get(i).getMessage());
//        }
//    }
//
//    /**
//     * Runs procedure with given index.
//     *
//     * @param index index of menu.
//     */
//    public void runFunction(int index) {
//        this.menuEntries.get(index).getFunction().run();
//    }
//
//    /**
//     * Prints menu and prompts user to select an entry then runs the procedure
//     * of selected entry.
//     */
//    public void promptMenu() {
//        int option = -1;
//        while (option < 0 || option >= this.menuEntries.size()) {
//            printMenu();
//            option = utilities.IOHelper.promptUserInt(SELECT_OPTION);
//        }
//        runFunction(option);
//    }
    }
