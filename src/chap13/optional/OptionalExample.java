package chap13.optional;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
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

        System.out.println("==============================");

        // Optiional 객체 꺼내기 (반환)
        // 1. get()
        Integer h = optional2.get();
        System.out.println(h);


        // 2. orElseThrow()=> 값이 비어있을 경우 에러
//        Integer i = empty.orElseThrow(NoSuchElementException::new);   // 에러 발생
        Integer i = optional2.orElseThrow(NoSuchElementException::new);
        System.out.println(i);


        // 3. orElse() => 값이 없으면 기본값 즉시 반환
//        Integer j = optional3.orElse(1000);
        Integer j = empty.orElse(1000);
        System.out.println(j);


        // 4. orElseGet() => 값이 없을 때만 지정한 함수 실행
//        Integer k = optional3.orElseGet(() -> 777);
        Integer k = empty.orElseGet(() -> 777);
        System.out.println(k);


        // 5. isPresent() => if 조건절이 true 라면 값을 바로 꺼내줌.
        if (optional4.isPresent()) {
            String s = optional4.get();
            System.out.println(s);
        }
    }
}
