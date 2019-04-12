package model.gameObject;

import model.Position;

public abstract class GameObject {
    
    private String graphicspath = "";
    private int height = 0;


    public GameObject(String graphicsPath, int height) {
        this.graphicspath = graphicsPath;
        this.height = height;
    }
    
    
    public String getGraphicsPath()
    {
        return this.graphicspath;
    }
   
     
    public int getHeight() 
    {
        return height;
    }
    
    @Override
    public String toString()
    {
        return this.graphicspath.substring(this.graphicspath.length()-1);
    }
}