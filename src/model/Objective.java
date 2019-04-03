package model;

import java.util.HashMap;
import model.gameObject.GameObject;

public class Objective  {
    private HashMap<GameObject, Integer> objectives;

    public Objective(HashMap<GameObject, Integer> objectives) {
        this.objectives = objectives;
    }
    
    public boolean objectiveComplete(){
        return true;
    }
}
