package chap12;

import chap12.functional.MyFunctionalInterface;
import chap12.functional.MyFunctionalInterface2;

import java.sql.SQLOutput;

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

        // 일반적인 구현객체
        MyFunctionalInterface inter = new MyFunctionalInterface() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        };

        inter.run();    // 익명 구현 객체.메서드명(); 으로 호출함

        MyFunctionalInterface inter2 = () -> System.out.println("익명 구현 객체");
        inter2.run();

        // 매개변수가 있는 람다식
        MyFunctionalInterface2 inter3 = (x) -> System.out.println(x);
        inter3.method(12);
        
        // 매개변수가 있고 리턴값이 있는 람다식

    }
}
