package chap10;

import chap10.generic.Box;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("문자열");

        // 제네릭이 아닌 경우 이렇게 캐스팅을 해줘야 함
        String str = (String) box.get();
        System.out.println(str);

    }
}
