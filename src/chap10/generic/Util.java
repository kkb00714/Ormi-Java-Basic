package chap10.generic;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box; // Box<T> 으로 반환
    }
}
