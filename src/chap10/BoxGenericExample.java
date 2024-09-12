package chap10;

public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("문자열");
        String str = box.get();
        System.out.println(str);

        // 참조 타입, 혹은 Wrapper 타입으로 변환해야 제네릭을 사용할 수 있다.
        // 원시형은 사용 불가능.
        Box<Integer> box2 = new Box<>();
        box2.set(2);    // 자동 Boxing이 일어남 (Auto Boxing), int 타입이 Wrapper 클래스인 Integer 타입으로 변환
        int value2 = box2.get();    // 자동 Unboxing이 일어남 (Auto Unboxing), Integer 값이 int 값으로 변환
        System.out.println(value2);

        Box<Double> box3 = new Box<>();
        Box<Boolean> box4 = new Box<>();

    }
}
