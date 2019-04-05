package model.map;

import model.gameObject.GameObject;

public class Field
{

    private char texture;
    private GameObject gameObject = null;

    public Field(char c, GameObject gameObject)
    {
        this.texture = c;
        this.gameObject = gameObject;
    }

    public Field(char c)
    {
        this(c, null);
    }

    public Field(GameObject gameObject)
    {
        this('T', gameObject);
    }

    public char getTextture()
    {
        return this.texture;
    }

    public void setGameObject(GameObject gameObject)
    {
        this.gameObject = gameObject;
    }

    public void setTexture(char c)
    {
        this.texture = c;
    }

    public GameObject getGameObject()
    {
        return this.gameObject;
    }

    @Override
    public String toString()
    {
        //TODO: später darf man sich hier nicht nur auf die GameObjects beziehen, sondern muss auch die Texturen mit einbeziehen
        return (this.gameObject == null ? null : this.gameObject.toString());
    }
}
