package model;

import control.Enums.Materials;
import model.item.Material;

public class Reward {
    private int gold = 0;
    private int xp = 0;
    private Material[] material = null;
    
    public Reward (int gold, int xp, Material... material) {
        this.gold = gold;
        this.xp = xp;
        this.material = material;
    }
}
