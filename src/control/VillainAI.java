package control;

import control.Constants.Const;
import java.util.ArrayList;
import model.Position;
import model.gameObject.GameObject;
import model.gameObject.Hero;
import model.gameObject.Villain;
import control.phase.VillainPhase;

public class VillainAI
{
    private static VillainPhase villainPhase = null;
    
    public static void makeMoveForVillain(VillainPhase villainPhase)
    {
        VillainAI.villainPhase = villainPhase;
        Hero hero = getHeroInAttackableRange();
        if (hero != null) 
        {
            villainPhase.attack(hero.getPosition(), villainPhase.getCharacter().getSkills().get(0));
        }
        else 
        {
           
           villainPhase.move(new Position(9, 6));
           
        }
    }

    private static Hero getHeroInAttackableRange()
    {
        ArrayList<Position> range = MovementController.getAttackFelder(villainPhase.getCharacter().getSkills().get(0).getRange(),
                villainPhase.getCharacter().getPosition());
        for (Position position: range) 
        {
            if (MovementController.getField(position).getGameObject().getGraphicsPath().contains(Const.HERO_PATH)) 
            {
                return (Hero)MovementController.getField(position).getGameObject();
            }
        }
        return null;
    }
    
}
