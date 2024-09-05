package chap05;

public class StringFormat {
    public static void main(String[] args) {
        // %s 는 문자열 치환
        String str1 = "..%s....... %s ......! 특정 문자 %s 사잇값";
        System.out.println(String.format(str1, "오", "오옹", "짱신기"));
        System.out.println(String.format(str1, "777", "번째", "당첨"));

        // %d 는 정수형 치환
        String str2 = "치환값 1: %d, ... 치환값 2: %d";
        System.out.println(String.format(str2, 123, 321));

        // %f 는 실수형 치환 ( &.(숫자)f 하면 숫자 이하의 소수점까지 표시)
        String str3 = "치환값 3: %.13f, ... 치환값 4: %f";
        System.out.println(String.format(str3, 3.14312234788888, 0.1));
    }
}
