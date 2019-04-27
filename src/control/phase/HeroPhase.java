package control.phase;

import control.CombatController;
import control.Constants.HeroConst;
import control.Constants.PhaseConst;
import control.MovementController;
import model.Position;
import model.gameObject.Character;
import java.util.Scanner;

public class HeroPhase extends CharacterPhase
{
    Scanner listener = new Scanner(System.in);
    
    public HeroPhase(Character character)
    {
        super(character, HeroConst.HERO_ACTION_POINTS);
    }

    public void attack(Position target, int skill)
    {
        CombatController.attack(this.getCharacter(), target, this.getCharacter().getSkills().get(skill));
        this.setActionPoints(this.getActionPoints()-1);
    }

    public void move(Position newPosition)
    {
        MovementController.changePositionOfGameObject(this.getCharacter(), newPosition);
        this.setActionPoints(this.getActionPoints()-1);
    }
    
    public void inform() 
    {
        System.out.println(PhaseConst.HERO_PHASE);
        while (this.actionPointsLeft()) 
        {
        System.out.println("Action Points left: " + this.getActionPoints());
        System.out.println("0) " + PhaseConst.HERO_PHASE_MOVE);
        System.out.println("1) " + PhaseConst.HERO_PHASE_ATTACK);
        System.out.println("Select Option: ");
        int option = listener.nextInt();
        
        if (option == 0) 
                {
                    System.out.println("Choose Position");
                    //todo exception
                    this.move(new Position(listener.nextInt(), listener.nextInt()));
                }
                if (option == 1) 
                {
                    System.out.println("Choose target");
                    int x = listener.nextInt();
                    int y = listener.nextInt();
                    
                    System.out.println("Choose skill");
                    int z = listener.nextInt();
                    this.attack(new Position(x, y), z);
                    
                }
        }
    }
}
