package model.map;

public class Terrain {

    private int height = 0;
    private String texturePath = "";

    public Terrain(int height, String graphicsPath) {
        this.height = height;
        this.texturePath = graphicsPath;
    }

    public int getHeight() {
        return height;
    }

    public String getTexturePath() {
        return texturePath;
    }

}
