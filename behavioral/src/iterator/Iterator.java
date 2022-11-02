package iterator;

public interface Iterator<T> {
    T current();
    void next();
    boolean hasNext();
}
