package chap13.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> list = null;

        // Optional로 감싸기
        Optional<List<String>> optional = Optional.ofNullable(list);
        optional.orElseGet(Collections::emptyList)     // 어떤 값으로 꺼내줄지 정의
                .forEach(System.out::println);

        Optional.ofNullable(list)
                .orElseGet(Collections::emptyList)
                .forEach(System.out::println);

        // Optional 객체 생성 (empty(), of(), ofNullable())
        Optional<Integer> empty = Optional.empty();  // 비어 있는 optional 객체 생성
        Optional<Integer> optional2 = Optional.of(456);  // 절대 null이 아닌 Optional 객체 생성
        // null 값을 허용하지 않기 때문에, null 을 넣으려고 하면 즉시 에러 발생

        Optional<Integer> optional3 = Optional.ofNullable(2324);  // 값이 있을 수도 있고 없을 수도 있는 Optional 객체 생성
        Optional<String> optional4 = Optional.of("231");

        empty.ifPresent(System.out::println);  //
        optional2.ifPresent(System.out::println);  // 456
        optional3.ifPresent(System.out::println);  // 2324
        optional4.ifPresent(System.out::println);  // 231


        // Optiional 객체 꺼내기 (반환)
        // 1. T get()


        // 2. T orElse(T other)


        // 3. T orElseGet(Supplier<? extends T> other)


        // 4.


        // 5. boolean isPresent()


    }
}
