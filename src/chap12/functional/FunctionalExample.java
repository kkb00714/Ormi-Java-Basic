package chap12.functional;

public class FunctionalExample {
    public static void main(String[] args) {
        // 매개변수와 리턴타입이 있는 람다식 작성해보기!
        // 매개변수가 2개 이상이라면?
        MyFunctionalInterface3 inter4 = (x, y) -> x * y;
        int result1 = inter4.method(10, 22);
        System.out.println("매개변수가 2개 이상인 경우1: " + result1);

        MyFunctionalInterface3 inter3_5 = (x, y) -> {
            System.out.printf("매개변수가 2개 이상인 경우2 + 출력문이 여러개인 경우: ");
            return x * y;
        };
        int result3_5 = inter3_5.method(7, 7);
        System.out.println(result3_5);

        // 만약 매개변수가 1개라면?
        // -> 괄호 생략 가능!
        MyFunctionalInterface4 inter5 = i -> i * 2;
        int result2 = inter5.method(7);
        System.out.println("매개변수가 1개인 경우: " + result2);


    }
}
