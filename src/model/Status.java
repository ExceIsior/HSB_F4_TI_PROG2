package model;

public class Status
{
    private int restlicheGueltigkeit = 0;
    private Effekt effekt = null;

    public Status(int restlicheGueltigkeit, Effekt effekt)
    {
        this.restlicheGueltigkeit = restlicheGueltigkeit;
        this.effekt = effekt;
    }
}
