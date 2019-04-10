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
    private InteractiveMap positions = null;
    private MovementController moveController = null;
    private Hero hero1 = HeroManager.getInstance().getHeroes()[0];
    
    public PhaseController(Dungeon dungeon, InteractiveMap positions) {
        this.dungeon = dungeon;
        this.positions = positions;
        moveController = new MovementController(this.positions, this.dungeon);
    }
    
    public void startGame() {
        switch(this.phaseID)
        {
            case(1):
                positions.putInteractive(hero1, new Position(10,10));
                System.out.println("current position: " + positions.getPosition(hero1));
                MapController.ausgeben(dungeon);
                int x = positionListener.nextInt();
                int y = positionListener.nextInt();
                //durch Collection durchgehen um kleinste Initiative rauszufinden
                this.moveController.changePositionOfInteractive(new InteractiveContainer(hero1), new Position(x, y));
                //MapController.ausgeben(dungeon);
                System.out.println("new position: " + positions.getPosition(hero1));
                
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
