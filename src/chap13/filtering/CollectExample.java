package chap13.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        // Map<요소, 갯수>
        Map<Integer, Long> result = list.stream()
            .collect(
                Collectors.groupingBy(
                    n -> n, // 기준이 되는 키값 => 요소 값 그 자체를 키로 사용한다는 의미
                    Collectors.counting()  // 그룹핑 후 집계하는 메소드
                )
            );
        result.forEach((key, value)
            -> System.out.println(key + ": " + value + "개"));
    }
}
