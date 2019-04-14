package model;

public class Status
{
    private int restlicheGueltigkeit = 0;
    private Effect effekt = null;
    private boolean positive = false;

    public Status(int restlicheGueltigkeit, Effect effekt, boolean positiv)
    {
        this.restlicheGueltigkeit = restlicheGueltigkeit;
        this.effekt = effekt;
    }

    public boolean isPositive()
    {
        return this.positive;
    }
}
