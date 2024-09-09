package chap07;

public class Cat extends Animal{

    Cat(String name) {
        // super(name);        // super(매개값) 라는 키워드가 생략되어 있는 것.
        System.out.println("Cat 객체 생성, name: " + name);
    }
    
    void sleep(int times) {
        // 시그니쳐(리턴 타입, 메서드명, 파라미터)가 달라지면 오버로딩
        System.out.println(name + " Zzz... " + times + " hours later...");
    }
}
