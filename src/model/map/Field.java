package model.map;

import model.gameObject.GameObject;

/**
 * Represents a single field.
 *
 * @author Ismail
 */
public class Field 
{


  //private String texturePath = "";
    private boolean visible = false;
  //private int height = 0;

    Terrain terrain = null;
    private GameObject gameObject = null;

    /**
     * Initialises a field.
     * @param terrain Terrain type of the field.
     * @param visible Visibility status of the field.
     * @param gameObject Game object which is on the field
     */
    public Field(Terrain terrain, boolean visible, GameObject gameObject) 
    {
        this.terrain = terrain;
        this.visible = visible;
    }

    /**
     * Initialises an invisible field without any game object.
     * @param terrain Terrain of the field.
     */
    public Field(Terrain terrain) 
    {
        this(terrain, false, null);
    }

    /**
     * Initialises an invisible field without a terrain.
     * @param gameObject Game object that should be "standing" on the field.
     */
    public Field(GameObject gameObject) 
    {
        this(null, false, gameObject);
    }

    /**
     * Returns the terrain type
     * @return Terrain
     */
    public Terrain getTerrain() 
    {
        return terrain;
    }

    /**
     * Returns the current visibility status of the field.
     * @return Visibility status
     */
    public boolean isVisibile() 
    {
        return visible;
    }

    /**
     * Sets the visibility status of the field
     * @param visible Visibility
     */
    public void setVisible(boolean visible) 
    {
        this.visible = visible;
    }

    /**
     * Returns the game object on the field.
     * @return Game object of the field.
     */
    public GameObject getGameObject() 
    {
        return gameObject;
    }

    /**
     * Sets the game object which should be on the field.
     * @param gameObject Game object which should be on the field.
     */
    public void setGameObject(GameObject gameObject) 
    {
        this.gameObject = gameObject;
    }

    @Override
    public String toString() 
    {
        if (gameObject != null) {
            return gameObject.getGraphicsPath();
        } else {
            return this.terrain.getTexturePath();
        }

    }
}
