package chap13;

import chap04.Array;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        // 1. 컬렉션으로 스트림 생성
        List<String> list = Arrays.asList("1", "2", "5", "7");
        Stream<String> stream = list.stream();

        // 2. 배열로 스트림 생성
        String[] arrays = {"1", "7", "14", "21"};
        Stream<String> stringStream2 = Arrays.stream(arrays);

        // 3. 숫자 범위로 스트림 생성
        IntStream intStream = IntStream.range(7, 15);   // 7, 8, ..., 14
//        intStream.forEach(System.out::println);

        LongStream intStream2 = LongStream.rangeClosed(7, 15);   // 7, 8, ..., 15
//        intStream2.forEach(System.out::println);

        DoubleStream intStream3 = DoubleStream.of(1, 2, 3);    // 1.0, 7.0
//        intStream3.forEach(System.out::println);

        // 4. 파일을 통한 스트림 생성
        Stream<String> fileStream = Files.lines(Paths.get("file1.txt"), Charset.forName("UTF-8"));
        fileStream.forEach(System.out::println);

        // 5. 스트림 연결해서 하나의 스트림 생성
        Stream<Integer> intStream_1 = Stream.of(1, 2, 3);
        Stream<Integer> intStream_2 = Stream.of(4, 5, 6);
        Stream<Integer> concated = Stream.concat(intStream_1, intStream_2);
        concated.forEach(System.out::println);

    }
}
