package control;

import model.InteractiveContainer;
import model.Position;
import model.gameObject.Character;
import model.gameObject.Hero;
import model.gameObject.Villain;

import java.util.HashMap;

public class CombatController
{
    public static void main(String[] args)
    {
        HashMap<Position, InteractiveContainer> hashMap = new HashMap<>();
        Character character = new Character("", null, 0, null, "",0, 0,0, null, null );
        Hero hero = new Hero("", null, 0, null, "", 0, 0, 0, null, null, null);
        Villain villain = new Villain("", null, 0, null, "", 0, 0, 0, null, null);
        Position position = new Position(0,0);
        hashMap.put(position, new InteractiveContainer<Villain>(villain));
        hashMap.put(new Position(1,1), new InteractiveContainer<Villain>(villain));

        System.out.println(hashMap.get(position).getContent() == villain);
    }
}
