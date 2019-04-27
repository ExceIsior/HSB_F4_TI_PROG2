package model.phasen;

import control.CombatController;
import model.Position;
import model.gameObject.Character;
import model.gameObject.Skill;

public class HeroPhase extends CharacterPhase
{
    public HeroPhase(Character character)
    {
        //TODO: in Konstante auslagern (keine nackten Zahlen)
        super(character, 2);
    }

    public void attack(Position target, Skill skill)
    {
        CombatController.attack(this.getCharacter(), target, skill);
    }

    public void move(Position target)
    {
    }
}
