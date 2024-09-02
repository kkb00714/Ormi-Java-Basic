package chap02.casting;

public class ForceCasting {
    public static void main(String[] args) {
        // long -> int
        long longValue = 300;
        int intValue = (int) longValue; // 300이 그대로 저자

        // double -> int
        double pi = 3.14;
        int convertedInt = (int) pi;
        System.out.println("convertedInt = " + convertedInt);
        // 소수를 정수로 강제 변환할 경우, 소수점 이하 부분은 버려지고 정수 부분만 저장

        int intVar2 = 10;
        char charValue = 'A';
        double doubleValue = 5.5;
        String stringValue = "A";

        int result = intVar2 + (int) doubleValue;
        // 정수로만 값을 넣고 싶을 때 강제 형 변환 사용

        // int -> double
        double doubleValue2 = (double) intValue;

        // String -> char (캐스팅으로 변환은 x)
//        char var = (char) stringValue;

        // 가능하게 하려면 charAt(index) 라는 메서드를 사용해야 함.
        char changedValue = stringValue.charAt(0);
        System.out.println("changedValue = " + changedValue);
    }
}