package model.gameObject;

/**
 * Abstract super class of all objects that can be located on the game's map.
 * @author Ismail
 */
public abstract class GameObject {
    
    private String graphicspath = "";
    private Position position = null;
    public GameObject(String graphicsPath, int height) {
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