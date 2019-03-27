package model.gameObject;

import model.Position;

public abstract class GameObject {
    
    private Position position = null;
    private String graphicspath = "";
    
    
    public Position getPosition()
    {
        return null;
    }
    
    public void setPosition(Position newPosition)
    {
        this.position = newPosition;
    }
    
    public String getGraphicsPath(GameObject g)
    {
        return this.graphicspath;
    }
}