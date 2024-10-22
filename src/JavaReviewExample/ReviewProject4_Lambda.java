package JavaReviewExample;

import java.util.function.*;

public class ReviewProject4_Lambda {
    public static void main(String[] args) {

        IntBinaryOperator val1 = (x, y) -> x + y;
        // 이 람다식을 메서드 참조형으로 바꾸기 (클래스명::메서드명)
        // Integer::sum => Integer - 클래스명 (x, y 타입 때문?) , sum(x, y) - 메서드

        System.out.println(val1.applyAsInt(20, 1)); // 21


        // input값 String, output값 Integer
        Function<String, Integer> val2 = (s1) -> s1.length(); // String::length
        System.out.println(val2.apply("문자열 길이 측정")); // 9

        // input값 output값 둘 다 Integer
        Function<Integer, Integer> val3 = (v1) -> v1 * 2;
        System.out.println(val3.apply(3)); // 6

        // input값은 String, Char, output값은 Integer
        BiFunction<String, Character, Integer> val4 = (a2, b2) -> {
            int cnt = 0;
            for (char chr : a2.toCharArray()) {
                if (chr == b2) cnt++;
            }
            return cnt;
        };
        System.out.println(val4.apply("Chocolate", 'a'));

        
    }
}
