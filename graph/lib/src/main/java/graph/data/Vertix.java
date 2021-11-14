package graph.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vertix<T> {
    public T label;
    public Vertix(T label) {
        this.label = label;
    }

    public int x;
    public List<Vertix> adj = new ArrayList<>();

    public T getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertix vertex = (Vertix) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return (String) label;
    }
}