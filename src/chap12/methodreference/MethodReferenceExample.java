package chap12.methodreference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메서드 참조
        operator = Calculator::staticMethod;
        System.out.println(operator.applyAsInt(1, 6));

        // 인스턴스 메서드 참조
        // 단, 클래스명 대신 인스턴스명::메서드명 으로 작성한다.
        Calculator cal = new Calculator();
        operator = cal::method;
        System.out.println(operator.applyAsInt(3, 5));
    }
}
