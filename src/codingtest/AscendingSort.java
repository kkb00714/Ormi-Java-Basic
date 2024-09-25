package codingtest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        IntStream arr1 = Arrays.stream(array1);
        IntStream arr2 = Arrays.stream(array2);

        int[] answer = IntStream.concat(arr1, arr2)
                .sorted()
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}