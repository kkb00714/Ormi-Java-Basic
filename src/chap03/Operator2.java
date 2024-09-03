package chap03;

public class Operator2 {
    public static void main(String[] args) {
        // 이항 연산자
        // 산술 연산자 (사칙연산과 유사)

        int a = 10;
        int b = 3;

        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3, 나누기 연산 
        System.out.println((double) a / b); // 3.33333335... 나누기 연산이지만 실수로 반환하여 생략된 값을 출력함
        System.out.println(a % b);  // 1, 나머지 연산

        byte c = 45;
        byte d = 67;

        int result = c + d; // 자동적으로 int로 변환됨
        System.out.println(result); // 112

        int x2 = 40;
        double y2 = 50.24;

        int xy1 = (int) (x2 + y2); // 40.0 + 50.24
        int xy2 = x2 + (int) y2; // 40 + 50
        double doublexy2 = x2 + y2; // 40.0 + 50.34

        char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
        char c2 = 'A';
//        char c3 = c2 + 1;   // 에러
        int c3 = c2 + 1;   // 이렇게 하면 에러가 고쳐짐
        System.out.println(c3);
    }
}
