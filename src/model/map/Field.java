package model.map;

import control.Constants.Const;
import model.gameObject.GameObject;

public class Field {

    //private String texturePath = "";
    private boolean visible = false;
//    private int height = 0;
    Terrain terrain = null;
    private GameObject gameObject = null;
    
    public Field(Terrain terrain, boolean visible, GameObject gameObject) {
        this.terrain = terrain;
        this.visible = visible;
    }

    public Field(Terrain terrain) {
        this(terrain, false, null);
    }
    
    public Field(GameObject gameObject) {
        this(null, false, gameObject);
    }

    public Terrain getTerrain() {
        return terrain;
    }
    
    public boolean isVisibile() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public GameObject getGameObject() {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public String toString() {
        if (gameObject != null) {
            return gameObject.getGraphicsPath();
        }
        else {
            return this.terrain.getTexturePath();
        }
        
    }
}
