package control;

import control.Constants.Const;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import java.util.Arrays;
import model.gameObject.Villain;
import model.map.Dungeon;
<<<<<<< HEAD
import model.phasen.HeroPhase;
import model.phasen.VillainPhase;
=======
import model.map.Field;
import model.map.Tile;
>>>>>>> 9ffca055392ae533f5a1ca77a6c841a1b01c293b

public class PhaseController {
    
    private Scanner positionListener = new Scanner(System.in);
    private int phaseID = 1;
    private ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    private Dungeon dungeon = null;
    private MovementController moveController = null;
    private boolean gameOn = true;
    private VisibilityController visibilityController = null;
    private Villain[] villains = null;
    private ConcurrentLinkedQueue<Villain> villainQueue = new ConcurrentLinkedQueue<>();
    
    public PhaseController(Dungeon dungeon, Villain[] villains) {
        this.dungeon = dungeon;
        this.villains = villains;
  
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
                
                putVillainsInQueue();
                
                MapController.ausgeben(dungeon);
                this.phaseID = 4;
                //break;
                
            //Encounterphase wird uebersprungen
            case(3):
                System.out.println("ENCOUNTERPHASE");
                this.phaseID = 4;
                //break;
                
            case(4):
                System.out.println("VILLAINPHASE");
                
<<<<<<< HEAD
               
                //Ueberprueft ob die VillainQueue ein Villain enthaelt
                while( !villainQueue.isEmpty() )
                { 
                    VillainPhase villainPhase = new VillainPhase(villainQueue.peek());
                    VillainAI.makeMoveForVillain(villainPhase);
=======
                //ueberprueft ob die VillainQueue ein Villain enthaelt
                if (!villainQueue.isEmpty()) 
                {
                    System.out.println("aktuelles Villain" + villainQueue.poll().getGraphicsPath());
                }
                else {
                    System.out.println("kein Villain in Queue");
>>>>>>> 9ffca055392ae533f5a1ca77a6c841a1b01c293b
                }
                
                this.phaseID = 1;
                //break;
            default:
                break;
        
            }  
        }   
    }
    private void putVillainsInQueue() 
    {
        for (int i = 0; i < villains.length; i++) 
                {
                    Position villainPositionTile = Converter.convertMapCoordinatesInTileCoordinates(villains[i].getPosition());
                    if (dungeon.getMap()[villainPositionTile.getX()][villainPositionTile.getY()].isVisible()) {
                        villainQueue.add(villains[i]);
                    }
                    else {
                        
                    }
                }
    }
}
