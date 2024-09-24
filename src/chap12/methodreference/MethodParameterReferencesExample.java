package chap12.methodreference;

import java.util.function.ToIntBiFunction;

public class MethodParameterReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

//        function = (a, b) -> a.compareToIgnoreCase(b);
        function = String::compareToIgnoreCase; // 문자열 비교를 하지만, 대소문자는 무시
        System.out.println(function.applyAsInt("Leo", "leo")); // 0
    }
}
