package model.map;

import control.Constants.Const;
import model.gameObject.GameObject;

public class Field {

    private String texturePath = "";
    private boolean visible = false;
    private int height = 0;

    private GameObject gameObject = null;
    
    public Field(String texturePath, boolean visible, int height) {
        this.texturePath = texturePath;
        this.visible = visible;
        this.height = height;
    }

    public Field(String texturePath, int height) {
        this(texturePath, false, height);
    }
    
    public Field(GameObject gameObject) {
        this(gameObject.getGraphicsPath(), Const.HEIGHT_CHARACTER);
    }
    
    public String getTextture() {
        return this.texturePath;
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
    
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        if (gameObject != null) {
            return gameObject.getGraphicsPath();
        }
        else {
            return this.texturePath;
        }
        
    }
}
