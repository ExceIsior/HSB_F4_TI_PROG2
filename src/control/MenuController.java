package control;

import model.Menu;

public class MenuController {
    private Menu mainMenu = null;
    private Menu dungeonMenu = null;
    
    public MenuController(){
        this.mainMenu = new Menu();
        this.dungeonMenu = new Menu();
    }
}
