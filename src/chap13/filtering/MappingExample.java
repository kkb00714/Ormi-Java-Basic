package chap13.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        list.stream()
                .map(element -> element.toUpperCase())
                .forEach(System.out::printf);

        System.out.println();
        System.out.println("=============================");

        // flatMap
        // output으로 스트림을 반환해야 함
        Integer[][] array = {{3, 5}, {7, 19}};
        Arrays.stream(array)
                .flatMap(Arrays::stream)
                .forEach(System.out::print);

        // 새로운 stream으로 분리하고 하나의 stream으로 합침 (?)
        List<String> list3 = Arrays.asList("땃땃따", "따- 따- 따-", "땃땃따");
        list3.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                // 각 요소별로 공백으로 구분하여 배열로 생성하고, 생성된 배열을 stream 객체화
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers_result = numbers.stream()
                .map(element -> element * element)
                .collect(Collectors.toList());
        System.out.println(numbers_result);

        List<String> sentences = Arrays.asList("Hello:world", "Java:Stream:flatMap", "Functional:programming");
        List<String> result = sentences.stream()
                .flatMap(element -> Arrays.stream(element.split(":")))
                .collect(Collectors.toList());
        System.out.println(result);

        List<List<Integer>> num_1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> result_1 = num_1.stream()
                .flatMap(element -> element.stream())
                .collect(Collectors.toList());
        System.out.println(result_1);

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );
        List<String> ur_Name = people.stream()
                .filter(element -> element.age >= 28)
                .map(element -> element.name)
                .collect(Collectors.toList());
        System.out.println(ur_Name);

    }
}
