package model.gameObject;

/**
 * Abstract super class of all objects that can be located on the game's map.
 * @author Ismail
 */
public abstract class GameObject {
    
    private String graphicspath = "";
    private int height = 0;

    /**
     * Initialises the game object.
     * @param graphicsPath Path to the image file that is to be drawn on the screen for the instance.
     * @param height Height of the game object to determine whether a hero can traverse over the object.
     */
    public GameObject(String graphicsPath, int height) {
        this.graphicspath = graphicsPath;
        this.height = height;
    }
    
    /**
     * Retrieves the game objects image path.
     * @return Relative path to game objects image file.
     */
    public String getGraphicsPath()
    {
        return this.graphicspath;
    }
   
     /**
      * Retrieves the game object's height
      * @return Game object's height.
      */
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