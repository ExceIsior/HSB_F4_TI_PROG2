package model;

public class Status
{
    private int restlicheGueltigkeit = 0;
    private Effect effekt = null;

    public Status(int restlicheGueltigkeit, Effect effekt)
    {
        this.restlicheGueltigkeit = restlicheGueltigkeit;
        this.effekt = effekt;
    }
}
