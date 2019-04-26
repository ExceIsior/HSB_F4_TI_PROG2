package model.map;

/**
 * Represents a terrain.
 *
 * @author Ismail
 */
public class Terrain {

    private int height = 0;
    private String texturePath = "";

    /**
     * Initialises a terrain.
     *
     * @param height Height of the terrain to determine traversibility of a
     * field.
     * @param graphicsPath Path to the image file that is to be shown.
     */
    public Terrain(int height, String texturePath) {
        this.height = height;
        this.texturePath = texturePath;
    }

    /**
     * Returns the height of the terrain for traversibility determination.
     *
     * @return Height of the terrain
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns the path to the image file that is to be shown.
     *
     * @return Path of the image file.
     */
    public String getTexturePath() {
        return texturePath;
    }
}
