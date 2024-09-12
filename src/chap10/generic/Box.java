package chap10.generic;

// 타입 파라미터 T를 사용하여 Object 타입을 T로 대체.
public class Box<T> {
    // Object는 모든 클래스의 부모 클래스
    // => 따라서 모든 타입이 올 수 있음. (부모클래스 변수명 = new (자식)클래스();) 로 사용하는 것
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return this.obj;
    }
}
