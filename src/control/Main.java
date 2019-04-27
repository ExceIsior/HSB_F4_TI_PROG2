package control;

import control.Constants.Const;

public class Main {

    public static void main(String[] args)
    {
       //MenuManager.getInstance().promptMainMenu();
        GameController game = new GameController(Const.LEVEL1);
        game.start();
    }
}