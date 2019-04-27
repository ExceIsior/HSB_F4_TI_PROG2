package model.phasen;

import control.CombatController;
import model.Position;
import model.gameObject.Character;
import model.Skill;

public class VillainPhase extends CharacterPhase
{
    public VillainPhase(Character character)
    {
        //TODO: in Konstante auslagern (keine nackten Zahlen)
        super(character, 1);
    }

    public void attack(Position target, Skill skill)
    {
        CombatController.attack(this.getCharacter(), target, skill);
    }

    public void move(Position target)
    {
    }
}
