package control;

import control.Constants.Const;
import control.Constants.VillainConst;
import control.Enums.Skills;
import model.Factories.VillainFactory;
import model.Position;
import model.Skill;
import model.gameObject.Character;
import model.gameObject.*;

import java.util.ArrayList;

public class CombatController
{
    public static void attack(Character attacker, Position defenderPosition, Skill skill)
    {
        GameObject defender = MovementController.getField(defenderPosition).getGameObject();
        System.out.println("defender graphic: " + defender.getGraphicsPath());
        if (defender.getGraphicsPath().equals(Const.TRAP_PATH))
        {
            attack(attacker, skill, (Trap) defender);
        } else if (defender.getGraphicsPath().contains(Const.CHARACTERS_PATH))
        {
            System.out.println("defender");
            attack(attacker, (Character) defender, skill);
        } else
        {
            //TODO: passende Exception einfügen
        }
    }

    public static void attack(Character attacker, Character defender, Skill skill)
    {
        int attackBonus = getDieBonusForCharacter(attacker);
        System.out.println("würfelzahl: " + attackBonus);
        System.out.println("skill: " + skill.getName());
        System.out.println("defender armor points: " + defender.getArmor());
        int attackValue = calculateAttackValue(attacker, skill, attackBonus);
        System.out.println("attack value: " + attackValue);
        if (defender.getArmor() < attackValue)
        {
            System.out.println("old health points: " + defender.getHealthPoints());
            reduceHealthPointsOfInteractive(attacker, defender, attackBonus);
            System.out.println("new health points: " + defender.getHealthPoints());
        }
    }

    public static void attack(Trap trap, Character defender)
    {
        int attackBonus = DiceController.castDie();
        if (defender.getArmor() < trap.getDamage() + attackBonus)
        {
            reduceHealthPointsOfInteractive(trap.getDamage(), defender, attackBonus);
        }
    }

    public static void attack(Character attacker, Skill skill, Trap trap)
    {
        int attackBonus = DiceController.castDie();
        int attackValue = calculateAttackValue(attacker, skill, attackBonus);
        if (trap.getArmor() < attackBonus + attackValue)
        {
            reduceHealthPointsOfInteractive(attacker, trap, attackBonus);
        } else
        {
            attack(trap, attacker);
        }
    }

    private static int calculateAttackValue(Character attacker, Skill skill, int attackBonus)
    {
        return skill.getDamageBonus() + skill.getDieBonus() + attacker.getBaseDamage() + attackBonus;
    }

    private static void reduceHealthPointsOfInteractive(Character attacker, Interactive defender, int attackBonus)
    {
        reduceHealthPointsOfInteractive(attacker.getBaseDamage(), defender, attackBonus);
    }

    private static void reduceHealthPointsOfInteractive(int damage, Interactive defender, int attackBonus)
    {
        int hp = defender.getHealthPoints();
        defender.setHealthPoints(hp -
                (attackBonus == Const.NUMBER_CUBE_FACES ? damage + 1 : damage));
    }

    private static int getDieBonusForCharacter(Character character)
    {
        int bonus1 = DiceController.castDie();
        int bonus2 = DiceController.castDie();
        if (character.getStatus() == null)
        {
            return bonus1;
        }
        if (character.getStatus().isPositive())
        {
            return (bonus1 > bonus2 ? bonus1 : bonus2);
        } else if (!character.getStatus().isPositive())
        {
            return (bonus1 < bonus2 ? bonus1 : bonus2);
        } else
        {
            return bonus1;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(Skills.DAGGER_STAB.getSkill());
        Hero hero = new Hero("", 5, "", 30, 4, 3,
                null, null, null, null);
        hero.setBaseDamage(1);
        Villain villain = VillainFactory.getVillain(0);
        System.out.println(villain.getHealthPoints());
        attack(hero, villain, hero.getSkills().get(0));
        System.out.println(villain.getHealthPoints());
    }
}
