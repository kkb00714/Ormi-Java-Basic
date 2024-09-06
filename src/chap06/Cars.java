package chap06;

import chap05.StringMethod;

public class Cars {
    String company;
    String model;
    int maxSpeed;

    // default Constructor
    Cars() {

    }

    Cars(String company) {
        this.company = company;
    }

    Cars(String company, String model) {
        this.company = company;
        this.model = model;
    }

    Cars(String company, String model, int maxSpeed) { // 매개변수(파라미터)들
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // 메서드
    // 메서드의 타입과 일치하는 값을 return 해줘야 함.
    String printField() {
        return "company: " + company + ", model: " + model + ", maxSpeed: " + maxSpeed;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        Cars car = new Cars(); // Car 클래스 객체 생성
        System.out.println(car);

        Cars car2 = new Cars("기아");
//        System.out.println(car2); // 그냥 객체 자체를 이렇게 출력하면 주솟값이 나옴
        car2.setModel("모르는 차"); // 인수(아규먼트)
        System.out.println(car2.printField());

        Cars car3 = new Cars("쌍용", "코란도C");
        car3.setMaxSpeed(200); // 인수(아규먼트)
        System.out.println(car3.printField());

        Cars car4 = new Cars("페라리", "ferrari", 400);
        System.out.println(car4.printField());

        Cars car5 = new Cars("아우디");
        // void 타입이기 때문에 변수에 할당해서 사용할 수 없다.
        // int value = car5.setMaxSpeed(30); => 이러면 오류가 발생한다.
        car5.setModel("audi a5");
        car5.setMaxSpeed(300);
        System.out.println(car5.printField());
    }
}
