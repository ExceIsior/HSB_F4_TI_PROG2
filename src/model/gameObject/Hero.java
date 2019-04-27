package model.gameObject;

import model.Skill;
import control.Constants.Const;
import model.Position;
import model.Status;
import model.item.Inventory;
import model.item.Item;

import java.util.ArrayList;
import java.util.List;
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
                Status status,
                List<Skill> skills,
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

    public int getSurgeValue() {
        return surgeValue;
    }

    public EquipmentSet getEquipmentSet() {
        return equipmentSet;
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
