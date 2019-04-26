package model.map;

/**
 * Represents a terrain.
 * @author Ismail
 */
public class Terrain 
{

    private int height = 0;
    private String texturePath = "";

    /**
     * Initialises a terrain.
     * @param height Height of the terrain to determine traversibility 
     * @param graphicsPath 
     */
    public Terrain(int height, String graphicsPath) 
    {
        this.height = height;
        this.texturePath = graphicsPath;
    }

    public int getHeight() 
    {
        return height;
    }

    public String getTexturePath() 
    {
        return texturePath;
    }

}
