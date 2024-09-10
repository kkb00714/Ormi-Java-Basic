package chap08.zoo;

public class Zookeeper {
    void feed(Lion lion) {
        System.out.println("사자에게 생선을 줍니다.");
    }

    void feed(Tiger tiger) {
        System.out.println("호랑이에게 소고기를 줍니다.");
    }

    // 동물이 추가될 때마다 이렇게 메서드를 추가하는 형식
}
