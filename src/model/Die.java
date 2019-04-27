package model;

public class Die
{
    private int numberOfFaces = 0;

    public Die(int faces)
    {
        this.numberOfFaces = faces;
    }

    public int getNumberOfFaces()
    {
        return this.numberOfFaces;
    }
}
