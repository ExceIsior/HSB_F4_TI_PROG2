package model.gameObject;

import model.Position;

public abstract class GameObject {
    
    private Position position = null;
    private String graphicspath = "";

    public GameObject(String graphicsPath, Position position) {
        this.graphicspath = graphicsPath;
        this.position = position;
    }
    
    
    
    public Position getPosition()
    {
        return this.position;
    }
    
    public void setPosition(Position newPosition)
    {
        this.position = newPosition;
    }
    
    public String getGraphicsPath()
    {
        return this.graphicspath;
    }
}