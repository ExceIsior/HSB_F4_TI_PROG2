package control;

import control.Constants.PhaseConst;
import control.phase.HeroPhase;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import model.Position;
import model.gameObject.Hero;
import java.util.Arrays;
import model.gameObject.Villain;
import model.map.Dungeon;
import control.phase.VillainPhase;

public class PhaseController {
    
    private Scanner listener = new Scanner(System.in);
    private ConcurrentLinkedQueue<Hero> heroQueue = new ConcurrentLinkedQueue<>(Arrays.asList(HeroManager.getInstance().getHeroes()));
    private ConcurrentLinkedQueue<Villain> villainQueue = new ConcurrentLinkedQueue<>();
    private VisibilityController visibilityController = null;
    private Dungeon dungeon = null;
    private boolean gameOver = false;
    private Villain[] villains = null;    
    private int phaseID = 1;
  
    
    public PhaseController(Dungeon dungeon, Villain[] villains) {
        this.dungeon = dungeon;
        this.villains = villains;
        MovementController.setDungeon(dungeon);
        visibilityController = new VisibilityController(this.dungeon);
    }
    
    public void startGame() 
    {
        while(!gameOver) {
        switch(this.phaseID)
        {
            case(1):
                //if (dungeon.getQuest().checkAllObjectives()) 
                
                
                MapController.ausgeben(dungeon);
                HeroPhase heroPhase = new HeroPhase(heroQueue.poll());
                heroPhase.inform();
                MapController.ausgeben(dungeon);

                this.phaseID = 2;
                break;
                
            case(2):
                System.out.println(PhaseConst.EXPLORATION_PHASE);
                visibilityController.explorateTile();
                
                putVillainsInQueue();
                
                MapController.ausgeben(dungeon);
                this.phaseID = 4;
                break;
                
            //Encounterphase wird uebersprungen
            case(3):
                System.out.println(PhaseConst.ENCOUNTER_PHASE);
                this.phaseID = 4;
                //break;
                
            case(4):
                System.out.println(PhaseConst.VILLAIN_PHASE);
                
                while( !villainQueue.isEmpty() )
                { 
                    VillainPhase villainPhase = new VillainPhase(villainQueue.peek());
                    VillainAI.makeMoveForVillain(villainPhase);
                }
                
                this.phaseID = 1;
                break;
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
