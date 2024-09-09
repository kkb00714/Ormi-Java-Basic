package chap07.overriding;

public class Calculator {
    // 상수
    private static final double PI = 3.14159;

    double areaCircle(double r) {
//        System.out.println("Calculator 객체의 areaCircle() 실행");
        return PI * r * r;
    }

}
