package model;

import model.item.Materials;

public class Reward {
    private int gold = 0;
    private int xp = 0;
    private Materials material = null;
    
    public Reward (int gold, int xp, Materials material) {
        this.gold = gold;
        this.xp = xp;
        this.material = material;
    }
}
