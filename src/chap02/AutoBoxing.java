package chap02;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args) {
        // 박싱 (int -> Integer)
        int a = 10;
        Integer a2 = Integer.valueOf(a);


        // 오토 박싱 (int -> Integer)
        Integer a3 = a;

        ArrayList<Integer> arrayList = new ArrayList<>();

        /* 오토 박싱 */
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);

    }
}
