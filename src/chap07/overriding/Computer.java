package chap07.overriding;

public class Computer extends Calculator{
    // 메서드 재정의 (Override)
    @Override
    double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
