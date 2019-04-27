package model.phasen;

import control.CombatController;
import model.Position;
import model.gameObject.Character;
import model.Skill;

public class CharacterPhase extends Phase
{
    private Character character = null;
    private int actionPoints = 0;

    public CharacterPhase(Character character, int actionPoints)
    {
        this.character = character;
        this.actionPoints = actionPoints;
    }

    public void attack(Position target, Skill skill)
    {
        CombatController.attack(this.character, target, skill);
    }

    public void move(Position target)
    {
    }

    public Character getCharacter()
    {
        return this.character;
    }

    public int getActionPoints()
    {
        return this.actionPoints;
    }
    public void setActionPoints(int actionPoints) 
    {
        this.actionPoints = actionPoints;
    }
    public boolean actionPointsLeft() 
    {
        return (this.actionPoints != 0);
    }
}
