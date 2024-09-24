package chap12.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function = (x) -> new Member(x);

        // 생성자 참조
        // 클래스명::new 으로 작성 가능
        function = Member::new;
        System.out.println(function.apply("String"));

        BiFunction<String, String, Member> function2 = (x, y) -> new Member(x, y);
        function2 = Member::new;
        System.out.println(function2.apply("String", "String2"));
        
    }
}
