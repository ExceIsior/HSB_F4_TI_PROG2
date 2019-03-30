package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import model.Position;
import model.item.Item;

public class Hero extends Character {
    private int surgeValue = 0;
    private Item equipment = null;

    public Hero(Position position, int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(Constants.HERO_PATH,position,  damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
}
