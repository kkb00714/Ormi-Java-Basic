package chap12;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다식 적용 전
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체의 메서드");
            }
        };

        // 익명 구현 객체
        Runnable runnable2 = () -> System.out.println("익명 구현 객체의 메서드");

    }
}
