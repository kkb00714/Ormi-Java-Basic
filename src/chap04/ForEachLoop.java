package chap04;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for each 반복문
        String[] numbers = {"one", "two", "three", "four", "five"};

        for (String number : numbers) {
            System.out.println(number);
        } // numbers 배열 안에 있는 것을 순회하며 하나하나 빼냄

        // for each문 변환
        // iterate(args) 부분에서는 자바에서 제공하는 자료구조를 대입할 수 있음
        // ex) Collection 관련 클래스들 - 자료를 여러 개 담을 수 있는 자료구조
        for (String arg : args) {
            System.out.println(arg);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(17);
        list.add(71);

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i = 1; i <= 60; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }

        // 위 실습 정답 코드
        for (int i = 0; i <= 60; i++) {
            int value = i + 1;
            if (value % 3 != 0) {
                continue;
            }
            System.out.println(value + " 는 3의 배수");
        }

    }
}
