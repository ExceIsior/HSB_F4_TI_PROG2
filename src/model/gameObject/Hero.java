package model.gameObject;

import control.Constants;
import java.util.ArrayList;
import jdk.vm.ci.meta.Constant;
import model.Effekt;
import model.item.Item;

public class Hero extends Character {
    private int surgeValue = 0;
    private Status status = null;
    private Skill skill = null;
    private Item equipment = null;

    public Hero(int damage, int armor, Item loot, String name, int HealthPoints, int agility, ArrayList<Status> status, ArrayList<Skill> skills) {
        super(Constants.HERO_PATH , damage, armor, loot, name, HealthPoints, agility, status, skills);
    }
}
