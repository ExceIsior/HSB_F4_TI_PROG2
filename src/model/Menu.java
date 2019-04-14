package model;

import java.lang.Runnable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Menu {

//    private HashMap<String, Runnable> menuEntries = null;
    private List<MenuEntry> menuEntries = null;
    private final String SELECT_OPTION = "Select Option: ";

    public Menu(MenuEntry... menuEntries) {
        this.menuEntries = Arrays.asList(menuEntries);
    }

    public void addMenuEntry(MenuEntry menuEntry) {
        this.menuEntries.add(menuEntry);
    }

    public void printMenu() {
        for (int i = 0; i < this.menuEntries.size(); i++) {
            System.out.printf("%d.) %s\n", i, this.menuEntries.get(i).getMessage());
        }
    }

    public void runFunction(int index) {
        this.menuEntries.get(index).getFunction().run();
    }

    public void promptMenu() {
        int option = -1;
        while (option < 0 || option >= this.menuEntries.size()) {
            printMenu();
            option = utilities.IOHelper.promptUserInt(SELECT_OPTION);
        }
        runFunction(option);
    }
}
