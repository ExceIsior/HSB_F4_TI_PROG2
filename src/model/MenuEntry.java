package model;

/**
 * Represents a menu entry in a menu. Consists of a entry message shown on the
 * menu and a procedure that is to be executed once the entry was selected.
 *
 * @author Ismail
 */
public class MenuEntry {

    private String message = "";
    private Runnable function = null;

    /**
     * Initialises a menu entry.
     *
     * @param message Message shown inside the menu
     * @param function Procedure that is to be executed once the menu entry is
     * selected.
     */
    public MenuEntry(String message, Runnable function) {
        this.message = message;
        this.function = function;
    }

    /**
     * Retrieves the entry's message.
     *
     * @return Entry's message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Retrieves the Procedure of the entry.
     *
     * @return Entry's procedure
     */
    public Runnable getFunction() {
        return function;
    }

}
