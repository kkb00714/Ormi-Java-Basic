package chap03;

public class Operator {
    public static void main(String[] args) {
        // 단항 연산자
        //  부호 연산자 : 양수나 음수를 표시
        int x = -100;
        int res1 = +x;
        int res2 = -x;

        System.out.println(res1);
        System.out.println(res2);

        // 증감 연산자 ( ++, -- )
        // 전위 연산
        int y = 5;
        int result = y++;
        System.out.println(result); // 5
        System.out.println(y); // 6

        // 후위 연산
        int z = 14;
        int result2 = --z;
        System.out.println(result2); // 13
        System.out.println(z); //13

        // 심화 1
        int i = 14;
        int result3 = --i;
        System.out.println(result3); // 13
        System.out.println(++i); // 14

        // 심화 2
        int a1 = 5;
        int aresult = a1++ + 3;
        System.out.println(aresult); // 8
        System.out.println(a1); // 6

    }
}
