package control;

import java.util.Scanner;
import model.Position;

public class PhaseController {
    
    static Scanner positionListener = new Scanner(System.in);
    
    public static void main(String args[])
    {
        MapController.generateMap();
        GameController gameController = new GameController();
        switch(gameController.getGamePhase())
        {
            case(1):
                System.out.println("hallo");
                MapController.ausgeben(MapController.getDungeon());
                int x = positionListener.nextInt();
                int y = positionListener.nextInt();
                MovementController.changePositionOfGameObject(new Position(x, y));
                MapController.ausgeben(GameController.getDungeon());
                System.out.println("naechster Schritt");
                x = positionListener.nextInt();
                y = positionListener.nextInt();
                MovementController.changePositionOfGameObject(new Position(x, y));
                MapController.ausgeben(GameController.getDungeon());
                gameController.setGamePhase(2);
                break;
            case(2):
                
                gameController.setGamePhase(3);
                break;
            case(3):
                
                gameController.setGamePhase(4);
                break;
            case(4):
                
                gameController.setGamePhase(1);
                break;
            default: ;
        }
    }
}
