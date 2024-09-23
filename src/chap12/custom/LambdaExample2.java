package chap12.custom;

import java.util.function.*;

public class LambdaExample2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Supplier 출력 실험";
        String result = supplier.get();
        System.out.println(result);

        IntSupplier supplier2 = () -> 20;
        int result2 = supplier2.getAsInt();
        System.out.println(result2);

        Consumer<String> consumer = (name) -> System.out.println(name);
        consumer.accept("나다");


        // Function
        // Integer 입력, String 출력
        Function<Integer, String> function = x -> String.valueOf(x) + ", 문자열";
        System.out.println(function.apply(31));

        Function<String, Double> function2 = x -> Double.valueOf(x) * 1.2;
        Double result3 = function2.apply("56.7");
        System.out.println(result3);
        
        // Predicate 구현 객체를 람다식으로 작성
        Predicate<String> isEmpty = (x) -> x.length() == 0;
        System.out.println("빈 값 체크: " + isEmpty.test( ""));
        System.out.println("빈 값 체크: " + isEmpty.test("132435"));

        Predicate<Integer> even = (x) -> x % 2 == 0;
        System.out.println("짝수 체크: " + even.test(132445));
        System.out.println("짝수 체크: " + even.test(24));

        // Predicate<String> isEmpty2 = (x) -> x.isEmpty();   // 메서드 참조형으로 변경한다면
        // 클래스명::메서드명 으로 면경 가능
        Predicate<String> isEmpty2 = String::isEmpty;   // 다만 해석이 복잡해질 수 있다.


    }
}
