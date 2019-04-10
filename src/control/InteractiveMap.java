
package control;

import java.util.HashMap;
import model.Position;
import model.gameObject.Boss;
import model.gameObject.Hero;
import model.gameObject.Interactive;
import model.gameObject.QuestItem;
import model.gameObject.Trap;
import model.gameObject.TreasureChest;
import model.gameObject.Villain;

public class InteractiveMap {
    
    HashMap<Hero, Position> hashMapHero; 
    HashMap<Villain, Position> hashMapVillain;
    HashMap<Boss, Position> hashMapBoss; 
    HashMap<TreasureChest, Position> hashMapTreasureChest;
    HashMap<Trap, Position> hashMapTrap; 
    HashMap<QuestItem, Position> hashMapQuestItem; 
    
    
    public void putInteractive(Hero hero, Position position) {
        hashMapHero.put(hero, position);
    }
    public void putInteractive(Villain villain, Position position) {
        hashMapVillain.put(villain, position);
    }
    public void putInteractive(Boss boss, Position position) {
        hashMapBoss.put(boss, position);
    }
    public void putInteractive(TreasureChest treasureChest, Position position) {
        hashMapTreasureChest.put(treasureChest, position);
    }
    public void putInteractive(Trap trap, Position position) {
        hashMapTrap.put(trap, position);
    }
    public void putInteractive(QuestItem questItem, Position position) {
        hashMapQuestItem.put(questItem, position);
    }
    
    public Position getPosition(Hero hero) {
        return hashMapHero.get(hero);
    }
    public Position getPosition(Villain villain) {
        return hashMapVillain.get(villain);
    }
    public Position getPosition(Boss boss) {
        return hashMapBoss.get(boss);
    }
    public Position getPosition(TreasureChest treasureChest) {
        return hashMapTreasureChest.get(treasureChest);
    }
    public Position getPosition(Trap trap) {
        return hashMapTrap.get(trap);
    }
    public Position getPosition(QuestItem questItem) {
        return hashMapQuestItem.get(questItem);
    }
    
    
    
}
