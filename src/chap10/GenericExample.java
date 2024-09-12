package chap10;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        // 제네릭 사용 o
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("12.45");

        // 제네릭 사용 x
        // : 어떤 값이 들어가도 상관이 없음.
//        ArrayList list2 = new ArrayList();
//        list2.add("10");
//        list2.add(10.23);
//        list2.add("문자열");
//
        // 제네릭을 해주지 않으면 타입 변환을 해줘야 함.
//        Object object = list2.get(2);
//        int a = Integer.parseInt((String) object);
//        System.out.println(a + 1);
    }
}
