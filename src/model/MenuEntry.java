package model;

public class MenuEntry {

    private String message = "";
    private Runnable function = null;

    public MenuEntry(String message, Runnable function) {
        this.message = message;
        this.function = function;
    }

    public String getMessage() {
        return message;
    }

    public Runnable getFunction() {
        return function;
    }

}
