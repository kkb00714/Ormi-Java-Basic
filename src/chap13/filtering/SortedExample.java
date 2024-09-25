package chap13.filtering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "a", "88", "7");

        List<String> result = list.stream()
                .sorted()
                .toList();
        System.out.println(result);

        List<String> list2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(list2);
    }
}
