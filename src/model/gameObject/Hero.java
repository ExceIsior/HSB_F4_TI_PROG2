package model.gameObject;

import model.Position;
import model.Status;
import model.item.Inventory;
import model.item.Item;

import java.util.ArrayList;

public class Hero extends Character
{
    private int surgeValue = 0;
    private Item equipment = null;
    private Inventory inventory = null;

    public Hero(String graphicsPath,
                Position position,
                int armor,
                Item loot,
                String name,
                int healthPoints,
                int maxHealthPoints,
                int agility,
                ArrayList<Status> status,
                ArrayList<Skill> skills,
                Inventory inventory)
    {
        super(graphicsPath, position, armor, loot, name, healthPoints, maxHealthPoints, agility, status, skills);
        this.inventory = inventory;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }


    @Override
    public String toString()
    {
        return this.getGraphicsPath();
    }


}
