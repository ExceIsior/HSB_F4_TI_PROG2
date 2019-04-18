package model.gameObject;

import control.Constants.Const;
import model.Position;
import model.Status;
import model.item.Inventory;
import model.item.Item;

import java.util.ArrayList;
import model.item.Equipment.EquipmentSet;

public class Hero extends Character
{
    private int surgeValue = 0;
    private EquipmentSet equipmentSet = null;
    private Inventory inventory = null;

    public Hero(String graphicsPath,
                int armor,
                Item loot,
                String name,
                int healthPoints,
                int maxHealthPoints,
                int agility,
                ArrayList<Status> status,
                ArrayList<Skill> skills,
                Inventory inventory,
                EquipmentSet equipmentSet)
    {
        super(graphicsPath,
                armor, 
                loot,
                name, 
                healthPoints,
                maxHealthPoints,
                agility, 
                status, 
                skills);
        this.inventory = inventory;
        this.equipmentSet = equipmentSet;
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
