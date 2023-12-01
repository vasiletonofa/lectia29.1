package container;

public class Container<T> {

    private T item; // Orice clasa

    public void transport(T t) {
        item = t;
    }

    public T unload() {
        return item;
    }

}
