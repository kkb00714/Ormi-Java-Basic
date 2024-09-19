package chap10.quiz;

public class Container<T> {
    private T Object;

    public void set(T object) {
        Object = object;
    }

    public T get() {
        return Object;
    }
}
