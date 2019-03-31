package model;

import java.lang.Runnable;
import java.util.Arrays;
import java.util.HashMap;

public class Menu {

    private HashMap<String, Runnable> menuEntries = null;

    public Menu(HashMap<String, Runnable> menuEntries) {
        this.menuEntries = menuEntries;
    }

    public Menu() {
        this.menuEntries = new HashMap<>();
    }

    public void addMenuEntry(String message, Runnable function) {
        this.menuEntries.put(message, function);
    }

    public void printMenu() {
        String[] messages = this.menuEntries.keySet().toArray((size) -> new String[size]);
        for (int i = 0; i < this.menuEntries.size(); i++) {
            System.out.printf("%d.) %s\n", i, messages[i]);
        }
    }

    public void runFunction(int index) {
        Runnable[] functions = this.menuEntries.values().toArray((size) -> new Runnable[size]);
        functions[index].run();
    }
}
