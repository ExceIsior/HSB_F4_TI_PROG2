package model.gameObject;

import model.Position;

public abstract class GameObject {
    
    private Position position = null;
    private String graphicspath = "";
    private int height = 0;

    public GameObject(String graphicsPath, Position position, int height) {
        this.graphicspath = graphicsPath;
        this.position = position;
        this.height = height;
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