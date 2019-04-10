package model;

import model.gameObject.Interactive;

public class InteractiveContainer<T extends Interactive>
{
    private T content;

    public InteractiveContainer(T content)
    {
        this.content = content;
    }

    public T getContent()
    {
        return this.content;
    }
}
