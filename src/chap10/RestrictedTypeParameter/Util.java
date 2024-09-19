package chap10.RestrictedTypeParameter;

public class Util {
    // -1, 0, 1
    public static <T extends Number> int compare(T t1, T t2) { // Number라는 타입으로 제한
        // 실수형으로 변환
        double value1 = t1.doubleValue();
        // t1이라는 값을 value1이라는 double 타입의 변수 생성
        double value2 = t2.doubleValue();

        // Double.compare();
        return Double.compare(value1, value2);
        // 1이 크다면 1, 1이 작다면 -1, 같다면 0 리턴
    }
}
