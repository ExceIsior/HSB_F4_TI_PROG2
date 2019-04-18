package control;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import java.util.Arrays;
import model.map.Dungeon;

public class PhaseController {
    
    private Scanner positionListener = new Scanner(System.in);
    private int phaseID = 1;
    private ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    private Dungeon dungeon = null;
    private MovementController moveController = null;
    private boolean gameOn = true;
    private VisibilityController visibilityController = null;
    
    public PhaseController(Dungeon dungeon) {
        this.dungeon = dungeon;
        moveController = new MovementController(this.dungeon);
        visibilityController = new VisibilityController(this.dungeon);
    }
    
    public void startGame() {
        int count = 0;
        while(gameOn) {
        switch(this.phaseID)
        {
            case(1):
                MapController.ausgeben(dungeon);
                System.out.println("HEROPHASE");
                System.out.println("erste Position");
                int x = positionListener.nextInt();
                int y = positionListener.nextInt();
                heroQueue.add(heroQueue.peek());
                this.moveController.changePositionOfGameObject(heroQueue.poll(), new Position(x, y));
                MapController.ausgeben(dungeon);
                
                count++;
                if (count == 5) {
                    gameOn = false;
                }
                this.phaseID = 2;
                //break;
                
            case(2):
                System.out.println("EXPLORATIONPHASE");
                visibilityController.explorateTile();
                MapController.ausgeben(dungeon);
                this.phaseID = 3;
                //break;
            case(3):
                System.out.println("ENCOUNTERPHASE");
                this.phaseID = 4;
                //break;
            case(4):
                System.out.println("VILLAINPHASE");
                this.phaseID = 1;
                //break;
            default:
                break;
        
        }
    }
    }
}
