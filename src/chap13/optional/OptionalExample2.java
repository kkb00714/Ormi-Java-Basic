package chap13.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample2 {
    public static void main(String[] args) {
        // 값이 실제로 존재할 때만 편균을 출력
        List<Integer> list = new ArrayList<>();

        // NoSuchElementException 예외 발생
        OptionalDouble optional = list.stream() // 리스트에서 stream을 생성하고 optional로 감쌈
                .mapToInt(Integer::intValue) // 리스트의 각 요소를 정수로 변환
                .average(); // 각 요소들의 평균값을 계산하는 메서드

        // 값이 실제로 존재하는지 체크
        if (optional.isPresent()) {
            System.out.println(optional.getAsDouble());
        }
    }
}
