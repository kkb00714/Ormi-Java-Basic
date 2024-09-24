package chap12.methodreference;

public class Calculator {
    // 정적 메서드
    public static int staticMethod(int left, int right) {
        return left + right;
    }

    // 인스턴스 메서드
    public int method(int left, int right) {
        return left + right;
    }
}
