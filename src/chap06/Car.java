package chap06;

public class Car { // convention : 첫글자 대문자, 카멜케이스
    // 필드, 멤버 변수
    String company;
    int speed;

    // 생성자에서 필드 초기화
    // 1번 생성자
    Car() {
        // 생성자를 통해 변수를 초기화 해주어야 함.
        company = "쌍용";
    }

    // 2번 생성자
    Car(String company) {
        this.company = company;
        // 여기서 this는 위의 String company를 의미.
    }

    // 3번 생성자
    /* 오버로딩 : 이름이 같은 메서드(생성자)에 다양한 매개변수를 정의할 수 있는 것 */
    Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }


    public static void main(String[] args) {
        // Car 클래스 객체 생성 - 생성자를 호출

        Car myCar = new Car();
        System.out.println("코란도C 회사 : " + myCar.company);

        Car car2 = new Car("누구게~");
        System.out.println(car2.company);

        Car car3 = new Car("아우디", 300);
        System.out.println(car3);
    }
}