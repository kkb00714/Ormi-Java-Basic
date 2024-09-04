package chap04;

public class Array {
    public static void main(String[] args) {
        // String[] 문자열 배열 선언, 값 저장
        String[] arrayString = new String[10]; // 배열의 사이즈를 10으로 정함
        arrayString[0] = "첫번째";
        arrayString[1] = "두번째";
        System.out.println(arrayString[0]);

        // 선언, 초기화(값 저장) => 값을 바로 저장할 때에는 중괄호 사용
        String[] arrayString2 = {"첫번째", "두번째", "마지막"};
        System.out.println(arrayString2[0]);
        System.out.println(arrayString2[1]);

        System.out.println(arrayString.length);
        System.out.println(arrayString2.length);
    }
}
