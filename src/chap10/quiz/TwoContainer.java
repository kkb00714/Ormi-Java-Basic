package chap10.quiz;

public class TwoContainer <T, M>{
    private T key;
    private M value;

    public void set(T name, M inf) {
        this.key = name;
        this.value = inf;
    }

    public T getKey() {
        return this.key;
    }

    public M getValue() {
        return this.value;
    }
}
