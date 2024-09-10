package chap08.defaultmethod;

public class Zookeeper {
    void feed(Predator predator) {
//        System.out.println(predator.getFood() + "(을)를 먹이로 줍니다.");
        // getFood 메서드는 다형성을 가짐
        predator.printFood();
    }
}
