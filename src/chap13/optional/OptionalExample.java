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
    }
}
