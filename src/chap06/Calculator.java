package chap06;

public class Calculator {
    int a;

    Calculator() {

    }

    Calculator(int a) {
        this.a = a;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    void postfixOperator() {
        this.a++; // a++; 도 가능. (위의 코드와 동일하다! - return 제외)
    }

    // postfixOperator가 오버로딩된 모습!
    void postfixOperator(Calculator cal) {
        cal.a++;
    }

    public static void main(String[] args) {
        // 1. Calculator에 변수 a의 값을 매개변수로 전달하여
        // 변수에 담겨있는 값에 증가를 해줌.
        int a = 1;
        Calculator calculator = new Calculator();
        a = calculator.postfixOperator(a);
        System.out.println(a);

        // 2. Calculator cal 객체를 매개변수로 전달
        // 객체 매개변수 cal과 변수 cal1이 같은 주솟값을 가리킨다
        // 왜? cal1은 객체라 변수를 가리키는 주솟값을 갖고 있기 때문!
        Calculator cal1 = new Calculator(1);
        cal1.postfixOperator(cal1);
        System.out.println(cal1.a);

        // 3. 최종
        Calculator cal2 = new Calculator(6);
        cal2.postfixOperator();
        System.out.println(cal2.a);

    }
}
