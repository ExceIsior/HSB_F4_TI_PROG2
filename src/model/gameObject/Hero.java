package model.gameObject;

import java.util.ArrayList;
import model.Effekt;
import model.item.Item;

public class Hero extends Character {
    private int surgeValue = 0;
    private Status status = null;
    private Skill skill = null;
    private Item equipment = null;

    public Hero(int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
}
