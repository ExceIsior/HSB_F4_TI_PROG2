package control;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import java.util.Arrays;
import model.InteractiveContainer;
import model.map.Dungeon;

public class PhaseController {
    
    private Scanner positionListener = new Scanner(System.in);
    private int phaseID = 1;
    private ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    private Dungeon dungeon = null;
    private MovementController moveController = null;
    
    public PhaseController(Dungeon dungeon) {
        this.dungeon = dungeon;
        moveController = new MovementController(this.dungeon);
    }
    
    public void startGame() {
        switch(this.phaseID)
        {
            case(1):
                MapController.ausgeben(dungeon);
                
                int x = positionListener.nextInt();
                int y = positionListener.nextInt();
                //durch Collection durchgehen um kleinste Initiative rauszufinden
                //hero wird nachtraeglich geloescht -> aendern
                this.moveController.changePositionOfInteractive(heroQueue.poll(), new Position(x, y));
                MapController.ausgeben(dungeon);
                
                x = positionListener.nextInt();
                y = positionListener.nextInt();
                //durch Collection durchgehen um kleinste Initiative rauszufinden
                this.moveController.changePositionOfInteractive(heroQueue.poll(), new Position(x, y));
                MapController.ausgeben(dungeon);
                
                this.phaseID = 2;
                break;
                
            case(2):
                
                this.phaseID = 3;
                break;
            case(3):
                
                this.phaseID = 4;
                break;
            case(4):
                
                this.phaseID = 1;
                break;
            default: ;
        
    }
    }
}
