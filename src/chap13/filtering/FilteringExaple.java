package chap13.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteringExaple {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "c", "d", "e");
        list.stream()
                .distinct() // 중복 제거
                .forEach(System.out::print);
        System.out.println();

        List<String> list2 = Arrays.asList("치즈", "치즈깁밥", "치즈빙수", "치즈밥", "체다치즈", "김치피자", "치즈밥", "치즈초밥");
        list2.stream()
                .distinct() // 중복 제거와 함께 쓰일 수 있다!
                .filter(x -> x.startsWith("치즈"))
                .filter(x -> x.endsWith("밥"))
                .toList()
                .forEach(System.out::println);

        List<String> list3 = Arrays.asList("치즈", "치즈깁밥", "치즈빙수", "치즈밥", "체다치즈", "김치피자", "치즈밥", "치즈초밥");
        Set<String> set = list3.stream() // set 자체로도 중복제거가 가능하기 때문에 distinct가 필요 없다!
                .filter(x -> x.startsWith("치즈"))
                .collect(Collectors.toSet());  // "치즈" 로 시작하는 문자열을 모두 set에 담음
        System.out.println(set);
    }
}
