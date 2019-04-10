package control;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import control.PlayerManager;
import java.util.Arrays;

public class PhaseController {
    
    static Scanner positionListener = new Scanner(System.in);
    private static int count = 0;
//    private static Hero hero1 = new Hero("Hero1", new Position(0,1), 0, null, "", 0, 0,0, null, null, null, 1);
//    private static Hero hero2 = new Hero("Hero2", new Position(0,3), 0, null, "", 0, 0,0, null, null, null, 2);
    
    private static ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    public static void main(String[]args){
        System.out.println(heroQueue.poll());
        System.out.println(heroQueue.poll());
        System.out.println(heroQueue.poll());
        System.out.println(heroQueue.poll());
    }
//    
//    public static Hero getHero1() {
//        return hero1;
//    }
//    
//    public static Hero getHero2() {
//        return hero2;
//    }
//    
//    public static void main(String args[])
//    {
//        MapController.generateMap();
//        GameController gameController = new GameController();
//        switch(gameController.getGamePhase())
//        {
//            case(1):
//                System.out.println("hallo");
//                MapController.ausgeben(MapController.getDungeon());
//                int x = positionListener.nextInt();
//                int y = positionListener.nextInt();
//                //durch Collection durchgehen um kleinste Initiative rauszufinden
//                MovementController.changePositionOfGameObject(hero1, new Position(x, y));
//                MapController.ausgeben(GameController.getDungeon());
//                
//                System.out.println("naechster Schritt");
//                x = positionListener.nextInt();
//                y = positionListener.nextInt();
//                MovementController.changePositionOfGameObject(hero1, new Position(x, y));
//                MapController.ausgeben(GameController.getDungeon());
//                gameController.setGamePhase(2);
//                break;
//                
//                //Problem ist, dass currentPosition vom letzten verwendeten Gameobjekt ist
//            case(2):
//                
//                gameController.setGamePhase(3);
//                break;
//            case(3):
//                
//                gameController.setGamePhase(4);
//                break;
//            case(4):
//                
//                gameController.setGamePhase(1);
//                break;
//            default: ;
//        }
//    }
//    private static void getPositionWithinOneTile(){
//        
//    }
}
