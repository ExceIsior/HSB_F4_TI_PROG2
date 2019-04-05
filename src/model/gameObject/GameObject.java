package model.gameObject;

import model.Position;

public abstract class GameObject
{

    private Position position = null; //TODO: eventuell rausnehmen
    private String graphicspath = "";

    public GameObject(String graphicsPath, Position position)
    {
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

    @Override
    public String toString()
    {
        return this.graphicspath.substring(this.graphicspath.length()-1);
    }
}