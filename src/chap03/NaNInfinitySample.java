package chap03;

public class NaNInfinitySample {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        System.out.println(a / b); // Infinity
        System.out.println(a % b); // NaN

        // 이렇게 체크해볼 수 있는 방법이 있다.
        Double.isInfinite(a/b); // true
        Double.isNaN(a%b); // true
    }
}
