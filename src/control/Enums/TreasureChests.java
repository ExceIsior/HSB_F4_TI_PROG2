package control.Enums;

import model.gameObject.TreasureChest;

public enum TreasureChests {
    TREASURE_CHEST_HEAL_POTION(new TreasureChest(0, HeroItems.HEAL_POTION.getHeroItem())),
    TREASURE_CHEST_AGILITY_POTION(new TreasureChest(0, HeroItems.AGILITY_POTION.getHeroItem())),
    TREASURE_CHEST_DAMAGE_POTION(new TreasureChest(0, HeroItems.DAMAGE_POTION.getHeroItem())),
    TREASURE_CHEST_ARMOR_POTION(new TreasureChest(0, HeroItems.ARMOR_POTION.getHeroItem()));
    
    private final TreasureChest treasureChest;

    private TreasureChests(TreasureChest treasureChest) {
        this.treasureChest = treasureChest;
    }

    public TreasureChest getTreasureChest() {
        return this.treasureChest;
    }
}
