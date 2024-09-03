package chap03;

public class Operator3 {
    public static void main(String[] args) {
        System.out.println("Hello" + 123 + 456); // Hello123456
        System.out.println(123 + 456 + "Hello"); // 579Hello

        // 문자열 비교 연산자
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);  // true,
        //동일한 값을 바라보고 있기 때문

        System.out.println(str1 == str3);  // false,
        // str3의 경우 Heap 메모리에 존재하게 되기 때문

        // 비트 연산자 => 피연산자가 정수일 경우 일반 연산자로 작용
        int x = 15;
        int y = 30;

        System.out.println(x & y); // 01110, 14
        System.out.println(x | y); // 11111, 31
        System.out.println(x ^ y); // 10001, 17
        // 논리 부정
        System.out.println(~x == y); // false

        // 시프트 연산자 => 정수 데이터의 비트를 좌측 또는 우측으로 밀어서 이동시키는 연산
        int s1 = 8;
        System.out.println(s1 >> 1); // 4


    }
}
