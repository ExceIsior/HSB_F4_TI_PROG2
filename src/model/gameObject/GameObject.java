package model.gameObject;

import model.Position;

/**
 * Abstract super class of all objects that can be located on the game's map.
 * @author Ismail
 */
public abstract class GameObject 
{   
    private String graphicspath = "";
    private Position position = null;
    
    /**
     * Initializes a new game object.
     * @param graphicsPath 
     */
    public GameObject(String graphicsPath) 
    {
        this.graphicspath = graphicsPath;
    }
    
    /**
     * Returns the current position of the game object.
     * @return current position
     */
    public Position getPosition() 
    {
        return position;
    }
    
    /**
     * Sets the new position of the game object.
     * @param newPosition 
     */
    public void setPosition(Position newPosition) 
    {
        this.position = newPosition;
    }    
    
    /**
     * Returns the graphics path of the game object.
     * @return graphics path
     */
    public String getGraphicsPath()
    {
        return this.graphicspath;
    }
    
    @Override
    public String toString()
    {
        return this.graphicspath.substring(this.graphicspath.length()-1);
    }
}