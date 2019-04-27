package control;

import control.Constants.PhaseConst;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import java.util.Arrays;
import model.gameObject.Villain;
import model.map.Dungeon;
import model.phasen.HeroPhase;

public class PhaseController {
    //todo
    private ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    private ConcurrentLinkedQueue<Villain> villainQueue = new ConcurrentLinkedQueue<>();
    private final Scanner Listener = new Scanner(System.in);
    private VisibilityController visibilityController = null;
    private Dungeon dungeon = null;
    private Villain[] villains = null;
    private boolean gameOver = false;
    private int phaseID = 1;
    
    public PhaseController(Dungeon dungeon, Villain[] villains) {
        this.dungeon = dungeon;
        this.villains = villains;
        MovementController.setDungeon(dungeon);
        this.visibilityController = new VisibilityController(this.dungeon);
    }
    
    public void startGame() {
        int count = 0;
        while(!gameOver) 
        {
        switch(this.phaseID)
        {
            case(1):
//                if (dungeon.getQuest().checkAllObjectives()) 
//                {
//                    gameOver = true;
//                    break;
//                }
                
                MapController.printOutDungeon(dungeon);
                
                heroQueue.add(heroQueue.peek());
                HeroPhase heroPhase = new HeroPhase(heroQueue.poll());
                heroPhase.inform();
                
                MapController.printOutDungeon(dungeon);
                
                this.phaseID = 2;
                break;
                
            case(2):
                System.out.println(PhaseConst.EXPLORATION_PHASE);
                visibilityController.explorateTile();
                
                putVisibleVillainsInQueue();
                
                MapController.printOutDungeon(dungeon);
                this.phaseID = 4;
                break;
                
            //Encounterphase wird uebersprungen
            case(3):
                System.out.println(PhaseConst.ENCOUNTER_PHASE);
                this.phaseID = 4;
                break;
                
            case(4):
                System.out.println(PhaseConst.VILLAIN_PHASE);
                
                //Ueberprueft ob die VillainQueue ein Villain enthaelt
                if (!villainQueue.isEmpty()) 
                {
                    System.out.println("Villain: " + villainQueue.poll().getGraphicsPath());
                }
                else {
                    System.out.println("Kein Villain in Queue");
                }
                this.phaseID = 1;
                break;
                
            default:
                break;
        
            }  
        }   
    }
    
    /**
     * Iterates through all Villains and adds Villain to VillainQueue if Villain is on visible Tile.
     */
    private void putVisibleVillainsInQueue() 
    {
        for (int i = 0; i < villains.length; i++) 
        {
            Position villainPositionTile = Converter.convertMapCoordinatesInTileCoordinates(villains[i].getPosition());
            if (dungeon.getMap()[villainPositionTile.getX()][villainPositionTile.getY()].isVisible()) 
            {
                villainQueue.add(villains[i]);
            }
        }
    }
}
