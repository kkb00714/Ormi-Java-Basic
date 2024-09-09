package chap07;

public class InheritAInheritBExample {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        inheritB.field1 = 10;
        inheritB.method1();         // 부모 클래스의 구성 요소 (InheritA로부터 물려받은 필드와 메서드)

        inheritB.field2 = "77";
        inheritB.method2(); // 자식 클래스 (InheritB)에서 추가한 필드와 메서드
    }
}
