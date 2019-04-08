package model;

import java.util.HashMap;
import model.gameObject.GameObject;

public class Objective  {
    private GameObject gameObject = null;
    private int count = 0;

    public Objective(GameObject gameObject, int count) {
        this.gameObject = gameObject;
        this.count = count;
    }
    
    public GameObject getGameObject() {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean objectiveComplete(){
        return true;
    }
}
