package control;

import model.gameObject.GameObject;
import model.gameObject.Villain;

public class VillainAI
{
    public static void makeMoveForVillain(Villain villain)
    {
        Pathfinder.calculateShortestWayToGameObject(villain.getPosition(), getClosestHero(villain));

    }

    public static GameObject getClosestHero(Villain villain)
    {
        //MovementController.getRangeFelder(20, villain.getPosition());
        return null;
    }
}
