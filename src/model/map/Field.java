package model.map;

public class Field {

    private String texturePath = "";
    private boolean visible = false;

    public Field(String texturePath, boolean visible) {
        this.texturePath = texturePath;
        this.visible = visible;
    }

    public Field(String texturePath) {
        this(texturePath, false);
    }

    public String getTextture() {
        return this.texturePath;
    }

    public void setTexture(String texturePath) {
        this.texturePath = texturePath;
    }

    public boolean isVisibile() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return this.texturePath;
    }
}
