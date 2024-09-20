package chap11;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 값 추가
        List<String> list = new LinkedList<>();   // 10개의 사이즈가 있는 배열을 선언
        list.add("Java");
        list.add("Spring");
        list.add("Python");
        list.add("JavaScript");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 추가된 객체의 총 개수
        System.out.println(list.size());    // 7

        // 값 순회 하면서 출력

        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + i + " : " + list.get(i));
        }

        // 값 삭제 - 인덱스를 삭제하면서 뒤에 있는 인덱스가 앞으로 당겨짐
        list.remove(2);     // Python 삭제
        list.remove(2);     // JavaScript 삭제

        for (String str: list) {
            System.out.println(str);
            //  Java
            //  Spring
            //  Servlet/JSP
            //  DBMS
            //  JPA
        }
    }
}
