
package control;

import java.util.HashMap;
import model.InteractiveContainer;
import model.Position;
import model.gameObject.Boss;
import model.gameObject.Hero;
import model.gameObject.Interactive;
import model.gameObject.QuestItem;
import model.gameObject.Trap;
import model.gameObject.TreasureChest;
import model.gameObject.Villain;

public class InteractiveMap {
    
//    HashMap<Hero, Position> hashMapHero; 
//    HashMap<Villain, Position> hashMapVillain;
//    HashMap<Boss, Position> hashMapBoss; 
//    HashMap<TreasureChest, Position> hashMapTreasureChest;
//    HashMap<Trap, Position> hashMapTrap; 
//    HashMap<QuestItem, Position> hashMapQuestItem; 
    HashMap<InteractiveContainer, Position> InteractivePositions = null;

    public InteractiveMap() {
        this.InteractivePositions = new HashMap<>();
    }
       
    
    public void putInteractive(Hero hero, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(hero), position);
    }
    public void putInteractive(Villain villain, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(villain), position);
    }
    public void putInteractive(Boss boss, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(boss), position);
    }
    public void putInteractive(TreasureChest treasureChest, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(treasureChest), position);
    }
    public void putInteractive(Trap trap, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(trap), position);
    }
    public void putInteractive(QuestItem questItem, Position position) {
        this.InteractivePositions.put(new InteractiveContainer<>(questItem), position);
    }
    
    public Position getPosition(Hero hero) {
        return this.InteractivePositions.get(new InteractiveContainer<>(hero));
    }
    public Position getPosition(Villain villain) {
        return this.InteractivePositions.get(new InteractiveContainer<>(villain));
    }
    public Position getPosition(Boss boss) {
        return this.InteractivePositions.get(new InteractiveContainer<>(boss));
    }
    public Position getPosition(TreasureChest treasureChest) {
        return this.InteractivePositions.get(new InteractiveContainer<>(treasureChest));
    }
    public Position getPosition(Trap trap) {
        return this.InteractivePositions.get(new InteractiveContainer<>(trap));
    }
    public Position getPosition(QuestItem questItem) {
        return this.InteractivePositions.get(new InteractiveContainer<>(questItem));
    }
    
    
    
}
