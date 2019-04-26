package control;

import control.Constants.Const;
import model.InteractiveContainer;
import model.Position;
import model.gameObject.Character;
import model.Skill;

import java.util.ArrayList;

public class CombatController
{
    public static void attack(Character character, Position position, Skill skill)
    {
        ArrayList<Position> arrayList = MovementController.getRangeFelder(skill.getRange(), position);
        ArrayList<InteractiveContainer> interactivesInAttackRadius = getInteractives(arrayList);

        int attackBonus = getDieBonusForCharacter(character);
        int attackValue = skill.getDamageBonus() + skill.getDieBonus() + character.getBaseDamage() + attackBonus;

        for (InteractiveContainer interactive : interactivesInAttackRadius)
        {
            if (interactive.getContent().getArmor() < attackValue)
            {
                //TODO: wahrscheinlich wird ein falscher Wert für die Verringerung der HP verwendet
                reduceHealthPointsOfCharacter(character, interactive, attackBonus);
            }
        }
    }

    private static void reduceHealthPointsOfCharacter(Character character, InteractiveContainer interactive, int attackBonus)
    {
        int hp = interactive.getContent().getHealthPoints();
        interactive.getContent().setHealthPoints(hp -
                (attackBonus == Const.NUMBER_CUBE_FACES ? character.getBaseDamage() + 1 : character.getBaseDamage()));
    }

    private static int getDieBonusForCharacter(Character character)
    {
        int bonus1 = DiceController.rollDie();
        int bonus2 = DiceController.rollDie();

        if (character.getStatus().get(0).isPositive())
        {
            return (bonus1 > bonus2 ? bonus1 : bonus2);
        } else if (!character.getStatus().get(0).isPositive())
        {
            return (bonus1 < bonus2 ? bonus1 : bonus2);
        } else
        {
            return bonus1;
        }
    }

    private static ArrayList<InteractiveContainer> getInteractives(ArrayList<Position> arrayList)
    {
        ArrayList<InteractiveContainer> listOfInteractivesInGivenRadius = new ArrayList<>();
        InteractiveMap interactiveMap = MovementController.getPositions();

        for (Position position : arrayList)
        {
            if (interactiveMap.getInteractive(position) != null)
            {
                listOfInteractivesInGivenRadius.add(interactiveMap.getInteractive(position));
            }
        }
        return listOfInteractivesInGivenRadius;
    }

    public static void main(String[] args)
    {

    }
}
