package model.gameObject;

import model.Position;

public abstract class GameObject {
    
    private String graphicspath = "";
    private Position position = null;

    public GameObject(String graphicsPath) {
        this.graphicspath = graphicsPath;
    }
     
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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