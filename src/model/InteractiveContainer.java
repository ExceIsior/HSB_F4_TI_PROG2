package model;

import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InteractiveContainer<?> other = (InteractiveContainer<?>) obj;
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }
    
    
}
