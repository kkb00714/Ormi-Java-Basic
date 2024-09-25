package chap13.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Looping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .mapToInt(element -> element) // Integer였던 stream을 IntStream으로 변환
                .filter(element -> element % 2 == 0)
                .peek(System.out::println)     // 짝수가 잘 필터링 되었는지 확인하기 위한 메서드
                .sum();
        System.out.println("총 합: " + sum);
    }
}
